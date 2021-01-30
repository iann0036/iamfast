'use strict';

let AWS = require('aws-sdk');
let s3 = new AWS.S3();
const fs = require('fs');
const _downloadLocation = './web-site-manifest.json';

/**
 * Helper function to interact with s3 hosted website for cfn custom resource.
 *
 * @class websiteHelper
 */
let websiteHelper = (function() {

    /**
     * @class websiteHelper
     * @constructor
     */
    let websiteHelper = function() {};

    websiteHelper.prototype.copyWebSiteAssets = function(resourceProperties, cb) {
		var destS3Bucket = resourceProperties.destS3Bucket;
		var destS3KeyPrefix = resourceProperties.destS3KeyPrefix;
		var region = resourceProperties.Region;

        console.log("Copying UI web site");
        console.log(['destination bucket:', destS3Bucket].join(' '));
        console.log(['destination s3 key prefix:', destS3KeyPrefix].join(' '));
        console.log(['region:', region].join(' '));

        fs.readFile(_downloadLocation, 'utf8', function(err, data) {
            if (err) {
                console.log(err);
                return cb(err, null);
            }

            console.log(data);
            let _manifest = validateJSON(data);

            if (!_manifest) {
                return cb('Unable to validate downloaded manifest file JSON', null);
            } else {
                uploadToS3(_manifest.files, 0, destS3Bucket, destS3KeyPrefix,
                    function(err, result) {
                        if (err) {
                            return cb(err, null);
                        }
                        console.log(result);
                        return cb(null, result);
                    });
            }

        });
    };
    

    /**
     * Helper function to validate the JSON structure of contents of an import manifest file.
     * @param {string} body -  JSON object stringify-ed.
     * @returns {JSON} - The JSON parsed string or null if string parsing failed
     */
    let validateJSON = function(body) {
        try {
            let data = JSON.parse(body);
            console.log(data);
            return data;
        } catch (e) {
            // failed to parse
            console.log('Manifest file contains invalid JSON.');
            return null;
        }
    };
    
    async function uploadToS3(filelist, index, destS3Bucket, destS3KeyPrefix, cb) {
      if (filelist.length > index) {

          const response = fs.readFileSync(filelist[index], 'utf8');
          var fileDetails = filelist[index]
          fileDetails = fileDetails.substring(2, fileDetails.length);

          let params2 = {
              Bucket: destS3Bucket,
              Key: destS3KeyPrefix + '/' + fileDetails,
              Body: response
          };
            if (filelist[index].endsWith('.htm') || filelist[index].endsWith('.html')) {
                params2.ContentType = "text/html";
            } else if (filelist[index].endsWith('.css')) {
                params2.ContentType = "text/css";
            } else if (filelist[index].endsWith('.js')) {
                params2.ContentType = "application/javascript";
            } else if (filelist[index].endsWith('.png')) {
                params2.ContentType = "image/png";
            } else if (filelist[index].endsWith('.jpg') || filelist[index].endsWith('.jpeg')) {
                params2.ContentType = "image/jpeg";
              } else if (filelist[index].endsWith('.pdf')) {
                  params2.ContentType = "application/pdf";
            } else if (filelist[index].endsWith('.gif')) {
                params2.ContentType = "image/gif";
            } else if (filelist[index].endsWith('.svg')) {
                params2.ContentType = "image/svg+xml";
            };

          s3.putObject(params2, function(err, data) {
                if (err) {
                    console.log(err);
                    return cb(['error copying ', [filelist[index]].join('/'), '\n', err]
                        .join(
                            ''),
                        null);
                }

                console.log([
                    [filelist[index]].join('/'), 'uploaded successfully'
                ].join(' '));
                let _next = index + 1;
                uploadToS3(filelist, _next, destS3Bucket, destS3KeyPrefix, function(err, resp) {
                    if (err) {
                        return cb(err, null);
                    }

                    cb(null, resp);
                });
            });
        } else {
            cb(null, [index, 'files copied'].join(' '));
        }
    }
    return websiteHelper;

})();

module.exports = websiteHelper;