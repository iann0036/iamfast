var __create = Object.create;
var __defProp = Object.defineProperty;
var __getOwnPropDesc = Object.getOwnPropertyDescriptor;
var __getOwnPropNames = Object.getOwnPropertyNames;
var __getProtoOf = Object.getPrototypeOf;
var __hasOwnProp = Object.prototype.hasOwnProperty;
var __markAsModule = (target) => __defProp(target, "__esModule", { value: true });
var __export = (target, all) => {
  for (var name in all)
    __defProp(target, name, { get: all[name], enumerable: true });
};
var __reExport = (target, module2, copyDefault, desc) => {
  if (module2 && typeof module2 === "object" || typeof module2 === "function") {
    for (let key of __getOwnPropNames(module2))
      if (!__hasOwnProp.call(target, key) && (copyDefault || key !== "default"))
        __defProp(target, key, { get: () => module2[key], enumerable: !(desc = __getOwnPropDesc(module2, key)) || desc.enumerable });
  }
  return target;
};
var __toESM = (module2, isNodeMode) => {
  return __reExport(__markAsModule(__defProp(module2 != null ? __create(__getProtoOf(module2)) : {}, "default", !isNodeMode && module2 && module2.__esModule ? { get: () => module2.default, enumerable: true } : { value: module2, enumerable: true })), module2);
};
var __toCommonJS = /* @__PURE__ */ ((cache) => {
  return (module2, temp) => {
    return cache && cache.get(module2) || (temp = __reExport(__markAsModule({}), module2, 1), cache && cache.set(module2, temp), temp);
  };
})(typeof WeakMap !== "undefined" ? /* @__PURE__ */ new WeakMap() : 0);
var GoParser_exports = {};
__export(GoParser_exports, {
  default: () => GoParser
});
var import_antlr4 = __toESM(require("antlr4"));
var import_GoParserListener = __toESM(require("./GoParserListener.js"));
var import_GoParserVisitor = __toESM(require("./GoParserVisitor.js"));
var import_GoParserBase = __toESM(require("./GoParserBase.js"));
const serializedATN = [
  "\u608B\uA72A\u8133\uB9ED\u417C\u3BE7\u7786",
  "\u5964Z\u03BA		",
  "			\x07	\x07",
  "\b	\b			\n	\n\v	\v\f	\f",
  "\r	\r			",
  "			",
  "				",
  "			\x1B",
  "	\x1B			",
  '	 	 !	!"	"#	#',
  "$	$%	%&	&'	'(	()	)*	*",
  "+	+,	,-	-.	./	/0	01	1",
  "2	23	34	45	56	67	78	8",
  "9	9:	:;	;<	<=	=>	>?	?",
  "@	@A	AB	BC	CD	DE	EF	F",
  "G	GH	HI	IJ	JK	KL	LM	M",
  "N	NO	OP	PQ	QR	RS	ST	T",
  "U	UV	VW	WX	XY	YZ	Z[	[",
  "\\	\\]	]^	^_	_`	`a	ab	b",
  "c	cd	d",
  "\x07\xCE\n\f\xD1\v",
  "\xD6\n",
  "\x07\xDA\n\f\xDD",
  "\v",
  "",
  "\x07\xEA\n\f\xED\v",
  "\xF0\n\xF3\n",
  "\x07\x07",
  "\x07\x07\xFC\n\x07\b\b\b",
  "\b\b\b\x07\b\u0104\n\b\f\b\b\u0107\v\b",
  "\b\b\u010A\n\b			\u010E\n		",
  "		\u0112\n	\n\n\n\x07\n\u0117\n\n\f\n",
  "\n\u011A\v\n\v\v\v\x07\v\u011F",
  "\n\v\f\v\v\u0122\v\v\f\f",
  "\f\f\f\f\x07\f\u012A\n\f\f\f\f\u012D\v",
  "\f\f\f\u0130\n\f\r\r\r\u0134\n\r",
  "\r\r",
  "\u013C\n",
  "\u0143\n",
  "\x07",
  "\u014D\n\f\u0150\v",
  "\u0153\n",
  "\u0159\n\u015D",
  "\n\u0161\n",
  "\u0166\n",
  "\u016B\n\r\u016C",
  "",
  "",
  "\u017E\n",
  "\u0185",
  "\n",
  "",
  "\x1B\x1B\u0195\n\x1B",
  "\x1B\x1B",
  "\u01A2",
  "\n\u01A6\n ",
  '  \u01AA\n !!!\u01AE\n!""',
  '"##$$$%%%%',
  "%%%%%%\u01C1\n%%%%",
  "%%\u01C7\n%%\u01C9\n%&&&\u01CD\n&",
  "'''\u01D1\n'''\u01D4\n''",
  "''\u01D8\n''\u01DA\n'''\x07'\u01DE",
  "\n'\f''\u01E1\v'''(((",
  "(\u01E8\n())))\u01ED\n)**",
  "********\u01F8\n*",
  "**\x07*\u01FC\n*\f**\u01FF\v***",
  "+++\u0205\n+++++++",
  ",,,,\u0210\n,----\u0215\n",
  "-...\u0219\n.....\u021E\n",
  ".\x07.\u0220\n.\f..\u0223\v.///\x07",
  "/\u0228\n/\f//\u022B\v///00",
  "00\u0232\n01111\u0237\n11",
  "1\u023A\n12222222\u0242\n",
  "22233333\u024A\n33",
  "344\u024F\n4444\u0253\n44",
  "44\u0257\n45555555\u025F",
  "\n5555666777",
  "7777\u026D\n7888\u0271\n8",
  "999999999\u027B\n9",
  ":::::;;<<=",
  "==>>>>>\u028D\n>>>\x07",
  ">\u0291\n>\f>>\u0294\v>>>??",
  "??@@@@@@AA",
  "AAAA\u02A7\nAAABBB",
  "BBBB\u02B1\nBCCCDD",
  "DDD\u02BA\nDEEE\u02BE\nEF",
  "FFF\x07F\u02C4\nF\fFF\u02C7\vFF",
  "F\u02CA\nFF\u02CC\nFFFGG\u02D1\nG",
  "GG\u02D4\nGGGHHHHH\u02DC",
  "\nHHHHHHHHHH",
  "HHHHHH\x07H\u02ED\nH\fHH\u02F0",
  "\vHIIIII\u02F6\nIII",
  "IIIIII\u02FF\nI\x07I\u0301\nI\fI",
  "I\u0304\vIJJJJJ\u030A\nJJ",
  "JKKKKKK\u0313\nKLL",
  "LLLLL\u031B\nLMMMM\u0320",
  "\nMNNNNN\u0326\nNOO",
  "PPQQQQRRRS",
  "SSSSSSSSS\u033C\nS",
  "TTTT\u0341\nTT\u0343\nTTT",
  "UUU\x07U\u034A\nU\fUU\u034D\vUV",
  "VVV\u0352\nVVVWWW\u0358\n",
  "WXXX\u035C\nXYYYYY\x07",
  "Y\u0363\nY\fYY\u0366\vYYYZZ",
  "ZZZ\u036E\nZZZ\u0371\nZ[[",
  "\\\\\u0376\n\\\\\\]]]]",
  "^^^^___\u0384\n___",
  "_\u0388\n___\u038B\n_____",
  "__\u0392\n___`````",
  "aaaaaa\u03A0\naa\u03A2\na",
  "aa\u03A5\naaa\u03A8\naa\u03AA\naa",
  "abbbbccddd",
  "dd\u03B8\ndd\x8E\x90e",
  '\b\n\f "$&(*',
  ",.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\x80\x82\x84\x86",
  "\x88\x8A\x8C\x8E\x90\x92\x94\x96\x98\x9A\x9C\x9E",
  "\xA0\xA2\xA4\xA6\xA8\xAA\xAC\xAE\xB0\xB2\xB4\xB6",
  "\xB8\xBA\xBC\xBE\xC0\xC2\xC4\xC6\f",
  "(()*5:<@&&YY",
  ";A6:?@55<>/4BEIJ",
  "PQ\u03F2\xC8\xE0",
  "\xE3\b\xF2",
  "\n\xF6\f\xFB",
  "\xFD\u010B",
  "\u0113\u011B",
  "\u0123\u0131",
  "\u0137\u013D",
  "\u0144 \u0146",
  '"\u0154$\u015E',
  "&\u016A(\u017D",
  "*\u0184,\u0186",
  ".\u01880\u018C2\u018F",
  "4\u01946\u0198",
  "8\u019C:\u019E",
  "<\u01A3>\u01A7",
  "@\u01ABB\u01AF",
  "D\u01B2F\u01B4H\u01B7",
  "J\u01CCL\u01CE",
  "N\u01E4P\u01EC",
  "R\u01EET\u0204",
  "V\u020CX\u0214",
  "Z\u0218\\\u0224^\u022E",
  "`\u0239b\u0241",
  "d\u0245f\u024E",
  "h\u025Ej\u0263",
  "l\u026Cn\u0270",
  "p\u027Ar\u027Ct\u0281",
  "v\u0283x\u0285",
  "z\u0288|\u0297",
  "~\u029B\x80\u02A6",
  "\x82\u02B0\x84\u02B2",
  "\x86\u02B9\x88\u02BD",
  "\x8A\u02BF\x8C\u02D0",
  "\x8E\u02DB\x90\u02F5",
  "\x92\u0305\x94\u0312",
  "\x96\u031A\x98\u031F",
  "\x9A\u0325\x9C\u0327",
  "\x9E\u0329\xA0\u032B",
  "\xA2\u032F\xA4\u033B",
  "\xA6\u033D\xA8\u0346",
  "\xAA\u0351\xAC\u0357",
  "\xAE\u035B\xB0\u035D",
  "\xB2\u036D\xB4\u0372",
  "\xB6\u0375\xB8\u0379",
  "\xBA\u037D\xBC\u0381",
  "\xBE\u0395\xC0\u039A",
  "\xC2\u03AD\xC4\u03B1",
  "\xC6\u03B7\xC8\xC9",
  "\xC9\xCF\xC6d\xCA\xCB",
  "\xCB\xCC\xC6d\xCC\xCE",
  "\xCD\xCA\xCE\xD1",
  "\xCF\xCD\xCF\xD0",
  "\xD0\xDB\xD1\xCF",
  "\xD2\xD6\xD3\xD6",
  "\xD4\xD6\f\x07\xD5\xD2",
  "\xD5\xD3\xD5\xD4",
  "\xD6\xD7\xD7\xD8\xC6",
  "d\xD8\xDA\xD9\xD5",
  "\xDA\xDD\xDB\xD9",
  "\xDB\xDC\xDC\xDE",
  "\xDD\xDB\xDE\xDF\x07",
  "\xDF\xE0\xE1\x07",
  "\xE1\xE2\x07\xE2",
  "\xE3\xEF\x07\xE4\xF0\b",
  "\xE5\xEB\x07\xE6\xE7\b",
  "\xE7\xE8\xC6d\xE8\xEA",
  "\xE9\xE6\xEA\xED",
  "\xEB\xE9\xEB\xEC",
  "\xEC\xEE\xED\xEB",
  "\xEE\xF0\x07\xEF\xE4",
  "\xEF\xE5\xF0\x07",
  "\xF1\xF3	\xF2\xF1",
  "\xF2\xF3\xF3\xF4",
  "\xF4\xF5\n\xF5	",
  "\xF6\xF7\xB4[\xF7\v",
  "\xF8\xFC\b\xF9\xFC\f",
  "\xFA\xFC \xFB\xF8",
  "\xFB\xF9\xFB\xFA",
  "\xFC\r\xFD\u0109\x07",
  "\xFE\u010A	\xFF\u0105\x07",
  "\u0100\u0101	\u0101\u0102\xC6d\u0102",
  "\u0104\u0103\u0100\u0104",
  "\u0107\u0105\u0103\u0105",
  "\u0106\u0106\u0108\u0107",
  "\u0105\u0108\u010A\x07\u0109",
  "\xFE\u0109\xFF\u010A",
  "\u010B\u0111\n\u010C",
  "\u010El7\u010D\u010C\u010D\u010E",
  "\u010E\u010F\u010F\u0110",
  "\x07$\u0110\u0112\v\u0111\u010D",
  "\u0111\u0112\u0112",
  "\u0113\u0118\x07\u0114\u0115",
  "\x07%\u0115\u0117\x07\u0116\u0114",
  "\u0117\u011A\u0118\u0116",
  "\u0118\u0119\u0119",
  "\u011A\u0118\u011B\u0120",
  "\x8EH\u011C\u011D\x07%\u011D\u011F",
  "\x8EH\u011E\u011C\u011F\u0122",
  "\u0120\u011E\u0120\u0121",
  "\u0121\u0122\u0120",
  "\u0123\u012F\x07\u0124\u0130",
  "\r\u0125\u012B\x07\u0126\u0127",
  "\r\u0127\u0128\xC6d\u0128\u012A",
  "\u0129\u0126\u012A\u012D",
  "\u012B\u0129\u012B\u012C",
  "\u012C\u012E\u012D\u012B",
  "\u012E\u0130\x07\u012F\u0124",
  "\u012F\u0125\u0130",
  "\u0131\u0133\x07\u0132\u0134\x07$",
  "\u0133\u0132\u0133\u0134",
  "\u0134\u0135\u0135\u0136l",
  "7\u0136\u0137\u0138\x07",
  "\u0138\u0139\x07\u0139\u013B\x86",
  "D\u013A\u013C$\u013B\u013A",
  "\u013B\u013C\u013C\x1B",
  "\u013D\u013E\x07\u013E\u013F",
  "\u013F\u0140\x07\u0140\u0142\x86D",
  "\u0141\u0143$\u0142\u0141",
  "\u0142\u0143\u0143",
  "\u0144\u0145\x8AF\u0145",
  '\u0146\u0152\x07\x1B\u0147\u0153"',
  '\u0148\u014E\x07\u0149\u014A"',
  "\u014A\u014B\xC6d\u014B\u014D",
  "\u014C\u0149\u014D\u0150",
  "\u014E\u014C\u014E\u014F",
  "\u014F\u0151\u0150\u014E",
  "\u0151\u0153\x07\u0152\u0147",
  "\u0152\u0148\u0153!",
  "\u0154\u015C\n\u0155\u0158l7\u0156",
  "\u0157\x07$\u0157\u0159\v\u0158",
  "\u0156\u0158\u0159\u0159",
  "\u015D\u015A\u015B\x07$\u015B",
  "\u015D\v\u015C\u0155\u015C",
  "\u015A\u015D#\u015E",
  "\u0160\x07 \u015F\u0161&\u0160\u015F",
  "\u0160\u0161\u0161\u0162",
  "\u0162\u0163\x07!\u0163%",
  "\u0164\u0166\xC6d\u0165\u0164",
  "\u0165\u0166\u0166\u0167",
  "\u0167\u0168(\u0168\u0169",
  "\xC6d\u0169\u016B\u016A\u0165",
  "\u016B\u016C\u016C\u016A",
  "\u016C\u016D\u016D'",
  "\u016E\u017E\f\x07\u016F\u017E",
  ":\u0170\u017E*\u0171\u017Ej6",
  "\u0172\u017E<\u0173\u017E> \u0174\u017E",
  '@!\u0175\u017EB"\u0176\u017ED#',
  "\u0177\u017E$\u0178\u017EH%\u0179\u017E",
  "J&\u017A\u017E\\/\u017B\u017Ed3",
  "\u017C\u017EF$\u017D\u016E\u017D",
  "\u016F\u017D\u0170\u017D",
  "\u0171\u017D\u0172\u017D",
  "\u0173\u017D\u0174\u017D",
  "\u0175\u017D\u0176\u017D",
  "\u0177\u017D\u0178\u017D",
  "\u0179\u017D\u017A\u017D",
  "\u017B\u017D\u017C\u017E",
  ")\u017F\u0185.\u0180\u0185",
  "0\u0181\u01852\u0182\u0185",
  ",\u0183\u01856\u0184\u017F",
  "\u0184\u0180\u0184\u0181",
  "\u0184\u0182\u0184\u0183",
  "\u0185+\u0186\u0187\x8E",
  "H\u0187-\u0188\u0189\x8EH",
  "\u0189\u018A\x07A\u018A\u018B\x8EH\u018B",
  "/\u018C\u018D\x8EH\u018D\u018E",
  "	\u018E1\u018F\u0190",
  "\v\u0190\u01914\x1B\u0191\u0192",
  "\v\u01923\u0193\u0195	",
  "\u0194\u0193\u0194\u0195",
  "\u0195\u0196\u0196\u0197\x07$",
  "\u01975\u0198\u0199",
  "\n\u0199\u019A\x07+\u019A\u019B\v",
  "\u019B7\u019C\u019D	",
  "\u019D9\u019E\u019F\x07",
  "\u019F\u01A1\x07'\u01A0\u01A2(\u01A1",
  "\u01A0\u01A1\u01A2\u01A2",
  ";\u01A3\u01A5\x07\u01A4",
  "\u01A6\v\u01A5\u01A4\u01A5",
  "\u01A6\u01A6=\u01A7",
  "\u01A9\x07\u01A8\u01AA\x07\u01A9",
  "\u01A8\u01A9\u01AA\u01AA",
  "?\u01AB\u01AD\x07\u01AC",
  "\u01AE\x07\u01AD\u01AC\u01AD",
  "\u01AE\u01AEA\u01AF",
  "\u01B0\x07\u01B0\u01B1\x07\u01B1",
  "C\u01B2\u01B3\x07\u01B3",
  "E\u01B4\u01B5\x07	\u01B5\u01B6",
  "\x8EH\u01B6G\u01B7\u01C0\x07",
  "\u01B8\u01C1\x8EH\u01B9\u01BA",
  "\xC6d\u01BA\u01BB\x8EH\u01BB\u01C1",
  "\u01BC\u01BD*\u01BD\u01BE\xC6",
  "d\u01BE\u01BF\x8EH\u01BF\u01C1",
  "\u01C0\u01B8\u01C0\u01B9",
  "\u01C0\u01BC\u01C1\u01C2",
  "\u01C2\u01C8$\u01C3\u01C6\x07",
  "\u01C4\u01C7H%\u01C5\u01C7$\u01C6",
  "\u01C4\u01C6\u01C5\u01C7",
  "\u01C9\u01C8\u01C3\u01C8",
  "\u01C9\u01C9I\u01CA",
  "\u01CDL'\u01CB\u01CDR*\u01CC\u01CA",
  "\u01CC\u01CB\u01CDK",
  "\u01CE\u01D9\x07\u01CF\u01D1\x8E",
  "H\u01D0\u01CF\u01D0\u01D1",
  "\u01D1\u01DA\u01D2\u01D4*",
  "\u01D3\u01D2\u01D3\u01D4",
  "\u01D4\u01D5\u01D5\u01D7\xC6",
  "d\u01D6\u01D8\x8EH\u01D7\u01D6",
  "\u01D7\u01D8\u01D8\u01DA",
  "\u01D9\u01D0\u01D9\u01D3",
  "\u01DA\u01DB\u01DB\u01DF\x07 ",
  "\u01DC\u01DEN(\u01DD\u01DC",
  "\u01DE\u01E1\u01DF\u01DD",
  "\u01DF\u01E0\u01E0\u01E2",
  "\u01E1\u01DF\u01E2\u01E3\x07!",
  "\u01E3M\u01E4\u01E5P)\u01E5\u01E7",
  "\x07'\u01E6\u01E8&\u01E7\u01E6",
  "\u01E7\u01E8\u01E8O",
  "\u01E9\u01EA\x07\b\u01EA\u01ED",
  "\v\u01EB\u01ED\x07\u01EC\u01E9",
  "\u01EC\u01EB\u01EDQ",
  "\u01EE\u01F7\x07\u01EF\u01F8",
  "T+\u01F0\u01F1\xC6d\u01F1\u01F2T+\u01F2",
  "\u01F8\u01F3\u01F4*\u01F4",
  "\u01F5\xC6d\u01F5\u01F6T+\u01F6\u01F8",
  "\u01F7\u01EF\u01F7\u01F0",
  "\u01F7\u01F3\u01F8\u01F9",
  "\u01F9\u01FD\x07 \u01FA\u01FC",
  "V,\u01FB\u01FA\u01FC\u01FF",
  "\u01FD\u01FB\u01FD\u01FE",
  "\u01FE\u0200\u01FF\u01FD",
  "\u0200\u0201\x07!\u0201S",
  "\u0202\u0203\x07\u0203\u0205\x07+",
  "\u0204\u0202\u0204\u0205",
  "\u0205\u0206\u0206\u0207\x90I",
  "\u0207\u0208\x07(\u0208\u0209\x07",
  "\u0209\u020A\x07\u020A\u020B\x07",
  "\u020BU\u020C\u020DX-\u020D",
  "\u020F\x07'\u020E\u0210&\u020F\u020E",
  "\u020F\u0210\u0210W",
  "\u0211\u0212\x07\b\u0212\u0215",
  "Z.\u0213\u0215\x07\u0214\u0211",
  "\u0214\u0213\u0215Y",
  "\u0216\u0219l7\u0217\u0219\x07",
  "\u0218\u0216\u0218\u0217",
  "\u0219\u0221\u021A\u021D\x07%",
  "\u021B\u021El7\u021C\u021E\x07",
  "\u021D\u021B\u021D\u021C",
  "\u021E\u0220\u021F\u021A",
  "\u0220\u0223\u0221\u021F",
  "\u0221\u0222\u0222[",
  "\u0223\u0221\u0224\u0225\x07\x07",
  "\u0225\u0229\x07 \u0226\u0228^0\u0227",
  "\u0226\u0228\u022B\u0229",
  "\u0227\u0229\u022A\u022A",
  "\u022C\u022B\u0229\u022C",
  "\u022D\x07!\u022D]\u022E\u022F",
  "`1\u022F\u0231\x07'\u0230\u0232&",
  "\u0231\u0230\u0231\u0232",
  "\u0232_\u0233\u0236\x07\b",
  "\u0234\u0237.\u0235\u0237b2\u0236\u0234",
  "\u0236\u0235\u0237\u023A",
  "\u0238\u023A\x07\u0239\u0233",
  "\u0239\u0238\u023Aa",
  "\u023B\u023C\v\u023C\u023D",
  "\x07$\u023D\u0242\u023E\u023F",
  "\n\u023F\u0240\x07+\u0240\u0242",
  "\u0241\u023B\u0241\u023E",
  "\u0241\u0242\u0242\u0243",
  "\u0243\u0244\x8EH\u0244c",
  "\u0245\u0249\x07\u0246\u024A\x8E",
  "H\u0247\u024Af4\u0248\u024Ah5\u0249\u0246",
  "\u0249\u0247\u0249\u0248",
  "\u0249\u024A\u024A\u024B",
  "\u024B\u024C$\u024Ce",
  "\u024D\u024F*\u024E\u024D",
  "\u024E\u024F\u024F\u0250",
  "\u0250\u0252\xC6d\u0251\u0253",
  "\x8EH\u0252\u0251\u0252\u0253",
  "\u0253\u0254\u0254\u0256",
  "\xC6d\u0255\u0257*\u0256\u0255",
  "\u0256\u0257\u0257g",
  "\u0258\u0259\v\u0259\u025A\x07$",
  "\u025A\u025F\u025B\u025C",
  "\n\u025C\u025D\x07+\u025D\u025F",
  "\u025E\u0258\u025E\u025B",
  "\u025E\u025F\u025F\u0260",
  "\u0260\u0261\x07\u0261\u0262\x8EH",
  "\u0262i\u0263\u0264\x07\n",
  "\u0264\u0265\x8EH\u0265k\u0266",
  "\u026Dn8\u0267\u026Dp9\u0268\u0269\x07",
  "\u0269\u026Al7\u026A\u026B\x07",
  "\u026B\u026D\u026C\u0266",
  "\u026C\u0267\u026C\u0268",
  "\u026Dm\u026E\u0271\xA0Q",
  "\u026F\u0271\x07\u0270\u026E",
  "\u0270\u026F\u0271o",
  "\u0272\u027Br:\u0273\u027B\xB0Y\u0274\u027B",
  "x=\u0275\u027B\x84C\u0276\u027Bz>",
  "\u0277\u027B|?\u0278\u027B~@\u0279\u027B",
  "\x80A\u027A\u0272\u027A\u0273",
  "\u027A\u0274\u027A\u0275",
  "\u027A\u0276\u027A\u0277",
  "\u027A\u0278\u027A\u0279",
  "\u027Bq\u027C\u027D\x07",
  '"\u027D\u027Et;\u027E\u027F\x07#',
  "\u027F\u0280v<\u0280s\u0281\u0282",
  "\x8EH\u0282u\u0283\u0284",
  "l7\u0284w\u0285\u0286\x07?",
  "\u0286\u0287l7\u0287y\u0288\u0289",
  "\x07\u0289\u0292\x07 \u028A\u028D",
  "\x82B\u028B\u028Dn8\u028C\u028A",
  "\u028C\u028B\u028D\u028E",
  "\u028E\u028F\xC6d\u028F\u0291",
  "\u0290\u028C\u0291\u0294",
  "\u0292\u0290\u0292\u0293",
  "\u0293\u0295\u0294\u0292",
  "\u0295\u0296\x07!\u0296{",
  '\u0297\u0298\x07"\u0298\u0299\x07#',
  "\u0299\u029Av<\u029A}\u029B\u029C",
  '\x07\v\u029C\u029D\x07"\u029D\u029E',
  "l7\u029E\u029F\x07#\u029F\u02A0v<",
  "\u02A0\x7F\u02A1\u02A7\x07\r",
  "\u02A2\u02A3\x07\r\u02A3\u02A7\x07A\u02A4",
  "\u02A5\x07A\u02A5\u02A7\x07\r\u02A6\u02A1",
  "\u02A6\u02A2\u02A6\u02A4",
  "\u02A7\u02A8\u02A8\u02A9",
  "v<\u02A9\x81\u02AA\u02AB\x07",
  "\u02AB\u02AC\x8AF\u02AC\u02AD",
  "\x88E\u02AD\u02B1\u02AE\u02AF\x07",
  "\u02AF\u02B1\x8AF\u02B0\u02AA",
  "\u02B0\u02AE\u02B1\x83",
  "\u02B2\u02B3\x07\u02B3\u02B4",
  "\x86D\u02B4\x85\u02B5\u02B6",
  "\x8AF\u02B6\u02B7\x88E\u02B7\u02BA",
  "\u02B8\u02BA\x8AF\u02B9\u02B5",
  "\u02B9\u02B8\u02BA\x87",
  "\u02BB\u02BE\x8AF\u02BC\u02BEl7",
  "\u02BD\u02BB\u02BD\u02BC",
  "\u02BE\x89\u02BF\u02CB\x07",
  "\u02C0\u02C5\x8CG\u02C1\u02C2\x07%\u02C2",
  "\u02C4\x8CG\u02C3\u02C1\u02C4",
  "\u02C7\u02C5\u02C3\u02C5",
  "\u02C6\u02C6\u02C9\u02C7",
  "\u02C5\u02C8\u02CA\x07%\u02C9",
  "\u02C8\u02C9\u02CA\u02CA",
  "\u02CC\u02CB\u02C0\u02CB",
  "\u02CC\u02CC\u02CD\u02CD",
  "\u02CE\x07\u02CE\x8B\u02CF",
  "\u02D1\n\u02D0\u02CF\u02D0",
  "\u02D1\u02D1\u02D3\u02D2",
  "\u02D4\x07,\u02D3\u02D2\u02D3",
  "\u02D4\u02D4\u02D5\u02D5",
  "\u02D6l7\u02D6\x8D\u02D7\u02D8",
  "\bH\u02D8\u02DC\x90I\u02D9\u02DA	",
  "\u02DA\u02DC\x8EH\b\u02DB\u02D7",
  "\u02DB\u02D9\u02DC\u02EE",
  "\u02DD\u02DE\f\x07\u02DE\u02DF	\x07\u02DF",
  "\u02ED\x8EH\b\u02E0\u02E1\f\u02E1\u02E2	",
  "\b\u02E2\u02ED\x8EH\x07\u02E3\u02E4\f",
  "\u02E4\u02E5		\u02E5\u02ED\x8EH\u02E6",
  "\u02E7\f\u02E7\u02E8\x07.\u02E8\u02ED",
  "\x8EH\u02E9\u02EA\f\u02EA\u02EB\x07",
  "-\u02EB\u02ED\x8EH\u02EC\u02DD",
  "\u02EC\u02E0\u02EC\u02E3",
  "\u02EC\u02E6\u02EC\u02E9",
  "\u02ED\u02F0\u02EE\u02EC",
  "\u02EE\u02EF\u02EF\x8F",
  "\u02F0\u02EE\u02F1\u02F2\bI",
  "\u02F2\u02F6\x96L\u02F3\u02F6\x92J",
  "\u02F4\u02F6\xC2b\u02F5\u02F1",
  "\u02F5\u02F3\u02F5\u02F4",
  "\u02F6\u0302\u02F7\u02FE\f",
  "\u02F8\u02F9\x07(\u02F9\u02FF\x07",
  "\u02FA\u02FF\xBA^\u02FB\u02FF\xBC_\u02FC",
  "\u02FF\xBE`\u02FD\u02FF\xC0a\u02FE\u02F8",
  "\u02FE\u02FA\u02FE\u02FB",
  "\u02FE\u02FC\u02FE\u02FD",
  "\u02FF\u0301\u0300\u02F7",
  "\u0301\u0304\u0302\u0300",
  "\u0302\u0303\u0303\x91",
  "\u0304\u0302\u0305\u0306",
  "\x94K\u0306\u0307\x07\u0307\u0309",
  "\x8EH\u0308\u030A\x07%\u0309\u0308",
  "\u0309\u030A\u030A\u030B",
  "\u030B\u030C\x07\u030C\x93",
  "\u030D\u0313p9\u030E\u030F\x07",
  "\u030F\u0310\x94K\u0310\u0311\x07",
  "\u0311\u0313\u0312\u030D",
  "\u0312\u030E\u0313\x95",
  "\u0314\u031B\x98M\u0315\u031B\x9E",
  "P\u0316\u0317\x07\u0317\u0318\x8E",
  "H\u0318\u0319\x07\u0319\u031B",
  "\u031A\u0314\u031A\u0315",
  "\u031A\u0316\u031B\x97",
  "\u031C\u0320\x9AN\u031D\u0320\xA2",
  "R\u031E\u0320\xB8]\u031F\u031C",
  "\u031F\u031D\u031F\u031E",
  "\u0320\x99\u0321\u0326\x07",
  "\u0322\u0326\x9CO\u0323\u0326\xB4[",
  "\u0324\u0326\x07F\u0325\u0321",
  "\u0325\u0322\u0325\u0323",
  "\u0325\u0324\u0326\x9B",
  "\u0327\u0328	\n\u0328\x9D\u0329",
  "\u032A\x07\u032A\x9F\u032B",
  "\u032C\x07\u032C\u032D\x07(\u032D",
  "\u032E\x07\u032E\xA1\u032F",
  "\u0330\xA4S\u0330\u0331\xA6T\u0331\xA3",
  "\u0332\u033C\xB0Y\u0333\u033C",
  'r:\u0334\u0335\x07"\u0335\u0336\x07,',
  "\u0336\u0337\x07#\u0337\u033Cv<\u0338",
  "\u033C|?\u0339\u033C~@\u033A\u033Cn8",
  "\u033B\u0332\u033B\u0333",
  "\u033B\u0334\u033B\u0338",
  "\u033B\u0339\u033B\u033A",
  "\u033C\xA5\u033D\u0342\x07 ",
  "\u033E\u0340\xA8U\u033F\u0341\x07%\u0340",
  "\u033F\u0340\u0341\u0341",
  "\u0343\u0342\u033E\u0342",
  "\u0343\u0343\u0344\u0344",
  "\u0345\x07!\u0345\xA7\u0346",
  "\u034B\xAAV\u0347\u0348\x07%\u0348\u034A",
  "\xAAV\u0349\u0347\u034A\u034D",
  "\u034B\u0349\u034B\u034C",
  "\u034C\xA9\u034D\u034B",
  "\u034E\u034F\xACW\u034F\u0350",
  "\x07'\u0350\u0352\u0351\u034E",
  "\u0351\u0352\u0352\u0353",
  "\u0353\u0354\xAEX\u0354\xAB",
  "\u0355\u0358\x8EH\u0356\u0358",
  "\xA6T\u0357\u0355\u0357\u0356",
  "\u0358\xAD\u0359\u035C",
  "\x8EH\u035A\u035C\xA6T\u035B\u0359",
  "\u035B\u035A\u035C\xAF",
  "\u035D\u035E\x07\f\u035E\u0364\x07",
  " \u035F\u0360\xB2Z\u0360\u0361\xC6",
  "d\u0361\u0363\u0362\u035F",
  "\u0363\u0366\u0364\u0362",
  "\u0364\u0365\u0365\u0367",
  "\u0366\u0364\u0367\u0368\x07!",
  "\u0368\xB1\u0369\u036A",
  "\n\u036A\u036Bl7\u036B\u036E",
  "\u036C\u036E\xB6\\\u036D\u0369",
  "\u036D\u036C\u036E\u0370",
  "\u036F\u0371\xB4[\u0370\u036F",
  "\u0370\u0371\u0371\xB3",
  "\u0372\u0373	\v\u0373\xB5",
  "\u0374\u0376\x07?\u0375\u0374",
  "\u0375\u0376\u0376\u0377",
  "\u0377\u0378n8\u0378\xB7\u0379",
  "\u037A\x07\u037A\u037B\x86D\u037B",
  "\u037C$\u037C\xB9\u037D",
  '\u037E\x07"\u037E\u037F\x8EH\u037F\u0380',
  "\x07#\u0380\xBB\u0381\u0391",
  '\x07"\u0382\u0384\x8EH\u0383\u0382',
  "\u0383\u0384\u0384\u0385",
  "\u0385\u0387\x07'\u0386\u0388",
  "\x8EH\u0387\u0386\u0387\u0388",
  "\u0388\u0392\u0389\u038B",
  "\x8EH\u038A\u0389\u038A\u038B",
  "\u038B\u038C\u038C\u038D\x07",
  "'\u038D\u038E\x8EH\u038E\u038F\x07'",
  "\u038F\u0390\x8EH\u0390\u0392",
  "\u0391\u0383\u0391\u038A",
  "\u0392\u0393\u0393\u0394\x07#",
  "\u0394\xBD\u0395\u0396\x07(",
  "\u0396\u0397\x07\u0397\u0398l7",
  "\u0398\u0399\x07\u0399\xBF",
  "\u039A\u03A9\x07\u039B\u03A2\v",
  "\u039C\u039F\x94K\u039D\u039E\x07%\u039E",
  "\u03A0\v\u039F\u039D\u039F",
  "\u03A0\u03A0\u03A2\u03A1",
  "\u039B\u03A1\u039C\u03A2",
  "\u03A4\u03A3\u03A5\x07,\u03A4",
  "\u03A3\u03A4\u03A5\u03A5",
  "\u03A7\u03A6\u03A8\x07%\u03A7",
  "\u03A6\u03A7\u03A8\u03A8",
  "\u03AA\u03A9\u03A1\u03A9",
  "\u03AA\u03AA\u03AB\u03AB",
  "\u03AC\x07\u03AC\xC1\u03AD",
  "\u03AE\x94K\u03AE\u03AF\x07(\u03AF\u03B0",
  "\x07\u03B0\xC3\u03B1\u03B2",
  "l7\u03B2\xC5\u03B3\u03B8\x07",
  "&\u03B4\u03B8\x07\u03B5\u03B8\x07",
  "Y\u03B6\u03B8d\b\u03B7\u03B3",
  "\u03B7\u03B4\u03B7\u03B5",
  "\u03B7\u03B6\u03B8\xC7",
  "m\xCF\xD5\xDB\xEB\xEF\xF2\xFB\u0105\u0109\u010D",
  "\u0111\u0118\u0120\u012B\u012F\u0133\u013B\u0142\u014E\u0152\u0158\u015C",
  "\u0160\u0165\u016C\u017D\u0184\u0194\u01A1\u01A5\u01A9\u01AD\u01C0\u01C6",
  "\u01C8\u01CC\u01D0\u01D3\u01D7\u01D9\u01DF\u01E7\u01EC\u01F7\u01FD\u0204",
  "\u020F\u0214\u0218\u021D\u0221\u0229\u0231\u0236\u0239\u0241\u0249\u024E",
  "\u0252\u0256\u025E\u026C\u0270\u027A\u028C\u0292\u02A6\u02B0\u02B9\u02BD",
  "\u02C5\u02C9\u02CB\u02D0\u02D3\u02DB\u02EC\u02EE\u02F5\u02FE\u0302\u0309",
  "\u0312\u031A\u031F\u0325\u033B\u0340\u0342\u034B\u0351\u0357\u035B\u0364",
  "\u036D\u0370\u0375\u0383\u0387\u038A\u0391\u039F\u03A1\u03A4\u03A7\u03A9",
  "\u03B7"
].join("");
const atn = new import_antlr4.default.atn.ATNDeserializer().deserialize(serializedATN);
const decisionsToDFA = atn.decisionToState.map((ds, index) => new import_antlr4.default.dfa.DFA(ds, index));
const sharedContextCache = new import_antlr4.default.PredictionContextCache();
class GoParser extends import_GoParserBase.default {
  static grammarFileName = "GoParser.g4";
  static literalNames = [
    null,
    "'break'",
    "'default'",
    "'func'",
    "'interface'",
    "'select'",
    "'case'",
    "'defer'",
    "'go'",
    "'map'",
    "'struct'",
    "'chan'",
    "'else'",
    "'goto'",
    "'package'",
    "'switch'",
    "'const'",
    "'fallthrough'",
    "'if'",
    "'range'",
    "'type'",
    "'continue'",
    "'for'",
    "'import'",
    "'return'",
    "'var'",
    "'nil'",
    null,
    "'('",
    "')'",
    "'{'",
    "'}'",
    "'['",
    "']'",
    "'='",
    "','",
    "';'",
    "':'",
    "'.'",
    "'++'",
    "'--'",
    "':='",
    "'...'",
    "'||'",
    "'&&'",
    "'=='",
    "'!='",
    "'<'",
    "'<='",
    "'>'",
    "'>='",
    "'|'",
    "'/'",
    "'%'",
    "'<<'",
    "'>>'",
    "'&^'",
    "'!'",
    "'+'",
    "'-'",
    "'^'",
    "'*'",
    "'&'",
    "'<-'"
  ];
  static symbolicNames = [
    null,
    "BREAK",
    "DEFAULT",
    "FUNC",
    "INTERFACE",
    "SELECT",
    "CASE",
    "DEFER",
    "GO",
    "MAP",
    "STRUCT",
    "CHAN",
    "ELSE",
    "GOTO",
    "PACKAGE",
    "SWITCH",
    "CONST",
    "FALLTHROUGH",
    "IF",
    "RANGE",
    "TYPE",
    "CONTINUE",
    "FOR",
    "IMPORT",
    "RETURN",
    "VAR",
    "NIL_LIT",
    "IDENTIFIER",
    "L_PAREN",
    "R_PAREN",
    "L_CURLY",
    "R_CURLY",
    "L_BRACKET",
    "R_BRACKET",
    "ASSIGN",
    "COMMA",
    "SEMI",
    "COLON",
    "DOT",
    "PLUS_PLUS",
    "MINUS_MINUS",
    "DECLARE_ASSIGN",
    "ELLIPSIS",
    "LOGICAL_OR",
    "LOGICAL_AND",
    "EQUALS",
    "NOT_EQUALS",
    "LESS",
    "LESS_OR_EQUALS",
    "GREATER",
    "GREATER_OR_EQUALS",
    "OR",
    "DIV",
    "MOD",
    "LSHIFT",
    "RSHIFT",
    "BIT_CLEAR",
    "EXCLAMATION",
    "PLUS",
    "MINUS",
    "CARET",
    "STAR",
    "AMPERSAND",
    "RECEIVE",
    "DECIMAL_LIT",
    "BINARY_LIT",
    "OCTAL_LIT",
    "HEX_LIT",
    "FLOAT_LIT",
    "DECIMAL_FLOAT_LIT",
    "HEX_FLOAT_LIT",
    "IMAGINARY_LIT",
    "RUNE_LIT",
    "BYTE_VALUE",
    "OCTAL_BYTE_VALUE",
    "HEX_BYTE_VALUE",
    "LITTLE_U_VALUE",
    "BIG_U_VALUE",
    "RAW_STRING_LIT",
    "INTERPRETED_STRING_LIT",
    "WS",
    "COMMENT",
    "TERMINATOR",
    "LINE_COMMENT",
    "WS_NLSEMI",
    "COMMENT_NLSEMI",
    "LINE_COMMENT_NLSEMI",
    "EOS",
    "OTHER"
  ];
  static ruleNames = [
    "sourceFile",
    "packageClause",
    "importDecl",
    "importSpec",
    "importPath",
    "declaration",
    "constDecl",
    "constSpec",
    "identifierList",
    "expressionList",
    "typeDecl",
    "typeSpec",
    "functionDecl",
    "methodDecl",
    "receiver",
    "varDecl",
    "varSpec",
    "block",
    "statementList",
    "statement",
    "simpleStmt",
    "expressionStmt",
    "sendStmt",
    "incDecStmt",
    "assignment",
    "assign_op",
    "shortVarDecl",
    "emptyStmt",
    "labeledStmt",
    "returnStmt",
    "breakStmt",
    "continueStmt",
    "gotoStmt",
    "fallthroughStmt",
    "deferStmt",
    "ifStmt",
    "switchStmt",
    "exprSwitchStmt",
    "exprCaseClause",
    "exprSwitchCase",
    "typeSwitchStmt",
    "typeSwitchGuard",
    "typeCaseClause",
    "typeSwitchCase",
    "typeList",
    "selectStmt",
    "commClause",
    "commCase",
    "recvStmt",
    "forStmt",
    "forClause",
    "rangeClause",
    "goStmt",
    "type_",
    "typeName",
    "typeLit",
    "arrayType",
    "arrayLength",
    "elementType",
    "pointerType",
    "interfaceType",
    "sliceType",
    "mapType",
    "channelType",
    "methodSpec",
    "functionType",
    "signature",
    "result",
    "parameters",
    "parameterDecl",
    "expression",
    "primaryExpr",
    "conversion",
    "nonNamedType",
    "operand",
    "literal",
    "basicLit",
    "integer",
    "operandName",
    "qualifiedIdent",
    "compositeLit",
    "literalType",
    "literalValue",
    "elementList",
    "keyedElement",
    "key",
    "element",
    "structType",
    "fieldDecl",
    "string_",
    "embeddedField",
    "functionLit",
    "index",
    "slice_",
    "typeAssertion",
    "arguments",
    "methodExpr",
    "receiverType",
    "eos"
  ];
  constructor(input) {
    super(input);
    this._interp = new import_antlr4.default.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = GoParser.ruleNames;
    this.literalNames = GoParser.literalNames;
    this.symbolicNames = GoParser.symbolicNames;
  }
  get atn() {
    return atn;
  }
  sempred(localctx, ruleIndex, predIndex) {
    switch (ruleIndex) {
      case 70:
        return this.expression_sempred(localctx, predIndex);
      case 71:
        return this.primaryExpr_sempred(localctx, predIndex);
      case 98:
        return this.eos_sempred(localctx, predIndex);
      default:
        throw "No predicate with index:" + ruleIndex;
    }
  }
  expression_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 0:
        return this.precpred(this._ctx, 5);
      case 1:
        return this.precpred(this._ctx, 4);
      case 2:
        return this.precpred(this._ctx, 3);
      case 3:
        return this.precpred(this._ctx, 2);
      case 4:
        return this.precpred(this._ctx, 1);
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  primaryExpr_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 5:
        return this.precpred(this._ctx, 1);
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  eos_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 6:
        return this.closingBracket();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  sourceFile() {
    let localctx = new SourceFileContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, GoParser.RULE_sourceFile);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 198;
      this.packageClause();
      this.state = 199;
      this.eos();
      this.state = 205;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === GoParser.IMPORT) {
        this.state = 200;
        this.importDecl();
        this.state = 201;
        this.eos();
        this.state = 207;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 217;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while ((_la & ~31) == 0 && (1 << _la & (1 << GoParser.FUNC | 1 << GoParser.CONST | 1 << GoParser.TYPE | 1 << GoParser.VAR)) !== 0) {
        this.state = 211;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input, 1, this._ctx);
        switch (la_) {
          case 1:
            this.state = 208;
            this.functionDecl();
            break;
          case 2:
            this.state = 209;
            this.methodDecl();
            break;
          case 3:
            this.state = 210;
            this.declaration();
            break;
        }
        this.state = 213;
        this.eos();
        this.state = 219;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 220;
      this.match(GoParser.EOF);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  packageClause() {
    let localctx = new PackageClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, GoParser.RULE_packageClause);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 222;
      this.match(GoParser.PACKAGE);
      this.state = 223;
      localctx.packageName = this.match(GoParser.IDENTIFIER);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  importDecl() {
    let localctx = new ImportDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, GoParser.RULE_importDecl);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 225;
      this.match(GoParser.IMPORT);
      this.state = 237;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.IDENTIFIER:
        case GoParser.DOT:
        case GoParser.RAW_STRING_LIT:
        case GoParser.INTERPRETED_STRING_LIT:
          this.state = 226;
          this.importSpec();
          break;
        case GoParser.L_PAREN:
          this.state = 227;
          this.match(GoParser.L_PAREN);
          this.state = 233;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          while (_la === GoParser.IDENTIFIER || _la === GoParser.DOT || _la === GoParser.RAW_STRING_LIT || _la === GoParser.INTERPRETED_STRING_LIT) {
            this.state = 228;
            this.importSpec();
            this.state = 229;
            this.eos();
            this.state = 235;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          }
          this.state = 236;
          this.match(GoParser.R_PAREN);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  importSpec() {
    let localctx = new ImportSpecContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, GoParser.RULE_importSpec);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 240;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === GoParser.IDENTIFIER || _la === GoParser.DOT) {
        this.state = 239;
        localctx.alias = this._input.LT(1);
        _la = this._input.LA(1);
        if (!(_la === GoParser.IDENTIFIER || _la === GoParser.DOT)) {
          localctx.alias = this._errHandler.recoverInline(this);
        } else {
          this._errHandler.reportMatch(this);
          this.consume();
        }
      }
      this.state = 242;
      this.importPath();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  importPath() {
    let localctx = new ImportPathContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, GoParser.RULE_importPath);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 244;
      this.string_();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  declaration() {
    let localctx = new DeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, GoParser.RULE_declaration);
    try {
      this.state = 249;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.CONST:
          this.enterOuterAlt(localctx, 1);
          this.state = 246;
          this.constDecl();
          break;
        case GoParser.TYPE:
          this.enterOuterAlt(localctx, 2);
          this.state = 247;
          this.typeDecl();
          break;
        case GoParser.VAR:
          this.enterOuterAlt(localctx, 3);
          this.state = 248;
          this.varDecl();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  constDecl() {
    let localctx = new ConstDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, GoParser.RULE_constDecl);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 251;
      this.match(GoParser.CONST);
      this.state = 263;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.IDENTIFIER:
          this.state = 252;
          this.constSpec();
          break;
        case GoParser.L_PAREN:
          this.state = 253;
          this.match(GoParser.L_PAREN);
          this.state = 259;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          while (_la === GoParser.IDENTIFIER) {
            this.state = 254;
            this.constSpec();
            this.state = 255;
            this.eos();
            this.state = 261;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          }
          this.state = 262;
          this.match(GoParser.R_PAREN);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  constSpec() {
    let localctx = new ConstSpecContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, GoParser.RULE_constSpec);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 265;
      this.identifierList();
      this.state = 271;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 10, this._ctx);
      if (la_ === 1) {
        this.state = 267;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if ((_la & ~31) == 0 && (1 << _la & (1 << GoParser.FUNC | 1 << GoParser.INTERFACE | 1 << GoParser.MAP | 1 << GoParser.STRUCT | 1 << GoParser.CHAN | 1 << GoParser.IDENTIFIER | 1 << GoParser.L_PAREN)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << GoParser.L_BRACKET - 32 | 1 << GoParser.STAR - 32 | 1 << GoParser.RECEIVE - 32)) !== 0) {
          this.state = 266;
          this.type_();
        }
        this.state = 269;
        this.match(GoParser.ASSIGN);
        this.state = 270;
        this.expressionList();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  identifierList() {
    let localctx = new IdentifierListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, GoParser.RULE_identifierList);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 273;
      this.match(GoParser.IDENTIFIER);
      this.state = 278;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 11, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 274;
          this.match(GoParser.COMMA);
          this.state = 275;
          this.match(GoParser.IDENTIFIER);
        }
        this.state = 280;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 11, this._ctx);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  expressionList() {
    let localctx = new ExpressionListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, GoParser.RULE_expressionList);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 281;
      this.expression(0);
      this.state = 286;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 282;
          this.match(GoParser.COMMA);
          this.state = 283;
          this.expression(0);
        }
        this.state = 288;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeDecl() {
    let localctx = new TypeDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, GoParser.RULE_typeDecl);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 289;
      this.match(GoParser.TYPE);
      this.state = 301;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.IDENTIFIER:
          this.state = 290;
          this.typeSpec();
          break;
        case GoParser.L_PAREN:
          this.state = 291;
          this.match(GoParser.L_PAREN);
          this.state = 297;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          while (_la === GoParser.IDENTIFIER) {
            this.state = 292;
            this.typeSpec();
            this.state = 293;
            this.eos();
            this.state = 299;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          }
          this.state = 300;
          this.match(GoParser.R_PAREN);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeSpec() {
    let localctx = new TypeSpecContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, GoParser.RULE_typeSpec);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 303;
      this.match(GoParser.IDENTIFIER);
      this.state = 305;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === GoParser.ASSIGN) {
        this.state = 304;
        this.match(GoParser.ASSIGN);
      }
      this.state = 307;
      this.type_();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  functionDecl() {
    let localctx = new FunctionDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, GoParser.RULE_functionDecl);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 309;
      this.match(GoParser.FUNC);
      this.state = 310;
      this.match(GoParser.IDENTIFIER);
      this.state = 311;
      this.signature();
      this.state = 313;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 16, this._ctx);
      if (la_ === 1) {
        this.state = 312;
        this.block();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  methodDecl() {
    let localctx = new MethodDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, GoParser.RULE_methodDecl);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 315;
      this.match(GoParser.FUNC);
      this.state = 316;
      this.receiver();
      this.state = 317;
      this.match(GoParser.IDENTIFIER);
      this.state = 318;
      this.signature();
      this.state = 320;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 17, this._ctx);
      if (la_ === 1) {
        this.state = 319;
        this.block();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  receiver() {
    let localctx = new ReceiverContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, GoParser.RULE_receiver);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 322;
      this.parameters();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  varDecl() {
    let localctx = new VarDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, GoParser.RULE_varDecl);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 324;
      this.match(GoParser.VAR);
      this.state = 336;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.IDENTIFIER:
          this.state = 325;
          this.varSpec();
          break;
        case GoParser.L_PAREN:
          this.state = 326;
          this.match(GoParser.L_PAREN);
          this.state = 332;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          while (_la === GoParser.IDENTIFIER) {
            this.state = 327;
            this.varSpec();
            this.state = 328;
            this.eos();
            this.state = 334;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          }
          this.state = 335;
          this.match(GoParser.R_PAREN);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  varSpec() {
    let localctx = new VarSpecContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, GoParser.RULE_varSpec);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 338;
      this.identifierList();
      this.state = 346;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.FUNC:
        case GoParser.INTERFACE:
        case GoParser.MAP:
        case GoParser.STRUCT:
        case GoParser.CHAN:
        case GoParser.IDENTIFIER:
        case GoParser.L_PAREN:
        case GoParser.L_BRACKET:
        case GoParser.STAR:
        case GoParser.RECEIVE:
          this.state = 339;
          this.type_();
          this.state = 342;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 20, this._ctx);
          if (la_ === 1) {
            this.state = 340;
            this.match(GoParser.ASSIGN);
            this.state = 341;
            this.expressionList();
          }
          break;
        case GoParser.ASSIGN:
          this.state = 344;
          this.match(GoParser.ASSIGN);
          this.state = 345;
          this.expressionList();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  block() {
    let localctx = new BlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, GoParser.RULE_block);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 348;
      this.match(GoParser.L_CURLY);
      this.state = 350;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 22, this._ctx);
      if (la_ === 1) {
        this.state = 349;
        this.statementList();
      }
      this.state = 352;
      this.match(GoParser.R_CURLY);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  statementList() {
    let localctx = new StatementListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 36, GoParser.RULE_statementList);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 360;
      this._errHandler.sync(this);
      var _alt = 1;
      do {
        switch (_alt) {
          case 1:
            this.state = 355;
            this._errHandler.sync(this);
            var la_ = this._interp.adaptivePredict(this._input, 23, this._ctx);
            if (la_ === 1) {
              this.state = 354;
              this.eos();
            }
            this.state = 357;
            this.statement();
            this.state = 358;
            this.eos();
            break;
          default:
            throw new import_antlr4.default.error.NoViableAltException(this);
        }
        this.state = 362;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 24, this._ctx);
      } while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  statement() {
    let localctx = new StatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, GoParser.RULE_statement);
    try {
      this.state = 379;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 25, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 364;
          this.declaration();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 365;
          this.labeledStmt();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 366;
          this.simpleStmt();
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 367;
          this.goStmt();
          break;
        case 5:
          this.enterOuterAlt(localctx, 5);
          this.state = 368;
          this.returnStmt();
          break;
        case 6:
          this.enterOuterAlt(localctx, 6);
          this.state = 369;
          this.breakStmt();
          break;
        case 7:
          this.enterOuterAlt(localctx, 7);
          this.state = 370;
          this.continueStmt();
          break;
        case 8:
          this.enterOuterAlt(localctx, 8);
          this.state = 371;
          this.gotoStmt();
          break;
        case 9:
          this.enterOuterAlt(localctx, 9);
          this.state = 372;
          this.fallthroughStmt();
          break;
        case 10:
          this.enterOuterAlt(localctx, 10);
          this.state = 373;
          this.block();
          break;
        case 11:
          this.enterOuterAlt(localctx, 11);
          this.state = 374;
          this.ifStmt();
          break;
        case 12:
          this.enterOuterAlt(localctx, 12);
          this.state = 375;
          this.switchStmt();
          break;
        case 13:
          this.enterOuterAlt(localctx, 13);
          this.state = 376;
          this.selectStmt();
          break;
        case 14:
          this.enterOuterAlt(localctx, 14);
          this.state = 377;
          this.forStmt();
          break;
        case 15:
          this.enterOuterAlt(localctx, 15);
          this.state = 378;
          this.deferStmt();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  simpleStmt() {
    let localctx = new SimpleStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 40, GoParser.RULE_simpleStmt);
    try {
      this.state = 386;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 26, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 381;
          this.sendStmt();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 382;
          this.incDecStmt();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 383;
          this.assignment();
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 384;
          this.expressionStmt();
          break;
        case 5:
          this.enterOuterAlt(localctx, 5);
          this.state = 385;
          this.shortVarDecl();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  expressionStmt() {
    let localctx = new ExpressionStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 42, GoParser.RULE_expressionStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 388;
      this.expression(0);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  sendStmt() {
    let localctx = new SendStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 44, GoParser.RULE_sendStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 390;
      localctx.channel = this.expression(0);
      this.state = 391;
      this.match(GoParser.RECEIVE);
      this.state = 392;
      this.expression(0);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  incDecStmt() {
    let localctx = new IncDecStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 46, GoParser.RULE_incDecStmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 394;
      this.expression(0);
      this.state = 395;
      _la = this._input.LA(1);
      if (!(_la === GoParser.PLUS_PLUS || _la === GoParser.MINUS_MINUS)) {
        this._errHandler.recoverInline(this);
      } else {
        this._errHandler.reportMatch(this);
        this.consume();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  assignment() {
    let localctx = new AssignmentContext(this, this._ctx, this.state);
    this.enterRule(localctx, 48, GoParser.RULE_assignment);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 397;
      this.expressionList();
      this.state = 398;
      this.assign_op();
      this.state = 399;
      this.expressionList();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  assign_op() {
    let localctx = new Assign_opContext(this, this._ctx, this.state);
    this.enterRule(localctx, 50, GoParser.RULE_assign_op);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 402;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 51 & ~31) == 0 && (1 << _la - 51 & (1 << GoParser.OR - 51 | 1 << GoParser.DIV - 51 | 1 << GoParser.MOD - 51 | 1 << GoParser.LSHIFT - 51 | 1 << GoParser.RSHIFT - 51 | 1 << GoParser.BIT_CLEAR - 51 | 1 << GoParser.PLUS - 51 | 1 << GoParser.MINUS - 51 | 1 << GoParser.CARET - 51 | 1 << GoParser.STAR - 51 | 1 << GoParser.AMPERSAND - 51)) !== 0) {
        this.state = 401;
        _la = this._input.LA(1);
        if (!((_la - 51 & ~31) == 0 && (1 << _la - 51 & (1 << GoParser.OR - 51 | 1 << GoParser.DIV - 51 | 1 << GoParser.MOD - 51 | 1 << GoParser.LSHIFT - 51 | 1 << GoParser.RSHIFT - 51 | 1 << GoParser.BIT_CLEAR - 51 | 1 << GoParser.PLUS - 51 | 1 << GoParser.MINUS - 51 | 1 << GoParser.CARET - 51 | 1 << GoParser.STAR - 51 | 1 << GoParser.AMPERSAND - 51)) !== 0)) {
          this._errHandler.recoverInline(this);
        } else {
          this._errHandler.reportMatch(this);
          this.consume();
        }
      }
      this.state = 404;
      this.match(GoParser.ASSIGN);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  shortVarDecl() {
    let localctx = new ShortVarDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 52, GoParser.RULE_shortVarDecl);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 406;
      this.identifierList();
      this.state = 407;
      this.match(GoParser.DECLARE_ASSIGN);
      this.state = 408;
      this.expressionList();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  emptyStmt() {
    let localctx = new EmptyStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 54, GoParser.RULE_emptyStmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 410;
      _la = this._input.LA(1);
      if (!(_la === GoParser.SEMI || _la === GoParser.EOS)) {
        this._errHandler.recoverInline(this);
      } else {
        this._errHandler.reportMatch(this);
        this.consume();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  labeledStmt() {
    let localctx = new LabeledStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 56, GoParser.RULE_labeledStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 412;
      this.match(GoParser.IDENTIFIER);
      this.state = 413;
      this.match(GoParser.COLON);
      this.state = 415;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 28, this._ctx);
      if (la_ === 1) {
        this.state = 414;
        this.statement();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  returnStmt() {
    let localctx = new ReturnStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 58, GoParser.RULE_returnStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 417;
      this.match(GoParser.RETURN);
      this.state = 419;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 29, this._ctx);
      if (la_ === 1) {
        this.state = 418;
        this.expressionList();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  breakStmt() {
    let localctx = new BreakStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 60, GoParser.RULE_breakStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 421;
      this.match(GoParser.BREAK);
      this.state = 423;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 30, this._ctx);
      if (la_ === 1) {
        this.state = 422;
        this.match(GoParser.IDENTIFIER);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  continueStmt() {
    let localctx = new ContinueStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 62, GoParser.RULE_continueStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 425;
      this.match(GoParser.CONTINUE);
      this.state = 427;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 31, this._ctx);
      if (la_ === 1) {
        this.state = 426;
        this.match(GoParser.IDENTIFIER);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  gotoStmt() {
    let localctx = new GotoStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 64, GoParser.RULE_gotoStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 429;
      this.match(GoParser.GOTO);
      this.state = 430;
      this.match(GoParser.IDENTIFIER);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  fallthroughStmt() {
    let localctx = new FallthroughStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 66, GoParser.RULE_fallthroughStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 432;
      this.match(GoParser.FALLTHROUGH);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  deferStmt() {
    let localctx = new DeferStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 68, GoParser.RULE_deferStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 434;
      this.match(GoParser.DEFER);
      this.state = 435;
      this.expression(0);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  ifStmt() {
    let localctx = new IfStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 70, GoParser.RULE_ifStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 437;
      this.match(GoParser.IF);
      this.state = 446;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 32, this._ctx);
      switch (la_) {
        case 1:
          this.state = 438;
          this.expression(0);
          break;
        case 2:
          this.state = 439;
          this.eos();
          this.state = 440;
          this.expression(0);
          break;
        case 3:
          this.state = 442;
          this.simpleStmt();
          this.state = 443;
          this.eos();
          this.state = 444;
          this.expression(0);
          break;
      }
      this.state = 448;
      this.block();
      this.state = 454;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 34, this._ctx);
      if (la_ === 1) {
        this.state = 449;
        this.match(GoParser.ELSE);
        this.state = 452;
        this._errHandler.sync(this);
        switch (this._input.LA(1)) {
          case GoParser.IF:
            this.state = 450;
            this.ifStmt();
            break;
          case GoParser.L_CURLY:
            this.state = 451;
            this.block();
            break;
          default:
            throw new import_antlr4.default.error.NoViableAltException(this);
        }
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  switchStmt() {
    let localctx = new SwitchStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 72, GoParser.RULE_switchStmt);
    try {
      this.state = 458;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 35, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 456;
          this.exprSwitchStmt();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 457;
          this.typeSwitchStmt();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  exprSwitchStmt() {
    let localctx = new ExprSwitchStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 74, GoParser.RULE_exprSwitchStmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 460;
      this.match(GoParser.SWITCH);
      this.state = 471;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 39, this._ctx);
      switch (la_) {
        case 1:
          this.state = 462;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
            this.state = 461;
            this.expression(0);
          }
          break;
        case 2:
          this.state = 465;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 37, this._ctx);
          if (la_ === 1) {
            this.state = 464;
            this.simpleStmt();
          }
          this.state = 467;
          this.eos();
          this.state = 469;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
            this.state = 468;
            this.expression(0);
          }
          break;
      }
      this.state = 473;
      this.match(GoParser.L_CURLY);
      this.state = 477;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === GoParser.DEFAULT || _la === GoParser.CASE) {
        this.state = 474;
        this.exprCaseClause();
        this.state = 479;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 480;
      this.match(GoParser.R_CURLY);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  exprCaseClause() {
    let localctx = new ExprCaseClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 76, GoParser.RULE_exprCaseClause);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 482;
      this.exprSwitchCase();
      this.state = 483;
      this.match(GoParser.COLON);
      this.state = 485;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 41, this._ctx);
      if (la_ === 1) {
        this.state = 484;
        this.statementList();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  exprSwitchCase() {
    let localctx = new ExprSwitchCaseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 78, GoParser.RULE_exprSwitchCase);
    try {
      this.state = 490;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.CASE:
          this.enterOuterAlt(localctx, 1);
          this.state = 487;
          this.match(GoParser.CASE);
          this.state = 488;
          this.expressionList();
          break;
        case GoParser.DEFAULT:
          this.enterOuterAlt(localctx, 2);
          this.state = 489;
          this.match(GoParser.DEFAULT);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeSwitchStmt() {
    let localctx = new TypeSwitchStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 80, GoParser.RULE_typeSwitchStmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 492;
      this.match(GoParser.SWITCH);
      this.state = 501;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 43, this._ctx);
      switch (la_) {
        case 1:
          this.state = 493;
          this.typeSwitchGuard();
          break;
        case 2:
          this.state = 494;
          this.eos();
          this.state = 495;
          this.typeSwitchGuard();
          break;
        case 3:
          this.state = 497;
          this.simpleStmt();
          this.state = 498;
          this.eos();
          this.state = 499;
          this.typeSwitchGuard();
          break;
      }
      this.state = 503;
      this.match(GoParser.L_CURLY);
      this.state = 507;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === GoParser.DEFAULT || _la === GoParser.CASE) {
        this.state = 504;
        this.typeCaseClause();
        this.state = 509;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 510;
      this.match(GoParser.R_CURLY);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeSwitchGuard() {
    let localctx = new TypeSwitchGuardContext(this, this._ctx, this.state);
    this.enterRule(localctx, 82, GoParser.RULE_typeSwitchGuard);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 514;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 45, this._ctx);
      if (la_ === 1) {
        this.state = 512;
        this.match(GoParser.IDENTIFIER);
        this.state = 513;
        this.match(GoParser.DECLARE_ASSIGN);
      }
      this.state = 516;
      this.primaryExpr(0);
      this.state = 517;
      this.match(GoParser.DOT);
      this.state = 518;
      this.match(GoParser.L_PAREN);
      this.state = 519;
      this.match(GoParser.TYPE);
      this.state = 520;
      this.match(GoParser.R_PAREN);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeCaseClause() {
    let localctx = new TypeCaseClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 84, GoParser.RULE_typeCaseClause);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 522;
      this.typeSwitchCase();
      this.state = 523;
      this.match(GoParser.COLON);
      this.state = 525;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 46, this._ctx);
      if (la_ === 1) {
        this.state = 524;
        this.statementList();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeSwitchCase() {
    let localctx = new TypeSwitchCaseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 86, GoParser.RULE_typeSwitchCase);
    try {
      this.state = 530;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.CASE:
          this.enterOuterAlt(localctx, 1);
          this.state = 527;
          this.match(GoParser.CASE);
          this.state = 528;
          this.typeList();
          break;
        case GoParser.DEFAULT:
          this.enterOuterAlt(localctx, 2);
          this.state = 529;
          this.match(GoParser.DEFAULT);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeList() {
    let localctx = new TypeListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 88, GoParser.RULE_typeList);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 534;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.FUNC:
        case GoParser.INTERFACE:
        case GoParser.MAP:
        case GoParser.STRUCT:
        case GoParser.CHAN:
        case GoParser.IDENTIFIER:
        case GoParser.L_PAREN:
        case GoParser.L_BRACKET:
        case GoParser.STAR:
        case GoParser.RECEIVE:
          this.state = 532;
          this.type_();
          break;
        case GoParser.NIL_LIT:
          this.state = 533;
          this.match(GoParser.NIL_LIT);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
      this.state = 543;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === GoParser.COMMA) {
        this.state = 536;
        this.match(GoParser.COMMA);
        this.state = 539;
        this._errHandler.sync(this);
        switch (this._input.LA(1)) {
          case GoParser.FUNC:
          case GoParser.INTERFACE:
          case GoParser.MAP:
          case GoParser.STRUCT:
          case GoParser.CHAN:
          case GoParser.IDENTIFIER:
          case GoParser.L_PAREN:
          case GoParser.L_BRACKET:
          case GoParser.STAR:
          case GoParser.RECEIVE:
            this.state = 537;
            this.type_();
            break;
          case GoParser.NIL_LIT:
            this.state = 538;
            this.match(GoParser.NIL_LIT);
            break;
          default:
            throw new import_antlr4.default.error.NoViableAltException(this);
        }
        this.state = 545;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  selectStmt() {
    let localctx = new SelectStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 90, GoParser.RULE_selectStmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 546;
      this.match(GoParser.SELECT);
      this.state = 547;
      this.match(GoParser.L_CURLY);
      this.state = 551;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === GoParser.DEFAULT || _la === GoParser.CASE) {
        this.state = 548;
        this.commClause();
        this.state = 553;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 554;
      this.match(GoParser.R_CURLY);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  commClause() {
    let localctx = new CommClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 92, GoParser.RULE_commClause);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 556;
      this.commCase();
      this.state = 557;
      this.match(GoParser.COLON);
      this.state = 559;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 52, this._ctx);
      if (la_ === 1) {
        this.state = 558;
        this.statementList();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  commCase() {
    let localctx = new CommCaseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 94, GoParser.RULE_commCase);
    try {
      this.state = 567;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.CASE:
          this.enterOuterAlt(localctx, 1);
          this.state = 561;
          this.match(GoParser.CASE);
          this.state = 564;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 53, this._ctx);
          switch (la_) {
            case 1:
              this.state = 562;
              this.sendStmt();
              break;
            case 2:
              this.state = 563;
              this.recvStmt();
              break;
          }
          break;
        case GoParser.DEFAULT:
          this.enterOuterAlt(localctx, 2);
          this.state = 566;
          this.match(GoParser.DEFAULT);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  recvStmt() {
    let localctx = new RecvStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 96, GoParser.RULE_recvStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 575;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 55, this._ctx);
      if (la_ === 1) {
        this.state = 569;
        this.expressionList();
        this.state = 570;
        this.match(GoParser.ASSIGN);
      } else if (la_ === 2) {
        this.state = 572;
        this.identifierList();
        this.state = 573;
        this.match(GoParser.DECLARE_ASSIGN);
      }
      this.state = 577;
      localctx.recvExpr = this.expression(0);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  forStmt() {
    let localctx = new ForStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 98, GoParser.RULE_forStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 579;
      this.match(GoParser.FOR);
      this.state = 583;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 56, this._ctx);
      if (la_ === 1) {
        this.state = 580;
        this.expression(0);
      } else if (la_ === 2) {
        this.state = 581;
        this.forClause();
      } else if (la_ === 3) {
        this.state = 582;
        this.rangeClause();
      }
      this.state = 585;
      this.block();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  forClause() {
    let localctx = new ForClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 100, GoParser.RULE_forClause);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 588;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 57, this._ctx);
      if (la_ === 1) {
        this.state = 587;
        localctx.initStmt = this.simpleStmt();
      }
      this.state = 590;
      this.eos();
      this.state = 592;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 58, this._ctx);
      if (la_ === 1) {
        this.state = 591;
        this.expression(0);
      }
      this.state = 594;
      this.eos();
      this.state = 596;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
        this.state = 595;
        localctx.postStmt = this.simpleStmt();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  rangeClause() {
    let localctx = new RangeClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 102, GoParser.RULE_rangeClause);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 604;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 60, this._ctx);
      if (la_ === 1) {
        this.state = 598;
        this.expressionList();
        this.state = 599;
        this.match(GoParser.ASSIGN);
      } else if (la_ === 2) {
        this.state = 601;
        this.identifierList();
        this.state = 602;
        this.match(GoParser.DECLARE_ASSIGN);
      }
      this.state = 606;
      this.match(GoParser.RANGE);
      this.state = 607;
      this.expression(0);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  goStmt() {
    let localctx = new GoStmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 104, GoParser.RULE_goStmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 609;
      this.match(GoParser.GO);
      this.state = 610;
      this.expression(0);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  type_() {
    let localctx = new Type_Context(this, this._ctx, this.state);
    this.enterRule(localctx, 106, GoParser.RULE_type_);
    try {
      this.state = 618;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.IDENTIFIER:
          this.enterOuterAlt(localctx, 1);
          this.state = 612;
          this.typeName();
          break;
        case GoParser.FUNC:
        case GoParser.INTERFACE:
        case GoParser.MAP:
        case GoParser.STRUCT:
        case GoParser.CHAN:
        case GoParser.L_BRACKET:
        case GoParser.STAR:
        case GoParser.RECEIVE:
          this.enterOuterAlt(localctx, 2);
          this.state = 613;
          this.typeLit();
          break;
        case GoParser.L_PAREN:
          this.enterOuterAlt(localctx, 3);
          this.state = 614;
          this.match(GoParser.L_PAREN);
          this.state = 615;
          this.type_();
          this.state = 616;
          this.match(GoParser.R_PAREN);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeName() {
    let localctx = new TypeNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 108, GoParser.RULE_typeName);
    try {
      this.state = 622;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 62, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 620;
          this.qualifiedIdent();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 621;
          this.match(GoParser.IDENTIFIER);
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeLit() {
    let localctx = new TypeLitContext(this, this._ctx, this.state);
    this.enterRule(localctx, 110, GoParser.RULE_typeLit);
    try {
      this.state = 632;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 63, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 624;
          this.arrayType();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 625;
          this.structType();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 626;
          this.pointerType();
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 627;
          this.functionType();
          break;
        case 5:
          this.enterOuterAlt(localctx, 5);
          this.state = 628;
          this.interfaceType();
          break;
        case 6:
          this.enterOuterAlt(localctx, 6);
          this.state = 629;
          this.sliceType();
          break;
        case 7:
          this.enterOuterAlt(localctx, 7);
          this.state = 630;
          this.mapType();
          break;
        case 8:
          this.enterOuterAlt(localctx, 8);
          this.state = 631;
          this.channelType();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  arrayType() {
    let localctx = new ArrayTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 112, GoParser.RULE_arrayType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 634;
      this.match(GoParser.L_BRACKET);
      this.state = 635;
      this.arrayLength();
      this.state = 636;
      this.match(GoParser.R_BRACKET);
      this.state = 637;
      this.elementType();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  arrayLength() {
    let localctx = new ArrayLengthContext(this, this._ctx, this.state);
    this.enterRule(localctx, 114, GoParser.RULE_arrayLength);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 639;
      this.expression(0);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  elementType() {
    let localctx = new ElementTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 116, GoParser.RULE_elementType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 641;
      this.type_();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  pointerType() {
    let localctx = new PointerTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 118, GoParser.RULE_pointerType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 643;
      this.match(GoParser.STAR);
      this.state = 644;
      this.type_();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  interfaceType() {
    let localctx = new InterfaceTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 120, GoParser.RULE_interfaceType);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 646;
      this.match(GoParser.INTERFACE);
      this.state = 647;
      this.match(GoParser.L_CURLY);
      this.state = 656;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === GoParser.IDENTIFIER) {
        this.state = 650;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input, 64, this._ctx);
        switch (la_) {
          case 1:
            this.state = 648;
            this.methodSpec();
            break;
          case 2:
            this.state = 649;
            this.typeName();
            break;
        }
        this.state = 652;
        this.eos();
        this.state = 658;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 659;
      this.match(GoParser.R_CURLY);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  sliceType() {
    let localctx = new SliceTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 122, GoParser.RULE_sliceType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 661;
      this.match(GoParser.L_BRACKET);
      this.state = 662;
      this.match(GoParser.R_BRACKET);
      this.state = 663;
      this.elementType();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  mapType() {
    let localctx = new MapTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 124, GoParser.RULE_mapType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 665;
      this.match(GoParser.MAP);
      this.state = 666;
      this.match(GoParser.L_BRACKET);
      this.state = 667;
      this.type_();
      this.state = 668;
      this.match(GoParser.R_BRACKET);
      this.state = 669;
      this.elementType();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  channelType() {
    let localctx = new ChannelTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 126, GoParser.RULE_channelType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 676;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 66, this._ctx);
      switch (la_) {
        case 1:
          this.state = 671;
          this.match(GoParser.CHAN);
          break;
        case 2:
          this.state = 672;
          this.match(GoParser.CHAN);
          this.state = 673;
          this.match(GoParser.RECEIVE);
          break;
        case 3:
          this.state = 674;
          this.match(GoParser.RECEIVE);
          this.state = 675;
          this.match(GoParser.CHAN);
          break;
      }
      this.state = 678;
      this.elementType();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  methodSpec() {
    let localctx = new MethodSpecContext(this, this._ctx, this.state);
    this.enterRule(localctx, 128, GoParser.RULE_methodSpec);
    try {
      this.state = 686;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 67, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 680;
          this.match(GoParser.IDENTIFIER);
          this.state = 681;
          this.parameters();
          this.state = 682;
          this.result();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 684;
          this.match(GoParser.IDENTIFIER);
          this.state = 685;
          this.parameters();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  functionType() {
    let localctx = new FunctionTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 130, GoParser.RULE_functionType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 688;
      this.match(GoParser.FUNC);
      this.state = 689;
      this.signature();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  signature() {
    let localctx = new SignatureContext(this, this._ctx, this.state);
    this.enterRule(localctx, 132, GoParser.RULE_signature);
    try {
      this.state = 695;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 68, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 691;
          this.parameters();
          this.state = 692;
          this.result();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 694;
          this.parameters();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  result() {
    let localctx = new ResultContext(this, this._ctx, this.state);
    this.enterRule(localctx, 134, GoParser.RULE_result);
    try {
      this.state = 699;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 69, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 697;
          this.parameters();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 698;
          this.type_();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  parameters() {
    let localctx = new ParametersContext(this, this._ctx, this.state);
    this.enterRule(localctx, 136, GoParser.RULE_parameters);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 701;
      this.match(GoParser.L_PAREN);
      this.state = 713;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << GoParser.FUNC | 1 << GoParser.INTERFACE | 1 << GoParser.MAP | 1 << GoParser.STRUCT | 1 << GoParser.CHAN | 1 << GoParser.IDENTIFIER | 1 << GoParser.L_PAREN)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << GoParser.L_BRACKET - 32 | 1 << GoParser.ELLIPSIS - 32 | 1 << GoParser.STAR - 32 | 1 << GoParser.RECEIVE - 32)) !== 0) {
        this.state = 702;
        this.parameterDecl();
        this.state = 707;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input, 70, this._ctx);
        while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt === 1) {
            this.state = 703;
            this.match(GoParser.COMMA);
            this.state = 704;
            this.parameterDecl();
          }
          this.state = 709;
          this._errHandler.sync(this);
          _alt = this._interp.adaptivePredict(this._input, 70, this._ctx);
        }
        this.state = 711;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === GoParser.COMMA) {
          this.state = 710;
          this.match(GoParser.COMMA);
        }
      }
      this.state = 715;
      this.match(GoParser.R_PAREN);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  parameterDecl() {
    let localctx = new ParameterDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 138, GoParser.RULE_parameterDecl);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 718;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 73, this._ctx);
      if (la_ === 1) {
        this.state = 717;
        this.identifierList();
      }
      this.state = 721;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === GoParser.ELLIPSIS) {
        this.state = 720;
        this.match(GoParser.ELLIPSIS);
      }
      this.state = 723;
      this.type_();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  expression(_p) {
    if (_p === void 0) {
      _p = 0;
    }
    const _parentctx = this._ctx;
    const _parentState = this.state;
    let localctx = new ExpressionContext(this, this._ctx, _parentState);
    let _prevctx = localctx;
    const _startState = 140;
    this.enterRecursionRule(localctx, 140, GoParser.RULE_expression, _p);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 729;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 75, this._ctx);
      switch (la_) {
        case 1:
          this.state = 726;
          this.primaryExpr(0);
          break;
        case 2:
          this.state = 727;
          localctx.unary_op = this._input.LT(1);
          _la = this._input.LA(1);
          if (!((_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57)) !== 0)) {
            localctx.unary_op = this._errHandler.recoverInline(this);
          } else {
            this._errHandler.reportMatch(this);
            this.consume();
          }
          this.state = 728;
          this.expression(6);
          break;
      }
      this._ctx.stop = this._input.LT(-1);
      this.state = 748;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 77, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          if (this._parseListeners !== null) {
            this.triggerExitRuleEvent();
          }
          _prevctx = localctx;
          this.state = 746;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 76, this._ctx);
          switch (la_) {
            case 1:
              localctx = new ExpressionContext(this, _parentctx, _parentState);
              this.pushNewRecursionContext(localctx, _startState, GoParser.RULE_expression);
              this.state = 731;
              if (!this.precpred(this._ctx, 5)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 5)");
              }
              this.state = 732;
              localctx.mul_op = this._input.LT(1);
              _la = this._input.LA(1);
              if (!((_la - 52 & ~31) == 0 && (1 << _la - 52 & (1 << GoParser.DIV - 52 | 1 << GoParser.MOD - 52 | 1 << GoParser.LSHIFT - 52 | 1 << GoParser.RSHIFT - 52 | 1 << GoParser.BIT_CLEAR - 52 | 1 << GoParser.STAR - 52 | 1 << GoParser.AMPERSAND - 52)) !== 0)) {
                localctx.mul_op = this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 733;
              this.expression(6);
              break;
            case 2:
              localctx = new ExpressionContext(this, _parentctx, _parentState);
              this.pushNewRecursionContext(localctx, _startState, GoParser.RULE_expression);
              this.state = 734;
              if (!this.precpred(this._ctx, 4)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
              }
              this.state = 735;
              localctx.add_op = this._input.LT(1);
              _la = this._input.LA(1);
              if (!((_la - 51 & ~31) == 0 && (1 << _la - 51 & (1 << GoParser.OR - 51 | 1 << GoParser.PLUS - 51 | 1 << GoParser.MINUS - 51 | 1 << GoParser.CARET - 51)) !== 0)) {
                localctx.add_op = this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 736;
              this.expression(5);
              break;
            case 3:
              localctx = new ExpressionContext(this, _parentctx, _parentState);
              this.pushNewRecursionContext(localctx, _startState, GoParser.RULE_expression);
              this.state = 737;
              if (!this.precpred(this._ctx, 3)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
              }
              this.state = 738;
              localctx.rel_op = this._input.LT(1);
              _la = this._input.LA(1);
              if (!((_la - 45 & ~31) == 0 && (1 << _la - 45 & (1 << GoParser.EQUALS - 45 | 1 << GoParser.NOT_EQUALS - 45 | 1 << GoParser.LESS - 45 | 1 << GoParser.LESS_OR_EQUALS - 45 | 1 << GoParser.GREATER - 45 | 1 << GoParser.GREATER_OR_EQUALS - 45)) !== 0)) {
                localctx.rel_op = this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 739;
              this.expression(4);
              break;
            case 4:
              localctx = new ExpressionContext(this, _parentctx, _parentState);
              this.pushNewRecursionContext(localctx, _startState, GoParser.RULE_expression);
              this.state = 740;
              if (!this.precpred(this._ctx, 2)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
              }
              this.state = 741;
              this.match(GoParser.LOGICAL_AND);
              this.state = 742;
              this.expression(3);
              break;
            case 5:
              localctx = new ExpressionContext(this, _parentctx, _parentState);
              this.pushNewRecursionContext(localctx, _startState, GoParser.RULE_expression);
              this.state = 743;
              if (!this.precpred(this._ctx, 1)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
              }
              this.state = 744;
              this.match(GoParser.LOGICAL_OR);
              this.state = 745;
              this.expression(2);
              break;
          }
        }
        this.state = 750;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 77, this._ctx);
      }
    } catch (error) {
      if (error instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = error;
        this._errHandler.reportError(this, error);
        this._errHandler.recover(this, error);
      } else {
        throw error;
      }
    } finally {
      this.unrollRecursionContexts(_parentctx);
    }
    return localctx;
  }
  primaryExpr(_p) {
    if (_p === void 0) {
      _p = 0;
    }
    const _parentctx = this._ctx;
    const _parentState = this.state;
    let localctx = new PrimaryExprContext(this, this._ctx, _parentState);
    let _prevctx = localctx;
    const _startState = 142;
    this.enterRecursionRule(localctx, 142, GoParser.RULE_primaryExpr, _p);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 755;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 78, this._ctx);
      switch (la_) {
        case 1:
          this.state = 752;
          this.operand();
          break;
        case 2:
          this.state = 753;
          this.conversion();
          break;
        case 3:
          this.state = 754;
          this.methodExpr();
          break;
      }
      this._ctx.stop = this._input.LT(-1);
      this.state = 768;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 80, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          if (this._parseListeners !== null) {
            this.triggerExitRuleEvent();
          }
          _prevctx = localctx;
          localctx = new PrimaryExprContext(this, _parentctx, _parentState);
          this.pushNewRecursionContext(localctx, _startState, GoParser.RULE_primaryExpr);
          this.state = 757;
          if (!this.precpred(this._ctx, 1)) {
            throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 1)");
          }
          this.state = 764;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 79, this._ctx);
          switch (la_) {
            case 1:
              this.state = 758;
              this.match(GoParser.DOT);
              this.state = 759;
              this.match(GoParser.IDENTIFIER);
              break;
            case 2:
              this.state = 760;
              this.index();
              break;
            case 3:
              this.state = 761;
              this.slice_();
              break;
            case 4:
              this.state = 762;
              this.typeAssertion();
              break;
            case 5:
              this.state = 763;
              this.arguments();
              break;
          }
        }
        this.state = 770;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 80, this._ctx);
      }
    } catch (error) {
      if (error instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = error;
        this._errHandler.reportError(this, error);
        this._errHandler.recover(this, error);
      } else {
        throw error;
      }
    } finally {
      this.unrollRecursionContexts(_parentctx);
    }
    return localctx;
  }
  conversion() {
    let localctx = new ConversionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 144, GoParser.RULE_conversion);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 771;
      this.nonNamedType();
      this.state = 772;
      this.match(GoParser.L_PAREN);
      this.state = 773;
      this.expression(0);
      this.state = 775;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === GoParser.COMMA) {
        this.state = 774;
        this.match(GoParser.COMMA);
      }
      this.state = 777;
      this.match(GoParser.R_PAREN);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  nonNamedType() {
    let localctx = new NonNamedTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 146, GoParser.RULE_nonNamedType);
    try {
      this.state = 784;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.FUNC:
        case GoParser.INTERFACE:
        case GoParser.MAP:
        case GoParser.STRUCT:
        case GoParser.CHAN:
        case GoParser.L_BRACKET:
        case GoParser.STAR:
        case GoParser.RECEIVE:
          this.enterOuterAlt(localctx, 1);
          this.state = 779;
          this.typeLit();
          break;
        case GoParser.L_PAREN:
          this.enterOuterAlt(localctx, 2);
          this.state = 780;
          this.match(GoParser.L_PAREN);
          this.state = 781;
          this.nonNamedType();
          this.state = 782;
          this.match(GoParser.R_PAREN);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  operand() {
    let localctx = new OperandContext(this, this._ctx, this.state);
    this.enterRule(localctx, 148, GoParser.RULE_operand);
    try {
      this.state = 792;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 83, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 786;
          this.literal();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 787;
          this.operandName();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 788;
          this.match(GoParser.L_PAREN);
          this.state = 789;
          this.expression(0);
          this.state = 790;
          this.match(GoParser.R_PAREN);
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  literal() {
    let localctx = new LiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 150, GoParser.RULE_literal);
    try {
      this.state = 797;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.NIL_LIT:
        case GoParser.DECIMAL_LIT:
        case GoParser.BINARY_LIT:
        case GoParser.OCTAL_LIT:
        case GoParser.HEX_LIT:
        case GoParser.FLOAT_LIT:
        case GoParser.IMAGINARY_LIT:
        case GoParser.RUNE_LIT:
        case GoParser.RAW_STRING_LIT:
        case GoParser.INTERPRETED_STRING_LIT:
          this.enterOuterAlt(localctx, 1);
          this.state = 794;
          this.basicLit();
          break;
        case GoParser.MAP:
        case GoParser.STRUCT:
        case GoParser.IDENTIFIER:
        case GoParser.L_BRACKET:
          this.enterOuterAlt(localctx, 2);
          this.state = 795;
          this.compositeLit();
          break;
        case GoParser.FUNC:
          this.enterOuterAlt(localctx, 3);
          this.state = 796;
          this.functionLit();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  basicLit() {
    let localctx = new BasicLitContext(this, this._ctx, this.state);
    this.enterRule(localctx, 152, GoParser.RULE_basicLit);
    try {
      this.state = 803;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.NIL_LIT:
          this.enterOuterAlt(localctx, 1);
          this.state = 799;
          this.match(GoParser.NIL_LIT);
          break;
        case GoParser.DECIMAL_LIT:
        case GoParser.BINARY_LIT:
        case GoParser.OCTAL_LIT:
        case GoParser.HEX_LIT:
        case GoParser.IMAGINARY_LIT:
        case GoParser.RUNE_LIT:
          this.enterOuterAlt(localctx, 2);
          this.state = 800;
          this.integer();
          break;
        case GoParser.RAW_STRING_LIT:
        case GoParser.INTERPRETED_STRING_LIT:
          this.enterOuterAlt(localctx, 3);
          this.state = 801;
          this.string_();
          break;
        case GoParser.FLOAT_LIT:
          this.enterOuterAlt(localctx, 4);
          this.state = 802;
          this.match(GoParser.FLOAT_LIT);
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  integer() {
    let localctx = new IntegerContext(this, this._ctx, this.state);
    this.enterRule(localctx, 154, GoParser.RULE_integer);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 805;
      _la = this._input.LA(1);
      if (!((_la - 64 & ~31) == 0 && (1 << _la - 64 & (1 << GoParser.DECIMAL_LIT - 64 | 1 << GoParser.BINARY_LIT - 64 | 1 << GoParser.OCTAL_LIT - 64 | 1 << GoParser.HEX_LIT - 64 | 1 << GoParser.IMAGINARY_LIT - 64 | 1 << GoParser.RUNE_LIT - 64)) !== 0)) {
        this._errHandler.recoverInline(this);
      } else {
        this._errHandler.reportMatch(this);
        this.consume();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  operandName() {
    let localctx = new OperandNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 156, GoParser.RULE_operandName);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 807;
      this.match(GoParser.IDENTIFIER);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  qualifiedIdent() {
    let localctx = new QualifiedIdentContext(this, this._ctx, this.state);
    this.enterRule(localctx, 158, GoParser.RULE_qualifiedIdent);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 809;
      this.match(GoParser.IDENTIFIER);
      this.state = 810;
      this.match(GoParser.DOT);
      this.state = 811;
      this.match(GoParser.IDENTIFIER);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  compositeLit() {
    let localctx = new CompositeLitContext(this, this._ctx, this.state);
    this.enterRule(localctx, 160, GoParser.RULE_compositeLit);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 813;
      this.literalType();
      this.state = 814;
      this.literalValue();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  literalType() {
    let localctx = new LiteralTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 162, GoParser.RULE_literalType);
    try {
      this.state = 825;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 86, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 816;
          this.structType();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 817;
          this.arrayType();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 818;
          this.match(GoParser.L_BRACKET);
          this.state = 819;
          this.match(GoParser.ELLIPSIS);
          this.state = 820;
          this.match(GoParser.R_BRACKET);
          this.state = 821;
          this.elementType();
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 822;
          this.sliceType();
          break;
        case 5:
          this.enterOuterAlt(localctx, 5);
          this.state = 823;
          this.mapType();
          break;
        case 6:
          this.enterOuterAlt(localctx, 6);
          this.state = 824;
          this.typeName();
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  literalValue() {
    let localctx = new LiteralValueContext(this, this._ctx, this.state);
    this.enterRule(localctx, 164, GoParser.RULE_literalValue);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 827;
      this.match(GoParser.L_CURLY);
      this.state = 832;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_CURLY - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
        this.state = 828;
        this.elementList();
        this.state = 830;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === GoParser.COMMA) {
          this.state = 829;
          this.match(GoParser.COMMA);
        }
      }
      this.state = 834;
      this.match(GoParser.R_CURLY);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  elementList() {
    let localctx = new ElementListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 166, GoParser.RULE_elementList);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 836;
      this.keyedElement();
      this.state = 841;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 89, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 837;
          this.match(GoParser.COMMA);
          this.state = 838;
          this.keyedElement();
        }
        this.state = 843;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 89, this._ctx);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  keyedElement() {
    let localctx = new KeyedElementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 168, GoParser.RULE_keyedElement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 847;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 90, this._ctx);
      if (la_ === 1) {
        this.state = 844;
        this.key();
        this.state = 845;
        this.match(GoParser.COLON);
      }
      this.state = 849;
      this.element();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  key() {
    let localctx = new KeyContext(this, this._ctx, this.state);
    this.enterRule(localctx, 170, GoParser.RULE_key);
    try {
      this.state = 853;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.FUNC:
        case GoParser.INTERFACE:
        case GoParser.MAP:
        case GoParser.STRUCT:
        case GoParser.CHAN:
        case GoParser.NIL_LIT:
        case GoParser.IDENTIFIER:
        case GoParser.L_PAREN:
        case GoParser.L_BRACKET:
        case GoParser.EXCLAMATION:
        case GoParser.PLUS:
        case GoParser.MINUS:
        case GoParser.CARET:
        case GoParser.STAR:
        case GoParser.AMPERSAND:
        case GoParser.RECEIVE:
        case GoParser.DECIMAL_LIT:
        case GoParser.BINARY_LIT:
        case GoParser.OCTAL_LIT:
        case GoParser.HEX_LIT:
        case GoParser.FLOAT_LIT:
        case GoParser.IMAGINARY_LIT:
        case GoParser.RUNE_LIT:
        case GoParser.RAW_STRING_LIT:
        case GoParser.INTERPRETED_STRING_LIT:
          this.enterOuterAlt(localctx, 1);
          this.state = 851;
          this.expression(0);
          break;
        case GoParser.L_CURLY:
          this.enterOuterAlt(localctx, 2);
          this.state = 852;
          this.literalValue();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  element() {
    let localctx = new ElementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 172, GoParser.RULE_element);
    try {
      this.state = 857;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case GoParser.FUNC:
        case GoParser.INTERFACE:
        case GoParser.MAP:
        case GoParser.STRUCT:
        case GoParser.CHAN:
        case GoParser.NIL_LIT:
        case GoParser.IDENTIFIER:
        case GoParser.L_PAREN:
        case GoParser.L_BRACKET:
        case GoParser.EXCLAMATION:
        case GoParser.PLUS:
        case GoParser.MINUS:
        case GoParser.CARET:
        case GoParser.STAR:
        case GoParser.AMPERSAND:
        case GoParser.RECEIVE:
        case GoParser.DECIMAL_LIT:
        case GoParser.BINARY_LIT:
        case GoParser.OCTAL_LIT:
        case GoParser.HEX_LIT:
        case GoParser.FLOAT_LIT:
        case GoParser.IMAGINARY_LIT:
        case GoParser.RUNE_LIT:
        case GoParser.RAW_STRING_LIT:
        case GoParser.INTERPRETED_STRING_LIT:
          this.enterOuterAlt(localctx, 1);
          this.state = 855;
          this.expression(0);
          break;
        case GoParser.L_CURLY:
          this.enterOuterAlt(localctx, 2);
          this.state = 856;
          this.literalValue();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  structType() {
    let localctx = new StructTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 174, GoParser.RULE_structType);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 859;
      this.match(GoParser.STRUCT);
      this.state = 860;
      this.match(GoParser.L_CURLY);
      this.state = 866;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === GoParser.IDENTIFIER || _la === GoParser.STAR) {
        this.state = 861;
        this.fieldDecl();
        this.state = 862;
        this.eos();
        this.state = 868;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 869;
      this.match(GoParser.R_CURLY);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  fieldDecl() {
    let localctx = new FieldDeclContext(this, this._ctx, this.state);
    this.enterRule(localctx, 176, GoParser.RULE_fieldDecl);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 875;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 94, this._ctx);
      switch (la_) {
        case 1:
          this.state = 871;
          this.identifierList();
          this.state = 872;
          this.type_();
          break;
        case 2:
          this.state = 874;
          this.embeddedField();
          break;
      }
      this.state = 878;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 95, this._ctx);
      if (la_ === 1) {
        this.state = 877;
        localctx.tag = this.string_();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  string_() {
    let localctx = new String_Context(this, this._ctx, this.state);
    this.enterRule(localctx, 178, GoParser.RULE_string_);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 880;
      _la = this._input.LA(1);
      if (!(_la === GoParser.RAW_STRING_LIT || _la === GoParser.INTERPRETED_STRING_LIT)) {
        this._errHandler.recoverInline(this);
      } else {
        this._errHandler.reportMatch(this);
        this.consume();
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  embeddedField() {
    let localctx = new EmbeddedFieldContext(this, this._ctx, this.state);
    this.enterRule(localctx, 180, GoParser.RULE_embeddedField);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 883;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === GoParser.STAR) {
        this.state = 882;
        this.match(GoParser.STAR);
      }
      this.state = 885;
      this.typeName();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  functionLit() {
    let localctx = new FunctionLitContext(this, this._ctx, this.state);
    this.enterRule(localctx, 182, GoParser.RULE_functionLit);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 887;
      this.match(GoParser.FUNC);
      this.state = 888;
      this.signature();
      this.state = 889;
      this.block();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  index() {
    let localctx = new IndexContext(this, this._ctx, this.state);
    this.enterRule(localctx, 184, GoParser.RULE_index);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 891;
      this.match(GoParser.L_BRACKET);
      this.state = 892;
      this.expression(0);
      this.state = 893;
      this.match(GoParser.R_BRACKET);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  slice_() {
    let localctx = new Slice_Context(this, this._ctx, this.state);
    this.enterRule(localctx, 186, GoParser.RULE_slice_);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 895;
      this.match(GoParser.L_BRACKET);
      this.state = 911;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 100, this._ctx);
      switch (la_) {
        case 1:
          this.state = 897;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
            this.state = 896;
            this.expression(0);
          }
          this.state = 899;
          this.match(GoParser.COLON);
          this.state = 901;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
            this.state = 900;
            this.expression(0);
          }
          break;
        case 2:
          this.state = 904;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
            this.state = 903;
            this.expression(0);
          }
          this.state = 906;
          this.match(GoParser.COLON);
          this.state = 907;
          this.expression(0);
          this.state = 908;
          this.match(GoParser.COLON);
          this.state = 909;
          this.expression(0);
          break;
      }
      this.state = 913;
      this.match(GoParser.R_BRACKET);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  typeAssertion() {
    let localctx = new TypeAssertionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 188, GoParser.RULE_typeAssertion);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 915;
      this.match(GoParser.DOT);
      this.state = 916;
      this.match(GoParser.L_PAREN);
      this.state = 917;
      this.type_();
      this.state = 918;
      this.match(GoParser.R_PAREN);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  arguments() {
    let localctx = new ArgumentsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 190, GoParser.RULE_arguments);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 920;
      this.match(GoParser.L_PAREN);
      this.state = 935;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 3 & ~31) == 0 && (1 << _la - 3 & (1 << GoParser.FUNC - 3 | 1 << GoParser.INTERFACE - 3 | 1 << GoParser.MAP - 3 | 1 << GoParser.STRUCT - 3 | 1 << GoParser.CHAN - 3 | 1 << GoParser.NIL_LIT - 3 | 1 << GoParser.IDENTIFIER - 3 | 1 << GoParser.L_PAREN - 3 | 1 << GoParser.L_BRACKET - 3)) !== 0 || (_la - 57 & ~31) == 0 && (1 << _la - 57 & (1 << GoParser.EXCLAMATION - 57 | 1 << GoParser.PLUS - 57 | 1 << GoParser.MINUS - 57 | 1 << GoParser.CARET - 57 | 1 << GoParser.STAR - 57 | 1 << GoParser.AMPERSAND - 57 | 1 << GoParser.RECEIVE - 57 | 1 << GoParser.DECIMAL_LIT - 57 | 1 << GoParser.BINARY_LIT - 57 | 1 << GoParser.OCTAL_LIT - 57 | 1 << GoParser.HEX_LIT - 57 | 1 << GoParser.FLOAT_LIT - 57 | 1 << GoParser.IMAGINARY_LIT - 57 | 1 << GoParser.RUNE_LIT - 57 | 1 << GoParser.RAW_STRING_LIT - 57 | 1 << GoParser.INTERPRETED_STRING_LIT - 57)) !== 0) {
        this.state = 927;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input, 102, this._ctx);
        switch (la_) {
          case 1:
            this.state = 921;
            this.expressionList();
            break;
          case 2:
            this.state = 922;
            this.nonNamedType();
            this.state = 925;
            this._errHandler.sync(this);
            var la_ = this._interp.adaptivePredict(this._input, 101, this._ctx);
            if (la_ === 1) {
              this.state = 923;
              this.match(GoParser.COMMA);
              this.state = 924;
              this.expressionList();
            }
            break;
        }
        this.state = 930;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === GoParser.ELLIPSIS) {
          this.state = 929;
          this.match(GoParser.ELLIPSIS);
        }
        this.state = 933;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === GoParser.COMMA) {
          this.state = 932;
          this.match(GoParser.COMMA);
        }
      }
      this.state = 937;
      this.match(GoParser.R_PAREN);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  methodExpr() {
    let localctx = new MethodExprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 192, GoParser.RULE_methodExpr);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 939;
      this.nonNamedType();
      this.state = 940;
      this.match(GoParser.DOT);
      this.state = 941;
      this.match(GoParser.IDENTIFIER);
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  receiverType() {
    let localctx = new ReceiverTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 194, GoParser.RULE_receiverType);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 943;
      this.type_();
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
  eos() {
    let localctx = new EosContext(this, this._ctx, this.state);
    this.enterRule(localctx, 196, GoParser.RULE_eos);
    try {
      this.state = 949;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 106, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 945;
          this.match(GoParser.SEMI);
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 946;
          this.match(GoParser.EOF);
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 947;
          this.match(GoParser.EOS);
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 948;
          if (!this.closingBracket()) {
            throw new import_antlr4.default.error.FailedPredicateException(this, "closingBracket()");
          }
          break;
      }
    } catch (re) {
      if (re instanceof import_antlr4.default.error.RecognitionException) {
        localctx.exception = re;
        this._errHandler.reportError(this, re);
        this._errHandler.recover(this, re);
      } else {
        throw re;
      }
    } finally {
      this.exitRule();
    }
    return localctx;
  }
}
GoParser.EOF = import_antlr4.default.Token.EOF;
GoParser.BREAK = 1;
GoParser.DEFAULT = 2;
GoParser.FUNC = 3;
GoParser.INTERFACE = 4;
GoParser.SELECT = 5;
GoParser.CASE = 6;
GoParser.DEFER = 7;
GoParser.GO = 8;
GoParser.MAP = 9;
GoParser.STRUCT = 10;
GoParser.CHAN = 11;
GoParser.ELSE = 12;
GoParser.GOTO = 13;
GoParser.PACKAGE = 14;
GoParser.SWITCH = 15;
GoParser.CONST = 16;
GoParser.FALLTHROUGH = 17;
GoParser.IF = 18;
GoParser.RANGE = 19;
GoParser.TYPE = 20;
GoParser.CONTINUE = 21;
GoParser.FOR = 22;
GoParser.IMPORT = 23;
GoParser.RETURN = 24;
GoParser.VAR = 25;
GoParser.NIL_LIT = 26;
GoParser.IDENTIFIER = 27;
GoParser.L_PAREN = 28;
GoParser.R_PAREN = 29;
GoParser.L_CURLY = 30;
GoParser.R_CURLY = 31;
GoParser.L_BRACKET = 32;
GoParser.R_BRACKET = 33;
GoParser.ASSIGN = 34;
GoParser.COMMA = 35;
GoParser.SEMI = 36;
GoParser.COLON = 37;
GoParser.DOT = 38;
GoParser.PLUS_PLUS = 39;
GoParser.MINUS_MINUS = 40;
GoParser.DECLARE_ASSIGN = 41;
GoParser.ELLIPSIS = 42;
GoParser.LOGICAL_OR = 43;
GoParser.LOGICAL_AND = 44;
GoParser.EQUALS = 45;
GoParser.NOT_EQUALS = 46;
GoParser.LESS = 47;
GoParser.LESS_OR_EQUALS = 48;
GoParser.GREATER = 49;
GoParser.GREATER_OR_EQUALS = 50;
GoParser.OR = 51;
GoParser.DIV = 52;
GoParser.MOD = 53;
GoParser.LSHIFT = 54;
GoParser.RSHIFT = 55;
GoParser.BIT_CLEAR = 56;
GoParser.EXCLAMATION = 57;
GoParser.PLUS = 58;
GoParser.MINUS = 59;
GoParser.CARET = 60;
GoParser.STAR = 61;
GoParser.AMPERSAND = 62;
GoParser.RECEIVE = 63;
GoParser.DECIMAL_LIT = 64;
GoParser.BINARY_LIT = 65;
GoParser.OCTAL_LIT = 66;
GoParser.HEX_LIT = 67;
GoParser.FLOAT_LIT = 68;
GoParser.DECIMAL_FLOAT_LIT = 69;
GoParser.HEX_FLOAT_LIT = 70;
GoParser.IMAGINARY_LIT = 71;
GoParser.RUNE_LIT = 72;
GoParser.BYTE_VALUE = 73;
GoParser.OCTAL_BYTE_VALUE = 74;
GoParser.HEX_BYTE_VALUE = 75;
GoParser.LITTLE_U_VALUE = 76;
GoParser.BIG_U_VALUE = 77;
GoParser.RAW_STRING_LIT = 78;
GoParser.INTERPRETED_STRING_LIT = 79;
GoParser.WS = 80;
GoParser.COMMENT = 81;
GoParser.TERMINATOR = 82;
GoParser.LINE_COMMENT = 83;
GoParser.WS_NLSEMI = 84;
GoParser.COMMENT_NLSEMI = 85;
GoParser.LINE_COMMENT_NLSEMI = 86;
GoParser.EOS = 87;
GoParser.OTHER = 88;
GoParser.RULE_sourceFile = 0;
GoParser.RULE_packageClause = 1;
GoParser.RULE_importDecl = 2;
GoParser.RULE_importSpec = 3;
GoParser.RULE_importPath = 4;
GoParser.RULE_declaration = 5;
GoParser.RULE_constDecl = 6;
GoParser.RULE_constSpec = 7;
GoParser.RULE_identifierList = 8;
GoParser.RULE_expressionList = 9;
GoParser.RULE_typeDecl = 10;
GoParser.RULE_typeSpec = 11;
GoParser.RULE_functionDecl = 12;
GoParser.RULE_methodDecl = 13;
GoParser.RULE_receiver = 14;
GoParser.RULE_varDecl = 15;
GoParser.RULE_varSpec = 16;
GoParser.RULE_block = 17;
GoParser.RULE_statementList = 18;
GoParser.RULE_statement = 19;
GoParser.RULE_simpleStmt = 20;
GoParser.RULE_expressionStmt = 21;
GoParser.RULE_sendStmt = 22;
GoParser.RULE_incDecStmt = 23;
GoParser.RULE_assignment = 24;
GoParser.RULE_assign_op = 25;
GoParser.RULE_shortVarDecl = 26;
GoParser.RULE_emptyStmt = 27;
GoParser.RULE_labeledStmt = 28;
GoParser.RULE_returnStmt = 29;
GoParser.RULE_breakStmt = 30;
GoParser.RULE_continueStmt = 31;
GoParser.RULE_gotoStmt = 32;
GoParser.RULE_fallthroughStmt = 33;
GoParser.RULE_deferStmt = 34;
GoParser.RULE_ifStmt = 35;
GoParser.RULE_switchStmt = 36;
GoParser.RULE_exprSwitchStmt = 37;
GoParser.RULE_exprCaseClause = 38;
GoParser.RULE_exprSwitchCase = 39;
GoParser.RULE_typeSwitchStmt = 40;
GoParser.RULE_typeSwitchGuard = 41;
GoParser.RULE_typeCaseClause = 42;
GoParser.RULE_typeSwitchCase = 43;
GoParser.RULE_typeList = 44;
GoParser.RULE_selectStmt = 45;
GoParser.RULE_commClause = 46;
GoParser.RULE_commCase = 47;
GoParser.RULE_recvStmt = 48;
GoParser.RULE_forStmt = 49;
GoParser.RULE_forClause = 50;
GoParser.RULE_rangeClause = 51;
GoParser.RULE_goStmt = 52;
GoParser.RULE_type_ = 53;
GoParser.RULE_typeName = 54;
GoParser.RULE_typeLit = 55;
GoParser.RULE_arrayType = 56;
GoParser.RULE_arrayLength = 57;
GoParser.RULE_elementType = 58;
GoParser.RULE_pointerType = 59;
GoParser.RULE_interfaceType = 60;
GoParser.RULE_sliceType = 61;
GoParser.RULE_mapType = 62;
GoParser.RULE_channelType = 63;
GoParser.RULE_methodSpec = 64;
GoParser.RULE_functionType = 65;
GoParser.RULE_signature = 66;
GoParser.RULE_result = 67;
GoParser.RULE_parameters = 68;
GoParser.RULE_parameterDecl = 69;
GoParser.RULE_expression = 70;
GoParser.RULE_primaryExpr = 71;
GoParser.RULE_conversion = 72;
GoParser.RULE_nonNamedType = 73;
GoParser.RULE_operand = 74;
GoParser.RULE_literal = 75;
GoParser.RULE_basicLit = 76;
GoParser.RULE_integer = 77;
GoParser.RULE_operandName = 78;
GoParser.RULE_qualifiedIdent = 79;
GoParser.RULE_compositeLit = 80;
GoParser.RULE_literalType = 81;
GoParser.RULE_literalValue = 82;
GoParser.RULE_elementList = 83;
GoParser.RULE_keyedElement = 84;
GoParser.RULE_key = 85;
GoParser.RULE_element = 86;
GoParser.RULE_structType = 87;
GoParser.RULE_fieldDecl = 88;
GoParser.RULE_string_ = 89;
GoParser.RULE_embeddedField = 90;
GoParser.RULE_functionLit = 91;
GoParser.RULE_index = 92;
GoParser.RULE_slice_ = 93;
GoParser.RULE_typeAssertion = 94;
GoParser.RULE_arguments = 95;
GoParser.RULE_methodExpr = 96;
GoParser.RULE_receiverType = 97;
GoParser.RULE_eos = 98;
class SourceFileContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_sourceFile;
  }
  packageClause() {
    return this.getTypedRuleContext(PackageClauseContext, 0);
  }
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  EOF() {
    return this.getToken(GoParser.EOF, 0);
  }
  importDecl = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ImportDeclContext);
    } else {
      return this.getTypedRuleContext(ImportDeclContext, i);
    }
  };
  functionDecl = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(FunctionDeclContext);
    } else {
      return this.getTypedRuleContext(FunctionDeclContext, i);
    }
  };
  methodDecl = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(MethodDeclContext);
    } else {
      return this.getTypedRuleContext(MethodDeclContext, i);
    }
  };
  declaration = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(DeclarationContext);
    } else {
      return this.getTypedRuleContext(DeclarationContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSourceFile(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSourceFile(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSourceFile(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class PackageClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_packageClause;
    this.packageName = null;
  }
  PACKAGE() {
    return this.getToken(GoParser.PACKAGE, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterPackageClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitPackageClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitPackageClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_importDecl;
  }
  IMPORT() {
    return this.getToken(GoParser.IMPORT, 0);
  }
  importSpec = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ImportSpecContext);
    } else {
      return this.getTypedRuleContext(ImportSpecContext, i);
    }
  };
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterImportDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitImportDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitImportDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportSpecContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_importSpec;
    this.alias = null;
  }
  importPath() {
    return this.getTypedRuleContext(ImportPathContext, 0);
  }
  DOT() {
    return this.getToken(GoParser.DOT, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterImportSpec(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitImportSpec(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitImportSpec(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportPathContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_importPath;
  }
  string_() {
    return this.getTypedRuleContext(String_Context, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterImportPath(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitImportPath(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitImportPath(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DeclarationContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_declaration;
  }
  constDecl() {
    return this.getTypedRuleContext(ConstDeclContext, 0);
  }
  typeDecl() {
    return this.getTypedRuleContext(TypeDeclContext, 0);
  }
  varDecl() {
    return this.getTypedRuleContext(VarDeclContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterDeclaration(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitDeclaration(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitDeclaration(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ConstDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_constDecl;
  }
  CONST() {
    return this.getToken(GoParser.CONST, 0);
  }
  constSpec = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ConstSpecContext);
    } else {
      return this.getTypedRuleContext(ConstSpecContext, i);
    }
  };
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterConstDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitConstDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitConstDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ConstSpecContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_constSpec;
  }
  identifierList() {
    return this.getTypedRuleContext(IdentifierListContext, 0);
  }
  ASSIGN() {
    return this.getToken(GoParser.ASSIGN, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterConstSpec(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitConstSpec(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitConstSpec(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IdentifierListContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_identifierList;
  }
  IDENTIFIER = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.IDENTIFIER);
    } else {
      return this.getToken(GoParser.IDENTIFIER, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.COMMA);
    } else {
      return this.getToken(GoParser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterIdentifierList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitIdentifierList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitIdentifierList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExpressionListContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_expressionList;
  }
  expression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExpressionContext);
    } else {
      return this.getTypedRuleContext(ExpressionContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.COMMA);
    } else {
      return this.getToken(GoParser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterExpressionList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitExpressionList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitExpressionList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeDecl;
  }
  TYPE() {
    return this.getToken(GoParser.TYPE, 0);
  }
  typeSpec = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TypeSpecContext);
    } else {
      return this.getTypedRuleContext(TypeSpecContext, i);
    }
  };
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeSpecContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeSpec;
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  ASSIGN() {
    return this.getToken(GoParser.ASSIGN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeSpec(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeSpec(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeSpec(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FunctionDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_functionDecl;
  }
  FUNC() {
    return this.getToken(GoParser.FUNC, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  signature() {
    return this.getTypedRuleContext(SignatureContext, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterFunctionDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitFunctionDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitFunctionDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class MethodDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_methodDecl;
  }
  FUNC() {
    return this.getToken(GoParser.FUNC, 0);
  }
  receiver() {
    return this.getTypedRuleContext(ReceiverContext, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  signature() {
    return this.getTypedRuleContext(SignatureContext, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterMethodDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitMethodDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitMethodDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ReceiverContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_receiver;
  }
  parameters() {
    return this.getTypedRuleContext(ParametersContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterReceiver(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitReceiver(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitReceiver(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class VarDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_varDecl;
  }
  VAR() {
    return this.getToken(GoParser.VAR, 0);
  }
  varSpec = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(VarSpecContext);
    } else {
      return this.getTypedRuleContext(VarSpecContext, i);
    }
  };
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterVarDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitVarDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitVarDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class VarSpecContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_varSpec;
  }
  identifierList() {
    return this.getTypedRuleContext(IdentifierListContext, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  ASSIGN() {
    return this.getToken(GoParser.ASSIGN, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterVarSpec(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitVarSpec(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitVarSpec(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class BlockContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_block;
  }
  L_CURLY() {
    return this.getToken(GoParser.L_CURLY, 0);
  }
  R_CURLY() {
    return this.getToken(GoParser.R_CURLY, 0);
  }
  statementList() {
    return this.getTypedRuleContext(StatementListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterBlock(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitBlock(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitBlock(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class StatementListContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_statementList;
  }
  statement = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(StatementContext);
    } else {
      return this.getTypedRuleContext(StatementContext, i);
    }
  };
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterStatementList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitStatementList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitStatementList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class StatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_statement;
  }
  declaration() {
    return this.getTypedRuleContext(DeclarationContext, 0);
  }
  labeledStmt() {
    return this.getTypedRuleContext(LabeledStmtContext, 0);
  }
  simpleStmt() {
    return this.getTypedRuleContext(SimpleStmtContext, 0);
  }
  goStmt() {
    return this.getTypedRuleContext(GoStmtContext, 0);
  }
  returnStmt() {
    return this.getTypedRuleContext(ReturnStmtContext, 0);
  }
  breakStmt() {
    return this.getTypedRuleContext(BreakStmtContext, 0);
  }
  continueStmt() {
    return this.getTypedRuleContext(ContinueStmtContext, 0);
  }
  gotoStmt() {
    return this.getTypedRuleContext(GotoStmtContext, 0);
  }
  fallthroughStmt() {
    return this.getTypedRuleContext(FallthroughStmtContext, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  ifStmt() {
    return this.getTypedRuleContext(IfStmtContext, 0);
  }
  switchStmt() {
    return this.getTypedRuleContext(SwitchStmtContext, 0);
  }
  selectStmt() {
    return this.getTypedRuleContext(SelectStmtContext, 0);
  }
  forStmt() {
    return this.getTypedRuleContext(ForStmtContext, 0);
  }
  deferStmt() {
    return this.getTypedRuleContext(DeferStmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SimpleStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_simpleStmt;
  }
  sendStmt() {
    return this.getTypedRuleContext(SendStmtContext, 0);
  }
  incDecStmt() {
    return this.getTypedRuleContext(IncDecStmtContext, 0);
  }
  assignment() {
    return this.getTypedRuleContext(AssignmentContext, 0);
  }
  expressionStmt() {
    return this.getTypedRuleContext(ExpressionStmtContext, 0);
  }
  shortVarDecl() {
    return this.getTypedRuleContext(ShortVarDeclContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSimpleStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSimpleStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSimpleStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExpressionStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_expressionStmt;
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterExpressionStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitExpressionStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitExpressionStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SendStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_sendStmt;
    this.channel = null;
  }
  RECEIVE() {
    return this.getToken(GoParser.RECEIVE, 0);
  }
  expression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExpressionContext);
    } else {
      return this.getTypedRuleContext(ExpressionContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSendStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSendStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSendStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IncDecStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_incDecStmt;
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  PLUS_PLUS() {
    return this.getToken(GoParser.PLUS_PLUS, 0);
  }
  MINUS_MINUS() {
    return this.getToken(GoParser.MINUS_MINUS, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterIncDecStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitIncDecStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitIncDecStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class AssignmentContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_assignment;
  }
  expressionList = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExpressionListContext);
    } else {
      return this.getTypedRuleContext(ExpressionListContext, i);
    }
  };
  assign_op() {
    return this.getTypedRuleContext(Assign_opContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterAssignment(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitAssignment(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitAssignment(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Assign_opContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_assign_op;
  }
  ASSIGN() {
    return this.getToken(GoParser.ASSIGN, 0);
  }
  PLUS() {
    return this.getToken(GoParser.PLUS, 0);
  }
  MINUS() {
    return this.getToken(GoParser.MINUS, 0);
  }
  OR() {
    return this.getToken(GoParser.OR, 0);
  }
  CARET() {
    return this.getToken(GoParser.CARET, 0);
  }
  STAR() {
    return this.getToken(GoParser.STAR, 0);
  }
  DIV() {
    return this.getToken(GoParser.DIV, 0);
  }
  MOD() {
    return this.getToken(GoParser.MOD, 0);
  }
  LSHIFT() {
    return this.getToken(GoParser.LSHIFT, 0);
  }
  RSHIFT() {
    return this.getToken(GoParser.RSHIFT, 0);
  }
  AMPERSAND() {
    return this.getToken(GoParser.AMPERSAND, 0);
  }
  BIT_CLEAR() {
    return this.getToken(GoParser.BIT_CLEAR, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterAssign_op(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitAssign_op(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitAssign_op(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ShortVarDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_shortVarDecl;
  }
  identifierList() {
    return this.getTypedRuleContext(IdentifierListContext, 0);
  }
  DECLARE_ASSIGN() {
    return this.getToken(GoParser.DECLARE_ASSIGN, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterShortVarDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitShortVarDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitShortVarDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class EmptyStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_emptyStmt;
  }
  EOS() {
    return this.getToken(GoParser.EOS, 0);
  }
  SEMI() {
    return this.getToken(GoParser.SEMI, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterEmptyStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitEmptyStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitEmptyStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class LabeledStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_labeledStmt;
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  COLON() {
    return this.getToken(GoParser.COLON, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterLabeledStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitLabeledStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitLabeledStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ReturnStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_returnStmt;
  }
  RETURN() {
    return this.getToken(GoParser.RETURN, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterReturnStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitReturnStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitReturnStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class BreakStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_breakStmt;
  }
  BREAK() {
    return this.getToken(GoParser.BREAK, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterBreakStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitBreakStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitBreakStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ContinueStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_continueStmt;
  }
  CONTINUE() {
    return this.getToken(GoParser.CONTINUE, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterContinueStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitContinueStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitContinueStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class GotoStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_gotoStmt;
  }
  GOTO() {
    return this.getToken(GoParser.GOTO, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterGotoStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitGotoStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitGotoStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FallthroughStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_fallthroughStmt;
  }
  FALLTHROUGH() {
    return this.getToken(GoParser.FALLTHROUGH, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterFallthroughStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitFallthroughStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitFallthroughStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DeferStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_deferStmt;
  }
  DEFER() {
    return this.getToken(GoParser.DEFER, 0);
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterDeferStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitDeferStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitDeferStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IfStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_ifStmt;
  }
  IF() {
    return this.getToken(GoParser.IF, 0);
  }
  block = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(BlockContext);
    } else {
      return this.getTypedRuleContext(BlockContext, i);
    }
  };
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  simpleStmt() {
    return this.getTypedRuleContext(SimpleStmtContext, 0);
  }
  ELSE() {
    return this.getToken(GoParser.ELSE, 0);
  }
  ifStmt() {
    return this.getTypedRuleContext(IfStmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterIfStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitIfStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitIfStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SwitchStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_switchStmt;
  }
  exprSwitchStmt() {
    return this.getTypedRuleContext(ExprSwitchStmtContext, 0);
  }
  typeSwitchStmt() {
    return this.getTypedRuleContext(TypeSwitchStmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSwitchStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSwitchStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSwitchStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExprSwitchStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_exprSwitchStmt;
  }
  SWITCH() {
    return this.getToken(GoParser.SWITCH, 0);
  }
  L_CURLY() {
    return this.getToken(GoParser.L_CURLY, 0);
  }
  R_CURLY() {
    return this.getToken(GoParser.R_CURLY, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  exprCaseClause = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExprCaseClauseContext);
    } else {
      return this.getTypedRuleContext(ExprCaseClauseContext, i);
    }
  };
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  simpleStmt() {
    return this.getTypedRuleContext(SimpleStmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterExprSwitchStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitExprSwitchStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitExprSwitchStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExprCaseClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_exprCaseClause;
  }
  exprSwitchCase() {
    return this.getTypedRuleContext(ExprSwitchCaseContext, 0);
  }
  COLON() {
    return this.getToken(GoParser.COLON, 0);
  }
  statementList() {
    return this.getTypedRuleContext(StatementListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterExprCaseClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitExprCaseClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitExprCaseClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExprSwitchCaseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_exprSwitchCase;
  }
  CASE() {
    return this.getToken(GoParser.CASE, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  DEFAULT() {
    return this.getToken(GoParser.DEFAULT, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterExprSwitchCase(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitExprSwitchCase(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitExprSwitchCase(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeSwitchStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeSwitchStmt;
  }
  SWITCH() {
    return this.getToken(GoParser.SWITCH, 0);
  }
  L_CURLY() {
    return this.getToken(GoParser.L_CURLY, 0);
  }
  R_CURLY() {
    return this.getToken(GoParser.R_CURLY, 0);
  }
  typeSwitchGuard() {
    return this.getTypedRuleContext(TypeSwitchGuardContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  simpleStmt() {
    return this.getTypedRuleContext(SimpleStmtContext, 0);
  }
  typeCaseClause = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TypeCaseClauseContext);
    } else {
      return this.getTypedRuleContext(TypeCaseClauseContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeSwitchStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeSwitchStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeSwitchStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeSwitchGuardContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeSwitchGuard;
  }
  primaryExpr() {
    return this.getTypedRuleContext(PrimaryExprContext, 0);
  }
  DOT() {
    return this.getToken(GoParser.DOT, 0);
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  TYPE() {
    return this.getToken(GoParser.TYPE, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  DECLARE_ASSIGN() {
    return this.getToken(GoParser.DECLARE_ASSIGN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeSwitchGuard(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeSwitchGuard(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeSwitchGuard(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeCaseClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeCaseClause;
  }
  typeSwitchCase() {
    return this.getTypedRuleContext(TypeSwitchCaseContext, 0);
  }
  COLON() {
    return this.getToken(GoParser.COLON, 0);
  }
  statementList() {
    return this.getTypedRuleContext(StatementListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeCaseClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeCaseClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeCaseClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeSwitchCaseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeSwitchCase;
  }
  CASE() {
    return this.getToken(GoParser.CASE, 0);
  }
  typeList() {
    return this.getTypedRuleContext(TypeListContext, 0);
  }
  DEFAULT() {
    return this.getToken(GoParser.DEFAULT, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeSwitchCase(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeSwitchCase(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeSwitchCase(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeListContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeList;
  }
  type_ = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Type_Context);
    } else {
      return this.getTypedRuleContext(Type_Context, i);
    }
  };
  NIL_LIT = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.NIL_LIT);
    } else {
      return this.getToken(GoParser.NIL_LIT, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.COMMA);
    } else {
      return this.getToken(GoParser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SelectStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_selectStmt;
  }
  SELECT() {
    return this.getToken(GoParser.SELECT, 0);
  }
  L_CURLY() {
    return this.getToken(GoParser.L_CURLY, 0);
  }
  R_CURLY() {
    return this.getToken(GoParser.R_CURLY, 0);
  }
  commClause = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(CommClauseContext);
    } else {
      return this.getTypedRuleContext(CommClauseContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSelectStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSelectStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSelectStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class CommClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_commClause;
  }
  commCase() {
    return this.getTypedRuleContext(CommCaseContext, 0);
  }
  COLON() {
    return this.getToken(GoParser.COLON, 0);
  }
  statementList() {
    return this.getTypedRuleContext(StatementListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterCommClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitCommClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitCommClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class CommCaseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_commCase;
  }
  CASE() {
    return this.getToken(GoParser.CASE, 0);
  }
  sendStmt() {
    return this.getTypedRuleContext(SendStmtContext, 0);
  }
  recvStmt() {
    return this.getTypedRuleContext(RecvStmtContext, 0);
  }
  DEFAULT() {
    return this.getToken(GoParser.DEFAULT, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterCommCase(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitCommCase(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitCommCase(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class RecvStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_recvStmt;
    this.recvExpr = null;
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  ASSIGN() {
    return this.getToken(GoParser.ASSIGN, 0);
  }
  identifierList() {
    return this.getTypedRuleContext(IdentifierListContext, 0);
  }
  DECLARE_ASSIGN() {
    return this.getToken(GoParser.DECLARE_ASSIGN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterRecvStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitRecvStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitRecvStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ForStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_forStmt;
  }
  FOR() {
    return this.getToken(GoParser.FOR, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  forClause() {
    return this.getTypedRuleContext(ForClauseContext, 0);
  }
  rangeClause() {
    return this.getTypedRuleContext(RangeClauseContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterForStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitForStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitForStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ForClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_forClause;
    this.initStmt = null;
    this.postStmt = null;
  }
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  simpleStmt = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SimpleStmtContext);
    } else {
      return this.getTypedRuleContext(SimpleStmtContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterForClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitForClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitForClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class RangeClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_rangeClause;
  }
  RANGE() {
    return this.getToken(GoParser.RANGE, 0);
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  ASSIGN() {
    return this.getToken(GoParser.ASSIGN, 0);
  }
  identifierList() {
    return this.getTypedRuleContext(IdentifierListContext, 0);
  }
  DECLARE_ASSIGN() {
    return this.getToken(GoParser.DECLARE_ASSIGN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterRangeClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitRangeClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitRangeClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class GoStmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_goStmt;
  }
  GO() {
    return this.getToken(GoParser.GO, 0);
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterGoStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitGoStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitGoStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Type_Context extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_type_;
  }
  typeName() {
    return this.getTypedRuleContext(TypeNameContext, 0);
  }
  typeLit() {
    return this.getTypedRuleContext(TypeLitContext, 0);
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterType_(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitType_(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitType_(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeNameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeName;
  }
  qualifiedIdent() {
    return this.getTypedRuleContext(QualifiedIdentContext, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeName(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeName(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeName(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeLitContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeLit;
  }
  arrayType() {
    return this.getTypedRuleContext(ArrayTypeContext, 0);
  }
  structType() {
    return this.getTypedRuleContext(StructTypeContext, 0);
  }
  pointerType() {
    return this.getTypedRuleContext(PointerTypeContext, 0);
  }
  functionType() {
    return this.getTypedRuleContext(FunctionTypeContext, 0);
  }
  interfaceType() {
    return this.getTypedRuleContext(InterfaceTypeContext, 0);
  }
  sliceType() {
    return this.getTypedRuleContext(SliceTypeContext, 0);
  }
  mapType() {
    return this.getTypedRuleContext(MapTypeContext, 0);
  }
  channelType() {
    return this.getTypedRuleContext(ChannelTypeContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeLit(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeLit(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeLit(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArrayTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_arrayType;
  }
  L_BRACKET() {
    return this.getToken(GoParser.L_BRACKET, 0);
  }
  arrayLength() {
    return this.getTypedRuleContext(ArrayLengthContext, 0);
  }
  R_BRACKET() {
    return this.getToken(GoParser.R_BRACKET, 0);
  }
  elementType() {
    return this.getTypedRuleContext(ElementTypeContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterArrayType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitArrayType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitArrayType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArrayLengthContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_arrayLength;
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterArrayLength(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitArrayLength(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitArrayLength(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ElementTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_elementType;
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterElementType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitElementType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitElementType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class PointerTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_pointerType;
  }
  STAR() {
    return this.getToken(GoParser.STAR, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterPointerType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitPointerType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitPointerType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class InterfaceTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_interfaceType;
  }
  INTERFACE() {
    return this.getToken(GoParser.INTERFACE, 0);
  }
  L_CURLY() {
    return this.getToken(GoParser.L_CURLY, 0);
  }
  R_CURLY() {
    return this.getToken(GoParser.R_CURLY, 0);
  }
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  methodSpec = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(MethodSpecContext);
    } else {
      return this.getTypedRuleContext(MethodSpecContext, i);
    }
  };
  typeName = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TypeNameContext);
    } else {
      return this.getTypedRuleContext(TypeNameContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterInterfaceType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitInterfaceType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitInterfaceType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SliceTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_sliceType;
  }
  L_BRACKET() {
    return this.getToken(GoParser.L_BRACKET, 0);
  }
  R_BRACKET() {
    return this.getToken(GoParser.R_BRACKET, 0);
  }
  elementType() {
    return this.getTypedRuleContext(ElementTypeContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSliceType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSliceType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSliceType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class MapTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_mapType;
  }
  MAP() {
    return this.getToken(GoParser.MAP, 0);
  }
  L_BRACKET() {
    return this.getToken(GoParser.L_BRACKET, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  R_BRACKET() {
    return this.getToken(GoParser.R_BRACKET, 0);
  }
  elementType() {
    return this.getTypedRuleContext(ElementTypeContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterMapType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitMapType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitMapType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ChannelTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_channelType;
  }
  elementType() {
    return this.getTypedRuleContext(ElementTypeContext, 0);
  }
  CHAN() {
    return this.getToken(GoParser.CHAN, 0);
  }
  RECEIVE() {
    return this.getToken(GoParser.RECEIVE, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterChannelType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitChannelType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitChannelType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class MethodSpecContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_methodSpec;
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  parameters() {
    return this.getTypedRuleContext(ParametersContext, 0);
  }
  result() {
    return this.getTypedRuleContext(ResultContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterMethodSpec(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitMethodSpec(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitMethodSpec(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FunctionTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_functionType;
  }
  FUNC() {
    return this.getToken(GoParser.FUNC, 0);
  }
  signature() {
    return this.getTypedRuleContext(SignatureContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterFunctionType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitFunctionType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitFunctionType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SignatureContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_signature;
  }
  parameters() {
    return this.getTypedRuleContext(ParametersContext, 0);
  }
  result() {
    return this.getTypedRuleContext(ResultContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSignature(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSignature(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSignature(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ResultContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_result;
  }
  parameters() {
    return this.getTypedRuleContext(ParametersContext, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterResult(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitResult(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitResult(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ParametersContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_parameters;
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  parameterDecl = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ParameterDeclContext);
    } else {
      return this.getTypedRuleContext(ParameterDeclContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.COMMA);
    } else {
      return this.getToken(GoParser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterParameters(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitParameters(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitParameters(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ParameterDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_parameterDecl;
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  identifierList() {
    return this.getTypedRuleContext(IdentifierListContext, 0);
  }
  ELLIPSIS() {
    return this.getToken(GoParser.ELLIPSIS, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterParameterDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitParameterDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitParameterDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExpressionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_expression;
    this.unary_op = null;
    this.mul_op = null;
    this.add_op = null;
    this.rel_op = null;
  }
  primaryExpr() {
    return this.getTypedRuleContext(PrimaryExprContext, 0);
  }
  expression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExpressionContext);
    } else {
      return this.getTypedRuleContext(ExpressionContext, i);
    }
  };
  PLUS() {
    return this.getToken(GoParser.PLUS, 0);
  }
  MINUS() {
    return this.getToken(GoParser.MINUS, 0);
  }
  EXCLAMATION() {
    return this.getToken(GoParser.EXCLAMATION, 0);
  }
  CARET() {
    return this.getToken(GoParser.CARET, 0);
  }
  STAR() {
    return this.getToken(GoParser.STAR, 0);
  }
  AMPERSAND() {
    return this.getToken(GoParser.AMPERSAND, 0);
  }
  RECEIVE() {
    return this.getToken(GoParser.RECEIVE, 0);
  }
  DIV() {
    return this.getToken(GoParser.DIV, 0);
  }
  MOD() {
    return this.getToken(GoParser.MOD, 0);
  }
  LSHIFT() {
    return this.getToken(GoParser.LSHIFT, 0);
  }
  RSHIFT() {
    return this.getToken(GoParser.RSHIFT, 0);
  }
  BIT_CLEAR() {
    return this.getToken(GoParser.BIT_CLEAR, 0);
  }
  OR() {
    return this.getToken(GoParser.OR, 0);
  }
  EQUALS() {
    return this.getToken(GoParser.EQUALS, 0);
  }
  NOT_EQUALS() {
    return this.getToken(GoParser.NOT_EQUALS, 0);
  }
  LESS() {
    return this.getToken(GoParser.LESS, 0);
  }
  LESS_OR_EQUALS() {
    return this.getToken(GoParser.LESS_OR_EQUALS, 0);
  }
  GREATER() {
    return this.getToken(GoParser.GREATER, 0);
  }
  GREATER_OR_EQUALS() {
    return this.getToken(GoParser.GREATER_OR_EQUALS, 0);
  }
  LOGICAL_AND() {
    return this.getToken(GoParser.LOGICAL_AND, 0);
  }
  LOGICAL_OR() {
    return this.getToken(GoParser.LOGICAL_OR, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class PrimaryExprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_primaryExpr;
  }
  operand() {
    return this.getTypedRuleContext(OperandContext, 0);
  }
  conversion() {
    return this.getTypedRuleContext(ConversionContext, 0);
  }
  methodExpr() {
    return this.getTypedRuleContext(MethodExprContext, 0);
  }
  primaryExpr() {
    return this.getTypedRuleContext(PrimaryExprContext, 0);
  }
  index() {
    return this.getTypedRuleContext(IndexContext, 0);
  }
  slice_() {
    return this.getTypedRuleContext(Slice_Context, 0);
  }
  typeAssertion() {
    return this.getTypedRuleContext(TypeAssertionContext, 0);
  }
  arguments() {
    return this.getTypedRuleContext(ArgumentsContext, 0);
  }
  DOT() {
    return this.getToken(GoParser.DOT, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterPrimaryExpr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitPrimaryExpr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitPrimaryExpr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ConversionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_conversion;
  }
  nonNamedType() {
    return this.getTypedRuleContext(NonNamedTypeContext, 0);
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  COMMA() {
    return this.getToken(GoParser.COMMA, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterConversion(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitConversion(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitConversion(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class NonNamedTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_nonNamedType;
  }
  typeLit() {
    return this.getTypedRuleContext(TypeLitContext, 0);
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  nonNamedType() {
    return this.getTypedRuleContext(NonNamedTypeContext, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterNonNamedType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitNonNamedType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitNonNamedType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class OperandContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_operand;
  }
  literal() {
    return this.getTypedRuleContext(LiteralContext, 0);
  }
  operandName() {
    return this.getTypedRuleContext(OperandNameContext, 0);
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterOperand(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitOperand(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitOperand(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class LiteralContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_literal;
  }
  basicLit() {
    return this.getTypedRuleContext(BasicLitContext, 0);
  }
  compositeLit() {
    return this.getTypedRuleContext(CompositeLitContext, 0);
  }
  functionLit() {
    return this.getTypedRuleContext(FunctionLitContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterLiteral(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitLiteral(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitLiteral(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class BasicLitContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_basicLit;
  }
  NIL_LIT() {
    return this.getToken(GoParser.NIL_LIT, 0);
  }
  integer() {
    return this.getTypedRuleContext(IntegerContext, 0);
  }
  string_() {
    return this.getTypedRuleContext(String_Context, 0);
  }
  FLOAT_LIT() {
    return this.getToken(GoParser.FLOAT_LIT, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterBasicLit(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitBasicLit(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitBasicLit(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IntegerContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_integer;
  }
  DECIMAL_LIT() {
    return this.getToken(GoParser.DECIMAL_LIT, 0);
  }
  BINARY_LIT() {
    return this.getToken(GoParser.BINARY_LIT, 0);
  }
  OCTAL_LIT() {
    return this.getToken(GoParser.OCTAL_LIT, 0);
  }
  HEX_LIT() {
    return this.getToken(GoParser.HEX_LIT, 0);
  }
  IMAGINARY_LIT() {
    return this.getToken(GoParser.IMAGINARY_LIT, 0);
  }
  RUNE_LIT() {
    return this.getToken(GoParser.RUNE_LIT, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterInteger(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitInteger(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitInteger(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class OperandNameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_operandName;
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterOperandName(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitOperandName(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitOperandName(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class QualifiedIdentContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_qualifiedIdent;
  }
  IDENTIFIER = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.IDENTIFIER);
    } else {
      return this.getToken(GoParser.IDENTIFIER, i);
    }
  };
  DOT() {
    return this.getToken(GoParser.DOT, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterQualifiedIdent(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitQualifiedIdent(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitQualifiedIdent(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class CompositeLitContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_compositeLit;
  }
  literalType() {
    return this.getTypedRuleContext(LiteralTypeContext, 0);
  }
  literalValue() {
    return this.getTypedRuleContext(LiteralValueContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterCompositeLit(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitCompositeLit(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitCompositeLit(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class LiteralTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_literalType;
  }
  structType() {
    return this.getTypedRuleContext(StructTypeContext, 0);
  }
  arrayType() {
    return this.getTypedRuleContext(ArrayTypeContext, 0);
  }
  L_BRACKET() {
    return this.getToken(GoParser.L_BRACKET, 0);
  }
  ELLIPSIS() {
    return this.getToken(GoParser.ELLIPSIS, 0);
  }
  R_BRACKET() {
    return this.getToken(GoParser.R_BRACKET, 0);
  }
  elementType() {
    return this.getTypedRuleContext(ElementTypeContext, 0);
  }
  sliceType() {
    return this.getTypedRuleContext(SliceTypeContext, 0);
  }
  mapType() {
    return this.getTypedRuleContext(MapTypeContext, 0);
  }
  typeName() {
    return this.getTypedRuleContext(TypeNameContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterLiteralType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitLiteralType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitLiteralType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class LiteralValueContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_literalValue;
  }
  L_CURLY() {
    return this.getToken(GoParser.L_CURLY, 0);
  }
  R_CURLY() {
    return this.getToken(GoParser.R_CURLY, 0);
  }
  elementList() {
    return this.getTypedRuleContext(ElementListContext, 0);
  }
  COMMA() {
    return this.getToken(GoParser.COMMA, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterLiteralValue(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitLiteralValue(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitLiteralValue(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ElementListContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_elementList;
  }
  keyedElement = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(KeyedElementContext);
    } else {
      return this.getTypedRuleContext(KeyedElementContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.COMMA);
    } else {
      return this.getToken(GoParser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterElementList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitElementList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitElementList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class KeyedElementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_keyedElement;
  }
  element() {
    return this.getTypedRuleContext(ElementContext, 0);
  }
  key() {
    return this.getTypedRuleContext(KeyContext, 0);
  }
  COLON() {
    return this.getToken(GoParser.COLON, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterKeyedElement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitKeyedElement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitKeyedElement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class KeyContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_key;
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  literalValue() {
    return this.getTypedRuleContext(LiteralValueContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterKey(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitKey(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitKey(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ElementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_element;
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  literalValue() {
    return this.getTypedRuleContext(LiteralValueContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterElement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitElement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitElement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class StructTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_structType;
  }
  STRUCT() {
    return this.getToken(GoParser.STRUCT, 0);
  }
  L_CURLY() {
    return this.getToken(GoParser.L_CURLY, 0);
  }
  R_CURLY() {
    return this.getToken(GoParser.R_CURLY, 0);
  }
  fieldDecl = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(FieldDeclContext);
    } else {
      return this.getTypedRuleContext(FieldDeclContext, i);
    }
  };
  eos = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(EosContext);
    } else {
      return this.getTypedRuleContext(EosContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterStructType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitStructType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitStructType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FieldDeclContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_fieldDecl;
    this.tag = null;
  }
  identifierList() {
    return this.getTypedRuleContext(IdentifierListContext, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  embeddedField() {
    return this.getTypedRuleContext(EmbeddedFieldContext, 0);
  }
  string_() {
    return this.getTypedRuleContext(String_Context, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterFieldDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitFieldDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitFieldDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class String_Context extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_string_;
  }
  RAW_STRING_LIT() {
    return this.getToken(GoParser.RAW_STRING_LIT, 0);
  }
  INTERPRETED_STRING_LIT() {
    return this.getToken(GoParser.INTERPRETED_STRING_LIT, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterString_(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitString_(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitString_(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class EmbeddedFieldContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_embeddedField;
  }
  typeName() {
    return this.getTypedRuleContext(TypeNameContext, 0);
  }
  STAR() {
    return this.getToken(GoParser.STAR, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterEmbeddedField(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitEmbeddedField(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitEmbeddedField(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FunctionLitContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_functionLit;
  }
  FUNC() {
    return this.getToken(GoParser.FUNC, 0);
  }
  signature() {
    return this.getTypedRuleContext(SignatureContext, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterFunctionLit(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitFunctionLit(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitFunctionLit(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IndexContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_index;
  }
  L_BRACKET() {
    return this.getToken(GoParser.L_BRACKET, 0);
  }
  expression() {
    return this.getTypedRuleContext(ExpressionContext, 0);
  }
  R_BRACKET() {
    return this.getToken(GoParser.R_BRACKET, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterIndex(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitIndex(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitIndex(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Slice_Context extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_slice_;
  }
  L_BRACKET() {
    return this.getToken(GoParser.L_BRACKET, 0);
  }
  R_BRACKET() {
    return this.getToken(GoParser.R_BRACKET, 0);
  }
  COLON = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.COLON);
    } else {
      return this.getToken(GoParser.COLON, i);
    }
  };
  expression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExpressionContext);
    } else {
      return this.getTypedRuleContext(ExpressionContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterSlice_(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitSlice_(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitSlice_(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypeAssertionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_typeAssertion;
  }
  DOT() {
    return this.getToken(GoParser.DOT, 0);
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterTypeAssertion(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitTypeAssertion(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitTypeAssertion(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArgumentsContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_arguments;
  }
  L_PAREN() {
    return this.getToken(GoParser.L_PAREN, 0);
  }
  R_PAREN() {
    return this.getToken(GoParser.R_PAREN, 0);
  }
  expressionList() {
    return this.getTypedRuleContext(ExpressionListContext, 0);
  }
  nonNamedType() {
    return this.getTypedRuleContext(NonNamedTypeContext, 0);
  }
  ELLIPSIS() {
    return this.getToken(GoParser.ELLIPSIS, 0);
  }
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(GoParser.COMMA);
    } else {
      return this.getToken(GoParser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterArguments(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitArguments(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitArguments(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class MethodExprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_methodExpr;
  }
  nonNamedType() {
    return this.getTypedRuleContext(NonNamedTypeContext, 0);
  }
  DOT() {
    return this.getToken(GoParser.DOT, 0);
  }
  IDENTIFIER() {
    return this.getToken(GoParser.IDENTIFIER, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterMethodExpr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitMethodExpr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitMethodExpr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ReceiverTypeContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_receiverType;
  }
  type_() {
    return this.getTypedRuleContext(Type_Context, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterReceiverType(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitReceiverType(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitReceiverType(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class EosContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = GoParser.RULE_eos;
  }
  SEMI() {
    return this.getToken(GoParser.SEMI, 0);
  }
  EOF() {
    return this.getToken(GoParser.EOF, 0);
  }
  EOS() {
    return this.getToken(GoParser.EOS, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.enterEos(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_GoParserListener.default) {
      listener.exitEos(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_GoParserVisitor.default) {
      return visitor.visitEos(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
GoParser.SourceFileContext = SourceFileContext;
GoParser.PackageClauseContext = PackageClauseContext;
GoParser.ImportDeclContext = ImportDeclContext;
GoParser.ImportSpecContext = ImportSpecContext;
GoParser.ImportPathContext = ImportPathContext;
GoParser.DeclarationContext = DeclarationContext;
GoParser.ConstDeclContext = ConstDeclContext;
GoParser.ConstSpecContext = ConstSpecContext;
GoParser.IdentifierListContext = IdentifierListContext;
GoParser.ExpressionListContext = ExpressionListContext;
GoParser.TypeDeclContext = TypeDeclContext;
GoParser.TypeSpecContext = TypeSpecContext;
GoParser.FunctionDeclContext = FunctionDeclContext;
GoParser.MethodDeclContext = MethodDeclContext;
GoParser.ReceiverContext = ReceiverContext;
GoParser.VarDeclContext = VarDeclContext;
GoParser.VarSpecContext = VarSpecContext;
GoParser.BlockContext = BlockContext;
GoParser.StatementListContext = StatementListContext;
GoParser.StatementContext = StatementContext;
GoParser.SimpleStmtContext = SimpleStmtContext;
GoParser.ExpressionStmtContext = ExpressionStmtContext;
GoParser.SendStmtContext = SendStmtContext;
GoParser.IncDecStmtContext = IncDecStmtContext;
GoParser.AssignmentContext = AssignmentContext;
GoParser.Assign_opContext = Assign_opContext;
GoParser.ShortVarDeclContext = ShortVarDeclContext;
GoParser.EmptyStmtContext = EmptyStmtContext;
GoParser.LabeledStmtContext = LabeledStmtContext;
GoParser.ReturnStmtContext = ReturnStmtContext;
GoParser.BreakStmtContext = BreakStmtContext;
GoParser.ContinueStmtContext = ContinueStmtContext;
GoParser.GotoStmtContext = GotoStmtContext;
GoParser.FallthroughStmtContext = FallthroughStmtContext;
GoParser.DeferStmtContext = DeferStmtContext;
GoParser.IfStmtContext = IfStmtContext;
GoParser.SwitchStmtContext = SwitchStmtContext;
GoParser.ExprSwitchStmtContext = ExprSwitchStmtContext;
GoParser.ExprCaseClauseContext = ExprCaseClauseContext;
GoParser.ExprSwitchCaseContext = ExprSwitchCaseContext;
GoParser.TypeSwitchStmtContext = TypeSwitchStmtContext;
GoParser.TypeSwitchGuardContext = TypeSwitchGuardContext;
GoParser.TypeCaseClauseContext = TypeCaseClauseContext;
GoParser.TypeSwitchCaseContext = TypeSwitchCaseContext;
GoParser.TypeListContext = TypeListContext;
GoParser.SelectStmtContext = SelectStmtContext;
GoParser.CommClauseContext = CommClauseContext;
GoParser.CommCaseContext = CommCaseContext;
GoParser.RecvStmtContext = RecvStmtContext;
GoParser.ForStmtContext = ForStmtContext;
GoParser.ForClauseContext = ForClauseContext;
GoParser.RangeClauseContext = RangeClauseContext;
GoParser.GoStmtContext = GoStmtContext;
GoParser.Type_Context = Type_Context;
GoParser.TypeNameContext = TypeNameContext;
GoParser.TypeLitContext = TypeLitContext;
GoParser.ArrayTypeContext = ArrayTypeContext;
GoParser.ArrayLengthContext = ArrayLengthContext;
GoParser.ElementTypeContext = ElementTypeContext;
GoParser.PointerTypeContext = PointerTypeContext;
GoParser.InterfaceTypeContext = InterfaceTypeContext;
GoParser.SliceTypeContext = SliceTypeContext;
GoParser.MapTypeContext = MapTypeContext;
GoParser.ChannelTypeContext = ChannelTypeContext;
GoParser.MethodSpecContext = MethodSpecContext;
GoParser.FunctionTypeContext = FunctionTypeContext;
GoParser.SignatureContext = SignatureContext;
GoParser.ResultContext = ResultContext;
GoParser.ParametersContext = ParametersContext;
GoParser.ParameterDeclContext = ParameterDeclContext;
GoParser.ExpressionContext = ExpressionContext;
GoParser.PrimaryExprContext = PrimaryExprContext;
GoParser.ConversionContext = ConversionContext;
GoParser.NonNamedTypeContext = NonNamedTypeContext;
GoParser.OperandContext = OperandContext;
GoParser.LiteralContext = LiteralContext;
GoParser.BasicLitContext = BasicLitContext;
GoParser.IntegerContext = IntegerContext;
GoParser.OperandNameContext = OperandNameContext;
GoParser.QualifiedIdentContext = QualifiedIdentContext;
GoParser.CompositeLitContext = CompositeLitContext;
GoParser.LiteralTypeContext = LiteralTypeContext;
GoParser.LiteralValueContext = LiteralValueContext;
GoParser.ElementListContext = ElementListContext;
GoParser.KeyedElementContext = KeyedElementContext;
GoParser.KeyContext = KeyContext;
GoParser.ElementContext = ElementContext;
GoParser.StructTypeContext = StructTypeContext;
GoParser.FieldDeclContext = FieldDeclContext;
GoParser.String_Context = String_Context;
GoParser.EmbeddedFieldContext = EmbeddedFieldContext;
GoParser.FunctionLitContext = FunctionLitContext;
GoParser.IndexContext = IndexContext;
GoParser.Slice_Context = Slice_Context;
GoParser.TypeAssertionContext = TypeAssertionContext;
GoParser.ArgumentsContext = ArgumentsContext;
GoParser.MethodExprContext = MethodExprContext;
GoParser.ReceiverTypeContext = ReceiverTypeContext;
GoParser.EosContext = EosContext;
module.exports = __toCommonJS(GoParser_exports);
