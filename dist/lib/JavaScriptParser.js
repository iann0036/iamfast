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
var JavaScriptParser_exports = {};
__export(JavaScriptParser_exports, {
  default: () => JavaScriptParser
});
var import_antlr4 = __toESM(require("antlr4"), 1);
var import_JavaScriptParserListener = __toESM(require("./JavaScriptParserListener.js"), 1);
var import_JavaScriptParserVisitor = __toESM(require("./JavaScriptParserVisitor.js"), 1);
var import_JavaScriptParserBase = __toESM(require("./JavaScriptParserBase.js"), 1);
const serializedATN = [
  "\u608B\uA72A\u8133\uB9ED\u417C\u3BE7\u7786",
  "\u5964\x81\u0407		",
  "			\x07	",
  "\x07\b	\b			\n	\n\v	\v",
  "\f	\f\r	\r		",
  "				",
  "			",
  "				",
  "\x1B	\x1B		",
  '		 	 !	!"	"#',
  "	#$	$%	%&	&'	'(	()	)",
  "*	*+	+,	,-	-.	./	/0	0",
  "1	12	23	34	45	56	67	7",
  "8	89	9:	:;	;<	<=	=>	>",
  "?	?@	@A	AB	BC	CD	DE	E",
  "F	FG	GH	HI	IJ	JK	KL	L",
  "M	MN	N\x9E\n",
  "\xA1\n",
  "",
  "",
  "",
  "\xBB\n",
  "\xBF\n",
  "\xC4\n\r\xC5\x07",
  "\x07\x07\b\b\xCC\n\b\b\b\b",
  "\xD0\n\b\b\b\b\b\b\b\xD7\n\b",
  "				\x07	\xDD\n	\f		\xE0",
  "\v				\xE4\n		\xE6\n		",
  "	\n\n\n\v\v\v",
  "\xEF\n\v\v\v\v\xF3\n\v",
  "\f\f\f\r\r\r\r\xFB\n\r",
  "\u0100\n",
  "",
  "\u0109\n",
  "\u0111\n",
  "\u0115\n",
  "\u011A\n",
  "\x07\u0123\n",
  "\f\u0126\v",
  "\u012B\n",
  "",
  "\u013A\n",
  "",
  "",
  "",
  "\u014E\n",
  "\u0152\n\u0156\n",
  "",
  "\u015E\n",
  "\u0167\n",
  "\u016C\n",
  "",
  "\u0174\n\u0179",
  "\n\u017E\n",
  "",
  "\u0185\n\x1B\x1B",
  "\x1B\x1B\u018C\n\x1B\x1B\x1B",
  "\u0193\n",
  "",
  "",
  "\u01A5\n",
  "\u01A9\n\u01AB\n",
  "  \u01B0\n \r  \u01B1!",
  '!!!!\u01B8\n!""""\u01BD',
  '\n"####$$$$$',
  "%%%%%\u01CC\n%%%\u01CF\n%",
  "&&&&\u01D4\n&&&\u01D7\n&&",
  "&'''((())\u01E2",
  "\n))))\u01E6\n)))))\u01EB",
  "\n))))****++",
  "+\u01F6\n+++\x07+\u01FA\n+\f++\u01FD\v+",
  "++,,,,\x07,\u0205\n,\f,,\u0208",
  "\v,,,,,,,,\u0210\n,",
  ",,,\u0214\n,,,,,,\u021A\n",
  ",--\u021D\n---\u0220\n---",
  "--\u0225\n------\u022B\n-",
  "--\u022E\n--------\u0236",
  "\n---\u0239\n-----\u023E\n-",
  "----\u0243\n-...\x07.\u0248\n",
  ".\f..\u024B\v....\u024F\n..",
  ".\u0252\n.////\u0257\n/00",
  "0111\u025E\n11122\u0263\n",
  "2\r22\u026433334\x074\u026C\n",
  "4\f44\u026F\v444\u0272\n444\u0275",
  "\n4\r44\u02764\x074\u027A\n4\f44\u027D\v4",
  "4\x074\u0280\n4\f44\u0283\v455\u0286\n5",
  "5566666666",
  "6666\u0295\n666\u0298\n66",
  "666\u029D\n6666666",
  "6666666666\u02AE",
  "\n666\u02B1\n677777",
  "777\u02BA\n78888\x078\u02C0\n",
  "8\f88\u02C3\v888\u02C6\n88\u02C8\n8",
  "8899\u02CD\n9999\u02D1\n9",
  ":::\x07:\u02D6\n:\f::\u02D9\v:;",
  ";;;;\u02DF\n;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;;;;;",
  ";;\u030F\n;;;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;;;;;",
  ";;;;;;\u034F\n;;;;\u0353",
  "\n;;;;;;;;;;",
  ";;\x07;\u0360\n;\f;;\u0363\v;<<",
  "<<\u0368\n<====\x07=\u036E\n=\f=",
  "=\u0371\v===\u0374\n==\u0376\n===",
  ">>>\u037C\n>>>>\u0380\n>>",
  ">>\u0384\n>>>>>\u0389\n>>",
  ">>>>\u038F\n>????\u0394",
  "\n???\u0397\n?@@@\u039B\n@A",
  "ABBBBBBBB\u03A6\nB",
  "CC\x07C\u03AA\nC\fCC\u03AD\vCCC",
  "DDDDDD\u03B6\nDEEF",
  "FGGGGHHHHI",
  "II\u03C6\nIJJKKKK\u03CD\n",
  "KLLLLLLLLL",
  "LLLLLLLLLL",
  "LLLLLLLLLL",
  "LLLLLLLLLL",
  "LLLLLLLL\u03FD\nLM",
  "MNNNNN\u0405\nNNtO",
  "\b\n\f",
  ' "$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\x80\x82\x84',
  "\x86\x88\x8A\x8C\x8E\x90\x92\x94\x96\x98\x9A",
  "\f\x1B!#",
  "$'(+1<@DEH",
  "llppxxop\u04AB\x9D",
  "\xA4\xBA",
  "\b\xBC\n\xC3",
  "\f\xC7\xD6",
  "\xD8\xE9",
  "\xEE\xF4",
  "\xF7\u0108",
  "\u0114\u0119",
  ' \u011B"\u011E$\u0127',
  "&\u012C(\u012E",
  "*\u0132,\u0173",
  ".\u01780\u017A",
  "2\u01814\u0188",
  "6\u018F8\u0196:\u019C",
  "<\u01A2>\u01AF",
  "@\u01B3B\u01B9",
  "D\u01BEF\u01C2",
  "H\u01C7J\u01D0",
  "L\u01DAN\u01DDP\u01E1",
  "R\u01EFT\u01F5",
  "V\u0219X\u0242",
  "Z\u0251\\\u0253",
  "^\u0258`\u025B",
  "b\u0262d\u0266f\u026D",
  "h\u0285j\u02B0",
  "l\u02B9n\u02BB",
  "p\u02CCr\u02D2",
  "t\u030Ev\u0367",
  "x\u0369z\u038E|\u0396",
  "~\u039A\x80\u039C",
  "\x82\u03A5\x84\u03A7",
  "\x86\u03B5\x88\u03B7",
  "\x8A\u03B9\x8C\u03BB",
  "\x8E\u03BF\x90\u03C5",
  "\x92\u03C7\x94\u03CC",
  "\x96\u03FC\x98\u03FE",
  "\x9A\u0404\x9C\x9E",
  "\x07\x9D\x9C\x9D\x9E",
  "\x9E\xA0\x9F\xA1",
  "b2\xA0\x9F\xA0\xA1",
  "\xA1\xA2\xA2\xA3\x07",
  "\xA3\xA4\xA5",
  "\xA5\xA6\xBB",
  "\b\xA7\xBB \xA8\xBB\f\x07",
  "\xA9\xBB\xAA\xBB&",
  "\xAB\xBBR*\xAC\xBB(\xAD",
  "\xBB*\xAE\xBB,\xAF\xBB",
  "0\xB0\xBB2\xB1\xBB",
  "4\x1B\xB2\xBB6\xB3\xBB8",
  "\xB4\xBBD#\xB5\xBB:\xB6",
  "\xBBF$\xB7\xBBH%\xB8\xBBN(",
  "\xB9\xBBP)\xBA\xA6\xBA",
  "\xA7\xBA\xA8\xBA",
  "\xA9\xBA\xAA\xBA",
  "\xAB\xBA\xAC\xBA",
  "\xAD\xBA\xAE\xBA",
  "\xAF\xBA\xB0\xBA",
  "\xB1\xBA\xB2\xBA",
  "\xB3\xBA\xB4\xBA",
  "\xB5\xBA\xB6\xBA",
  "\xB7\xBA\xB8\xBA",
  "\xB9\xBB\x07\xBC",
  "\xBE\x07\v\xBD\xBF\n\xBE",
  "\xBD\xBE\xBF\xBF",
  "\xC0\xC0\xC1\x07\r\xC1",
  "	\xC2\xC4\xC3",
  "\xC2\xC4\xC5\xC5",
  "\xC3\xC5\xC6\xC6",
  "\v\xC7\xC8\x07k\xC8",
  "\xC9\b\xC9\r\xCA\xCC",
  "\n\xCB\xCA\xCB\xCC",
  "\xCC\xCF\xCD\xD0",
  "\v\xCE\xD0	\xCF\xCD",
  "\xCF\xCE\xD0\xD1",
  "\xD1\xD2\f\xD2\xD3",
  "\x9AN\xD3\xD7\xD4\xD5",
  "\x07y\xD5\xD7\x9AN\xD6\xCB",
  "\xD6\xD4\xD7",
  "\xD8\xDE\x07\v\xD9\xDA",
  "\r\xDA\xDB\x07\xDB\xDD",
  "\xDC\xD9\xDD\xE0",
  "\xDE\xDC\xDE\xDF",
  "\xDF\xE5\xE0\xDE",
  "\xE1\xE3\r\xE2\xE4\x07",
  "\xE3\xE2\xE3\xE4",
  "\xE4\xE6\xE5\xE1",
  "\xE5\xE6\xE6\xE7",
  "\xE7\xE8\x07\r\xE8",
  "\xE9\xEA\r\xEA\xEB\x07",
  "\xEB\xEC\xEF\x07",
  "\x1B\xED\xEF\x90I\xEE\xEC",
  "\xEE\xED\xEF\xF2",
  "\xF0\xF1\x07c\xF1\xF3",
  "\x90I\xF2\xF0\xF2\xF3",
  "\xF3\xF4\xF5\x07",
  "d\xF5\xF6\x07y\xF6",
  "\xF7\xFA\x90I\xF8\xF9\x07c",
  "\xF9\xFB\x90I\xFA\xF8",
  "\xFA\xFB\xFB",
  "\xFC\xFF\x07j\xFD\u0100",
  "\xFE\u0100\xFF\xFD",
  "\xFF\xFE\u0100\u0101",
  "\u0101\u0102\x9AN\u0102\u0109",
  "\u0103\u0104\x07j\u0104\u0105\x07]",
  "\u0105\u0106t;\u0106\u0107\x9AN\u0107\u0109",
  "\u0108\xFC\u0108\u0103",
  "\u0109\x1B\u010A\u010B",
  "\v\u010B\u010C\f\u010C\u010D",
  "\x9AN\u010D\u0115\u010E\u0110",
  "	\u010F\u0111\f\u0110\u010F",
  "\u0110\u0111\u0111\u0112",
  "\u0112\u0113\x9AN\u0113\u0115",
  "\u0114\u010A\u0114\u010E",
  "\u0115\u0116\u011A",
  " \u0117\u011AR*\u0118\u011AP)\u0119",
  "\u0116\u0119\u0117\u0119",
  "\u0118\u011A\u011B",
  '\u011C"\u011C\u011D\x9AN\u011D!',
  "\u011E\u011F.\u011F\u0124",
  "$\u0120\u0121\x07\u0121\u0123",
  "$\u0122\u0120\u0123\u0126",
  "\u0124\u0122\u0124\u0125",
  "\u0125#\u0126\u0124",
  "\u0127\u012Av<\u0128\u0129\x07",
  "\u0129\u012Bt;\u012A\u0128",
  "\u012A\u012B\u012B%",
  "\u012C\u012D\x07\u012D'",
  "\u012E\u012F\u012F\u0130r:",
  "\u0130\u0131\x9AN\u0131)\u0132",
  "\u0133\x07^\u0133\u0134\x07	\u0134\u0135",
  "r:\u0135\u0136\x07\n\u0136\u0139",
  "\u0137\u0138\x07N\u0138\u013A",
  "\u0139\u0137\u0139\u013A",
  "\u013A+\u013B\u013C\x07J",
  "\u013C\u013D\u013D\u013E\x07X",
  "\u013E\u013F\x07	\u013F\u0140r:\u0140",
  "\u0141\x07\n\u0141\u0142\x9AN\u0142\u0174",
  "\u0143\u0144\x07X\u0144\u0145",
  "\x07	\u0145\u0146r:\u0146\u0147\x07\n",
  "\u0147\u0148\u0148\u0174",
  "\u0149\u014A\x07V\u014A\u014D\x07	",
  '\u014B\u014Er:\u014C\u014E"\u014D\u014B',
  "\u014D\u014C\u014D\u014E",
  "\u014E\u014F\u014F\u0151",
  "\x07\u0150\u0152r:\u0151\u0150",
  "\u0151\u0152\u0152\u0153",
  "\u0153\u0155\x07\u0154\u0156",
  "r:\u0155\u0154\u0155\u0156",
  "\u0156\u0157\u0157\u0158\x07\n",
  "\u0158\u0174\u0159\u015A\x07V",
  "\u015A\u015D\x07	\u015B\u015Et;",
  '\u015C\u015E"\u015D\u015B',
  "\u015D\u015C\u015E\u015F",
  "\u015F\u0160\x07a\u0160\u0161r:\u0161\u0162",
  "\x07\n\u0162\u0163\u0163\u0174",
  "\u0164\u0166\x07V\u0165\u0167",
  "\x07m\u0166\u0165\u0166\u0167",
  "\u0167\u0168\u0168\u016B",
  '\x07	\u0169\u016Ct;\u016A\u016C"',
  "\u016B\u0169\u016B\u016A",
  "\u016C\u016D\u016D\u016E\x92J",
  "\u016E\u016F\u016F\u0170r:",
  "\u0170\u0171\x07\n\u0171\u0172",
  "\u0172\u0174\u0173\u013B",
  "\u0173\u0143\u0173\u0149",
  "\u0173\u0159\u0173\u0164",
  "\u0174-\u0175\u0179\x07P\u0176",
  "\u0179\x98M\u0177\u0179\x07i\u0178\u0175",
  "\u0178\u0176\u0178\u0177",
  "\u0179/\u017A\u017D",
  "\x07U\u017B\u017C\u017C\u017E",
  "\x92J\u017D\u017B\u017D\u017E",
  "\u017E\u017F\u017F\u0180",
  "\x9AN\u01801\u0181\u0184\x07",
  "I\u0182\u0183\u0183\u0185",
  "\x92J\u0184\u0182\u0184\u0185",
  "\u0185\u0186\u0186\u0187",
  "\x9AN\u01873\u0188\u018B\x07S",
  "\u0189\u018A\x1B\u018A\u018Cr:",
  "\u018B\u0189\u018B\u018C",
  "\u018C\u018D\u018D\u018E\x9AN",
  "\u018E5\u018F\u0192\x07w\u0190",
  "\u0191\x07\u0191\u0193r:\u0192\u0190",
  "\u0192\u0193\u0193\u0194",
  "\u0194\u0195\x9AN\u01957",
  "\u0196\u0197\x07\\\u0197\u0198\x07",
  "	\u0198\u0199r:\u0199\u019A\x07\n",
  "\u019A\u019B\u019B9",
  "\u019C\u019D\x07W\u019D\u019E\x07	\u019E",
  "\u019Fr:\u019F\u01A0\x07\n\u01A0\u01A1",
  "<\u01A1;\u01A2\u01A4\x07\v",
  "\u01A3\u01A5> \u01A4\u01A3",
  "\u01A4\u01A5\u01A5\u01AA",
  '\u01A6\u01A8B"\u01A7\u01A9> \u01A8\u01A7',
  "\u01A8\u01A9\u01A9\u01AB",
  "\u01AA\u01A6\u01AA\u01AB",
  "\u01AB\u01AC\u01AC\u01AD",
  "\x07\r\u01AD=\u01AE\u01B0",
  "@!\u01AF\u01AE\u01B0\u01B1",
  "\u01B1\u01AF\u01B1\u01B2",
  "\u01B2?\u01B3\u01B4\x07M",
  "\u01B4\u01B5r:\u01B5\u01B7\x07",
  "\u01B6\u01B8\n\u01B7\u01B6",
  "\u01B7\u01B8\u01B8A",
  "\u01B9\u01BA\x07]\u01BA\u01BC\x07",
  "\u01BB\u01BD\n\u01BC\u01BB",
  "\u01BC\u01BD\u01BDC",
  "\u01BE\u01BF\x92J\u01BF\u01C0\x07",
  "\u01C0\u01C1\u01C1E",
  "\u01C2\u01C3\x07_\u01C3\u01C4$\b\u01C4\u01C5",
  "r:\u01C5\u01C6\x9AN\u01C6G",
  "\u01C7\u01C8\x07b\u01C8\u01CE\b",
  "\u01C9\u01CBJ&\u01CA\u01CCL'\u01CB\u01CA",
  "\u01CB\u01CC\u01CC\u01CF",
  "\u01CD\u01CFL'\u01CE\u01C9",
  "\u01CE\u01CD\u01CFI",
  "\u01D0\u01D6\x07Q\u01D1\u01D3\x07	",
  "\u01D2\u01D4v<\u01D3\u01D2",
  "\u01D3\u01D4\u01D4\u01D5",
  "\u01D5\u01D7\x07\n\u01D6\u01D1",
  "\u01D6\u01D7\u01D7\u01D8",
  "\u01D8\u01D9\b\u01D9K\u01DA",
  "\u01DB\x07R\u01DB\u01DC\b\u01DCM",
  "\u01DD\u01DE\x07Y\u01DE\u01DF",
  "\x9AN\u01DFO\u01E0\u01E2\x07l",
  "\u01E1\u01E0\u01E1\u01E2",
  "\u01E2\u01E3\u01E3\u01E5\x07Z",
  "\u01E4\u01E6\x07\x1B\u01E5\u01E4",
  "\u01E5\u01E6\u01E6\u01E7",
  "\u01E7\u01E8\x92J\u01E8\u01EA\x07	",
  "\u01E9\u01EBZ.\u01EA\u01E9\u01EA",
  "\u01EB\u01EB\u01EC\u01EC",
  "\u01ED\x07\n\u01ED\u01EE`1\u01EEQ",
  "\u01EF\u01F0\x07e\u01F0\u01F1\x92",
  "J\u01F1\u01F2T+\u01F2S\u01F3",
  "\u01F4\x07g\u01F4\u01F6t;\u01F5\u01F3",
  "\u01F5\u01F6\u01F6\u01F7",
  "\u01F7\u01FB\x07\v\u01F8\u01FA",
  "V,\u01F9\u01F8\u01FA\u01FD",
  "\u01FB\u01F9\u01FB\u01FC",
  "\u01FC\u01FE\u01FD\u01FB",
  "\u01FE\u01FF\x07\r\u01FFU",
  "\u0200\u0205\x07v\u0201\u0202,	\u0202",
  "\u0205\x92J\u0203\u0205\x07l\u0204\u0200",
  "\u0204\u0201\u0204\u0203",
  "\u0205\u0208\u0206\u0204",
  "\u0206\u0207\u0207\u020F",
  "\u0208\u0206\u0209\u0210",
  "X-\u020A\u020Bv<\u020B\u020C\x07",
  "\u020C\u020Dx=\u020D\u020E\x07",
  "\u020E\u0210\u020F\u0209",
  "\u020F\u020A\u0210\u021A",
  "\u0211\u021A&\u0212\u0214\x07 \u0213",
  "\u0212\u0213\u0214\u0214",
  "\u0215\u0215\u0216l7\u0216\u0217",
  "\x07\u0217\u0218t;\u0218\u021A",
  "\u0219\u0206\u0219\u0211",
  "\u0219\u0213\u021AW",
  "\u021B\u021D\x07\x1B\u021C\u021B",
  "\u021C\u021D\u021D\u021F",
  "\u021E\u0220\x07 \u021F\u021E",
  "\u021F\u0220\u0220\u0221",
  "\u0221\u0222l7\u0222\u0224\x07	",
  "\u0223\u0225Z.\u0224\u0223",
  "\u0224\u0225\u0225\u0226",
  "\u0226\u0227\x07\n\u0227\u0228`1\u0228\u0243",
  "\u0229\u022B\x07\x1B\u022A\u0229",
  "\u022A\u022B\u022B\u022D",
  "\u022C\u022E\x07 \u022D\u022C",
  "\u022D\u022E\u022E\u022F",
  "\u022F\u0230\x8CG\u0230\u0231",
  "\x07	\u0231\u0232\x07\n\u0232\u0233",
  "`1\u0233\u0243\u0234\u0236\x07\x1B",
  "\u0235\u0234\u0235\u0236",
  "\u0236\u0238\u0237\u0239\x07 ",
  "\u0238\u0237\u0238\u0239",
  "\u0239\u023A\u023A\u023B\x8E",
  "H\u023B\u023D\x07	\u023C\u023EZ.\u023D",
  "\u023C\u023D\u023E\u023E",
  "\u023F\u023F\u0240\x07\n\u0240",
  "\u0241`1\u0241\u0243\u0242\u021C",
  "\u0242\u022A\u0242\u0235",
  "\u0243Y\u0244\u0249",
  "\\/\u0245\u0246\x07\u0246\u0248",
  "\\/\u0247\u0245\u0248\u024B",
  "\u0249\u0247\u0249\u024A",
  "\u024A\u024E\u024B\u0249",
  "\u024C\u024D\x07\u024D\u024F^",
  "0\u024E\u024C\u024E\u024F",
  "\u024F\u0252\u0250\u0252^",
  "0\u0251\u0244\u0251\u0250",
  "\u0252[\u0253\u0256v<",
  "\u0254\u0255\x07\u0255\u0257t;\u0256",
  "\u0254\u0256\u0257\u0257",
  "]\u0258\u0259\x07\u0259",
  "\u025At;\u025A_\u025B\u025D\x07",
  "\v\u025C\u025Eb2\u025D\u025C",
  "\u025D\u025E\u025E\u025F",
  "\u025F\u0260\x07\r\u0260a",
  "\u0261\u0263\u0262\u0261",
  "\u0263\u0264\u0264\u0262",
  "\u0264\u0265\u0265c",
  "\u0266\u0267\x07\x07\u0267\u0268f4",
  "\u0268\u0269\x07\b\u0269e\u026A",
  "\u026C\x07\u026B\u026A\u026C",
  "\u026F\u026D\u026B\u026D",
  "\u026E\u026E\u0271\u026F",
  "\u026D\u0270\u0272h5\u0271\u0270",
  "\u0271\u0272\u0272\u027B",
  "\u0273\u0275\x07\u0274\u0273",
  "\u0275\u0276\u0276\u0274",
  "\u0276\u0277\u0277\u0278",
  "\u0278\u027Ah5\u0279\u0274",
  "\u027A\u027D\u027B\u0279",
  "\u027B\u027C\u027C\u0281",
  "\u027D\u027B\u027E\u0280\x07",
  "\u027F\u027E\u0280\u0283",
  "\u0281\u027F\u0281\u0282",
  "\u0282g\u0283\u0281",
  "\u0284\u0286\x07\u0285\u0284",
  "\u0285\u0286\u0286\u0287",
  "\u0287\u0288t;\u0288i",
  "\u0289\u028Al7\u028A\u028B\x07",
  "\u028B\u028Ct;\u028C\u02B1\u028D",
  "\u028E\x07\x07\u028E\u028Ft;\u028F\u0290",
  "\x07\b\u0290\u0291\x07\u0291\u0292",
  "t;\u0292\u02B1\u0293\u0295\x07",
  "l\u0294\u0293\u0294\u0295",
  "\u0295\u0297\u0296\u0298\x07",
  "\x1B\u0297\u0296\u0297\u0298",
  "\u0298\u0299\u0299\u029A",
  "l7\u029A\u029C\x07	\u029B\u029DZ.\u029C",
  "\u029B\u029C\u029D\u029D",
  "\u029E\u029E\u029F\x07\n\u029F",
  "\u02A0`1\u02A0\u02B1\u02A1\u02A2",
  "\x8CG\u02A2\u02A3\x07	\u02A3\u02A4\x07",
  "\n\u02A4\u02A5`1\u02A5\u02B1",
  "\u02A6\u02A7\x8EH\u02A7\u02A8\x07	",
  "\u02A8\u02A9\\/\u02A9\u02AA\x07\n\u02AA\u02AB",
  "`1\u02AB\u02B1\u02AC\u02AE\x07",
  "\u02AD\u02AC\u02AD\u02AE",
  "\u02AE\u02AF\u02AF\u02B1",
  "t;\u02B0\u0289\u02B0\u028D",
  "\u02B0\u0294\u02B0\u02A1",
  "\u02B0\u02A6\u02B0\u02AD",
  "\u02B1k\u02B2\u02BA\x90",
  "I\u02B3\u02BA\x07y\u02B4\u02BA\x88E",
  "\u02B5\u02B6\x07\x07\u02B6\u02B7t;\u02B7",
  "\u02B8\x07\b\u02B8\u02BA\u02B9",
  "\u02B2\u02B9\u02B3\u02B9",
  "\u02B4\u02B9\u02B5\u02BA",
  "m\u02BB\u02C7\x07	\u02BC\u02C1",
  "p9\u02BD\u02BE\x07\u02BE\u02C0",
  "p9\u02BF\u02BD\u02C0\u02C3",
  "\u02C1\u02BF\u02C1\u02C2",
  "\u02C2\u02C5\u02C3\u02C1",
  "\u02C4\u02C6\x07\u02C5\u02C4",
  "\u02C5\u02C6\u02C6\u02C8",
  "\u02C7\u02BC\u02C7\u02C8",
  "\u02C8\u02C9\u02C9\u02CA\x07\n",
  "\u02CAo\u02CB\u02CD\x07",
  "\u02CC\u02CB\u02CC\u02CD",
  "\u02CD\u02D0\u02CE\u02D1t",
  ";\u02CF\u02D1\x92J\u02D0\u02CE",
  "\u02D0\u02CF\u02D1q",
  "\u02D2\u02D7t;\u02D3\u02D4\x07",
  "\u02D4\u02D6t;\u02D5\u02D3\u02D6",
  "\u02D9\u02D7\u02D5\u02D7",
  "\u02D8\u02D8s\u02D9",
  "\u02D7\u02DA\u02DB\b;\u02DB\u030F",
  "z>\u02DC\u02DE\x07e\u02DD\u02DF\x92",
  "J\u02DE\u02DD\u02DE\u02DF",
  "\u02DF\u02E0\u02E0\u030FT",
  "+\u02E1\u02E2\x07O\u02E2\u02E3t;\u02E3",
  "\u02E4n8\u02E4\u030F\u02E5\u02E6",
  "\x07O\u02E6\u030Ft;,\u02E7\u02E8\x07O",
  "\u02E8\u02E9\x07\u02E9\u030F\x92J",
  "\u02EA\u02EB\x07`\u02EB\u030Ft;'\u02EC\u02ED\x07",
  "T\u02ED\u030Ft;&\u02EE\u02EF\x07L\u02EF",
  "\u030Ft;%\u02F0\u02F1\x07\u02F1\u030F",
  "t;$\u02F2\u02F3\x07\u02F3\u030Ft;#\u02F4\u02F5",
  '\x07\u02F5\u030Ft;"\u02F6\u02F7\x07',
  "\u02F7\u030Ft;!\u02F8\u02F9\x07",
  "\u02F9\u030Ft; \u02FA\u02FB\x07\u02FB\u030F",
  "t;\u02FC\u02FD\x07m\u02FD\u030Ft;",
  "\u02FE\u02FF\x07k\u02FF\u0300\x07	\u0300",
  "\u0301t;\u0301\u0302\x07\n\u0302\u030F",
  "\u0303\u030F6\u0304\u030F\x07",
  "[\u0305\u030F\x92J\u0306\u030F\x07h",
  "\u0307\u030F\x82B\u0308\u030Fd3\u0309",
  "\u030Fx=\u030A\u030B\x07	\u030B\u030C",
  "r:\u030C\u030D\x07\n\u030D\u030F",
  "\u030E\u02DA\u030E\u02DC",
  "\u030E\u02E1\u030E\u02E5",
  "\u030E\u02E7\u030E\u02EA",
  "\u030E\u02EC\u030E\u02EE",
  "\u030E\u02F0\u030E\u02F2",
  "\u030E\u02F4\u030E\u02F6",
  "\u030E\u02F8\u030E\u02FA",
  "\u030E\u02FC\u030E\u02FE",
  "\u030E\u0303\u030E\u0304",
  "\u030E\u0305\u030E\u0306",
  "\u030E\u0307\u030E\u0308",
  "\u030E\u0309\u030E\u030A",
  "\u030F\u0361\u0310\u0311\f",
  "\u0311\u0312\x07\u0312\u0360t;",
  "\u0313\u0314\f\u0314\u0315	\u0315",
  "\u0360t;\u0316\u0317\f\x1B\u0317\u0318	",
  "\u0318\u0360t;\u0319\u031A\f",
  "\u031A\u031B\x07\u031B\u0360t;\x1B\u031C",
  "\u031D\f\u031D\u031E	\u031E\u0360",
  "t;\u031F\u0320\f\u0320\u0321	",
  "\u0321\u0360t;\u0322\u0323\f\u0323",
  "\u0324\x07K\u0324\u0360t;\u0325\u0326\f",
  "\u0326\u0327\x07a\u0327\u0360t;",
  "\u0328\u0329\f\u0329\u032A	\u032A",
  "\u0360t;\u032B\u032C\f\u032C\u032D\x07",
  ",\u032D\u0360t;\u032E\u032F\f",
  "\u032F\u0330\x07-\u0330\u0360t;\u0331\u0332",
  "\f\u0332\u0333\x07.\u0333\u0360",
  "t;\u0334\u0335\f\u0335\u0336\x07/",
  "\u0336\u0360t;\u0337\u0338\f\u0338\u0339",
  "\x070\u0339\u0360t;\u033A\u033B\f",
  "\u033B\u033C\x07\u033C\u033Dt;",
  "\u033D\u033E\x07\u033E\u033Ft;\u033F",
  "\u0360\u0340\u0341\f\u0341",
  "\u0342\x07\u0342\u0360t;\u0343\u0344",
  "\f\r\u0344\u0345\x80A\u0345\u0346t;",
  "\r\u0346\u0360\u0347\u0348\f/\u0348",
  "\u0349\x07\x07\u0349\u034Ar:\u034A\u034B",
  "\x07\b\u034B\u0360\u034C\u034E",
  "\f.\u034D\u034F\x07\u034E\u034D",
  "\u034E\u034F\u034F\u0350",
  "\u0350\u0352\x07\u0351\u0353\x07",
  " \u0352\u0351\u0352\u0353",
  "\u0353\u0354\u0354\u0360",
  "\x90I\u0355\u0356\f+\u0356\u0360n8\u0357",
  "\u0358\f)\u0358\u0359;\u0359\u0360\x07",
  "\u035A\u035B\f(\u035B\u035C;!",
  "\u035C\u0360\x07\u035D\u035E\f\v",
  "\u035E\u0360\x84C\u035F\u0310",
  "\u035F\u0313\u035F\u0316",
  "\u035F\u0319\u035F\u031C",
  "\u035F\u031F\u035F\u0322",
  "\u035F\u0325\u035F\u0328",
  "\u035F\u032B\u035F\u032E",
  "\u035F\u0331\u035F\u0334",
  "\u035F\u0337\u035F\u033A",
  "\u035F\u0340\u035F\u0343",
  "\u035F\u0347\u035F\u034C",
  "\u035F\u0355\u035F\u0357",
  "\u035F\u035A\u035F\u035D",
  "\u0360\u0363\u0361\u035F",
  "\u0361\u0362\u0362u",
  "\u0363\u0361\u0364\u0368\x92J",
  "\u0365\u0368d3\u0366\u0368x=\u0367\u0364",
  "\u0367\u0365\u0367\u0366",
  "\u0368w\u0369\u0375\x07",
  "\v\u036A\u036Fj6\u036B\u036C\x07",
  "\u036C\u036Ej6\u036D\u036B",
  "\u036E\u0371\u036F\u036D",
  "\u036F\u0370\u0370\u0373",
  "\u0371\u036F\u0372\u0374\x07",
  "\u0373\u0372\u0373\u0374",
  "\u0374\u0376\u0375\u036A",
  "\u0375\u0376\u0376\u0377",
  "\u0377\u0378\x07\r\u0378y",
  "\u0379\u038FP)\u037A\u037C\x07l\u037B\u037A",
  "\u037B\u037C\u037C\u037D",
  "\u037D\u037F\x07Z\u037E\u0380",
  "\x07\x1B\u037F\u037E\u037F\u0380",
  "\u0380\u0381\u0381\u0383",
  "\x07	\u0382\u0384Z.\u0383\u0382",
  "\u0383\u0384\u0384\u0385",
  "\u0385\u0386\x07\n\u0386\u038F`1",
  "\u0387\u0389\x07l\u0388\u0387",
  "\u0388\u0389\u0389\u038A",
  "\u038A\u038B|?\u038B\u038C\x07=\u038C\u038D",
  "~@\u038D\u038F\u038E\u0379",
  "\u038E\u037B\u038E\u0388",
  "\u038F{\u0390\u0397",
  "\x92J\u0391\u0393\x07	\u0392\u0394Z.",
  "\u0393\u0392\u0393\u0394",
  "\u0394\u0395\u0395\u0397\x07\n",
  "\u0396\u0390\u0396\u0391",
  "\u0397}\u0398\u039Bt;\u0399\u039B",
  "`1\u039A\u0398\u039A\u0399",
  "\u039B\x7F\u039C\u039D	",
  "\x07\u039D\x81\u039E\u03A6\x07",
  ">\u039F\u03A6\x07?\u03A0\u03A6\x07y",
  "\u03A1\u03A6\x84C\u03A2\u03A6\x07",
  "\u03A3\u03A6\x88E\u03A4\u03A6\x8AF",
  "\u03A5\u039E\u03A5\u039F",
  "\u03A5\u03A0\u03A5\u03A1",
  "\u03A5\u03A2\u03A5\u03A3",
  "\u03A5\u03A4\u03A6\x83",
  "\u03A7\u03AB\x07z\u03A8\u03AA\x86D\u03A9",
  "\u03A8\u03AA\u03AD\u03AB",
  "\u03A9\u03AB\u03AC\u03AC",
  "\u03AE\u03AD\u03AB\u03AE",
  "\u03AF\x07z\u03AF\x85\u03B0",
  "\u03B6\x07\x81\u03B1\u03B2\x07\x80\u03B2",
  "\u03B3t;\u03B3\u03B4\x07\f\u03B4\u03B6",
  "\u03B5\u03B0\u03B5\u03B1",
  "\u03B6\x87\u03B7\u03B8	",
  "\b\u03B8\x89\u03B9\u03BA		",
  "\u03BA\x8B\u03BB\u03BCG#",
  "\u03BC\u03BD\x92J\u03BD\u03BEl7\u03BE\x8D",
  "\u03BF\u03C0H$\u03C0\u03C1",
  "\x92J\u03C1\u03C2l7\u03C2\x8F",
  "\u03C3\u03C6\x92J\u03C4\u03C6\x94K",
  "\u03C5\u03C3\u03C5\u03C4",
  "\u03C6\x91\u03C7\u03C8	\n\u03C8",
  "\x93\u03C9\u03CD\x96L\u03CA",
  "\u03CD\x07>\u03CB\u03CD\x07?\u03CC\u03C9",
  "\u03CC\u03CA\u03CC\u03CB",
  "\u03CD\x95\u03CE\u03FD",
  "\x07I\u03CF\u03FD\x07J\u03D0\u03FD\x07",
  "K\u03D1\u03FD\x07L\u03D2\u03FD\x07M",
  "\u03D3\u03FD\x07N\u03D4\u03FD\x07O",
  "\u03D5\u03FD\x07P\u03D6\u03FD\x07Q\u03D7",
  "\u03FD\x07R\u03D8\u03FD\x07S\u03D9\u03FD",
  "\x07T\u03DA\u03FD\x07U\u03DB\u03FD\x07",
  "V\u03DC\u03FD\x07W\u03DD\u03FD\x07X",
  "\u03DE\u03FD\x07Y\u03DF\u03FD\x07Z",
  "\u03E0\u03FD\x07[\u03E1\u03FD\x07\\\u03E2",
  "\u03FD\x07]\u03E3\u03FD\x07^\u03E4\u03FD",
  "\x07_\u03E5\u03FD\x07`\u03E6\u03FD\x07",
  "a\u03E7\u03FD\x07b\u03E8\u03FD\x07e",
  "\u03E9\u03FD\x07f\u03EA\u03FD\x07g",
  "\u03EB\u03FD\x07h\u03EC\u03FD\x07i\u03ED",
  "\u03FD\x07j\u03EE\u03FD\x07k\u03EF\u03FD",
  "\x07n\u03F0\u03FD\x98M\u03F1\u03FD\x07",
  "q\u03F2\u03FD\x07r\u03F3\u03FD\x07s",
  "\u03F4\u03FD\x07t\u03F5\u03FD\x07u",
  "\u03F6\u03FD\x07v\u03F7\u03FD\x07w\u03F8",
  "\u03FD\x07l\u03F9\u03FD\x07m\u03FA\u03FD",
  "\x07d\u03FB\u03FD\x07c\u03FC\u03CE",
  "\u03FC\u03CF\u03FC\u03D0",
  "\u03FC\u03D1\u03FC\u03D2",
  "\u03FC\u03D3\u03FC\u03D4",
  "\u03FC\u03D5\u03FC\u03D6",
  "\u03FC\u03D7\u03FC\u03D8",
  "\u03FC\u03D9\u03FC\u03DA",
  "\u03FC\u03DB\u03FC\u03DC",
  "\u03FC\u03DD\u03FC\u03DE",
  "\u03FC\u03DF\u03FC\u03E0",
  "\u03FC\u03E1\u03FC\u03E2",
  "\u03FC\u03E3\u03FC\u03E4",
  "\u03FC\u03E5\u03FC\u03E6",
  "\u03FC\u03E7\u03FC\u03E8",
  "\u03FC\u03E9\u03FC\u03EA",
  "\u03FC\u03EB\u03FC\u03EC",
  "\u03FC\u03ED\u03FC\u03EE",
  "\u03FC\u03EF\u03FC\u03F0",
  "\u03FC\u03F1\u03FC\u03F2",
  "\u03FC\u03F3\u03FC\u03F4",
  "\u03FC\u03F5\u03FC\u03F6",
  "\u03FC\u03F7\u03FC\u03F8",
  "\u03FC\u03F9\u03FC\u03FA",
  "\u03FC\u03FB\u03FD\x97",
  "\u03FE\u03FF	\v\u03FF\x99",
  "\u0400\u0405\x07\u0401\u0405\x07",
  "\u0402\u0405N%\u0403\u0405N&",
  "\u0404\u0400\u0404\u0401",
  "\u0404\u0402\u0404\u0403",
  "\u0405\x9Br\x9D\xA0\xBA\xBE\xC5",
  "\xCB\xCF\xD6\xDE\xE3\xE5\xEE\xF2\xFA\xFF\u0108\u0110",
  "\u0114\u0119\u0124\u012A\u0139\u014D\u0151\u0155\u015D\u0166\u016B\u0173",
  "\u0178\u017D\u0184\u018B\u0192\u01A4\u01A8\u01AA\u01B1\u01B7\u01BC\u01CB",
  "\u01CE\u01D3\u01D6\u01E1\u01E5\u01EA\u01F5\u01FB\u0204\u0206\u020F\u0213",
  "\u0219\u021C\u021F\u0224\u022A\u022D\u0235\u0238\u023D\u0242\u0249\u024E",
  "\u0251\u0256\u025D\u0264\u026D\u0271\u0276\u027B\u0281\u0285\u0294\u0297",
  "\u029C\u02AD\u02B0\u02B9\u02C1\u02C5\u02C7\u02CC\u02D0\u02D7\u02DE\u030E",
  "\u034E\u0352\u035F\u0361\u0367\u036F\u0373\u0375\u037B\u037F\u0383\u0388",
  "\u038E\u0393\u0396\u039A\u03A5\u03AB\u03B5\u03C5\u03CC\u03FC\u0404"
].join("");
const atn = new import_antlr4.default.atn.ATNDeserializer().deserialize(serializedATN);
const decisionsToDFA = atn.decisionToState.map((ds, index) => new import_antlr4.default.dfa.DFA(ds, index));
const sharedContextCache = new import_antlr4.default.PredictionContextCache();
class JavaScriptParser extends import_JavaScriptParserBase.default {
  static grammarFileName = "JavaScriptParser.g4";
  static literalNames = [
    null,
    null,
    null,
    null,
    null,
    "'['",
    "']'",
    "'('",
    "')'",
    "'{'",
    null,
    "'}'",
    "';'",
    "','",
    "'='",
    "'?'",
    "':'",
    "'...'",
    "'.'",
    "'++'",
    "'--'",
    "'+'",
    "'-'",
    "'~'",
    "'!'",
    "'*'",
    "'/'",
    "'%'",
    "'**'",
    "'??'",
    "'#'",
    "'>>'",
    "'<<'",
    "'>>>'",
    "'<'",
    "'>'",
    "'<='",
    "'>='",
    "'=='",
    "'!='",
    "'==='",
    "'!=='",
    "'&'",
    "'^'",
    "'|'",
    "'&&'",
    "'||'",
    "'*='",
    "'/='",
    "'%='",
    "'+='",
    "'-='",
    "'<<='",
    "'>>='",
    "'>>>='",
    "'&='",
    "'^='",
    "'|='",
    "'**='",
    "'=>'",
    "'null'",
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    "'break'",
    "'do'",
    "'instanceof'",
    "'typeof'",
    "'case'",
    "'else'",
    "'new'",
    "'var'",
    "'catch'",
    "'finally'",
    "'return'",
    "'void'",
    "'continue'",
    "'for'",
    "'switch'",
    "'while'",
    "'debugger'",
    "'function'",
    "'this'",
    "'with'",
    "'default'",
    "'if'",
    "'throw'",
    "'delete'",
    "'in'",
    "'try'",
    "'as'",
    "'from'",
    "'class'",
    "'enum'",
    "'extends'",
    "'super'",
    "'const'",
    "'export'",
    "'import'",
    "'async'",
    "'await'",
    "'implements'",
    null,
    null,
    "'private'",
    "'public'",
    "'interface'",
    "'package'",
    "'protected'",
    "'static'",
    "'yield'",
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    "'${'"
  ];
  static symbolicNames = [
    null,
    "HashBangLine",
    "MultiLineComment",
    "SingleLineComment",
    "RegularExpressionLiteral",
    "OpenBracket",
    "CloseBracket",
    "OpenParen",
    "CloseParen",
    "OpenBrace",
    "TemplateCloseBrace",
    "CloseBrace",
    "SemiColon",
    "Comma",
    "Assign",
    "QuestionMark",
    "Colon",
    "Ellipsis",
    "Dot",
    "PlusPlus",
    "MinusMinus",
    "Plus",
    "Minus",
    "BitNot",
    "Not",
    "Multiply",
    "Divide",
    "Modulus",
    "Power",
    "NullCoalesce",
    "Hashtag",
    "RightShiftArithmetic",
    "LeftShiftArithmetic",
    "RightShiftLogical",
    "LessThan",
    "MoreThan",
    "LessThanEquals",
    "GreaterThanEquals",
    "Equals_",
    "NotEquals",
    "IdentityEquals",
    "IdentityNotEquals",
    "BitAnd",
    "BitXOr",
    "BitOr",
    "And",
    "Or",
    "MultiplyAssign",
    "DivideAssign",
    "ModulusAssign",
    "PlusAssign",
    "MinusAssign",
    "LeftShiftArithmeticAssign",
    "RightShiftArithmeticAssign",
    "RightShiftLogicalAssign",
    "BitAndAssign",
    "BitXorAssign",
    "BitOrAssign",
    "PowerAssign",
    "ARROW",
    "NullLiteral",
    "BooleanLiteral",
    "DecimalLiteral",
    "HexIntegerLiteral",
    "OctalIntegerLiteral",
    "OctalIntegerLiteral2",
    "BinaryIntegerLiteral",
    "BigHexIntegerLiteral",
    "BigOctalIntegerLiteral",
    "BigBinaryIntegerLiteral",
    "BigDecimalIntegerLiteral",
    "Break",
    "Do",
    "Instanceof",
    "Typeof",
    "Case",
    "Else",
    "New",
    "Var",
    "Catch",
    "Finally",
    "Return",
    "Void",
    "Continue",
    "For",
    "Switch",
    "While",
    "Debugger",
    "Function_",
    "This",
    "With",
    "Default",
    "If",
    "Throw",
    "Delete",
    "In",
    "Try",
    "As",
    "From",
    "Class",
    "Enum",
    "Extends",
    "Super",
    "Const",
    "Export",
    "Import",
    "Async",
    "Await",
    "Implements",
    "StrictLet",
    "NonStrictLet",
    "Private",
    "Public",
    "Interface",
    "Package",
    "Protected",
    "Static",
    "Yield",
    "Identifier",
    "StringLiteral",
    "BackTick",
    "WhiteSpaces",
    "LineTerminator",
    "HtmlComment",
    "CDataComment",
    "UnexpectedCharacter",
    "TemplateStringStartExpression",
    "TemplateStringAtom"
  ];
  static ruleNames = [
    "program",
    "sourceElement",
    "statement",
    "block",
    "statementList",
    "importStatement",
    "importFromBlock",
    "moduleItems",
    "importDefault",
    "importNamespace",
    "importFrom",
    "aliasName",
    "exportStatement",
    "exportFromBlock",
    "declaration",
    "variableStatement",
    "variableDeclarationList",
    "variableDeclaration",
    "emptyStatement_",
    "expressionStatement",
    "ifStatement",
    "iterationStatement",
    "varModifier",
    "continueStatement",
    "breakStatement",
    "returnStatement",
    "yieldStatement",
    "withStatement",
    "switchStatement",
    "caseBlock",
    "caseClauses",
    "caseClause",
    "defaultClause",
    "labelledStatement",
    "throwStatement",
    "tryStatement",
    "catchProduction",
    "finallyProduction",
    "debuggerStatement",
    "functionDeclaration",
    "classDeclaration",
    "classTail",
    "classElement",
    "methodDefinition",
    "formalParameterList",
    "formalParameterArg",
    "lastFormalParameterArg",
    "functionBody",
    "sourceElements",
    "arrayLiteral",
    "elementList",
    "arrayElement",
    "propertyAssignment",
    "propertyName",
    "arguments",
    "argument",
    "expressionSequence",
    "singleExpression",
    "assignable",
    "objectLiteral",
    "anonymousFunction",
    "arrowFunctionParameters",
    "arrowFunctionBody",
    "assignmentOperator",
    "literal",
    "templateStringLiteral",
    "templateStringAtom",
    "numericLiteral",
    "bigintLiteral",
    "getter",
    "setter",
    "identifierName",
    "identifier",
    "reservedWord",
    "keyword",
    "let_",
    "eos"
  ];
  constructor(input) {
    super(input);
    this._interp = new import_antlr4.default.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = JavaScriptParser.ruleNames;
    this.literalNames = JavaScriptParser.literalNames;
    this.symbolicNames = JavaScriptParser.symbolicNames;
  }
  get atn() {
    return atn;
  }
  sempred(localctx, ruleIndex, predIndex) {
    switch (ruleIndex) {
      case 19:
        return this.expressionStatement_sempred(localctx, predIndex);
      case 21:
        return this.iterationStatement_sempred(localctx, predIndex);
      case 23:
        return this.continueStatement_sempred(localctx, predIndex);
      case 24:
        return this.breakStatement_sempred(localctx, predIndex);
      case 25:
        return this.returnStatement_sempred(localctx, predIndex);
      case 26:
        return this.yieldStatement_sempred(localctx, predIndex);
      case 34:
        return this.throwStatement_sempred(localctx, predIndex);
      case 42:
        return this.classElement_sempred(localctx, predIndex);
      case 57:
        return this.singleExpression_sempred(localctx, predIndex);
      case 69:
        return this.getter_sempred(localctx, predIndex);
      case 70:
        return this.setter_sempred(localctx, predIndex);
      case 76:
        return this.eos_sempred(localctx, predIndex);
      default:
        throw "No predicate with index:" + ruleIndex;
    }
  }
  expressionStatement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 0:
        return this.notOpenBraceAndNotFunction();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  iterationStatement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 1:
        return this.p("of");
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  continueStatement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 2:
        return this.notLineTerminator();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  breakStatement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 3:
        return this.notLineTerminator();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  returnStatement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 4:
        return this.notLineTerminator();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  yieldStatement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 5:
        return this.notLineTerminator();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  throwStatement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 6:
        return this.notLineTerminator();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  classElement_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 7:
        return this.n("static");
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  singleExpression_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 8:
        return this.precpred(this._ctx, 27);
      case 9:
        return this.precpred(this._ctx, 26);
      case 10:
        return this.precpred(this._ctx, 25);
      case 11:
        return this.precpred(this._ctx, 24);
      case 12:
        return this.precpred(this._ctx, 23);
      case 13:
        return this.precpred(this._ctx, 22);
      case 14:
        return this.precpred(this._ctx, 21);
      case 15:
        return this.precpred(this._ctx, 20);
      case 16:
        return this.precpred(this._ctx, 19);
      case 17:
        return this.precpred(this._ctx, 18);
      case 18:
        return this.precpred(this._ctx, 17);
      case 19:
        return this.precpred(this._ctx, 16);
      case 20:
        return this.precpred(this._ctx, 15);
      case 21:
        return this.precpred(this._ctx, 14);
      case 22:
        return this.precpred(this._ctx, 13);
      case 23:
        return this.precpred(this._ctx, 12);
      case 24:
        return this.precpred(this._ctx, 11);
      case 25:
        return this.precpred(this._ctx, 45);
      case 26:
        return this.precpred(this._ctx, 44);
      case 27:
        return this.precpred(this._ctx, 41);
      case 28:
        return this.precpred(this._ctx, 39);
      case 29:
        return this.notLineTerminator();
      case 30:
        return this.precpred(this._ctx, 38);
      case 31:
        return this.notLineTerminator();
      case 32:
        return this.precpred(this._ctx, 9);
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  getter_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 33:
        return this.n("get");
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  setter_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 34:
        return this.n("set");
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  eos_sempred(localctx, predIndex) {
    switch (predIndex) {
      case 35:
        return this.lineTerminatorAhead();
      case 36:
        return this.closeBrace();
      default:
        throw "No predicate with index:" + predIndex;
    }
  }
  program() {
    let localctx = new ProgramContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, JavaScriptParser.RULE_program);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 155;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 0, this._ctx);
      if (la_ === 1) {
        this.state = 154;
        this.match(JavaScriptParser.HashBangLine);
      }
      this.state = 158;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 1, this._ctx);
      if (la_ === 1) {
        this.state = 157;
        this.sourceElements();
      }
      this.state = 160;
      this.match(JavaScriptParser.EOF);
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
  sourceElement() {
    let localctx = new SourceElementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, JavaScriptParser.RULE_sourceElement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 162;
      this.statement();
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
    this.enterRule(localctx, 4, JavaScriptParser.RULE_statement);
    try {
      this.state = 184;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 2, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 164;
          this.block();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 165;
          this.variableStatement();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 166;
          this.importStatement();
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 167;
          this.exportStatement();
          break;
        case 5:
          this.enterOuterAlt(localctx, 5);
          this.state = 168;
          this.emptyStatement_();
          break;
        case 6:
          this.enterOuterAlt(localctx, 6);
          this.state = 169;
          this.classDeclaration();
          break;
        case 7:
          this.enterOuterAlt(localctx, 7);
          this.state = 170;
          this.expressionStatement();
          break;
        case 8:
          this.enterOuterAlt(localctx, 8);
          this.state = 171;
          this.ifStatement();
          break;
        case 9:
          this.enterOuterAlt(localctx, 9);
          this.state = 172;
          this.iterationStatement();
          break;
        case 10:
          this.enterOuterAlt(localctx, 10);
          this.state = 173;
          this.continueStatement();
          break;
        case 11:
          this.enterOuterAlt(localctx, 11);
          this.state = 174;
          this.breakStatement();
          break;
        case 12:
          this.enterOuterAlt(localctx, 12);
          this.state = 175;
          this.returnStatement();
          break;
        case 13:
          this.enterOuterAlt(localctx, 13);
          this.state = 176;
          this.yieldStatement();
          break;
        case 14:
          this.enterOuterAlt(localctx, 14);
          this.state = 177;
          this.withStatement();
          break;
        case 15:
          this.enterOuterAlt(localctx, 15);
          this.state = 178;
          this.labelledStatement();
          break;
        case 16:
          this.enterOuterAlt(localctx, 16);
          this.state = 179;
          this.switchStatement();
          break;
        case 17:
          this.enterOuterAlt(localctx, 17);
          this.state = 180;
          this.throwStatement();
          break;
        case 18:
          this.enterOuterAlt(localctx, 18);
          this.state = 181;
          this.tryStatement();
          break;
        case 19:
          this.enterOuterAlt(localctx, 19);
          this.state = 182;
          this.debuggerStatement();
          break;
        case 20:
          this.enterOuterAlt(localctx, 20);
          this.state = 183;
          this.functionDeclaration();
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
  block() {
    let localctx = new BlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, JavaScriptParser.RULE_block);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 186;
      this.match(JavaScriptParser.OpenBrace);
      this.state = 188;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 3, this._ctx);
      if (la_ === 1) {
        this.state = 187;
        this.statementList();
      }
      this.state = 190;
      this.match(JavaScriptParser.CloseBrace);
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
    this.enterRule(localctx, 8, JavaScriptParser.RULE_statementList);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 193;
      this._errHandler.sync(this);
      var _alt = 1;
      do {
        switch (_alt) {
          case 1:
            this.state = 192;
            this.statement();
            break;
          default:
            throw new import_antlr4.default.error.NoViableAltException(this);
        }
        this.state = 195;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 4, this._ctx);
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
  importStatement() {
    let localctx = new ImportStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, JavaScriptParser.RULE_importStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 197;
      this.match(JavaScriptParser.Import);
      this.state = 198;
      this.importFromBlock();
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
  importFromBlock() {
    let localctx = new ImportFromBlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, JavaScriptParser.RULE_importFromBlock);
    try {
      this.state = 212;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.OpenBrace:
        case JavaScriptParser.Multiply:
        case JavaScriptParser.NullLiteral:
        case JavaScriptParser.BooleanLiteral:
        case JavaScriptParser.Break:
        case JavaScriptParser.Do:
        case JavaScriptParser.Instanceof:
        case JavaScriptParser.Typeof:
        case JavaScriptParser.Case:
        case JavaScriptParser.Else:
        case JavaScriptParser.New:
        case JavaScriptParser.Var:
        case JavaScriptParser.Catch:
        case JavaScriptParser.Finally:
        case JavaScriptParser.Return:
        case JavaScriptParser.Void:
        case JavaScriptParser.Continue:
        case JavaScriptParser.For:
        case JavaScriptParser.Switch:
        case JavaScriptParser.While:
        case JavaScriptParser.Debugger:
        case JavaScriptParser.Function_:
        case JavaScriptParser.This:
        case JavaScriptParser.With:
        case JavaScriptParser.Default:
        case JavaScriptParser.If:
        case JavaScriptParser.Throw:
        case JavaScriptParser.Delete:
        case JavaScriptParser.In:
        case JavaScriptParser.Try:
        case JavaScriptParser.As:
        case JavaScriptParser.From:
        case JavaScriptParser.Class:
        case JavaScriptParser.Enum:
        case JavaScriptParser.Extends:
        case JavaScriptParser.Super:
        case JavaScriptParser.Const:
        case JavaScriptParser.Export:
        case JavaScriptParser.Import:
        case JavaScriptParser.Async:
        case JavaScriptParser.Await:
        case JavaScriptParser.Implements:
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Private:
        case JavaScriptParser.Public:
        case JavaScriptParser.Interface:
        case JavaScriptParser.Package:
        case JavaScriptParser.Protected:
        case JavaScriptParser.Static:
        case JavaScriptParser.Yield:
        case JavaScriptParser.Identifier:
          this.enterOuterAlt(localctx, 1);
          this.state = 201;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 5, this._ctx);
          if (la_ === 1) {
            this.state = 200;
            this.importDefault();
          }
          this.state = 205;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case JavaScriptParser.Multiply:
            case JavaScriptParser.NullLiteral:
            case JavaScriptParser.BooleanLiteral:
            case JavaScriptParser.Break:
            case JavaScriptParser.Do:
            case JavaScriptParser.Instanceof:
            case JavaScriptParser.Typeof:
            case JavaScriptParser.Case:
            case JavaScriptParser.Else:
            case JavaScriptParser.New:
            case JavaScriptParser.Var:
            case JavaScriptParser.Catch:
            case JavaScriptParser.Finally:
            case JavaScriptParser.Return:
            case JavaScriptParser.Void:
            case JavaScriptParser.Continue:
            case JavaScriptParser.For:
            case JavaScriptParser.Switch:
            case JavaScriptParser.While:
            case JavaScriptParser.Debugger:
            case JavaScriptParser.Function_:
            case JavaScriptParser.This:
            case JavaScriptParser.With:
            case JavaScriptParser.Default:
            case JavaScriptParser.If:
            case JavaScriptParser.Throw:
            case JavaScriptParser.Delete:
            case JavaScriptParser.In:
            case JavaScriptParser.Try:
            case JavaScriptParser.As:
            case JavaScriptParser.From:
            case JavaScriptParser.Class:
            case JavaScriptParser.Enum:
            case JavaScriptParser.Extends:
            case JavaScriptParser.Super:
            case JavaScriptParser.Const:
            case JavaScriptParser.Export:
            case JavaScriptParser.Import:
            case JavaScriptParser.Async:
            case JavaScriptParser.Await:
            case JavaScriptParser.Implements:
            case JavaScriptParser.StrictLet:
            case JavaScriptParser.NonStrictLet:
            case JavaScriptParser.Private:
            case JavaScriptParser.Public:
            case JavaScriptParser.Interface:
            case JavaScriptParser.Package:
            case JavaScriptParser.Protected:
            case JavaScriptParser.Static:
            case JavaScriptParser.Yield:
            case JavaScriptParser.Identifier:
              this.state = 203;
              this.importNamespace();
              break;
            case JavaScriptParser.OpenBrace:
              this.state = 204;
              this.moduleItems();
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
          }
          this.state = 207;
          this.importFrom();
          this.state = 208;
          this.eos();
          break;
        case JavaScriptParser.StringLiteral:
          this.enterOuterAlt(localctx, 2);
          this.state = 210;
          this.match(JavaScriptParser.StringLiteral);
          this.state = 211;
          this.eos();
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
  moduleItems() {
    let localctx = new ModuleItemsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, JavaScriptParser.RULE_moduleItems);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 214;
      this.match(JavaScriptParser.OpenBrace);
      this.state = 220;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 8, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 215;
          this.aliasName();
          this.state = 216;
          this.match(JavaScriptParser.Comma);
        }
        this.state = 222;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 8, this._ctx);
      }
      this.state = 227;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 60 & ~31) == 0 && (1 << _la - 60 & (1 << JavaScriptParser.NullLiteral - 60 | 1 << JavaScriptParser.BooleanLiteral - 60 | 1 << JavaScriptParser.Break - 60 | 1 << JavaScriptParser.Do - 60 | 1 << JavaScriptParser.Instanceof - 60 | 1 << JavaScriptParser.Typeof - 60 | 1 << JavaScriptParser.Case - 60 | 1 << JavaScriptParser.Else - 60 | 1 << JavaScriptParser.New - 60 | 1 << JavaScriptParser.Var - 60 | 1 << JavaScriptParser.Catch - 60 | 1 << JavaScriptParser.Finally - 60 | 1 << JavaScriptParser.Return - 60 | 1 << JavaScriptParser.Void - 60 | 1 << JavaScriptParser.Continue - 60 | 1 << JavaScriptParser.For - 60 | 1 << JavaScriptParser.Switch - 60 | 1 << JavaScriptParser.While - 60 | 1 << JavaScriptParser.Debugger - 60 | 1 << JavaScriptParser.Function_ - 60 | 1 << JavaScriptParser.This - 60 | 1 << JavaScriptParser.With - 60 | 1 << JavaScriptParser.Default - 60)) !== 0 || (_la - 92 & ~31) == 0 && (1 << _la - 92 & (1 << JavaScriptParser.If - 92 | 1 << JavaScriptParser.Throw - 92 | 1 << JavaScriptParser.Delete - 92 | 1 << JavaScriptParser.In - 92 | 1 << JavaScriptParser.Try - 92 | 1 << JavaScriptParser.As - 92 | 1 << JavaScriptParser.From - 92 | 1 << JavaScriptParser.Class - 92 | 1 << JavaScriptParser.Enum - 92 | 1 << JavaScriptParser.Extends - 92 | 1 << JavaScriptParser.Super - 92 | 1 << JavaScriptParser.Const - 92 | 1 << JavaScriptParser.Export - 92 | 1 << JavaScriptParser.Import - 92 | 1 << JavaScriptParser.Async - 92 | 1 << JavaScriptParser.Await - 92 | 1 << JavaScriptParser.Implements - 92 | 1 << JavaScriptParser.StrictLet - 92 | 1 << JavaScriptParser.NonStrictLet - 92 | 1 << JavaScriptParser.Private - 92 | 1 << JavaScriptParser.Public - 92 | 1 << JavaScriptParser.Interface - 92 | 1 << JavaScriptParser.Package - 92 | 1 << JavaScriptParser.Protected - 92 | 1 << JavaScriptParser.Static - 92 | 1 << JavaScriptParser.Yield - 92 | 1 << JavaScriptParser.Identifier - 92)) !== 0) {
        this.state = 223;
        this.aliasName();
        this.state = 225;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === JavaScriptParser.Comma) {
          this.state = 224;
          this.match(JavaScriptParser.Comma);
        }
      }
      this.state = 229;
      this.match(JavaScriptParser.CloseBrace);
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
  importDefault() {
    let localctx = new ImportDefaultContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, JavaScriptParser.RULE_importDefault);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 231;
      this.aliasName();
      this.state = 232;
      this.match(JavaScriptParser.Comma);
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
  importNamespace() {
    let localctx = new ImportNamespaceContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, JavaScriptParser.RULE_importNamespace);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 236;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Multiply:
          this.state = 234;
          this.match(JavaScriptParser.Multiply);
          break;
        case JavaScriptParser.NullLiteral:
        case JavaScriptParser.BooleanLiteral:
        case JavaScriptParser.Break:
        case JavaScriptParser.Do:
        case JavaScriptParser.Instanceof:
        case JavaScriptParser.Typeof:
        case JavaScriptParser.Case:
        case JavaScriptParser.Else:
        case JavaScriptParser.New:
        case JavaScriptParser.Var:
        case JavaScriptParser.Catch:
        case JavaScriptParser.Finally:
        case JavaScriptParser.Return:
        case JavaScriptParser.Void:
        case JavaScriptParser.Continue:
        case JavaScriptParser.For:
        case JavaScriptParser.Switch:
        case JavaScriptParser.While:
        case JavaScriptParser.Debugger:
        case JavaScriptParser.Function_:
        case JavaScriptParser.This:
        case JavaScriptParser.With:
        case JavaScriptParser.Default:
        case JavaScriptParser.If:
        case JavaScriptParser.Throw:
        case JavaScriptParser.Delete:
        case JavaScriptParser.In:
        case JavaScriptParser.Try:
        case JavaScriptParser.As:
        case JavaScriptParser.From:
        case JavaScriptParser.Class:
        case JavaScriptParser.Enum:
        case JavaScriptParser.Extends:
        case JavaScriptParser.Super:
        case JavaScriptParser.Const:
        case JavaScriptParser.Export:
        case JavaScriptParser.Import:
        case JavaScriptParser.Async:
        case JavaScriptParser.Await:
        case JavaScriptParser.Implements:
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Private:
        case JavaScriptParser.Public:
        case JavaScriptParser.Interface:
        case JavaScriptParser.Package:
        case JavaScriptParser.Protected:
        case JavaScriptParser.Static:
        case JavaScriptParser.Yield:
        case JavaScriptParser.Identifier:
          this.state = 235;
          this.identifierName();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
      this.state = 240;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.As) {
        this.state = 238;
        this.match(JavaScriptParser.As);
        this.state = 239;
        this.identifierName();
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
  importFrom() {
    let localctx = new ImportFromContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, JavaScriptParser.RULE_importFrom);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 242;
      this.match(JavaScriptParser.From);
      this.state = 243;
      this.match(JavaScriptParser.StringLiteral);
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
  aliasName() {
    let localctx = new AliasNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, JavaScriptParser.RULE_aliasName);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 245;
      this.identifierName();
      this.state = 248;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.As) {
        this.state = 246;
        this.match(JavaScriptParser.As);
        this.state = 247;
        this.identifierName();
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
  exportStatement() {
    let localctx = new ExportStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, JavaScriptParser.RULE_exportStatement);
    try {
      this.state = 262;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 15, this._ctx);
      switch (la_) {
        case 1:
          localctx = new ExportDeclarationContext(this, localctx);
          this.enterOuterAlt(localctx, 1);
          this.state = 250;
          this.match(JavaScriptParser.Export);
          this.state = 253;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 14, this._ctx);
          switch (la_) {
            case 1:
              this.state = 251;
              this.exportFromBlock();
              break;
            case 2:
              this.state = 252;
              this.declaration();
              break;
          }
          this.state = 255;
          this.eos();
          break;
        case 2:
          localctx = new ExportDefaultDeclarationContext(this, localctx);
          this.enterOuterAlt(localctx, 2);
          this.state = 257;
          this.match(JavaScriptParser.Export);
          this.state = 258;
          this.match(JavaScriptParser.Default);
          this.state = 259;
          this.singleExpression(0);
          this.state = 260;
          this.eos();
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
  exportFromBlock() {
    let localctx = new ExportFromBlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, JavaScriptParser.RULE_exportFromBlock);
    try {
      this.state = 274;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Multiply:
        case JavaScriptParser.NullLiteral:
        case JavaScriptParser.BooleanLiteral:
        case JavaScriptParser.Break:
        case JavaScriptParser.Do:
        case JavaScriptParser.Instanceof:
        case JavaScriptParser.Typeof:
        case JavaScriptParser.Case:
        case JavaScriptParser.Else:
        case JavaScriptParser.New:
        case JavaScriptParser.Var:
        case JavaScriptParser.Catch:
        case JavaScriptParser.Finally:
        case JavaScriptParser.Return:
        case JavaScriptParser.Void:
        case JavaScriptParser.Continue:
        case JavaScriptParser.For:
        case JavaScriptParser.Switch:
        case JavaScriptParser.While:
        case JavaScriptParser.Debugger:
        case JavaScriptParser.Function_:
        case JavaScriptParser.This:
        case JavaScriptParser.With:
        case JavaScriptParser.Default:
        case JavaScriptParser.If:
        case JavaScriptParser.Throw:
        case JavaScriptParser.Delete:
        case JavaScriptParser.In:
        case JavaScriptParser.Try:
        case JavaScriptParser.As:
        case JavaScriptParser.From:
        case JavaScriptParser.Class:
        case JavaScriptParser.Enum:
        case JavaScriptParser.Extends:
        case JavaScriptParser.Super:
        case JavaScriptParser.Const:
        case JavaScriptParser.Export:
        case JavaScriptParser.Import:
        case JavaScriptParser.Async:
        case JavaScriptParser.Await:
        case JavaScriptParser.Implements:
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Private:
        case JavaScriptParser.Public:
        case JavaScriptParser.Interface:
        case JavaScriptParser.Package:
        case JavaScriptParser.Protected:
        case JavaScriptParser.Static:
        case JavaScriptParser.Yield:
        case JavaScriptParser.Identifier:
          this.enterOuterAlt(localctx, 1);
          this.state = 264;
          this.importNamespace();
          this.state = 265;
          this.importFrom();
          this.state = 266;
          this.eos();
          break;
        case JavaScriptParser.OpenBrace:
          this.enterOuterAlt(localctx, 2);
          this.state = 268;
          this.moduleItems();
          this.state = 270;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 16, this._ctx);
          if (la_ === 1) {
            this.state = 269;
            this.importFrom();
          }
          this.state = 272;
          this.eos();
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
  declaration() {
    let localctx = new DeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, JavaScriptParser.RULE_declaration);
    try {
      this.state = 279;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Var:
        case JavaScriptParser.Const:
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
          this.enterOuterAlt(localctx, 1);
          this.state = 276;
          this.variableStatement();
          break;
        case JavaScriptParser.Class:
          this.enterOuterAlt(localctx, 2);
          this.state = 277;
          this.classDeclaration();
          break;
        case JavaScriptParser.Function_:
        case JavaScriptParser.Async:
          this.enterOuterAlt(localctx, 3);
          this.state = 278;
          this.functionDeclaration();
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
  variableStatement() {
    let localctx = new VariableStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, JavaScriptParser.RULE_variableStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 281;
      this.variableDeclarationList();
      this.state = 282;
      this.eos();
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
  variableDeclarationList() {
    let localctx = new VariableDeclarationListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, JavaScriptParser.RULE_variableDeclarationList);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 284;
      this.varModifier();
      this.state = 285;
      this.variableDeclaration();
      this.state = 290;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 19, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 286;
          this.match(JavaScriptParser.Comma);
          this.state = 287;
          this.variableDeclaration();
        }
        this.state = 292;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 19, this._ctx);
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
  variableDeclaration() {
    let localctx = new VariableDeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, JavaScriptParser.RULE_variableDeclaration);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 293;
      this.assignable();
      this.state = 296;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 20, this._ctx);
      if (la_ === 1) {
        this.state = 294;
        this.match(JavaScriptParser.Assign);
        this.state = 295;
        this.singleExpression(0);
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
  emptyStatement_() {
    let localctx = new EmptyStatement_Context(this, this._ctx, this.state);
    this.enterRule(localctx, 36, JavaScriptParser.RULE_emptyStatement_);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 298;
      this.match(JavaScriptParser.SemiColon);
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
  expressionStatement() {
    let localctx = new ExpressionStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, JavaScriptParser.RULE_expressionStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 300;
      if (!this.notOpenBraceAndNotFunction()) {
        throw new import_antlr4.default.error.FailedPredicateException(this, "this.notOpenBraceAndNotFunction()");
      }
      this.state = 301;
      this.expressionSequence();
      this.state = 302;
      this.eos();
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
  ifStatement() {
    let localctx = new IfStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 40, JavaScriptParser.RULE_ifStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 304;
      this.match(JavaScriptParser.If);
      this.state = 305;
      this.match(JavaScriptParser.OpenParen);
      this.state = 306;
      this.expressionSequence();
      this.state = 307;
      this.match(JavaScriptParser.CloseParen);
      this.state = 308;
      this.statement();
      this.state = 311;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 21, this._ctx);
      if (la_ === 1) {
        this.state = 309;
        this.match(JavaScriptParser.Else);
        this.state = 310;
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
  iterationStatement() {
    let localctx = new IterationStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 42, JavaScriptParser.RULE_iterationStatement);
    var _la = 0;
    try {
      this.state = 369;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 28, this._ctx);
      switch (la_) {
        case 1:
          localctx = new DoStatementContext(this, localctx);
          this.enterOuterAlt(localctx, 1);
          this.state = 313;
          this.match(JavaScriptParser.Do);
          this.state = 314;
          this.statement();
          this.state = 315;
          this.match(JavaScriptParser.While);
          this.state = 316;
          this.match(JavaScriptParser.OpenParen);
          this.state = 317;
          this.expressionSequence();
          this.state = 318;
          this.match(JavaScriptParser.CloseParen);
          this.state = 319;
          this.eos();
          break;
        case 2:
          localctx = new WhileStatementContext(this, localctx);
          this.enterOuterAlt(localctx, 2);
          this.state = 321;
          this.match(JavaScriptParser.While);
          this.state = 322;
          this.match(JavaScriptParser.OpenParen);
          this.state = 323;
          this.expressionSequence();
          this.state = 324;
          this.match(JavaScriptParser.CloseParen);
          this.state = 325;
          this.statement();
          break;
        case 3:
          localctx = new ForStatementContext(this, localctx);
          this.enterOuterAlt(localctx, 3);
          this.state = 327;
          this.match(JavaScriptParser.For);
          this.state = 328;
          this.match(JavaScriptParser.OpenParen);
          this.state = 331;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 22, this._ctx);
          if (la_ === 1) {
            this.state = 329;
            this.expressionSequence();
          } else if (la_ === 2) {
            this.state = 330;
            this.variableDeclarationList();
          }
          this.state = 333;
          this.match(JavaScriptParser.SemiColon);
          this.state = 335;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.RegularExpressionLiteral | 1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenParen | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.PlusPlus | 1 << JavaScriptParser.MinusMinus | 1 << JavaScriptParser.Plus | 1 << JavaScriptParser.Minus | 1 << JavaScriptParser.BitNot | 1 << JavaScriptParser.Not)) !== 0 || (_la - 60 & ~31) == 0 && (1 << _la - 60 & (1 << JavaScriptParser.NullLiteral - 60 | 1 << JavaScriptParser.BooleanLiteral - 60 | 1 << JavaScriptParser.DecimalLiteral - 60 | 1 << JavaScriptParser.HexIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral2 - 60 | 1 << JavaScriptParser.BinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigHexIntegerLiteral - 60 | 1 << JavaScriptParser.BigOctalIntegerLiteral - 60 | 1 << JavaScriptParser.BigBinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigDecimalIntegerLiteral - 60 | 1 << JavaScriptParser.Typeof - 60 | 1 << JavaScriptParser.New - 60 | 1 << JavaScriptParser.Void - 60 | 1 << JavaScriptParser.Function_ - 60 | 1 << JavaScriptParser.This - 60)) !== 0 || (_la - 94 & ~31) == 0 && (1 << _la - 94 & (1 << JavaScriptParser.Delete - 94 | 1 << JavaScriptParser.Class - 94 | 1 << JavaScriptParser.Super - 94 | 1 << JavaScriptParser.Import - 94 | 1 << JavaScriptParser.Async - 94 | 1 << JavaScriptParser.Await - 94 | 1 << JavaScriptParser.NonStrictLet - 94 | 1 << JavaScriptParser.Yield - 94 | 1 << JavaScriptParser.Identifier - 94 | 1 << JavaScriptParser.StringLiteral - 94 | 1 << JavaScriptParser.BackTick - 94)) !== 0) {
            this.state = 334;
            this.expressionSequence();
          }
          this.state = 337;
          this.match(JavaScriptParser.SemiColon);
          this.state = 339;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.RegularExpressionLiteral | 1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenParen | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.PlusPlus | 1 << JavaScriptParser.MinusMinus | 1 << JavaScriptParser.Plus | 1 << JavaScriptParser.Minus | 1 << JavaScriptParser.BitNot | 1 << JavaScriptParser.Not)) !== 0 || (_la - 60 & ~31) == 0 && (1 << _la - 60 & (1 << JavaScriptParser.NullLiteral - 60 | 1 << JavaScriptParser.BooleanLiteral - 60 | 1 << JavaScriptParser.DecimalLiteral - 60 | 1 << JavaScriptParser.HexIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral2 - 60 | 1 << JavaScriptParser.BinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigHexIntegerLiteral - 60 | 1 << JavaScriptParser.BigOctalIntegerLiteral - 60 | 1 << JavaScriptParser.BigBinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigDecimalIntegerLiteral - 60 | 1 << JavaScriptParser.Typeof - 60 | 1 << JavaScriptParser.New - 60 | 1 << JavaScriptParser.Void - 60 | 1 << JavaScriptParser.Function_ - 60 | 1 << JavaScriptParser.This - 60)) !== 0 || (_la - 94 & ~31) == 0 && (1 << _la - 94 & (1 << JavaScriptParser.Delete - 94 | 1 << JavaScriptParser.Class - 94 | 1 << JavaScriptParser.Super - 94 | 1 << JavaScriptParser.Import - 94 | 1 << JavaScriptParser.Async - 94 | 1 << JavaScriptParser.Await - 94 | 1 << JavaScriptParser.NonStrictLet - 94 | 1 << JavaScriptParser.Yield - 94 | 1 << JavaScriptParser.Identifier - 94 | 1 << JavaScriptParser.StringLiteral - 94 | 1 << JavaScriptParser.BackTick - 94)) !== 0) {
            this.state = 338;
            this.expressionSequence();
          }
          this.state = 341;
          this.match(JavaScriptParser.CloseParen);
          this.state = 342;
          this.statement();
          break;
        case 4:
          localctx = new ForInStatementContext(this, localctx);
          this.enterOuterAlt(localctx, 4);
          this.state = 343;
          this.match(JavaScriptParser.For);
          this.state = 344;
          this.match(JavaScriptParser.OpenParen);
          this.state = 347;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 25, this._ctx);
          switch (la_) {
            case 1:
              this.state = 345;
              this.singleExpression(0);
              break;
            case 2:
              this.state = 346;
              this.variableDeclarationList();
              break;
          }
          this.state = 349;
          this.match(JavaScriptParser.In);
          this.state = 350;
          this.expressionSequence();
          this.state = 351;
          this.match(JavaScriptParser.CloseParen);
          this.state = 352;
          this.statement();
          break;
        case 5:
          localctx = new ForOfStatementContext(this, localctx);
          this.enterOuterAlt(localctx, 5);
          this.state = 354;
          this.match(JavaScriptParser.For);
          this.state = 356;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Await) {
            this.state = 355;
            this.match(JavaScriptParser.Await);
          }
          this.state = 358;
          this.match(JavaScriptParser.OpenParen);
          this.state = 361;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 27, this._ctx);
          switch (la_) {
            case 1:
              this.state = 359;
              this.singleExpression(0);
              break;
            case 2:
              this.state = 360;
              this.variableDeclarationList();
              break;
          }
          this.state = 363;
          this.identifier();
          this.state = 364;
          if (!this.p("of")) {
            throw new import_antlr4.default.error.FailedPredicateException(this, 'this.p("of")');
          }
          this.state = 365;
          this.expressionSequence();
          this.state = 366;
          this.match(JavaScriptParser.CloseParen);
          this.state = 367;
          this.statement();
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
  varModifier() {
    let localctx = new VarModifierContext(this, this._ctx, this.state);
    this.enterRule(localctx, 44, JavaScriptParser.RULE_varModifier);
    try {
      this.state = 374;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Var:
          this.enterOuterAlt(localctx, 1);
          this.state = 371;
          this.match(JavaScriptParser.Var);
          break;
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
          this.enterOuterAlt(localctx, 2);
          this.state = 372;
          this.let_();
          break;
        case JavaScriptParser.Const:
          this.enterOuterAlt(localctx, 3);
          this.state = 373;
          this.match(JavaScriptParser.Const);
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
  continueStatement() {
    let localctx = new ContinueStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 46, JavaScriptParser.RULE_continueStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 376;
      this.match(JavaScriptParser.Continue);
      this.state = 379;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 30, this._ctx);
      if (la_ === 1) {
        this.state = 377;
        if (!this.notLineTerminator()) {
          throw new import_antlr4.default.error.FailedPredicateException(this, "this.notLineTerminator()");
        }
        this.state = 378;
        this.identifier();
      }
      this.state = 381;
      this.eos();
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
  breakStatement() {
    let localctx = new BreakStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 48, JavaScriptParser.RULE_breakStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 383;
      this.match(JavaScriptParser.Break);
      this.state = 386;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 31, this._ctx);
      if (la_ === 1) {
        this.state = 384;
        if (!this.notLineTerminator()) {
          throw new import_antlr4.default.error.FailedPredicateException(this, "this.notLineTerminator()");
        }
        this.state = 385;
        this.identifier();
      }
      this.state = 388;
      this.eos();
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
  returnStatement() {
    let localctx = new ReturnStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 50, JavaScriptParser.RULE_returnStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 390;
      this.match(JavaScriptParser.Return);
      this.state = 393;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 32, this._ctx);
      if (la_ === 1) {
        this.state = 391;
        if (!this.notLineTerminator()) {
          throw new import_antlr4.default.error.FailedPredicateException(this, "this.notLineTerminator()");
        }
        this.state = 392;
        this.expressionSequence();
      }
      this.state = 395;
      this.eos();
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
  yieldStatement() {
    let localctx = new YieldStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 52, JavaScriptParser.RULE_yieldStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 397;
      this.match(JavaScriptParser.Yield);
      this.state = 400;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 33, this._ctx);
      if (la_ === 1) {
        this.state = 398;
        if (!this.notLineTerminator()) {
          throw new import_antlr4.default.error.FailedPredicateException(this, "this.notLineTerminator()");
        }
        this.state = 399;
        this.expressionSequence();
      }
      this.state = 402;
      this.eos();
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
  withStatement() {
    let localctx = new WithStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 54, JavaScriptParser.RULE_withStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 404;
      this.match(JavaScriptParser.With);
      this.state = 405;
      this.match(JavaScriptParser.OpenParen);
      this.state = 406;
      this.expressionSequence();
      this.state = 407;
      this.match(JavaScriptParser.CloseParen);
      this.state = 408;
      this.statement();
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
  switchStatement() {
    let localctx = new SwitchStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 56, JavaScriptParser.RULE_switchStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 410;
      this.match(JavaScriptParser.Switch);
      this.state = 411;
      this.match(JavaScriptParser.OpenParen);
      this.state = 412;
      this.expressionSequence();
      this.state = 413;
      this.match(JavaScriptParser.CloseParen);
      this.state = 414;
      this.caseBlock();
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
  caseBlock() {
    let localctx = new CaseBlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 58, JavaScriptParser.RULE_caseBlock);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 416;
      this.match(JavaScriptParser.OpenBrace);
      this.state = 418;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Case) {
        this.state = 417;
        this.caseClauses();
      }
      this.state = 424;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Default) {
        this.state = 420;
        this.defaultClause();
        this.state = 422;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === JavaScriptParser.Case) {
          this.state = 421;
          this.caseClauses();
        }
      }
      this.state = 426;
      this.match(JavaScriptParser.CloseBrace);
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
  caseClauses() {
    let localctx = new CaseClausesContext(this, this._ctx, this.state);
    this.enterRule(localctx, 60, JavaScriptParser.RULE_caseClauses);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 429;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      do {
        this.state = 428;
        this.caseClause();
        this.state = 431;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      } while (_la === JavaScriptParser.Case);
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
  caseClause() {
    let localctx = new CaseClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 62, JavaScriptParser.RULE_caseClause);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 433;
      this.match(JavaScriptParser.Case);
      this.state = 434;
      this.expressionSequence();
      this.state = 435;
      this.match(JavaScriptParser.Colon);
      this.state = 437;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 38, this._ctx);
      if (la_ === 1) {
        this.state = 436;
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
  defaultClause() {
    let localctx = new DefaultClauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 64, JavaScriptParser.RULE_defaultClause);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 439;
      this.match(JavaScriptParser.Default);
      this.state = 440;
      this.match(JavaScriptParser.Colon);
      this.state = 442;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 39, this._ctx);
      if (la_ === 1) {
        this.state = 441;
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
  labelledStatement() {
    let localctx = new LabelledStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 66, JavaScriptParser.RULE_labelledStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 444;
      this.identifier();
      this.state = 445;
      this.match(JavaScriptParser.Colon);
      this.state = 446;
      this.statement();
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
  throwStatement() {
    let localctx = new ThrowStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 68, JavaScriptParser.RULE_throwStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 448;
      this.match(JavaScriptParser.Throw);
      this.state = 449;
      if (!this.notLineTerminator()) {
        throw new import_antlr4.default.error.FailedPredicateException(this, "this.notLineTerminator()");
      }
      this.state = 450;
      this.expressionSequence();
      this.state = 451;
      this.eos();
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
  tryStatement() {
    let localctx = new TryStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 70, JavaScriptParser.RULE_tryStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 453;
      this.match(JavaScriptParser.Try);
      this.state = 454;
      this.block();
      this.state = 460;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Catch:
          this.state = 455;
          this.catchProduction();
          this.state = 457;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 40, this._ctx);
          if (la_ === 1) {
            this.state = 456;
            this.finallyProduction();
          }
          break;
        case JavaScriptParser.Finally:
          this.state = 459;
          this.finallyProduction();
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
  catchProduction() {
    let localctx = new CatchProductionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 72, JavaScriptParser.RULE_catchProduction);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 462;
      this.match(JavaScriptParser.Catch);
      this.state = 468;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.OpenParen) {
        this.state = 463;
        this.match(JavaScriptParser.OpenParen);
        this.state = 465;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === JavaScriptParser.OpenBracket || _la === JavaScriptParser.OpenBrace || (_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
          this.state = 464;
          this.assignable();
        }
        this.state = 467;
        this.match(JavaScriptParser.CloseParen);
      }
      this.state = 470;
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
  finallyProduction() {
    let localctx = new FinallyProductionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 74, JavaScriptParser.RULE_finallyProduction);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 472;
      this.match(JavaScriptParser.Finally);
      this.state = 473;
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
  debuggerStatement() {
    let localctx = new DebuggerStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 76, JavaScriptParser.RULE_debuggerStatement);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 475;
      this.match(JavaScriptParser.Debugger);
      this.state = 476;
      this.eos();
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
  functionDeclaration() {
    let localctx = new FunctionDeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 78, JavaScriptParser.RULE_functionDeclaration);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 479;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Async) {
        this.state = 478;
        this.match(JavaScriptParser.Async);
      }
      this.state = 481;
      this.match(JavaScriptParser.Function_);
      this.state = 483;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Multiply) {
        this.state = 482;
        this.match(JavaScriptParser.Multiply);
      }
      this.state = 485;
      this.identifier();
      this.state = 486;
      this.match(JavaScriptParser.OpenParen);
      this.state = 488;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis)) !== 0 || (_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
        this.state = 487;
        this.formalParameterList();
      }
      this.state = 490;
      this.match(JavaScriptParser.CloseParen);
      this.state = 491;
      this.functionBody();
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
  classDeclaration() {
    let localctx = new ClassDeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 80, JavaScriptParser.RULE_classDeclaration);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 493;
      this.match(JavaScriptParser.Class);
      this.state = 494;
      this.identifier();
      this.state = 495;
      this.classTail();
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
  classTail() {
    let localctx = new ClassTailContext(this, this._ctx, this.state);
    this.enterRule(localctx, 82, JavaScriptParser.RULE_classTail);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 499;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Extends) {
        this.state = 497;
        this.match(JavaScriptParser.Extends);
        this.state = 498;
        this.singleExpression(0);
      }
      this.state = 501;
      this.match(JavaScriptParser.OpenBrace);
      this.state = 505;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 48, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 502;
          this.classElement();
        }
        this.state = 507;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 48, this._ctx);
      }
      this.state = 508;
      this.match(JavaScriptParser.CloseBrace);
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
  classElement() {
    let localctx = new ClassElementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 84, JavaScriptParser.RULE_classElement);
    var _la = 0;
    try {
      this.state = 535;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 53, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 516;
          this._errHandler.sync(this);
          var _alt = this._interp.adaptivePredict(this._input, 50, this._ctx);
          while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt === 1) {
              this.state = 514;
              this._errHandler.sync(this);
              var la_ = this._interp.adaptivePredict(this._input, 49, this._ctx);
              switch (la_) {
                case 1:
                  this.state = 510;
                  this.match(JavaScriptParser.Static);
                  break;
                case 2:
                  this.state = 511;
                  if (!this.n("static")) {
                    throw new import_antlr4.default.error.FailedPredicateException(this, 'this.n("static")');
                  }
                  this.state = 512;
                  this.identifier();
                  break;
                case 3:
                  this.state = 513;
                  this.match(JavaScriptParser.Async);
                  break;
              }
            }
            this.state = 518;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input, 50, this._ctx);
          }
          this.state = 525;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 51, this._ctx);
          switch (la_) {
            case 1:
              this.state = 519;
              this.methodDefinition();
              break;
            case 2:
              this.state = 520;
              this.assignable();
              this.state = 521;
              this.match(JavaScriptParser.Assign);
              this.state = 522;
              this.objectLiteral();
              this.state = 523;
              this.match(JavaScriptParser.SemiColon);
              break;
          }
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 527;
          this.emptyStatement_();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 529;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Hashtag) {
            this.state = 528;
            this.match(JavaScriptParser.Hashtag);
          }
          this.state = 531;
          this.propertyName();
          this.state = 532;
          this.match(JavaScriptParser.Assign);
          this.state = 533;
          this.singleExpression(0);
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
  methodDefinition() {
    let localctx = new MethodDefinitionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 86, JavaScriptParser.RULE_methodDefinition);
    var _la = 0;
    try {
      this.state = 576;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 62, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 538;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Multiply) {
            this.state = 537;
            this.match(JavaScriptParser.Multiply);
          }
          this.state = 541;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Hashtag) {
            this.state = 540;
            this.match(JavaScriptParser.Hashtag);
          }
          this.state = 543;
          this.propertyName();
          this.state = 544;
          this.match(JavaScriptParser.OpenParen);
          this.state = 546;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis)) !== 0 || (_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
            this.state = 545;
            this.formalParameterList();
          }
          this.state = 548;
          this.match(JavaScriptParser.CloseParen);
          this.state = 549;
          this.functionBody();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 552;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 57, this._ctx);
          if (la_ === 1) {
            this.state = 551;
            this.match(JavaScriptParser.Multiply);
          }
          this.state = 555;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 58, this._ctx);
          if (la_ === 1) {
            this.state = 554;
            this.match(JavaScriptParser.Hashtag);
          }
          this.state = 557;
          this.getter();
          this.state = 558;
          this.match(JavaScriptParser.OpenParen);
          this.state = 559;
          this.match(JavaScriptParser.CloseParen);
          this.state = 560;
          this.functionBody();
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 563;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 59, this._ctx);
          if (la_ === 1) {
            this.state = 562;
            this.match(JavaScriptParser.Multiply);
          }
          this.state = 566;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 60, this._ctx);
          if (la_ === 1) {
            this.state = 565;
            this.match(JavaScriptParser.Hashtag);
          }
          this.state = 568;
          this.setter();
          this.state = 569;
          this.match(JavaScriptParser.OpenParen);
          this.state = 571;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis)) !== 0 || (_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
            this.state = 570;
            this.formalParameterList();
          }
          this.state = 573;
          this.match(JavaScriptParser.CloseParen);
          this.state = 574;
          this.functionBody();
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
  formalParameterList() {
    let localctx = new FormalParameterListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 88, JavaScriptParser.RULE_formalParameterList);
    var _la = 0;
    try {
      this.state = 591;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.OpenBracket:
        case JavaScriptParser.OpenBrace:
        case JavaScriptParser.Async:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Identifier:
          this.enterOuterAlt(localctx, 1);
          this.state = 578;
          this.formalParameterArg();
          this.state = 583;
          this._errHandler.sync(this);
          var _alt = this._interp.adaptivePredict(this._input, 63, this._ctx);
          while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt === 1) {
              this.state = 579;
              this.match(JavaScriptParser.Comma);
              this.state = 580;
              this.formalParameterArg();
            }
            this.state = 585;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input, 63, this._ctx);
          }
          this.state = 588;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Comma) {
            this.state = 586;
            this.match(JavaScriptParser.Comma);
            this.state = 587;
            this.lastFormalParameterArg();
          }
          break;
        case JavaScriptParser.Ellipsis:
          this.enterOuterAlt(localctx, 2);
          this.state = 590;
          this.lastFormalParameterArg();
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
  formalParameterArg() {
    let localctx = new FormalParameterArgContext(this, this._ctx, this.state);
    this.enterRule(localctx, 90, JavaScriptParser.RULE_formalParameterArg);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 593;
      this.assignable();
      this.state = 596;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Assign) {
        this.state = 594;
        this.match(JavaScriptParser.Assign);
        this.state = 595;
        this.singleExpression(0);
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
  lastFormalParameterArg() {
    let localctx = new LastFormalParameterArgContext(this, this._ctx, this.state);
    this.enterRule(localctx, 92, JavaScriptParser.RULE_lastFormalParameterArg);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 598;
      this.match(JavaScriptParser.Ellipsis);
      this.state = 599;
      this.singleExpression(0);
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
  functionBody() {
    let localctx = new FunctionBodyContext(this, this._ctx, this.state);
    this.enterRule(localctx, 94, JavaScriptParser.RULE_functionBody);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 601;
      this.match(JavaScriptParser.OpenBrace);
      this.state = 603;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 67, this._ctx);
      if (la_ === 1) {
        this.state = 602;
        this.sourceElements();
      }
      this.state = 605;
      this.match(JavaScriptParser.CloseBrace);
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
  sourceElements() {
    let localctx = new SourceElementsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 96, JavaScriptParser.RULE_sourceElements);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 608;
      this._errHandler.sync(this);
      var _alt = 1;
      do {
        switch (_alt) {
          case 1:
            this.state = 607;
            this.sourceElement();
            break;
          default:
            throw new import_antlr4.default.error.NoViableAltException(this);
        }
        this.state = 610;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 68, this._ctx);
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
  arrayLiteral() {
    let localctx = new ArrayLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 98, JavaScriptParser.RULE_arrayLiteral);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 612;
      this.match(JavaScriptParser.OpenBracket);
      this.state = 613;
      this.elementList();
      this.state = 614;
      this.match(JavaScriptParser.CloseBracket);
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
    this.enterRule(localctx, 100, JavaScriptParser.RULE_elementList);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 619;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 69, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 616;
          this.match(JavaScriptParser.Comma);
        }
        this.state = 621;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 69, this._ctx);
      }
      this.state = 623;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.RegularExpressionLiteral | 1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenParen | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis | 1 << JavaScriptParser.PlusPlus | 1 << JavaScriptParser.MinusMinus | 1 << JavaScriptParser.Plus | 1 << JavaScriptParser.Minus | 1 << JavaScriptParser.BitNot | 1 << JavaScriptParser.Not)) !== 0 || (_la - 60 & ~31) == 0 && (1 << _la - 60 & (1 << JavaScriptParser.NullLiteral - 60 | 1 << JavaScriptParser.BooleanLiteral - 60 | 1 << JavaScriptParser.DecimalLiteral - 60 | 1 << JavaScriptParser.HexIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral2 - 60 | 1 << JavaScriptParser.BinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigHexIntegerLiteral - 60 | 1 << JavaScriptParser.BigOctalIntegerLiteral - 60 | 1 << JavaScriptParser.BigBinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigDecimalIntegerLiteral - 60 | 1 << JavaScriptParser.Typeof - 60 | 1 << JavaScriptParser.New - 60 | 1 << JavaScriptParser.Void - 60 | 1 << JavaScriptParser.Function_ - 60 | 1 << JavaScriptParser.This - 60)) !== 0 || (_la - 94 & ~31) == 0 && (1 << _la - 94 & (1 << JavaScriptParser.Delete - 94 | 1 << JavaScriptParser.Class - 94 | 1 << JavaScriptParser.Super - 94 | 1 << JavaScriptParser.Import - 94 | 1 << JavaScriptParser.Async - 94 | 1 << JavaScriptParser.Await - 94 | 1 << JavaScriptParser.NonStrictLet - 94 | 1 << JavaScriptParser.Yield - 94 | 1 << JavaScriptParser.Identifier - 94 | 1 << JavaScriptParser.StringLiteral - 94 | 1 << JavaScriptParser.BackTick - 94)) !== 0) {
        this.state = 622;
        this.arrayElement();
      }
      this.state = 633;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 72, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 626;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          do {
            this.state = 625;
            this.match(JavaScriptParser.Comma);
            this.state = 628;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          } while (_la === JavaScriptParser.Comma);
          this.state = 630;
          this.arrayElement();
        }
        this.state = 635;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 72, this._ctx);
      }
      this.state = 639;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === JavaScriptParser.Comma) {
        this.state = 636;
        this.match(JavaScriptParser.Comma);
        this.state = 641;
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
  arrayElement() {
    let localctx = new ArrayElementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 102, JavaScriptParser.RULE_arrayElement);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 643;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Ellipsis) {
        this.state = 642;
        this.match(JavaScriptParser.Ellipsis);
      }
      this.state = 645;
      this.singleExpression(0);
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
  propertyAssignment() {
    let localctx = new PropertyAssignmentContext(this, this._ctx, this.state);
    this.enterRule(localctx, 104, JavaScriptParser.RULE_propertyAssignment);
    var _la = 0;
    try {
      this.state = 686;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 79, this._ctx);
      switch (la_) {
        case 1:
          localctx = new PropertyExpressionAssignmentContext(this, localctx);
          this.enterOuterAlt(localctx, 1);
          this.state = 647;
          this.propertyName();
          this.state = 648;
          this.match(JavaScriptParser.Colon);
          this.state = 649;
          this.singleExpression(0);
          break;
        case 2:
          localctx = new ComputedPropertyExpressionAssignmentContext(this, localctx);
          this.enterOuterAlt(localctx, 2);
          this.state = 651;
          this.match(JavaScriptParser.OpenBracket);
          this.state = 652;
          this.singleExpression(0);
          this.state = 653;
          this.match(JavaScriptParser.CloseBracket);
          this.state = 654;
          this.match(JavaScriptParser.Colon);
          this.state = 655;
          this.singleExpression(0);
          break;
        case 3:
          localctx = new FunctionPropertyContext(this, localctx);
          this.enterOuterAlt(localctx, 3);
          this.state = 658;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 75, this._ctx);
          if (la_ === 1) {
            this.state = 657;
            this.match(JavaScriptParser.Async);
          }
          this.state = 661;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Multiply) {
            this.state = 660;
            this.match(JavaScriptParser.Multiply);
          }
          this.state = 663;
          this.propertyName();
          this.state = 664;
          this.match(JavaScriptParser.OpenParen);
          this.state = 666;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis)) !== 0 || (_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
            this.state = 665;
            this.formalParameterList();
          }
          this.state = 668;
          this.match(JavaScriptParser.CloseParen);
          this.state = 669;
          this.functionBody();
          break;
        case 4:
          localctx = new PropertyGetterContext(this, localctx);
          this.enterOuterAlt(localctx, 4);
          this.state = 671;
          this.getter();
          this.state = 672;
          this.match(JavaScriptParser.OpenParen);
          this.state = 673;
          this.match(JavaScriptParser.CloseParen);
          this.state = 674;
          this.functionBody();
          break;
        case 5:
          localctx = new PropertySetterContext(this, localctx);
          this.enterOuterAlt(localctx, 5);
          this.state = 676;
          this.setter();
          this.state = 677;
          this.match(JavaScriptParser.OpenParen);
          this.state = 678;
          this.formalParameterArg();
          this.state = 679;
          this.match(JavaScriptParser.CloseParen);
          this.state = 680;
          this.functionBody();
          break;
        case 6:
          localctx = new PropertyShorthandContext(this, localctx);
          this.enterOuterAlt(localctx, 6);
          this.state = 683;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Ellipsis) {
            this.state = 682;
            this.match(JavaScriptParser.Ellipsis);
          }
          this.state = 685;
          this.singleExpression(0);
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
  propertyName() {
    let localctx = new PropertyNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 106, JavaScriptParser.RULE_propertyName);
    try {
      this.state = 695;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.NullLiteral:
        case JavaScriptParser.BooleanLiteral:
        case JavaScriptParser.Break:
        case JavaScriptParser.Do:
        case JavaScriptParser.Instanceof:
        case JavaScriptParser.Typeof:
        case JavaScriptParser.Case:
        case JavaScriptParser.Else:
        case JavaScriptParser.New:
        case JavaScriptParser.Var:
        case JavaScriptParser.Catch:
        case JavaScriptParser.Finally:
        case JavaScriptParser.Return:
        case JavaScriptParser.Void:
        case JavaScriptParser.Continue:
        case JavaScriptParser.For:
        case JavaScriptParser.Switch:
        case JavaScriptParser.While:
        case JavaScriptParser.Debugger:
        case JavaScriptParser.Function_:
        case JavaScriptParser.This:
        case JavaScriptParser.With:
        case JavaScriptParser.Default:
        case JavaScriptParser.If:
        case JavaScriptParser.Throw:
        case JavaScriptParser.Delete:
        case JavaScriptParser.In:
        case JavaScriptParser.Try:
        case JavaScriptParser.As:
        case JavaScriptParser.From:
        case JavaScriptParser.Class:
        case JavaScriptParser.Enum:
        case JavaScriptParser.Extends:
        case JavaScriptParser.Super:
        case JavaScriptParser.Const:
        case JavaScriptParser.Export:
        case JavaScriptParser.Import:
        case JavaScriptParser.Async:
        case JavaScriptParser.Await:
        case JavaScriptParser.Implements:
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Private:
        case JavaScriptParser.Public:
        case JavaScriptParser.Interface:
        case JavaScriptParser.Package:
        case JavaScriptParser.Protected:
        case JavaScriptParser.Static:
        case JavaScriptParser.Yield:
        case JavaScriptParser.Identifier:
          this.enterOuterAlt(localctx, 1);
          this.state = 688;
          this.identifierName();
          break;
        case JavaScriptParser.StringLiteral:
          this.enterOuterAlt(localctx, 2);
          this.state = 689;
          this.match(JavaScriptParser.StringLiteral);
          break;
        case JavaScriptParser.DecimalLiteral:
        case JavaScriptParser.HexIntegerLiteral:
        case JavaScriptParser.OctalIntegerLiteral:
        case JavaScriptParser.OctalIntegerLiteral2:
        case JavaScriptParser.BinaryIntegerLiteral:
          this.enterOuterAlt(localctx, 3);
          this.state = 690;
          this.numericLiteral();
          break;
        case JavaScriptParser.OpenBracket:
          this.enterOuterAlt(localctx, 4);
          this.state = 691;
          this.match(JavaScriptParser.OpenBracket);
          this.state = 692;
          this.singleExpression(0);
          this.state = 693;
          this.match(JavaScriptParser.CloseBracket);
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
  arguments() {
    let localctx = new ArgumentsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 108, JavaScriptParser.RULE_arguments);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 697;
      this.match(JavaScriptParser.OpenParen);
      this.state = 709;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.RegularExpressionLiteral | 1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenParen | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis | 1 << JavaScriptParser.PlusPlus | 1 << JavaScriptParser.MinusMinus | 1 << JavaScriptParser.Plus | 1 << JavaScriptParser.Minus | 1 << JavaScriptParser.BitNot | 1 << JavaScriptParser.Not)) !== 0 || (_la - 60 & ~31) == 0 && (1 << _la - 60 & (1 << JavaScriptParser.NullLiteral - 60 | 1 << JavaScriptParser.BooleanLiteral - 60 | 1 << JavaScriptParser.DecimalLiteral - 60 | 1 << JavaScriptParser.HexIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral - 60 | 1 << JavaScriptParser.OctalIntegerLiteral2 - 60 | 1 << JavaScriptParser.BinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigHexIntegerLiteral - 60 | 1 << JavaScriptParser.BigOctalIntegerLiteral - 60 | 1 << JavaScriptParser.BigBinaryIntegerLiteral - 60 | 1 << JavaScriptParser.BigDecimalIntegerLiteral - 60 | 1 << JavaScriptParser.Typeof - 60 | 1 << JavaScriptParser.New - 60 | 1 << JavaScriptParser.Void - 60 | 1 << JavaScriptParser.Function_ - 60 | 1 << JavaScriptParser.This - 60)) !== 0 || (_la - 94 & ~31) == 0 && (1 << _la - 94 & (1 << JavaScriptParser.Delete - 94 | 1 << JavaScriptParser.Class - 94 | 1 << JavaScriptParser.Super - 94 | 1 << JavaScriptParser.Import - 94 | 1 << JavaScriptParser.Async - 94 | 1 << JavaScriptParser.Await - 94 | 1 << JavaScriptParser.NonStrictLet - 94 | 1 << JavaScriptParser.Yield - 94 | 1 << JavaScriptParser.Identifier - 94 | 1 << JavaScriptParser.StringLiteral - 94 | 1 << JavaScriptParser.BackTick - 94)) !== 0) {
        this.state = 698;
        this.argument();
        this.state = 703;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input, 81, this._ctx);
        while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt === 1) {
            this.state = 699;
            this.match(JavaScriptParser.Comma);
            this.state = 700;
            this.argument();
          }
          this.state = 705;
          this._errHandler.sync(this);
          _alt = this._interp.adaptivePredict(this._input, 81, this._ctx);
        }
        this.state = 707;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === JavaScriptParser.Comma) {
          this.state = 706;
          this.match(JavaScriptParser.Comma);
        }
      }
      this.state = 711;
      this.match(JavaScriptParser.CloseParen);
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
  argument() {
    let localctx = new ArgumentContext(this, this._ctx, this.state);
    this.enterRule(localctx, 110, JavaScriptParser.RULE_argument);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 714;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === JavaScriptParser.Ellipsis) {
        this.state = 713;
        this.match(JavaScriptParser.Ellipsis);
      }
      this.state = 718;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 85, this._ctx);
      switch (la_) {
        case 1:
          this.state = 716;
          this.singleExpression(0);
          break;
        case 2:
          this.state = 717;
          this.identifier();
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
  expressionSequence() {
    let localctx = new ExpressionSequenceContext(this, this._ctx, this.state);
    this.enterRule(localctx, 112, JavaScriptParser.RULE_expressionSequence);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 720;
      this.singleExpression(0);
      this.state = 725;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 86, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 721;
          this.match(JavaScriptParser.Comma);
          this.state = 722;
          this.singleExpression(0);
        }
        this.state = 727;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 86, this._ctx);
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
  singleExpression(_p) {
    if (_p === void 0) {
      _p = 0;
    }
    const _parentctx = this._ctx;
    const _parentState = this.state;
    let localctx = new SingleExpressionContext(this, this._ctx, _parentState);
    let _prevctx = localctx;
    const _startState = 114;
    this.enterRecursionRule(localctx, 114, JavaScriptParser.RULE_singleExpression, _p);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 780;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 88, this._ctx);
      switch (la_) {
        case 1:
          localctx = new FunctionExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 729;
          this.anonymousFunction();
          break;
        case 2:
          localctx = new ClassExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 730;
          this.match(JavaScriptParser.Class);
          this.state = 732;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
            this.state = 731;
            this.identifier();
          }
          this.state = 734;
          this.classTail();
          break;
        case 3:
          localctx = new NewExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 735;
          this.match(JavaScriptParser.New);
          this.state = 736;
          this.singleExpression(0);
          this.state = 737;
          this.arguments();
          break;
        case 4:
          localctx = new NewExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 739;
          this.match(JavaScriptParser.New);
          this.state = 740;
          this.singleExpression(42);
          break;
        case 5:
          localctx = new MetaExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 741;
          this.match(JavaScriptParser.New);
          this.state = 742;
          this.match(JavaScriptParser.Dot);
          this.state = 743;
          this.identifier();
          break;
        case 6:
          localctx = new DeleteExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 744;
          this.match(JavaScriptParser.Delete);
          this.state = 745;
          this.singleExpression(37);
          break;
        case 7:
          localctx = new VoidExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 746;
          this.match(JavaScriptParser.Void);
          this.state = 747;
          this.singleExpression(36);
          break;
        case 8:
          localctx = new TypeofExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 748;
          this.match(JavaScriptParser.Typeof);
          this.state = 749;
          this.singleExpression(35);
          break;
        case 9:
          localctx = new PreIncrementExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 750;
          this.match(JavaScriptParser.PlusPlus);
          this.state = 751;
          this.singleExpression(34);
          break;
        case 10:
          localctx = new PreDecreaseExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 752;
          this.match(JavaScriptParser.MinusMinus);
          this.state = 753;
          this.singleExpression(33);
          break;
        case 11:
          localctx = new UnaryPlusExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 754;
          this.match(JavaScriptParser.Plus);
          this.state = 755;
          this.singleExpression(32);
          break;
        case 12:
          localctx = new UnaryMinusExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 756;
          this.match(JavaScriptParser.Minus);
          this.state = 757;
          this.singleExpression(31);
          break;
        case 13:
          localctx = new BitNotExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 758;
          this.match(JavaScriptParser.BitNot);
          this.state = 759;
          this.singleExpression(30);
          break;
        case 14:
          localctx = new NotExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 760;
          this.match(JavaScriptParser.Not);
          this.state = 761;
          this.singleExpression(29);
          break;
        case 15:
          localctx = new AwaitExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 762;
          this.match(JavaScriptParser.Await);
          this.state = 763;
          this.singleExpression(28);
          break;
        case 16:
          localctx = new ImportExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 764;
          this.match(JavaScriptParser.Import);
          this.state = 765;
          this.match(JavaScriptParser.OpenParen);
          this.state = 766;
          this.singleExpression(0);
          this.state = 767;
          this.match(JavaScriptParser.CloseParen);
          break;
        case 17:
          localctx = new YieldExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 769;
          this.yieldStatement();
          break;
        case 18:
          localctx = new ThisExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 770;
          this.match(JavaScriptParser.This);
          break;
        case 19:
          localctx = new IdentifierExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 771;
          this.identifier();
          break;
        case 20:
          localctx = new SuperExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 772;
          this.match(JavaScriptParser.Super);
          break;
        case 21:
          localctx = new LiteralExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 773;
          this.literal();
          break;
        case 22:
          localctx = new ArrayLiteralExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 774;
          this.arrayLiteral();
          break;
        case 23:
          localctx = new ObjectLiteralExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 775;
          this.objectLiteral();
          break;
        case 24:
          localctx = new ParenthesizedExpressionContext(this, localctx);
          this._ctx = localctx;
          _prevctx = localctx;
          this.state = 776;
          this.match(JavaScriptParser.OpenParen);
          this.state = 777;
          this.expressionSequence();
          this.state = 778;
          this.match(JavaScriptParser.CloseParen);
          break;
      }
      this._ctx.stop = this._input.LT(-1);
      this.state = 863;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 92, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          if (this._parseListeners !== null) {
            this.triggerExitRuleEvent();
          }
          _prevctx = localctx;
          this.state = 861;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 91, this._ctx);
          switch (la_) {
            case 1:
              localctx = new PowerExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 782;
              if (!this.precpred(this._ctx, 27)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 27)");
              }
              this.state = 783;
              this.match(JavaScriptParser.Power);
              this.state = 784;
              this.singleExpression(27);
              break;
            case 2:
              localctx = new MultiplicativeExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 785;
              if (!this.precpred(this._ctx, 26)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 26)");
              }
              this.state = 786;
              _la = this._input.LA(1);
              if (!((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.Multiply | 1 << JavaScriptParser.Divide | 1 << JavaScriptParser.Modulus)) !== 0)) {
                this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 787;
              this.singleExpression(27);
              break;
            case 3:
              localctx = new AdditiveExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 788;
              if (!this.precpred(this._ctx, 25)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 25)");
              }
              this.state = 789;
              _la = this._input.LA(1);
              if (!(_la === JavaScriptParser.Plus || _la === JavaScriptParser.Minus)) {
                this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 790;
              this.singleExpression(26);
              break;
            case 4:
              localctx = new CoalesceExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 791;
              if (!this.precpred(this._ctx, 24)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 24)");
              }
              this.state = 792;
              this.match(JavaScriptParser.NullCoalesce);
              this.state = 793;
              this.singleExpression(25);
              break;
            case 5:
              localctx = new BitShiftExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 794;
              if (!this.precpred(this._ctx, 23)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 23)");
              }
              this.state = 795;
              _la = this._input.LA(1);
              if (!((_la - 31 & ~31) == 0 && (1 << _la - 31 & (1 << JavaScriptParser.RightShiftArithmetic - 31 | 1 << JavaScriptParser.LeftShiftArithmetic - 31 | 1 << JavaScriptParser.RightShiftLogical - 31)) !== 0)) {
                this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 796;
              this.singleExpression(24);
              break;
            case 6:
              localctx = new RelationalExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 797;
              if (!this.precpred(this._ctx, 22)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 22)");
              }
              this.state = 798;
              _la = this._input.LA(1);
              if (!((_la - 34 & ~31) == 0 && (1 << _la - 34 & (1 << JavaScriptParser.LessThan - 34 | 1 << JavaScriptParser.MoreThan - 34 | 1 << JavaScriptParser.LessThanEquals - 34 | 1 << JavaScriptParser.GreaterThanEquals - 34)) !== 0)) {
                this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 799;
              this.singleExpression(23);
              break;
            case 7:
              localctx = new InstanceofExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 800;
              if (!this.precpred(this._ctx, 21)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 21)");
              }
              this.state = 801;
              this.match(JavaScriptParser.Instanceof);
              this.state = 802;
              this.singleExpression(22);
              break;
            case 8:
              localctx = new InExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 803;
              if (!this.precpred(this._ctx, 20)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 20)");
              }
              this.state = 804;
              this.match(JavaScriptParser.In);
              this.state = 805;
              this.singleExpression(21);
              break;
            case 9:
              localctx = new EqualityExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 806;
              if (!this.precpred(this._ctx, 19)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 19)");
              }
              this.state = 807;
              _la = this._input.LA(1);
              if (!((_la - 38 & ~31) == 0 && (1 << _la - 38 & (1 << JavaScriptParser.Equals_ - 38 | 1 << JavaScriptParser.NotEquals - 38 | 1 << JavaScriptParser.IdentityEquals - 38 | 1 << JavaScriptParser.IdentityNotEquals - 38)) !== 0)) {
                this._errHandler.recoverInline(this);
              } else {
                this._errHandler.reportMatch(this);
                this.consume();
              }
              this.state = 808;
              this.singleExpression(20);
              break;
            case 10:
              localctx = new BitAndExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 809;
              if (!this.precpred(this._ctx, 18)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 18)");
              }
              this.state = 810;
              this.match(JavaScriptParser.BitAnd);
              this.state = 811;
              this.singleExpression(19);
              break;
            case 11:
              localctx = new BitXOrExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 812;
              if (!this.precpred(this._ctx, 17)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 17)");
              }
              this.state = 813;
              this.match(JavaScriptParser.BitXOr);
              this.state = 814;
              this.singleExpression(18);
              break;
            case 12:
              localctx = new BitOrExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 815;
              if (!this.precpred(this._ctx, 16)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 16)");
              }
              this.state = 816;
              this.match(JavaScriptParser.BitOr);
              this.state = 817;
              this.singleExpression(17);
              break;
            case 13:
              localctx = new LogicalAndExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 818;
              if (!this.precpred(this._ctx, 15)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 15)");
              }
              this.state = 819;
              this.match(JavaScriptParser.And);
              this.state = 820;
              this.singleExpression(16);
              break;
            case 14:
              localctx = new LogicalOrExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 821;
              if (!this.precpred(this._ctx, 14)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 14)");
              }
              this.state = 822;
              this.match(JavaScriptParser.Or);
              this.state = 823;
              this.singleExpression(15);
              break;
            case 15:
              localctx = new TernaryExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 824;
              if (!this.precpred(this._ctx, 13)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 13)");
              }
              this.state = 825;
              this.match(JavaScriptParser.QuestionMark);
              this.state = 826;
              this.singleExpression(0);
              this.state = 827;
              this.match(JavaScriptParser.Colon);
              this.state = 828;
              this.singleExpression(14);
              break;
            case 16:
              localctx = new AssignmentExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 830;
              if (!this.precpred(this._ctx, 12)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 12)");
              }
              this.state = 831;
              this.match(JavaScriptParser.Assign);
              this.state = 832;
              this.singleExpression(12);
              break;
            case 17:
              localctx = new AssignmentOperatorExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 833;
              if (!this.precpred(this._ctx, 11)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 11)");
              }
              this.state = 834;
              this.assignmentOperator();
              this.state = 835;
              this.singleExpression(11);
              break;
            case 18:
              localctx = new MemberIndexExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 837;
              if (!this.precpred(this._ctx, 45)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 45)");
              }
              this.state = 838;
              this.match(JavaScriptParser.OpenBracket);
              this.state = 839;
              this.expressionSequence();
              this.state = 840;
              this.match(JavaScriptParser.CloseBracket);
              break;
            case 19:
              localctx = new MemberDotExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 842;
              if (!this.precpred(this._ctx, 44)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 44)");
              }
              this.state = 844;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === JavaScriptParser.QuestionMark) {
                this.state = 843;
                this.match(JavaScriptParser.QuestionMark);
              }
              this.state = 846;
              this.match(JavaScriptParser.Dot);
              this.state = 848;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === JavaScriptParser.Hashtag) {
                this.state = 847;
                this.match(JavaScriptParser.Hashtag);
              }
              this.state = 850;
              this.identifierName();
              break;
            case 20:
              localctx = new ArgumentsExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 851;
              if (!this.precpred(this._ctx, 41)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 41)");
              }
              this.state = 852;
              this.arguments();
              break;
            case 21:
              localctx = new PostIncrementExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 853;
              if (!this.precpred(this._ctx, 39)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 39)");
              }
              this.state = 854;
              if (!this.notLineTerminator()) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.notLineTerminator()");
              }
              this.state = 855;
              this.match(JavaScriptParser.PlusPlus);
              break;
            case 22:
              localctx = new PostDecreaseExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 856;
              if (!this.precpred(this._ctx, 38)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 38)");
              }
              this.state = 857;
              if (!this.notLineTerminator()) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.notLineTerminator()");
              }
              this.state = 858;
              this.match(JavaScriptParser.MinusMinus);
              break;
            case 23:
              localctx = new TemplateStringExpressionContext(this, new SingleExpressionContext(this, _parentctx, _parentState));
              this.pushNewRecursionContext(localctx, _startState, JavaScriptParser.RULE_singleExpression);
              this.state = 859;
              if (!this.precpred(this._ctx, 9)) {
                throw new import_antlr4.default.error.FailedPredicateException(this, "this.precpred(this._ctx, 9)");
              }
              this.state = 860;
              this.templateStringLiteral();
              break;
          }
        }
        this.state = 865;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 92, this._ctx);
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
  assignable() {
    let localctx = new AssignableContext(this, this._ctx, this.state);
    this.enterRule(localctx, 116, JavaScriptParser.RULE_assignable);
    try {
      this.state = 869;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Async:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Identifier:
          this.enterOuterAlt(localctx, 1);
          this.state = 866;
          this.identifier();
          break;
        case JavaScriptParser.OpenBracket:
          this.enterOuterAlt(localctx, 2);
          this.state = 867;
          this.arrayLiteral();
          break;
        case JavaScriptParser.OpenBrace:
          this.enterOuterAlt(localctx, 3);
          this.state = 868;
          this.objectLiteral();
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
  objectLiteral() {
    let localctx = new ObjectLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 118, JavaScriptParser.RULE_objectLiteral);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 871;
      this.match(JavaScriptParser.OpenBrace);
      this.state = 883;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 96, this._ctx);
      if (la_ === 1) {
        this.state = 872;
        this.propertyAssignment();
        this.state = 877;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input, 94, this._ctx);
        while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt === 1) {
            this.state = 873;
            this.match(JavaScriptParser.Comma);
            this.state = 874;
            this.propertyAssignment();
          }
          this.state = 879;
          this._errHandler.sync(this);
          _alt = this._interp.adaptivePredict(this._input, 94, this._ctx);
        }
        this.state = 881;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === JavaScriptParser.Comma) {
          this.state = 880;
          this.match(JavaScriptParser.Comma);
        }
      }
      this.state = 885;
      this.match(JavaScriptParser.CloseBrace);
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
  anonymousFunction() {
    let localctx = new AnonymousFunctionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 120, JavaScriptParser.RULE_anonymousFunction);
    var _la = 0;
    try {
      this.state = 908;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 101, this._ctx);
      switch (la_) {
        case 1:
          localctx = new FunctionDeclContext(this, localctx);
          this.enterOuterAlt(localctx, 1);
          this.state = 887;
          this.functionDeclaration();
          break;
        case 2:
          localctx = new AnonymousFunctionDeclContext(this, localctx);
          this.enterOuterAlt(localctx, 2);
          this.state = 889;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Async) {
            this.state = 888;
            this.match(JavaScriptParser.Async);
          }
          this.state = 891;
          this.match(JavaScriptParser.Function_);
          this.state = 893;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === JavaScriptParser.Multiply) {
            this.state = 892;
            this.match(JavaScriptParser.Multiply);
          }
          this.state = 895;
          this.match(JavaScriptParser.OpenParen);
          this.state = 897;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis)) !== 0 || (_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
            this.state = 896;
            this.formalParameterList();
          }
          this.state = 899;
          this.match(JavaScriptParser.CloseParen);
          this.state = 900;
          this.functionBody();
          break;
        case 3:
          localctx = new ArrowFunctionContext(this, localctx);
          this.enterOuterAlt(localctx, 3);
          this.state = 902;
          this._errHandler.sync(this);
          var la_ = this._interp.adaptivePredict(this._input, 100, this._ctx);
          if (la_ === 1) {
            this.state = 901;
            this.match(JavaScriptParser.Async);
          }
          this.state = 904;
          this.arrowFunctionParameters();
          this.state = 905;
          this.match(JavaScriptParser.ARROW);
          this.state = 906;
          this.arrowFunctionBody();
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
  arrowFunctionParameters() {
    let localctx = new ArrowFunctionParametersContext(this, this._ctx, this.state);
    this.enterRule(localctx, 122, JavaScriptParser.RULE_arrowFunctionParameters);
    var _la = 0;
    try {
      this.state = 916;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Async:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Identifier:
          this.enterOuterAlt(localctx, 1);
          this.state = 910;
          this.identifier();
          break;
        case JavaScriptParser.OpenParen:
          this.enterOuterAlt(localctx, 2);
          this.state = 911;
          this.match(JavaScriptParser.OpenParen);
          this.state = 913;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << JavaScriptParser.OpenBracket | 1 << JavaScriptParser.OpenBrace | 1 << JavaScriptParser.Ellipsis)) !== 0 || (_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0) {
            this.state = 912;
            this.formalParameterList();
          }
          this.state = 915;
          this.match(JavaScriptParser.CloseParen);
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
  arrowFunctionBody() {
    let localctx = new ArrowFunctionBodyContext(this, this._ctx, this.state);
    this.enterRule(localctx, 124, JavaScriptParser.RULE_arrowFunctionBody);
    try {
      this.state = 920;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 104, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 918;
          this.singleExpression(0);
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 919;
          this.functionBody();
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
  assignmentOperator() {
    let localctx = new AssignmentOperatorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 126, JavaScriptParser.RULE_assignmentOperator);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 922;
      _la = this._input.LA(1);
      if (!((_la - 47 & ~31) == 0 && (1 << _la - 47 & (1 << JavaScriptParser.MultiplyAssign - 47 | 1 << JavaScriptParser.DivideAssign - 47 | 1 << JavaScriptParser.ModulusAssign - 47 | 1 << JavaScriptParser.PlusAssign - 47 | 1 << JavaScriptParser.MinusAssign - 47 | 1 << JavaScriptParser.LeftShiftArithmeticAssign - 47 | 1 << JavaScriptParser.RightShiftArithmeticAssign - 47 | 1 << JavaScriptParser.RightShiftLogicalAssign - 47 | 1 << JavaScriptParser.BitAndAssign - 47 | 1 << JavaScriptParser.BitXorAssign - 47 | 1 << JavaScriptParser.BitOrAssign - 47 | 1 << JavaScriptParser.PowerAssign - 47)) !== 0)) {
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
  literal() {
    let localctx = new LiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 128, JavaScriptParser.RULE_literal);
    try {
      this.state = 931;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.NullLiteral:
          this.enterOuterAlt(localctx, 1);
          this.state = 924;
          this.match(JavaScriptParser.NullLiteral);
          break;
        case JavaScriptParser.BooleanLiteral:
          this.enterOuterAlt(localctx, 2);
          this.state = 925;
          this.match(JavaScriptParser.BooleanLiteral);
          break;
        case JavaScriptParser.StringLiteral:
          this.enterOuterAlt(localctx, 3);
          this.state = 926;
          this.match(JavaScriptParser.StringLiteral);
          break;
        case JavaScriptParser.BackTick:
          this.enterOuterAlt(localctx, 4);
          this.state = 927;
          this.templateStringLiteral();
          break;
        case JavaScriptParser.RegularExpressionLiteral:
          this.enterOuterAlt(localctx, 5);
          this.state = 928;
          this.match(JavaScriptParser.RegularExpressionLiteral);
          break;
        case JavaScriptParser.DecimalLiteral:
        case JavaScriptParser.HexIntegerLiteral:
        case JavaScriptParser.OctalIntegerLiteral:
        case JavaScriptParser.OctalIntegerLiteral2:
        case JavaScriptParser.BinaryIntegerLiteral:
          this.enterOuterAlt(localctx, 6);
          this.state = 929;
          this.numericLiteral();
          break;
        case JavaScriptParser.BigHexIntegerLiteral:
        case JavaScriptParser.BigOctalIntegerLiteral:
        case JavaScriptParser.BigBinaryIntegerLiteral:
        case JavaScriptParser.BigDecimalIntegerLiteral:
          this.enterOuterAlt(localctx, 7);
          this.state = 930;
          this.bigintLiteral();
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
  templateStringLiteral() {
    let localctx = new TemplateStringLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 130, JavaScriptParser.RULE_templateStringLiteral);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 933;
      this.match(JavaScriptParser.BackTick);
      this.state = 937;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === JavaScriptParser.TemplateStringStartExpression || _la === JavaScriptParser.TemplateStringAtom) {
        this.state = 934;
        this.templateStringAtom();
        this.state = 939;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 940;
      this.match(JavaScriptParser.BackTick);
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
  templateStringAtom() {
    let localctx = new TemplateStringAtomContext(this, this._ctx, this.state);
    this.enterRule(localctx, 132, JavaScriptParser.RULE_templateStringAtom);
    try {
      this.state = 947;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.TemplateStringAtom:
          this.enterOuterAlt(localctx, 1);
          this.state = 942;
          this.match(JavaScriptParser.TemplateStringAtom);
          break;
        case JavaScriptParser.TemplateStringStartExpression:
          this.enterOuterAlt(localctx, 2);
          this.state = 943;
          this.match(JavaScriptParser.TemplateStringStartExpression);
          this.state = 944;
          this.singleExpression(0);
          this.state = 945;
          this.match(JavaScriptParser.TemplateCloseBrace);
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
  numericLiteral() {
    let localctx = new NumericLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 134, JavaScriptParser.RULE_numericLiteral);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 949;
      _la = this._input.LA(1);
      if (!((_la - 62 & ~31) == 0 && (1 << _la - 62 & (1 << JavaScriptParser.DecimalLiteral - 62 | 1 << JavaScriptParser.HexIntegerLiteral - 62 | 1 << JavaScriptParser.OctalIntegerLiteral - 62 | 1 << JavaScriptParser.OctalIntegerLiteral2 - 62 | 1 << JavaScriptParser.BinaryIntegerLiteral - 62)) !== 0)) {
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
  bigintLiteral() {
    let localctx = new BigintLiteralContext(this, this._ctx, this.state);
    this.enterRule(localctx, 136, JavaScriptParser.RULE_bigintLiteral);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 951;
      _la = this._input.LA(1);
      if (!((_la - 67 & ~31) == 0 && (1 << _la - 67 & (1 << JavaScriptParser.BigHexIntegerLiteral - 67 | 1 << JavaScriptParser.BigOctalIntegerLiteral - 67 | 1 << JavaScriptParser.BigBinaryIntegerLiteral - 67 | 1 << JavaScriptParser.BigDecimalIntegerLiteral - 67)) !== 0)) {
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
  getter() {
    let localctx = new GetterContext(this, this._ctx, this.state);
    this.enterRule(localctx, 138, JavaScriptParser.RULE_getter);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 953;
      if (!this.n("get")) {
        throw new import_antlr4.default.error.FailedPredicateException(this, 'this.n("get")');
      }
      this.state = 954;
      this.identifier();
      this.state = 955;
      this.propertyName();
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
  setter() {
    let localctx = new SetterContext(this, this._ctx, this.state);
    this.enterRule(localctx, 140, JavaScriptParser.RULE_setter);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 957;
      if (!this.n("set")) {
        throw new import_antlr4.default.error.FailedPredicateException(this, 'this.n("set")');
      }
      this.state = 958;
      this.identifier();
      this.state = 959;
      this.propertyName();
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
  identifierName() {
    let localctx = new IdentifierNameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 142, JavaScriptParser.RULE_identifierName);
    try {
      this.state = 963;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 108, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 961;
          this.identifier();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 962;
          this.reservedWord();
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
  identifier() {
    let localctx = new IdentifierContext(this, this._ctx, this.state);
    this.enterRule(localctx, 144, JavaScriptParser.RULE_identifier);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 965;
      _la = this._input.LA(1);
      if (!((_la - 106 & ~31) == 0 && (1 << _la - 106 & (1 << JavaScriptParser.Async - 106 | 1 << JavaScriptParser.NonStrictLet - 106 | 1 << JavaScriptParser.Identifier - 106)) !== 0)) {
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
  reservedWord() {
    let localctx = new ReservedWordContext(this, this._ctx, this.state);
    this.enterRule(localctx, 146, JavaScriptParser.RULE_reservedWord);
    try {
      this.state = 970;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Break:
        case JavaScriptParser.Do:
        case JavaScriptParser.Instanceof:
        case JavaScriptParser.Typeof:
        case JavaScriptParser.Case:
        case JavaScriptParser.Else:
        case JavaScriptParser.New:
        case JavaScriptParser.Var:
        case JavaScriptParser.Catch:
        case JavaScriptParser.Finally:
        case JavaScriptParser.Return:
        case JavaScriptParser.Void:
        case JavaScriptParser.Continue:
        case JavaScriptParser.For:
        case JavaScriptParser.Switch:
        case JavaScriptParser.While:
        case JavaScriptParser.Debugger:
        case JavaScriptParser.Function_:
        case JavaScriptParser.This:
        case JavaScriptParser.With:
        case JavaScriptParser.Default:
        case JavaScriptParser.If:
        case JavaScriptParser.Throw:
        case JavaScriptParser.Delete:
        case JavaScriptParser.In:
        case JavaScriptParser.Try:
        case JavaScriptParser.As:
        case JavaScriptParser.From:
        case JavaScriptParser.Class:
        case JavaScriptParser.Enum:
        case JavaScriptParser.Extends:
        case JavaScriptParser.Super:
        case JavaScriptParser.Const:
        case JavaScriptParser.Export:
        case JavaScriptParser.Import:
        case JavaScriptParser.Async:
        case JavaScriptParser.Await:
        case JavaScriptParser.Implements:
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
        case JavaScriptParser.Private:
        case JavaScriptParser.Public:
        case JavaScriptParser.Interface:
        case JavaScriptParser.Package:
        case JavaScriptParser.Protected:
        case JavaScriptParser.Static:
        case JavaScriptParser.Yield:
          this.enterOuterAlt(localctx, 1);
          this.state = 967;
          this.keyword();
          break;
        case JavaScriptParser.NullLiteral:
          this.enterOuterAlt(localctx, 2);
          this.state = 968;
          this.match(JavaScriptParser.NullLiteral);
          break;
        case JavaScriptParser.BooleanLiteral:
          this.enterOuterAlt(localctx, 3);
          this.state = 969;
          this.match(JavaScriptParser.BooleanLiteral);
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
  keyword() {
    let localctx = new KeywordContext(this, this._ctx, this.state);
    this.enterRule(localctx, 148, JavaScriptParser.RULE_keyword);
    try {
      this.state = 1018;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case JavaScriptParser.Break:
          this.enterOuterAlt(localctx, 1);
          this.state = 972;
          this.match(JavaScriptParser.Break);
          break;
        case JavaScriptParser.Do:
          this.enterOuterAlt(localctx, 2);
          this.state = 973;
          this.match(JavaScriptParser.Do);
          break;
        case JavaScriptParser.Instanceof:
          this.enterOuterAlt(localctx, 3);
          this.state = 974;
          this.match(JavaScriptParser.Instanceof);
          break;
        case JavaScriptParser.Typeof:
          this.enterOuterAlt(localctx, 4);
          this.state = 975;
          this.match(JavaScriptParser.Typeof);
          break;
        case JavaScriptParser.Case:
          this.enterOuterAlt(localctx, 5);
          this.state = 976;
          this.match(JavaScriptParser.Case);
          break;
        case JavaScriptParser.Else:
          this.enterOuterAlt(localctx, 6);
          this.state = 977;
          this.match(JavaScriptParser.Else);
          break;
        case JavaScriptParser.New:
          this.enterOuterAlt(localctx, 7);
          this.state = 978;
          this.match(JavaScriptParser.New);
          break;
        case JavaScriptParser.Var:
          this.enterOuterAlt(localctx, 8);
          this.state = 979;
          this.match(JavaScriptParser.Var);
          break;
        case JavaScriptParser.Catch:
          this.enterOuterAlt(localctx, 9);
          this.state = 980;
          this.match(JavaScriptParser.Catch);
          break;
        case JavaScriptParser.Finally:
          this.enterOuterAlt(localctx, 10);
          this.state = 981;
          this.match(JavaScriptParser.Finally);
          break;
        case JavaScriptParser.Return:
          this.enterOuterAlt(localctx, 11);
          this.state = 982;
          this.match(JavaScriptParser.Return);
          break;
        case JavaScriptParser.Void:
          this.enterOuterAlt(localctx, 12);
          this.state = 983;
          this.match(JavaScriptParser.Void);
          break;
        case JavaScriptParser.Continue:
          this.enterOuterAlt(localctx, 13);
          this.state = 984;
          this.match(JavaScriptParser.Continue);
          break;
        case JavaScriptParser.For:
          this.enterOuterAlt(localctx, 14);
          this.state = 985;
          this.match(JavaScriptParser.For);
          break;
        case JavaScriptParser.Switch:
          this.enterOuterAlt(localctx, 15);
          this.state = 986;
          this.match(JavaScriptParser.Switch);
          break;
        case JavaScriptParser.While:
          this.enterOuterAlt(localctx, 16);
          this.state = 987;
          this.match(JavaScriptParser.While);
          break;
        case JavaScriptParser.Debugger:
          this.enterOuterAlt(localctx, 17);
          this.state = 988;
          this.match(JavaScriptParser.Debugger);
          break;
        case JavaScriptParser.Function_:
          this.enterOuterAlt(localctx, 18);
          this.state = 989;
          this.match(JavaScriptParser.Function_);
          break;
        case JavaScriptParser.This:
          this.enterOuterAlt(localctx, 19);
          this.state = 990;
          this.match(JavaScriptParser.This);
          break;
        case JavaScriptParser.With:
          this.enterOuterAlt(localctx, 20);
          this.state = 991;
          this.match(JavaScriptParser.With);
          break;
        case JavaScriptParser.Default:
          this.enterOuterAlt(localctx, 21);
          this.state = 992;
          this.match(JavaScriptParser.Default);
          break;
        case JavaScriptParser.If:
          this.enterOuterAlt(localctx, 22);
          this.state = 993;
          this.match(JavaScriptParser.If);
          break;
        case JavaScriptParser.Throw:
          this.enterOuterAlt(localctx, 23);
          this.state = 994;
          this.match(JavaScriptParser.Throw);
          break;
        case JavaScriptParser.Delete:
          this.enterOuterAlt(localctx, 24);
          this.state = 995;
          this.match(JavaScriptParser.Delete);
          break;
        case JavaScriptParser.In:
          this.enterOuterAlt(localctx, 25);
          this.state = 996;
          this.match(JavaScriptParser.In);
          break;
        case JavaScriptParser.Try:
          this.enterOuterAlt(localctx, 26);
          this.state = 997;
          this.match(JavaScriptParser.Try);
          break;
        case JavaScriptParser.Class:
          this.enterOuterAlt(localctx, 27);
          this.state = 998;
          this.match(JavaScriptParser.Class);
          break;
        case JavaScriptParser.Enum:
          this.enterOuterAlt(localctx, 28);
          this.state = 999;
          this.match(JavaScriptParser.Enum);
          break;
        case JavaScriptParser.Extends:
          this.enterOuterAlt(localctx, 29);
          this.state = 1e3;
          this.match(JavaScriptParser.Extends);
          break;
        case JavaScriptParser.Super:
          this.enterOuterAlt(localctx, 30);
          this.state = 1001;
          this.match(JavaScriptParser.Super);
          break;
        case JavaScriptParser.Const:
          this.enterOuterAlt(localctx, 31);
          this.state = 1002;
          this.match(JavaScriptParser.Const);
          break;
        case JavaScriptParser.Export:
          this.enterOuterAlt(localctx, 32);
          this.state = 1003;
          this.match(JavaScriptParser.Export);
          break;
        case JavaScriptParser.Import:
          this.enterOuterAlt(localctx, 33);
          this.state = 1004;
          this.match(JavaScriptParser.Import);
          break;
        case JavaScriptParser.Implements:
          this.enterOuterAlt(localctx, 34);
          this.state = 1005;
          this.match(JavaScriptParser.Implements);
          break;
        case JavaScriptParser.StrictLet:
        case JavaScriptParser.NonStrictLet:
          this.enterOuterAlt(localctx, 35);
          this.state = 1006;
          this.let_();
          break;
        case JavaScriptParser.Private:
          this.enterOuterAlt(localctx, 36);
          this.state = 1007;
          this.match(JavaScriptParser.Private);
          break;
        case JavaScriptParser.Public:
          this.enterOuterAlt(localctx, 37);
          this.state = 1008;
          this.match(JavaScriptParser.Public);
          break;
        case JavaScriptParser.Interface:
          this.enterOuterAlt(localctx, 38);
          this.state = 1009;
          this.match(JavaScriptParser.Interface);
          break;
        case JavaScriptParser.Package:
          this.enterOuterAlt(localctx, 39);
          this.state = 1010;
          this.match(JavaScriptParser.Package);
          break;
        case JavaScriptParser.Protected:
          this.enterOuterAlt(localctx, 40);
          this.state = 1011;
          this.match(JavaScriptParser.Protected);
          break;
        case JavaScriptParser.Static:
          this.enterOuterAlt(localctx, 41);
          this.state = 1012;
          this.match(JavaScriptParser.Static);
          break;
        case JavaScriptParser.Yield:
          this.enterOuterAlt(localctx, 42);
          this.state = 1013;
          this.match(JavaScriptParser.Yield);
          break;
        case JavaScriptParser.Async:
          this.enterOuterAlt(localctx, 43);
          this.state = 1014;
          this.match(JavaScriptParser.Async);
          break;
        case JavaScriptParser.Await:
          this.enterOuterAlt(localctx, 44);
          this.state = 1015;
          this.match(JavaScriptParser.Await);
          break;
        case JavaScriptParser.From:
          this.enterOuterAlt(localctx, 45);
          this.state = 1016;
          this.match(JavaScriptParser.From);
          break;
        case JavaScriptParser.As:
          this.enterOuterAlt(localctx, 46);
          this.state = 1017;
          this.match(JavaScriptParser.As);
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
  let_() {
    let localctx = new Let_Context(this, this._ctx, this.state);
    this.enterRule(localctx, 150, JavaScriptParser.RULE_let_);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1020;
      _la = this._input.LA(1);
      if (!(_la === JavaScriptParser.StrictLet || _la === JavaScriptParser.NonStrictLet)) {
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
  eos() {
    let localctx = new EosContext(this, this._ctx, this.state);
    this.enterRule(localctx, 152, JavaScriptParser.RULE_eos);
    try {
      this.state = 1026;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 111, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 1022;
          this.match(JavaScriptParser.SemiColon);
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 1023;
          this.match(JavaScriptParser.EOF);
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 1024;
          if (!this.lineTerminatorAhead()) {
            throw new import_antlr4.default.error.FailedPredicateException(this, "this.lineTerminatorAhead()");
          }
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 1025;
          if (!this.closeBrace()) {
            throw new import_antlr4.default.error.FailedPredicateException(this, "this.closeBrace()");
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
JavaScriptParser.EOF = import_antlr4.default.Token.EOF;
JavaScriptParser.HashBangLine = 1;
JavaScriptParser.MultiLineComment = 2;
JavaScriptParser.SingleLineComment = 3;
JavaScriptParser.RegularExpressionLiteral = 4;
JavaScriptParser.OpenBracket = 5;
JavaScriptParser.CloseBracket = 6;
JavaScriptParser.OpenParen = 7;
JavaScriptParser.CloseParen = 8;
JavaScriptParser.OpenBrace = 9;
JavaScriptParser.TemplateCloseBrace = 10;
JavaScriptParser.CloseBrace = 11;
JavaScriptParser.SemiColon = 12;
JavaScriptParser.Comma = 13;
JavaScriptParser.Assign = 14;
JavaScriptParser.QuestionMark = 15;
JavaScriptParser.Colon = 16;
JavaScriptParser.Ellipsis = 17;
JavaScriptParser.Dot = 18;
JavaScriptParser.PlusPlus = 19;
JavaScriptParser.MinusMinus = 20;
JavaScriptParser.Plus = 21;
JavaScriptParser.Minus = 22;
JavaScriptParser.BitNot = 23;
JavaScriptParser.Not = 24;
JavaScriptParser.Multiply = 25;
JavaScriptParser.Divide = 26;
JavaScriptParser.Modulus = 27;
JavaScriptParser.Power = 28;
JavaScriptParser.NullCoalesce = 29;
JavaScriptParser.Hashtag = 30;
JavaScriptParser.RightShiftArithmetic = 31;
JavaScriptParser.LeftShiftArithmetic = 32;
JavaScriptParser.RightShiftLogical = 33;
JavaScriptParser.LessThan = 34;
JavaScriptParser.MoreThan = 35;
JavaScriptParser.LessThanEquals = 36;
JavaScriptParser.GreaterThanEquals = 37;
JavaScriptParser.Equals_ = 38;
JavaScriptParser.NotEquals = 39;
JavaScriptParser.IdentityEquals = 40;
JavaScriptParser.IdentityNotEquals = 41;
JavaScriptParser.BitAnd = 42;
JavaScriptParser.BitXOr = 43;
JavaScriptParser.BitOr = 44;
JavaScriptParser.And = 45;
JavaScriptParser.Or = 46;
JavaScriptParser.MultiplyAssign = 47;
JavaScriptParser.DivideAssign = 48;
JavaScriptParser.ModulusAssign = 49;
JavaScriptParser.PlusAssign = 50;
JavaScriptParser.MinusAssign = 51;
JavaScriptParser.LeftShiftArithmeticAssign = 52;
JavaScriptParser.RightShiftArithmeticAssign = 53;
JavaScriptParser.RightShiftLogicalAssign = 54;
JavaScriptParser.BitAndAssign = 55;
JavaScriptParser.BitXorAssign = 56;
JavaScriptParser.BitOrAssign = 57;
JavaScriptParser.PowerAssign = 58;
JavaScriptParser.ARROW = 59;
JavaScriptParser.NullLiteral = 60;
JavaScriptParser.BooleanLiteral = 61;
JavaScriptParser.DecimalLiteral = 62;
JavaScriptParser.HexIntegerLiteral = 63;
JavaScriptParser.OctalIntegerLiteral = 64;
JavaScriptParser.OctalIntegerLiteral2 = 65;
JavaScriptParser.BinaryIntegerLiteral = 66;
JavaScriptParser.BigHexIntegerLiteral = 67;
JavaScriptParser.BigOctalIntegerLiteral = 68;
JavaScriptParser.BigBinaryIntegerLiteral = 69;
JavaScriptParser.BigDecimalIntegerLiteral = 70;
JavaScriptParser.Break = 71;
JavaScriptParser.Do = 72;
JavaScriptParser.Instanceof = 73;
JavaScriptParser.Typeof = 74;
JavaScriptParser.Case = 75;
JavaScriptParser.Else = 76;
JavaScriptParser.New = 77;
JavaScriptParser.Var = 78;
JavaScriptParser.Catch = 79;
JavaScriptParser.Finally = 80;
JavaScriptParser.Return = 81;
JavaScriptParser.Void = 82;
JavaScriptParser.Continue = 83;
JavaScriptParser.For = 84;
JavaScriptParser.Switch = 85;
JavaScriptParser.While = 86;
JavaScriptParser.Debugger = 87;
JavaScriptParser.Function_ = 88;
JavaScriptParser.This = 89;
JavaScriptParser.With = 90;
JavaScriptParser.Default = 91;
JavaScriptParser.If = 92;
JavaScriptParser.Throw = 93;
JavaScriptParser.Delete = 94;
JavaScriptParser.In = 95;
JavaScriptParser.Try = 96;
JavaScriptParser.As = 97;
JavaScriptParser.From = 98;
JavaScriptParser.Class = 99;
JavaScriptParser.Enum = 100;
JavaScriptParser.Extends = 101;
JavaScriptParser.Super = 102;
JavaScriptParser.Const = 103;
JavaScriptParser.Export = 104;
JavaScriptParser.Import = 105;
JavaScriptParser.Async = 106;
JavaScriptParser.Await = 107;
JavaScriptParser.Implements = 108;
JavaScriptParser.StrictLet = 109;
JavaScriptParser.NonStrictLet = 110;
JavaScriptParser.Private = 111;
JavaScriptParser.Public = 112;
JavaScriptParser.Interface = 113;
JavaScriptParser.Package = 114;
JavaScriptParser.Protected = 115;
JavaScriptParser.Static = 116;
JavaScriptParser.Yield = 117;
JavaScriptParser.Identifier = 118;
JavaScriptParser.StringLiteral = 119;
JavaScriptParser.BackTick = 120;
JavaScriptParser.WhiteSpaces = 121;
JavaScriptParser.LineTerminator = 122;
JavaScriptParser.HtmlComment = 123;
JavaScriptParser.CDataComment = 124;
JavaScriptParser.UnexpectedCharacter = 125;
JavaScriptParser.TemplateStringStartExpression = 126;
JavaScriptParser.TemplateStringAtom = 127;
JavaScriptParser.RULE_program = 0;
JavaScriptParser.RULE_sourceElement = 1;
JavaScriptParser.RULE_statement = 2;
JavaScriptParser.RULE_block = 3;
JavaScriptParser.RULE_statementList = 4;
JavaScriptParser.RULE_importStatement = 5;
JavaScriptParser.RULE_importFromBlock = 6;
JavaScriptParser.RULE_moduleItems = 7;
JavaScriptParser.RULE_importDefault = 8;
JavaScriptParser.RULE_importNamespace = 9;
JavaScriptParser.RULE_importFrom = 10;
JavaScriptParser.RULE_aliasName = 11;
JavaScriptParser.RULE_exportStatement = 12;
JavaScriptParser.RULE_exportFromBlock = 13;
JavaScriptParser.RULE_declaration = 14;
JavaScriptParser.RULE_variableStatement = 15;
JavaScriptParser.RULE_variableDeclarationList = 16;
JavaScriptParser.RULE_variableDeclaration = 17;
JavaScriptParser.RULE_emptyStatement_ = 18;
JavaScriptParser.RULE_expressionStatement = 19;
JavaScriptParser.RULE_ifStatement = 20;
JavaScriptParser.RULE_iterationStatement = 21;
JavaScriptParser.RULE_varModifier = 22;
JavaScriptParser.RULE_continueStatement = 23;
JavaScriptParser.RULE_breakStatement = 24;
JavaScriptParser.RULE_returnStatement = 25;
JavaScriptParser.RULE_yieldStatement = 26;
JavaScriptParser.RULE_withStatement = 27;
JavaScriptParser.RULE_switchStatement = 28;
JavaScriptParser.RULE_caseBlock = 29;
JavaScriptParser.RULE_caseClauses = 30;
JavaScriptParser.RULE_caseClause = 31;
JavaScriptParser.RULE_defaultClause = 32;
JavaScriptParser.RULE_labelledStatement = 33;
JavaScriptParser.RULE_throwStatement = 34;
JavaScriptParser.RULE_tryStatement = 35;
JavaScriptParser.RULE_catchProduction = 36;
JavaScriptParser.RULE_finallyProduction = 37;
JavaScriptParser.RULE_debuggerStatement = 38;
JavaScriptParser.RULE_functionDeclaration = 39;
JavaScriptParser.RULE_classDeclaration = 40;
JavaScriptParser.RULE_classTail = 41;
JavaScriptParser.RULE_classElement = 42;
JavaScriptParser.RULE_methodDefinition = 43;
JavaScriptParser.RULE_formalParameterList = 44;
JavaScriptParser.RULE_formalParameterArg = 45;
JavaScriptParser.RULE_lastFormalParameterArg = 46;
JavaScriptParser.RULE_functionBody = 47;
JavaScriptParser.RULE_sourceElements = 48;
JavaScriptParser.RULE_arrayLiteral = 49;
JavaScriptParser.RULE_elementList = 50;
JavaScriptParser.RULE_arrayElement = 51;
JavaScriptParser.RULE_propertyAssignment = 52;
JavaScriptParser.RULE_propertyName = 53;
JavaScriptParser.RULE_arguments = 54;
JavaScriptParser.RULE_argument = 55;
JavaScriptParser.RULE_expressionSequence = 56;
JavaScriptParser.RULE_singleExpression = 57;
JavaScriptParser.RULE_assignable = 58;
JavaScriptParser.RULE_objectLiteral = 59;
JavaScriptParser.RULE_anonymousFunction = 60;
JavaScriptParser.RULE_arrowFunctionParameters = 61;
JavaScriptParser.RULE_arrowFunctionBody = 62;
JavaScriptParser.RULE_assignmentOperator = 63;
JavaScriptParser.RULE_literal = 64;
JavaScriptParser.RULE_templateStringLiteral = 65;
JavaScriptParser.RULE_templateStringAtom = 66;
JavaScriptParser.RULE_numericLiteral = 67;
JavaScriptParser.RULE_bigintLiteral = 68;
JavaScriptParser.RULE_getter = 69;
JavaScriptParser.RULE_setter = 70;
JavaScriptParser.RULE_identifierName = 71;
JavaScriptParser.RULE_identifier = 72;
JavaScriptParser.RULE_reservedWord = 73;
JavaScriptParser.RULE_keyword = 74;
JavaScriptParser.RULE_let_ = 75;
JavaScriptParser.RULE_eos = 76;
class ProgramContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_program;
  }
  EOF() {
    return this.getToken(JavaScriptParser.EOF, 0);
  }
  HashBangLine() {
    return this.getToken(JavaScriptParser.HashBangLine, 0);
  }
  sourceElements() {
    return this.getTypedRuleContext(SourceElementsContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterProgram(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitProgram(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitProgram(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SourceElementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_sourceElement;
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterSourceElement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitSourceElement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitSourceElement(this);
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
    this.ruleIndex = JavaScriptParser.RULE_statement;
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  variableStatement() {
    return this.getTypedRuleContext(VariableStatementContext, 0);
  }
  importStatement() {
    return this.getTypedRuleContext(ImportStatementContext, 0);
  }
  exportStatement() {
    return this.getTypedRuleContext(ExportStatementContext, 0);
  }
  emptyStatement_() {
    return this.getTypedRuleContext(EmptyStatement_Context, 0);
  }
  classDeclaration() {
    return this.getTypedRuleContext(ClassDeclarationContext, 0);
  }
  expressionStatement() {
    return this.getTypedRuleContext(ExpressionStatementContext, 0);
  }
  ifStatement() {
    return this.getTypedRuleContext(IfStatementContext, 0);
  }
  iterationStatement() {
    return this.getTypedRuleContext(IterationStatementContext, 0);
  }
  continueStatement() {
    return this.getTypedRuleContext(ContinueStatementContext, 0);
  }
  breakStatement() {
    return this.getTypedRuleContext(BreakStatementContext, 0);
  }
  returnStatement() {
    return this.getTypedRuleContext(ReturnStatementContext, 0);
  }
  yieldStatement() {
    return this.getTypedRuleContext(YieldStatementContext, 0);
  }
  withStatement() {
    return this.getTypedRuleContext(WithStatementContext, 0);
  }
  labelledStatement() {
    return this.getTypedRuleContext(LabelledStatementContext, 0);
  }
  switchStatement() {
    return this.getTypedRuleContext(SwitchStatementContext, 0);
  }
  throwStatement() {
    return this.getTypedRuleContext(ThrowStatementContext, 0);
  }
  tryStatement() {
    return this.getTypedRuleContext(TryStatementContext, 0);
  }
  debuggerStatement() {
    return this.getTypedRuleContext(DebuggerStatementContext, 0);
  }
  functionDeclaration() {
    return this.getTypedRuleContext(FunctionDeclarationContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitStatement(this);
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
    this.ruleIndex = JavaScriptParser.RULE_block;
  }
  OpenBrace() {
    return this.getToken(JavaScriptParser.OpenBrace, 0);
  }
  CloseBrace() {
    return this.getToken(JavaScriptParser.CloseBrace, 0);
  }
  statementList() {
    return this.getTypedRuleContext(StatementListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBlock(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBlock(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
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
    this.ruleIndex = JavaScriptParser.RULE_statementList;
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
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterStatementList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitStatementList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitStatementList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_importStatement;
  }
  Import() {
    return this.getToken(JavaScriptParser.Import, 0);
  }
  importFromBlock() {
    return this.getTypedRuleContext(ImportFromBlockContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterImportStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitImportStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitImportStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportFromBlockContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_importFromBlock;
  }
  importFrom() {
    return this.getTypedRuleContext(ImportFromContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  importNamespace() {
    return this.getTypedRuleContext(ImportNamespaceContext, 0);
  }
  moduleItems() {
    return this.getTypedRuleContext(ModuleItemsContext, 0);
  }
  importDefault() {
    return this.getTypedRuleContext(ImportDefaultContext, 0);
  }
  StringLiteral() {
    return this.getToken(JavaScriptParser.StringLiteral, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterImportFromBlock(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitImportFromBlock(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitImportFromBlock(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ModuleItemsContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_moduleItems;
  }
  OpenBrace() {
    return this.getToken(JavaScriptParser.OpenBrace, 0);
  }
  CloseBrace() {
    return this.getToken(JavaScriptParser.CloseBrace, 0);
  }
  aliasName = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(AliasNameContext);
    } else {
      return this.getTypedRuleContext(AliasNameContext, i);
    }
  };
  Comma = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Comma);
    } else {
      return this.getToken(JavaScriptParser.Comma, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterModuleItems(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitModuleItems(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitModuleItems(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportDefaultContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_importDefault;
  }
  aliasName() {
    return this.getTypedRuleContext(AliasNameContext, 0);
  }
  Comma() {
    return this.getToken(JavaScriptParser.Comma, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterImportDefault(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitImportDefault(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitImportDefault(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportNamespaceContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_importNamespace;
  }
  Multiply() {
    return this.getToken(JavaScriptParser.Multiply, 0);
  }
  identifierName = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(IdentifierNameContext);
    } else {
      return this.getTypedRuleContext(IdentifierNameContext, i);
    }
  };
  As() {
    return this.getToken(JavaScriptParser.As, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterImportNamespace(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitImportNamespace(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitImportNamespace(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ImportFromContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_importFrom;
  }
  From() {
    return this.getToken(JavaScriptParser.From, 0);
  }
  StringLiteral() {
    return this.getToken(JavaScriptParser.StringLiteral, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterImportFrom(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitImportFrom(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitImportFrom(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class AliasNameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_aliasName;
  }
  identifierName = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(IdentifierNameContext);
    } else {
      return this.getTypedRuleContext(IdentifierNameContext, i);
    }
  };
  As() {
    return this.getToken(JavaScriptParser.As, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAliasName(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAliasName(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAliasName(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExportStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_exportStatement;
  }
  copyFrom(ctx) {
    super.copyFrom(ctx);
  }
}
class ExportDefaultDeclarationContext extends ExportStatementContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Export() {
    return this.getToken(JavaScriptParser.Export, 0);
  }
  Default() {
    return this.getToken(JavaScriptParser.Default, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterExportDefaultDeclaration(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitExportDefaultDeclaration(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitExportDefaultDeclaration(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ExportDefaultDeclarationContext = ExportDefaultDeclarationContext;
class ExportDeclarationContext extends ExportStatementContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Export() {
    return this.getToken(JavaScriptParser.Export, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  exportFromBlock() {
    return this.getTypedRuleContext(ExportFromBlockContext, 0);
  }
  declaration() {
    return this.getTypedRuleContext(DeclarationContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterExportDeclaration(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitExportDeclaration(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitExportDeclaration(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ExportDeclarationContext = ExportDeclarationContext;
class ExportFromBlockContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_exportFromBlock;
  }
  importNamespace() {
    return this.getTypedRuleContext(ImportNamespaceContext, 0);
  }
  importFrom() {
    return this.getTypedRuleContext(ImportFromContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  moduleItems() {
    return this.getTypedRuleContext(ModuleItemsContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterExportFromBlock(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitExportFromBlock(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitExportFromBlock(this);
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
    this.ruleIndex = JavaScriptParser.RULE_declaration;
  }
  variableStatement() {
    return this.getTypedRuleContext(VariableStatementContext, 0);
  }
  classDeclaration() {
    return this.getTypedRuleContext(ClassDeclarationContext, 0);
  }
  functionDeclaration() {
    return this.getTypedRuleContext(FunctionDeclarationContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterDeclaration(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitDeclaration(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitDeclaration(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class VariableStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_variableStatement;
  }
  variableDeclarationList() {
    return this.getTypedRuleContext(VariableDeclarationListContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterVariableStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitVariableStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitVariableStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class VariableDeclarationListContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_variableDeclarationList;
  }
  varModifier() {
    return this.getTypedRuleContext(VarModifierContext, 0);
  }
  variableDeclaration = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(VariableDeclarationContext);
    } else {
      return this.getTypedRuleContext(VariableDeclarationContext, i);
    }
  };
  Comma = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Comma);
    } else {
      return this.getToken(JavaScriptParser.Comma, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterVariableDeclarationList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitVariableDeclarationList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitVariableDeclarationList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class VariableDeclarationContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_variableDeclaration;
  }
  assignable() {
    return this.getTypedRuleContext(AssignableContext, 0);
  }
  Assign() {
    return this.getToken(JavaScriptParser.Assign, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterVariableDeclaration(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitVariableDeclaration(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitVariableDeclaration(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class EmptyStatement_Context extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_emptyStatement_;
  }
  SemiColon() {
    return this.getToken(JavaScriptParser.SemiColon, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterEmptyStatement_(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitEmptyStatement_(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitEmptyStatement_(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExpressionStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_expressionStatement;
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterExpressionStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitExpressionStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitExpressionStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IfStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_ifStatement;
  }
  If() {
    return this.getToken(JavaScriptParser.If, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
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
  Else() {
    return this.getToken(JavaScriptParser.Else, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterIfStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitIfStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitIfStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IterationStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_iterationStatement;
  }
  copyFrom(ctx) {
    super.copyFrom(ctx);
  }
}
class DoStatementContext extends IterationStatementContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Do() {
    return this.getToken(JavaScriptParser.Do, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  While() {
    return this.getToken(JavaScriptParser.While, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterDoStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitDoStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitDoStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.DoStatementContext = DoStatementContext;
class WhileStatementContext extends IterationStatementContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  While() {
    return this.getToken(JavaScriptParser.While, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterWhileStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitWhileStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitWhileStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.WhileStatementContext = WhileStatementContext;
class ForStatementContext extends IterationStatementContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  For() {
    return this.getToken(JavaScriptParser.For, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  SemiColon = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.SemiColon);
    } else {
      return this.getToken(JavaScriptParser.SemiColon, i);
    }
  };
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  expressionSequence = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExpressionSequenceContext);
    } else {
      return this.getTypedRuleContext(ExpressionSequenceContext, i);
    }
  };
  variableDeclarationList() {
    return this.getTypedRuleContext(VariableDeclarationListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterForStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitForStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitForStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ForStatementContext = ForStatementContext;
class ForInStatementContext extends IterationStatementContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  For() {
    return this.getToken(JavaScriptParser.For, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  In() {
    return this.getToken(JavaScriptParser.In, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  variableDeclarationList() {
    return this.getTypedRuleContext(VariableDeclarationListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterForInStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitForInStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitForInStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ForInStatementContext = ForInStatementContext;
class ForOfStatementContext extends IterationStatementContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  For() {
    return this.getToken(JavaScriptParser.For, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  variableDeclarationList() {
    return this.getTypedRuleContext(VariableDeclarationListContext, 0);
  }
  Await() {
    return this.getToken(JavaScriptParser.Await, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterForOfStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitForOfStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitForOfStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ForOfStatementContext = ForOfStatementContext;
class VarModifierContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_varModifier;
  }
  Var() {
    return this.getToken(JavaScriptParser.Var, 0);
  }
  let_() {
    return this.getTypedRuleContext(Let_Context, 0);
  }
  Const() {
    return this.getToken(JavaScriptParser.Const, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterVarModifier(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitVarModifier(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitVarModifier(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ContinueStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_continueStatement;
  }
  Continue() {
    return this.getToken(JavaScriptParser.Continue, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterContinueStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitContinueStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitContinueStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class BreakStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_breakStatement;
  }
  Break() {
    return this.getToken(JavaScriptParser.Break, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBreakStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBreakStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitBreakStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ReturnStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_returnStatement;
  }
  Return() {
    return this.getToken(JavaScriptParser.Return, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterReturnStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitReturnStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitReturnStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class YieldStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_yieldStatement;
  }
  Yield() {
    return this.getToken(JavaScriptParser.Yield, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterYieldStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitYieldStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitYieldStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class WithStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_withStatement;
  }
  With() {
    return this.getToken(JavaScriptParser.With, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterWithStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitWithStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitWithStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SwitchStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_switchStatement;
  }
  Switch() {
    return this.getToken(JavaScriptParser.Switch, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  caseBlock() {
    return this.getTypedRuleContext(CaseBlockContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterSwitchStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitSwitchStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitSwitchStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class CaseBlockContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_caseBlock;
  }
  OpenBrace() {
    return this.getToken(JavaScriptParser.OpenBrace, 0);
  }
  CloseBrace() {
    return this.getToken(JavaScriptParser.CloseBrace, 0);
  }
  caseClauses = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(CaseClausesContext);
    } else {
      return this.getTypedRuleContext(CaseClausesContext, i);
    }
  };
  defaultClause() {
    return this.getTypedRuleContext(DefaultClauseContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterCaseBlock(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitCaseBlock(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitCaseBlock(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class CaseClausesContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_caseClauses;
  }
  caseClause = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(CaseClauseContext);
    } else {
      return this.getTypedRuleContext(CaseClauseContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterCaseClauses(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitCaseClauses(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitCaseClauses(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class CaseClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_caseClause;
  }
  Case() {
    return this.getToken(JavaScriptParser.Case, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  Colon() {
    return this.getToken(JavaScriptParser.Colon, 0);
  }
  statementList() {
    return this.getTypedRuleContext(StatementListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterCaseClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitCaseClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitCaseClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DefaultClauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_defaultClause;
  }
  Default() {
    return this.getToken(JavaScriptParser.Default, 0);
  }
  Colon() {
    return this.getToken(JavaScriptParser.Colon, 0);
  }
  statementList() {
    return this.getTypedRuleContext(StatementListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterDefaultClause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitDefaultClause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitDefaultClause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class LabelledStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_labelledStatement;
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  Colon() {
    return this.getToken(JavaScriptParser.Colon, 0);
  }
  statement() {
    return this.getTypedRuleContext(StatementContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterLabelledStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitLabelledStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitLabelledStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ThrowStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_throwStatement;
  }
  Throw() {
    return this.getToken(JavaScriptParser.Throw, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterThrowStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitThrowStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitThrowStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TryStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_tryStatement;
  }
  Try() {
    return this.getToken(JavaScriptParser.Try, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  catchProduction() {
    return this.getTypedRuleContext(CatchProductionContext, 0);
  }
  finallyProduction() {
    return this.getTypedRuleContext(FinallyProductionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterTryStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitTryStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitTryStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class CatchProductionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_catchProduction;
  }
  Catch() {
    return this.getToken(JavaScriptParser.Catch, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  assignable() {
    return this.getTypedRuleContext(AssignableContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterCatchProduction(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitCatchProduction(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitCatchProduction(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FinallyProductionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_finallyProduction;
  }
  Finally() {
    return this.getToken(JavaScriptParser.Finally, 0);
  }
  block() {
    return this.getTypedRuleContext(BlockContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFinallyProduction(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFinallyProduction(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFinallyProduction(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DebuggerStatementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_debuggerStatement;
  }
  Debugger() {
    return this.getToken(JavaScriptParser.Debugger, 0);
  }
  eos() {
    return this.getTypedRuleContext(EosContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterDebuggerStatement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitDebuggerStatement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitDebuggerStatement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FunctionDeclarationContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_functionDeclaration;
  }
  Function_() {
    return this.getToken(JavaScriptParser.Function_, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  functionBody() {
    return this.getTypedRuleContext(FunctionBodyContext, 0);
  }
  Async() {
    return this.getToken(JavaScriptParser.Async, 0);
  }
  Multiply() {
    return this.getToken(JavaScriptParser.Multiply, 0);
  }
  formalParameterList() {
    return this.getTypedRuleContext(FormalParameterListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFunctionDeclaration(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFunctionDeclaration(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFunctionDeclaration(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ClassDeclarationContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_classDeclaration;
  }
  Class() {
    return this.getToken(JavaScriptParser.Class, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  classTail() {
    return this.getTypedRuleContext(ClassTailContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterClassDeclaration(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitClassDeclaration(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitClassDeclaration(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ClassTailContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_classTail;
  }
  OpenBrace() {
    return this.getToken(JavaScriptParser.OpenBrace, 0);
  }
  CloseBrace() {
    return this.getToken(JavaScriptParser.CloseBrace, 0);
  }
  Extends() {
    return this.getToken(JavaScriptParser.Extends, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  classElement = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ClassElementContext);
    } else {
      return this.getTypedRuleContext(ClassElementContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterClassTail(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitClassTail(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitClassTail(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ClassElementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_classElement;
  }
  methodDefinition() {
    return this.getTypedRuleContext(MethodDefinitionContext, 0);
  }
  assignable() {
    return this.getTypedRuleContext(AssignableContext, 0);
  }
  Assign() {
    return this.getToken(JavaScriptParser.Assign, 0);
  }
  objectLiteral() {
    return this.getTypedRuleContext(ObjectLiteralContext, 0);
  }
  SemiColon() {
    return this.getToken(JavaScriptParser.SemiColon, 0);
  }
  Static = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Static);
    } else {
      return this.getToken(JavaScriptParser.Static, i);
    }
  };
  identifier = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(IdentifierContext);
    } else {
      return this.getTypedRuleContext(IdentifierContext, i);
    }
  };
  Async = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Async);
    } else {
      return this.getToken(JavaScriptParser.Async, i);
    }
  };
  emptyStatement_() {
    return this.getTypedRuleContext(EmptyStatement_Context, 0);
  }
  propertyName() {
    return this.getTypedRuleContext(PropertyNameContext, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  Hashtag() {
    return this.getToken(JavaScriptParser.Hashtag, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterClassElement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitClassElement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitClassElement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class MethodDefinitionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_methodDefinition;
  }
  propertyName() {
    return this.getTypedRuleContext(PropertyNameContext, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  functionBody() {
    return this.getTypedRuleContext(FunctionBodyContext, 0);
  }
  Multiply() {
    return this.getToken(JavaScriptParser.Multiply, 0);
  }
  Hashtag() {
    return this.getToken(JavaScriptParser.Hashtag, 0);
  }
  formalParameterList() {
    return this.getTypedRuleContext(FormalParameterListContext, 0);
  }
  getter() {
    return this.getTypedRuleContext(GetterContext, 0);
  }
  setter() {
    return this.getTypedRuleContext(SetterContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterMethodDefinition(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitMethodDefinition(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitMethodDefinition(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FormalParameterListContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_formalParameterList;
  }
  formalParameterArg = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(FormalParameterArgContext);
    } else {
      return this.getTypedRuleContext(FormalParameterArgContext, i);
    }
  };
  Comma = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Comma);
    } else {
      return this.getToken(JavaScriptParser.Comma, i);
    }
  };
  lastFormalParameterArg() {
    return this.getTypedRuleContext(LastFormalParameterArgContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFormalParameterList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFormalParameterList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFormalParameterList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FormalParameterArgContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_formalParameterArg;
  }
  assignable() {
    return this.getTypedRuleContext(AssignableContext, 0);
  }
  Assign() {
    return this.getToken(JavaScriptParser.Assign, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFormalParameterArg(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFormalParameterArg(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFormalParameterArg(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class LastFormalParameterArgContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_lastFormalParameterArg;
  }
  Ellipsis() {
    return this.getToken(JavaScriptParser.Ellipsis, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterLastFormalParameterArg(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitLastFormalParameterArg(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitLastFormalParameterArg(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FunctionBodyContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_functionBody;
  }
  OpenBrace() {
    return this.getToken(JavaScriptParser.OpenBrace, 0);
  }
  CloseBrace() {
    return this.getToken(JavaScriptParser.CloseBrace, 0);
  }
  sourceElements() {
    return this.getTypedRuleContext(SourceElementsContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFunctionBody(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFunctionBody(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFunctionBody(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SourceElementsContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_sourceElements;
  }
  sourceElement = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SourceElementContext);
    } else {
      return this.getTypedRuleContext(SourceElementContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterSourceElements(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitSourceElements(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitSourceElements(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArrayLiteralContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_arrayLiteral;
  }
  OpenBracket() {
    return this.getToken(JavaScriptParser.OpenBracket, 0);
  }
  elementList() {
    return this.getTypedRuleContext(ElementListContext, 0);
  }
  CloseBracket() {
    return this.getToken(JavaScriptParser.CloseBracket, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArrayLiteral(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArrayLiteral(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArrayLiteral(this);
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
    this.ruleIndex = JavaScriptParser.RULE_elementList;
  }
  Comma = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Comma);
    } else {
      return this.getToken(JavaScriptParser.Comma, i);
    }
  };
  arrayElement = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ArrayElementContext);
    } else {
      return this.getTypedRuleContext(ArrayElementContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterElementList(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitElementList(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitElementList(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArrayElementContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_arrayElement;
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  Ellipsis() {
    return this.getToken(JavaScriptParser.Ellipsis, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArrayElement(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArrayElement(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArrayElement(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class PropertyAssignmentContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_propertyAssignment;
  }
  copyFrom(ctx) {
    super.copyFrom(ctx);
  }
}
class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  propertyName() {
    return this.getTypedRuleContext(PropertyNameContext, 0);
  }
  Colon() {
    return this.getToken(JavaScriptParser.Colon, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPropertyExpressionAssignment(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPropertyExpressionAssignment(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPropertyExpressionAssignment(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PropertyExpressionAssignmentContext = PropertyExpressionAssignmentContext;
class ComputedPropertyExpressionAssignmentContext extends PropertyAssignmentContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  OpenBracket() {
    return this.getToken(JavaScriptParser.OpenBracket, 0);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  CloseBracket() {
    return this.getToken(JavaScriptParser.CloseBracket, 0);
  }
  Colon() {
    return this.getToken(JavaScriptParser.Colon, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterComputedPropertyExpressionAssignment(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitComputedPropertyExpressionAssignment(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitComputedPropertyExpressionAssignment(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ComputedPropertyExpressionAssignmentContext = ComputedPropertyExpressionAssignmentContext;
class PropertyShorthandContext extends PropertyAssignmentContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  Ellipsis() {
    return this.getToken(JavaScriptParser.Ellipsis, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPropertyShorthand(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPropertyShorthand(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPropertyShorthand(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PropertyShorthandContext = PropertyShorthandContext;
class PropertySetterContext extends PropertyAssignmentContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  setter() {
    return this.getTypedRuleContext(SetterContext, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  formalParameterArg() {
    return this.getTypedRuleContext(FormalParameterArgContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  functionBody() {
    return this.getTypedRuleContext(FunctionBodyContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPropertySetter(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPropertySetter(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPropertySetter(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PropertySetterContext = PropertySetterContext;
class PropertyGetterContext extends PropertyAssignmentContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  getter() {
    return this.getTypedRuleContext(GetterContext, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  functionBody() {
    return this.getTypedRuleContext(FunctionBodyContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPropertyGetter(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPropertyGetter(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPropertyGetter(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PropertyGetterContext = PropertyGetterContext;
class FunctionPropertyContext extends PropertyAssignmentContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  propertyName() {
    return this.getTypedRuleContext(PropertyNameContext, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  functionBody() {
    return this.getTypedRuleContext(FunctionBodyContext, 0);
  }
  Async() {
    return this.getToken(JavaScriptParser.Async, 0);
  }
  Multiply() {
    return this.getToken(JavaScriptParser.Multiply, 0);
  }
  formalParameterList() {
    return this.getTypedRuleContext(FormalParameterListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFunctionProperty(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFunctionProperty(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFunctionProperty(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.FunctionPropertyContext = FunctionPropertyContext;
class PropertyNameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_propertyName;
  }
  identifierName() {
    return this.getTypedRuleContext(IdentifierNameContext, 0);
  }
  StringLiteral() {
    return this.getToken(JavaScriptParser.StringLiteral, 0);
  }
  numericLiteral() {
    return this.getTypedRuleContext(NumericLiteralContext, 0);
  }
  OpenBracket() {
    return this.getToken(JavaScriptParser.OpenBracket, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  CloseBracket() {
    return this.getToken(JavaScriptParser.CloseBracket, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPropertyName(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPropertyName(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPropertyName(this);
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
    this.ruleIndex = JavaScriptParser.RULE_arguments;
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  argument = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ArgumentContext);
    } else {
      return this.getTypedRuleContext(ArgumentContext, i);
    }
  };
  Comma = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Comma);
    } else {
      return this.getToken(JavaScriptParser.Comma, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArguments(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArguments(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArguments(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArgumentContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_argument;
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  Ellipsis() {
    return this.getToken(JavaScriptParser.Ellipsis, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArgument(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArgument(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArgument(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExpressionSequenceContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_expressionSequence;
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Comma = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Comma);
    } else {
      return this.getToken(JavaScriptParser.Comma, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterExpressionSequence(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitExpressionSequence(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitExpressionSequence(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SingleExpressionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_singleExpression;
  }
  copyFrom(ctx) {
    super.copyFrom(ctx);
  }
}
class TemplateStringExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  templateStringLiteral() {
    return this.getTypedRuleContext(TemplateStringLiteralContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterTemplateStringExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitTemplateStringExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitTemplateStringExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.TemplateStringExpressionContext = TemplateStringExpressionContext;
class TernaryExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  QuestionMark() {
    return this.getToken(JavaScriptParser.QuestionMark, 0);
  }
  Colon() {
    return this.getToken(JavaScriptParser.Colon, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterTernaryExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitTernaryExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitTernaryExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.TernaryExpressionContext = TernaryExpressionContext;
class LogicalAndExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  And() {
    return this.getToken(JavaScriptParser.And, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterLogicalAndExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitLogicalAndExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitLogicalAndExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.LogicalAndExpressionContext = LogicalAndExpressionContext;
class PowerExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Power() {
    return this.getToken(JavaScriptParser.Power, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPowerExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPowerExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPowerExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PowerExpressionContext = PowerExpressionContext;
class PreIncrementExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  PlusPlus() {
    return this.getToken(JavaScriptParser.PlusPlus, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPreIncrementExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPreIncrementExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPreIncrementExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PreIncrementExpressionContext = PreIncrementExpressionContext;
class ObjectLiteralExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  objectLiteral() {
    return this.getTypedRuleContext(ObjectLiteralContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterObjectLiteralExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitObjectLiteralExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitObjectLiteralExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ObjectLiteralExpressionContext = ObjectLiteralExpressionContext;
class MetaExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  New() {
    return this.getToken(JavaScriptParser.New, 0);
  }
  Dot() {
    return this.getToken(JavaScriptParser.Dot, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterMetaExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitMetaExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitMetaExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.MetaExpressionContext = MetaExpressionContext;
class InExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  In() {
    return this.getToken(JavaScriptParser.In, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterInExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitInExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitInExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.InExpressionContext = InExpressionContext;
class LogicalOrExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Or() {
    return this.getToken(JavaScriptParser.Or, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterLogicalOrExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitLogicalOrExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitLogicalOrExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.LogicalOrExpressionContext = LogicalOrExpressionContext;
class NotExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Not() {
    return this.getToken(JavaScriptParser.Not, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterNotExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitNotExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitNotExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.NotExpressionContext = NotExpressionContext;
class PreDecreaseExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  MinusMinus() {
    return this.getToken(JavaScriptParser.MinusMinus, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPreDecreaseExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPreDecreaseExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPreDecreaseExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PreDecreaseExpressionContext = PreDecreaseExpressionContext;
class ArgumentsExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  arguments() {
    return this.getTypedRuleContext(ArgumentsContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArgumentsExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArgumentsExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArgumentsExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ArgumentsExpressionContext = ArgumentsExpressionContext;
class AwaitExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Await() {
    return this.getToken(JavaScriptParser.Await, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAwaitExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAwaitExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAwaitExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.AwaitExpressionContext = AwaitExpressionContext;
class ThisExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  This() {
    return this.getToken(JavaScriptParser.This, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterThisExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitThisExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitThisExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ThisExpressionContext = ThisExpressionContext;
class FunctionExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  anonymousFunction() {
    return this.getTypedRuleContext(AnonymousFunctionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFunctionExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFunctionExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFunctionExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.FunctionExpressionContext = FunctionExpressionContext;
class UnaryMinusExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Minus() {
    return this.getToken(JavaScriptParser.Minus, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterUnaryMinusExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitUnaryMinusExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitUnaryMinusExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.UnaryMinusExpressionContext = UnaryMinusExpressionContext;
class AssignmentExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Assign() {
    return this.getToken(JavaScriptParser.Assign, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAssignmentExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAssignmentExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAssignmentExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.AssignmentExpressionContext = AssignmentExpressionContext;
class PostDecreaseExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  MinusMinus() {
    return this.getToken(JavaScriptParser.MinusMinus, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPostDecreaseExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPostDecreaseExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPostDecreaseExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PostDecreaseExpressionContext = PostDecreaseExpressionContext;
class TypeofExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Typeof() {
    return this.getToken(JavaScriptParser.Typeof, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterTypeofExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitTypeofExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitTypeofExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.TypeofExpressionContext = TypeofExpressionContext;
class InstanceofExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Instanceof() {
    return this.getToken(JavaScriptParser.Instanceof, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterInstanceofExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitInstanceofExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitInstanceofExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.InstanceofExpressionContext = InstanceofExpressionContext;
class UnaryPlusExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Plus() {
    return this.getToken(JavaScriptParser.Plus, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterUnaryPlusExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitUnaryPlusExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitUnaryPlusExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.UnaryPlusExpressionContext = UnaryPlusExpressionContext;
class DeleteExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Delete() {
    return this.getToken(JavaScriptParser.Delete, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterDeleteExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitDeleteExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitDeleteExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.DeleteExpressionContext = DeleteExpressionContext;
class ImportExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Import() {
    return this.getToken(JavaScriptParser.Import, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterImportExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitImportExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitImportExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ImportExpressionContext = ImportExpressionContext;
class EqualityExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Equals_() {
    return this.getToken(JavaScriptParser.Equals_, 0);
  }
  NotEquals() {
    return this.getToken(JavaScriptParser.NotEquals, 0);
  }
  IdentityEquals() {
    return this.getToken(JavaScriptParser.IdentityEquals, 0);
  }
  IdentityNotEquals() {
    return this.getToken(JavaScriptParser.IdentityNotEquals, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterEqualityExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitEqualityExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitEqualityExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.EqualityExpressionContext = EqualityExpressionContext;
class BitXOrExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  BitXOr() {
    return this.getToken(JavaScriptParser.BitXOr, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBitXOrExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBitXOrExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitBitXOrExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.BitXOrExpressionContext = BitXOrExpressionContext;
class SuperExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Super() {
    return this.getToken(JavaScriptParser.Super, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterSuperExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitSuperExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitSuperExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.SuperExpressionContext = SuperExpressionContext;
class MultiplicativeExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Multiply() {
    return this.getToken(JavaScriptParser.Multiply, 0);
  }
  Divide() {
    return this.getToken(JavaScriptParser.Divide, 0);
  }
  Modulus() {
    return this.getToken(JavaScriptParser.Modulus, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterMultiplicativeExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitMultiplicativeExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitMultiplicativeExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.MultiplicativeExpressionContext = MultiplicativeExpressionContext;
class BitShiftExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  LeftShiftArithmetic() {
    return this.getToken(JavaScriptParser.LeftShiftArithmetic, 0);
  }
  RightShiftArithmetic() {
    return this.getToken(JavaScriptParser.RightShiftArithmetic, 0);
  }
  RightShiftLogical() {
    return this.getToken(JavaScriptParser.RightShiftLogical, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBitShiftExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBitShiftExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitBitShiftExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.BitShiftExpressionContext = BitShiftExpressionContext;
class ParenthesizedExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterParenthesizedExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitParenthesizedExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitParenthesizedExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ParenthesizedExpressionContext = ParenthesizedExpressionContext;
class AdditiveExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  Plus() {
    return this.getToken(JavaScriptParser.Plus, 0);
  }
  Minus() {
    return this.getToken(JavaScriptParser.Minus, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAdditiveExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAdditiveExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAdditiveExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.AdditiveExpressionContext = AdditiveExpressionContext;
class RelationalExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  LessThan() {
    return this.getToken(JavaScriptParser.LessThan, 0);
  }
  MoreThan() {
    return this.getToken(JavaScriptParser.MoreThan, 0);
  }
  LessThanEquals() {
    return this.getToken(JavaScriptParser.LessThanEquals, 0);
  }
  GreaterThanEquals() {
    return this.getToken(JavaScriptParser.GreaterThanEquals, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterRelationalExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitRelationalExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitRelationalExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.RelationalExpressionContext = RelationalExpressionContext;
class PostIncrementExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  PlusPlus() {
    return this.getToken(JavaScriptParser.PlusPlus, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterPostIncrementExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitPostIncrementExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitPostIncrementExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.PostIncrementExpressionContext = PostIncrementExpressionContext;
class YieldExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  yieldStatement() {
    return this.getTypedRuleContext(YieldStatementContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterYieldExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitYieldExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitYieldExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.YieldExpressionContext = YieldExpressionContext;
class BitNotExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  BitNot() {
    return this.getToken(JavaScriptParser.BitNot, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBitNotExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBitNotExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitBitNotExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.BitNotExpressionContext = BitNotExpressionContext;
class NewExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  New() {
    return this.getToken(JavaScriptParser.New, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  arguments() {
    return this.getTypedRuleContext(ArgumentsContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterNewExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitNewExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitNewExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.NewExpressionContext = NewExpressionContext;
class LiteralExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  literal() {
    return this.getTypedRuleContext(LiteralContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterLiteralExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitLiteralExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitLiteralExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.LiteralExpressionContext = LiteralExpressionContext;
class ArrayLiteralExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  arrayLiteral() {
    return this.getTypedRuleContext(ArrayLiteralContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArrayLiteralExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArrayLiteralExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArrayLiteralExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ArrayLiteralExpressionContext = ArrayLiteralExpressionContext;
class MemberDotExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  Dot() {
    return this.getToken(JavaScriptParser.Dot, 0);
  }
  identifierName() {
    return this.getTypedRuleContext(IdentifierNameContext, 0);
  }
  QuestionMark() {
    return this.getToken(JavaScriptParser.QuestionMark, 0);
  }
  Hashtag() {
    return this.getToken(JavaScriptParser.Hashtag, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterMemberDotExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitMemberDotExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitMemberDotExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.MemberDotExpressionContext = MemberDotExpressionContext;
class ClassExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Class() {
    return this.getToken(JavaScriptParser.Class, 0);
  }
  classTail() {
    return this.getTypedRuleContext(ClassTailContext, 0);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterClassExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitClassExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitClassExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ClassExpressionContext = ClassExpressionContext;
class MemberIndexExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  OpenBracket() {
    return this.getToken(JavaScriptParser.OpenBracket, 0);
  }
  expressionSequence() {
    return this.getTypedRuleContext(ExpressionSequenceContext, 0);
  }
  CloseBracket() {
    return this.getToken(JavaScriptParser.CloseBracket, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterMemberIndexExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitMemberIndexExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitMemberIndexExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.MemberIndexExpressionContext = MemberIndexExpressionContext;
class IdentifierExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterIdentifierExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitIdentifierExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitIdentifierExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.IdentifierExpressionContext = IdentifierExpressionContext;
class BitAndExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  BitAnd() {
    return this.getToken(JavaScriptParser.BitAnd, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBitAndExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBitAndExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitBitAndExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.BitAndExpressionContext = BitAndExpressionContext;
class BitOrExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  BitOr() {
    return this.getToken(JavaScriptParser.BitOr, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBitOrExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBitOrExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitBitOrExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.BitOrExpressionContext = BitOrExpressionContext;
class AssignmentOperatorExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  assignmentOperator() {
    return this.getTypedRuleContext(AssignmentOperatorContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAssignmentOperatorExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAssignmentOperatorExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAssignmentOperatorExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.AssignmentOperatorExpressionContext = AssignmentOperatorExpressionContext;
class VoidExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Void() {
    return this.getToken(JavaScriptParser.Void, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterVoidExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitVoidExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitVoidExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.VoidExpressionContext = VoidExpressionContext;
class CoalesceExpressionContext extends SingleExpressionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  singleExpression = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SingleExpressionContext);
    } else {
      return this.getTypedRuleContext(SingleExpressionContext, i);
    }
  };
  NullCoalesce() {
    return this.getToken(JavaScriptParser.NullCoalesce, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterCoalesceExpression(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitCoalesceExpression(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitCoalesceExpression(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.CoalesceExpressionContext = CoalesceExpressionContext;
class AssignableContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_assignable;
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  arrayLiteral() {
    return this.getTypedRuleContext(ArrayLiteralContext, 0);
  }
  objectLiteral() {
    return this.getTypedRuleContext(ObjectLiteralContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAssignable(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAssignable(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAssignable(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ObjectLiteralContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_objectLiteral;
  }
  OpenBrace() {
    return this.getToken(JavaScriptParser.OpenBrace, 0);
  }
  CloseBrace() {
    return this.getToken(JavaScriptParser.CloseBrace, 0);
  }
  propertyAssignment = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(PropertyAssignmentContext);
    } else {
      return this.getTypedRuleContext(PropertyAssignmentContext, i);
    }
  };
  Comma = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.Comma);
    } else {
      return this.getToken(JavaScriptParser.Comma, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterObjectLiteral(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitObjectLiteral(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitObjectLiteral(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class AnonymousFunctionContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_anonymousFunction;
  }
  copyFrom(ctx) {
    super.copyFrom(ctx);
  }
}
class AnonymousFunctionDeclContext extends AnonymousFunctionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  Function_() {
    return this.getToken(JavaScriptParser.Function_, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  functionBody() {
    return this.getTypedRuleContext(FunctionBodyContext, 0);
  }
  Async() {
    return this.getToken(JavaScriptParser.Async, 0);
  }
  Multiply() {
    return this.getToken(JavaScriptParser.Multiply, 0);
  }
  formalParameterList() {
    return this.getTypedRuleContext(FormalParameterListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAnonymousFunctionDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAnonymousFunctionDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAnonymousFunctionDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.AnonymousFunctionDeclContext = AnonymousFunctionDeclContext;
class ArrowFunctionContext extends AnonymousFunctionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  arrowFunctionParameters() {
    return this.getTypedRuleContext(ArrowFunctionParametersContext, 0);
  }
  ARROW() {
    return this.getToken(JavaScriptParser.ARROW, 0);
  }
  arrowFunctionBody() {
    return this.getTypedRuleContext(ArrowFunctionBodyContext, 0);
  }
  Async() {
    return this.getToken(JavaScriptParser.Async, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArrowFunction(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArrowFunction(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArrowFunction(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ArrowFunctionContext = ArrowFunctionContext;
class FunctionDeclContext extends AnonymousFunctionContext {
  constructor(parser, ctx) {
    super(parser);
    super.copyFrom(ctx);
  }
  functionDeclaration() {
    return this.getTypedRuleContext(FunctionDeclarationContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterFunctionDecl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitFunctionDecl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitFunctionDecl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.FunctionDeclContext = FunctionDeclContext;
class ArrowFunctionParametersContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_arrowFunctionParameters;
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  OpenParen() {
    return this.getToken(JavaScriptParser.OpenParen, 0);
  }
  CloseParen() {
    return this.getToken(JavaScriptParser.CloseParen, 0);
  }
  formalParameterList() {
    return this.getTypedRuleContext(FormalParameterListContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArrowFunctionParameters(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArrowFunctionParameters(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArrowFunctionParameters(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArrowFunctionBodyContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_arrowFunctionBody;
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  functionBody() {
    return this.getTypedRuleContext(FunctionBodyContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterArrowFunctionBody(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitArrowFunctionBody(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitArrowFunctionBody(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class AssignmentOperatorContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_assignmentOperator;
  }
  MultiplyAssign() {
    return this.getToken(JavaScriptParser.MultiplyAssign, 0);
  }
  DivideAssign() {
    return this.getToken(JavaScriptParser.DivideAssign, 0);
  }
  ModulusAssign() {
    return this.getToken(JavaScriptParser.ModulusAssign, 0);
  }
  PlusAssign() {
    return this.getToken(JavaScriptParser.PlusAssign, 0);
  }
  MinusAssign() {
    return this.getToken(JavaScriptParser.MinusAssign, 0);
  }
  LeftShiftArithmeticAssign() {
    return this.getToken(JavaScriptParser.LeftShiftArithmeticAssign, 0);
  }
  RightShiftArithmeticAssign() {
    return this.getToken(JavaScriptParser.RightShiftArithmeticAssign, 0);
  }
  RightShiftLogicalAssign() {
    return this.getToken(JavaScriptParser.RightShiftLogicalAssign, 0);
  }
  BitAndAssign() {
    return this.getToken(JavaScriptParser.BitAndAssign, 0);
  }
  BitXorAssign() {
    return this.getToken(JavaScriptParser.BitXorAssign, 0);
  }
  BitOrAssign() {
    return this.getToken(JavaScriptParser.BitOrAssign, 0);
  }
  PowerAssign() {
    return this.getToken(JavaScriptParser.PowerAssign, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterAssignmentOperator(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitAssignmentOperator(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitAssignmentOperator(this);
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
    this.ruleIndex = JavaScriptParser.RULE_literal;
  }
  NullLiteral() {
    return this.getToken(JavaScriptParser.NullLiteral, 0);
  }
  BooleanLiteral() {
    return this.getToken(JavaScriptParser.BooleanLiteral, 0);
  }
  StringLiteral() {
    return this.getToken(JavaScriptParser.StringLiteral, 0);
  }
  templateStringLiteral() {
    return this.getTypedRuleContext(TemplateStringLiteralContext, 0);
  }
  RegularExpressionLiteral() {
    return this.getToken(JavaScriptParser.RegularExpressionLiteral, 0);
  }
  numericLiteral() {
    return this.getTypedRuleContext(NumericLiteralContext, 0);
  }
  bigintLiteral() {
    return this.getTypedRuleContext(BigintLiteralContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterLiteral(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitLiteral(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitLiteral(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TemplateStringLiteralContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_templateStringLiteral;
  }
  BackTick = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(JavaScriptParser.BackTick);
    } else {
      return this.getToken(JavaScriptParser.BackTick, i);
    }
  };
  templateStringAtom = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TemplateStringAtomContext);
    } else {
      return this.getTypedRuleContext(TemplateStringAtomContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterTemplateStringLiteral(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitTemplateStringLiteral(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitTemplateStringLiteral(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TemplateStringAtomContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_templateStringAtom;
  }
  TemplateStringAtom() {
    return this.getToken(JavaScriptParser.TemplateStringAtom, 0);
  }
  TemplateStringStartExpression() {
    return this.getToken(JavaScriptParser.TemplateStringStartExpression, 0);
  }
  singleExpression() {
    return this.getTypedRuleContext(SingleExpressionContext, 0);
  }
  TemplateCloseBrace() {
    return this.getToken(JavaScriptParser.TemplateCloseBrace, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterTemplateStringAtom(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitTemplateStringAtom(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitTemplateStringAtom(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class NumericLiteralContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_numericLiteral;
  }
  DecimalLiteral() {
    return this.getToken(JavaScriptParser.DecimalLiteral, 0);
  }
  HexIntegerLiteral() {
    return this.getToken(JavaScriptParser.HexIntegerLiteral, 0);
  }
  OctalIntegerLiteral() {
    return this.getToken(JavaScriptParser.OctalIntegerLiteral, 0);
  }
  OctalIntegerLiteral2() {
    return this.getToken(JavaScriptParser.OctalIntegerLiteral2, 0);
  }
  BinaryIntegerLiteral() {
    return this.getToken(JavaScriptParser.BinaryIntegerLiteral, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterNumericLiteral(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitNumericLiteral(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitNumericLiteral(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class BigintLiteralContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_bigintLiteral;
  }
  BigDecimalIntegerLiteral() {
    return this.getToken(JavaScriptParser.BigDecimalIntegerLiteral, 0);
  }
  BigHexIntegerLiteral() {
    return this.getToken(JavaScriptParser.BigHexIntegerLiteral, 0);
  }
  BigOctalIntegerLiteral() {
    return this.getToken(JavaScriptParser.BigOctalIntegerLiteral, 0);
  }
  BigBinaryIntegerLiteral() {
    return this.getToken(JavaScriptParser.BigBinaryIntegerLiteral, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterBigintLiteral(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitBigintLiteral(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitBigintLiteral(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class GetterContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_getter;
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  propertyName() {
    return this.getTypedRuleContext(PropertyNameContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterGetter(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitGetter(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitGetter(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SetterContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_setter;
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  propertyName() {
    return this.getTypedRuleContext(PropertyNameContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterSetter(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitSetter(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitSetter(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IdentifierNameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_identifierName;
  }
  identifier() {
    return this.getTypedRuleContext(IdentifierContext, 0);
  }
  reservedWord() {
    return this.getTypedRuleContext(ReservedWordContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterIdentifierName(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitIdentifierName(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitIdentifierName(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class IdentifierContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_identifier;
  }
  Identifier() {
    return this.getToken(JavaScriptParser.Identifier, 0);
  }
  NonStrictLet() {
    return this.getToken(JavaScriptParser.NonStrictLet, 0);
  }
  Async() {
    return this.getToken(JavaScriptParser.Async, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterIdentifier(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitIdentifier(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitIdentifier(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ReservedWordContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_reservedWord;
  }
  keyword() {
    return this.getTypedRuleContext(KeywordContext, 0);
  }
  NullLiteral() {
    return this.getToken(JavaScriptParser.NullLiteral, 0);
  }
  BooleanLiteral() {
    return this.getToken(JavaScriptParser.BooleanLiteral, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterReservedWord(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitReservedWord(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitReservedWord(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class KeywordContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_keyword;
  }
  Break() {
    return this.getToken(JavaScriptParser.Break, 0);
  }
  Do() {
    return this.getToken(JavaScriptParser.Do, 0);
  }
  Instanceof() {
    return this.getToken(JavaScriptParser.Instanceof, 0);
  }
  Typeof() {
    return this.getToken(JavaScriptParser.Typeof, 0);
  }
  Case() {
    return this.getToken(JavaScriptParser.Case, 0);
  }
  Else() {
    return this.getToken(JavaScriptParser.Else, 0);
  }
  New() {
    return this.getToken(JavaScriptParser.New, 0);
  }
  Var() {
    return this.getToken(JavaScriptParser.Var, 0);
  }
  Catch() {
    return this.getToken(JavaScriptParser.Catch, 0);
  }
  Finally() {
    return this.getToken(JavaScriptParser.Finally, 0);
  }
  Return() {
    return this.getToken(JavaScriptParser.Return, 0);
  }
  Void() {
    return this.getToken(JavaScriptParser.Void, 0);
  }
  Continue() {
    return this.getToken(JavaScriptParser.Continue, 0);
  }
  For() {
    return this.getToken(JavaScriptParser.For, 0);
  }
  Switch() {
    return this.getToken(JavaScriptParser.Switch, 0);
  }
  While() {
    return this.getToken(JavaScriptParser.While, 0);
  }
  Debugger() {
    return this.getToken(JavaScriptParser.Debugger, 0);
  }
  Function_() {
    return this.getToken(JavaScriptParser.Function_, 0);
  }
  This() {
    return this.getToken(JavaScriptParser.This, 0);
  }
  With() {
    return this.getToken(JavaScriptParser.With, 0);
  }
  Default() {
    return this.getToken(JavaScriptParser.Default, 0);
  }
  If() {
    return this.getToken(JavaScriptParser.If, 0);
  }
  Throw() {
    return this.getToken(JavaScriptParser.Throw, 0);
  }
  Delete() {
    return this.getToken(JavaScriptParser.Delete, 0);
  }
  In() {
    return this.getToken(JavaScriptParser.In, 0);
  }
  Try() {
    return this.getToken(JavaScriptParser.Try, 0);
  }
  Class() {
    return this.getToken(JavaScriptParser.Class, 0);
  }
  Enum() {
    return this.getToken(JavaScriptParser.Enum, 0);
  }
  Extends() {
    return this.getToken(JavaScriptParser.Extends, 0);
  }
  Super() {
    return this.getToken(JavaScriptParser.Super, 0);
  }
  Const() {
    return this.getToken(JavaScriptParser.Const, 0);
  }
  Export() {
    return this.getToken(JavaScriptParser.Export, 0);
  }
  Import() {
    return this.getToken(JavaScriptParser.Import, 0);
  }
  Implements() {
    return this.getToken(JavaScriptParser.Implements, 0);
  }
  let_() {
    return this.getTypedRuleContext(Let_Context, 0);
  }
  Private() {
    return this.getToken(JavaScriptParser.Private, 0);
  }
  Public() {
    return this.getToken(JavaScriptParser.Public, 0);
  }
  Interface() {
    return this.getToken(JavaScriptParser.Interface, 0);
  }
  Package() {
    return this.getToken(JavaScriptParser.Package, 0);
  }
  Protected() {
    return this.getToken(JavaScriptParser.Protected, 0);
  }
  Static() {
    return this.getToken(JavaScriptParser.Static, 0);
  }
  Yield() {
    return this.getToken(JavaScriptParser.Yield, 0);
  }
  Async() {
    return this.getToken(JavaScriptParser.Async, 0);
  }
  Await() {
    return this.getToken(JavaScriptParser.Await, 0);
  }
  From() {
    return this.getToken(JavaScriptParser.From, 0);
  }
  As() {
    return this.getToken(JavaScriptParser.As, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterKeyword(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitKeyword(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitKeyword(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Let_Context extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = JavaScriptParser.RULE_let_;
  }
  NonStrictLet() {
    return this.getToken(JavaScriptParser.NonStrictLet, 0);
  }
  StrictLet() {
    return this.getToken(JavaScriptParser.StrictLet, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterLet_(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitLet_(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitLet_(this);
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
    this.ruleIndex = JavaScriptParser.RULE_eos;
  }
  SemiColon() {
    return this.getToken(JavaScriptParser.SemiColon, 0);
  }
  EOF() {
    return this.getToken(JavaScriptParser.EOF, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.enterEos(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_JavaScriptParserListener.default) {
      listener.exitEos(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_JavaScriptParserVisitor.default) {
      return visitor.visitEos(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
JavaScriptParser.ProgramContext = ProgramContext;
JavaScriptParser.SourceElementContext = SourceElementContext;
JavaScriptParser.StatementContext = StatementContext;
JavaScriptParser.BlockContext = BlockContext;
JavaScriptParser.StatementListContext = StatementListContext;
JavaScriptParser.ImportStatementContext = ImportStatementContext;
JavaScriptParser.ImportFromBlockContext = ImportFromBlockContext;
JavaScriptParser.ModuleItemsContext = ModuleItemsContext;
JavaScriptParser.ImportDefaultContext = ImportDefaultContext;
JavaScriptParser.ImportNamespaceContext = ImportNamespaceContext;
JavaScriptParser.ImportFromContext = ImportFromContext;
JavaScriptParser.AliasNameContext = AliasNameContext;
JavaScriptParser.ExportStatementContext = ExportStatementContext;
JavaScriptParser.ExportFromBlockContext = ExportFromBlockContext;
JavaScriptParser.DeclarationContext = DeclarationContext;
JavaScriptParser.VariableStatementContext = VariableStatementContext;
JavaScriptParser.VariableDeclarationListContext = VariableDeclarationListContext;
JavaScriptParser.VariableDeclarationContext = VariableDeclarationContext;
JavaScriptParser.EmptyStatement_Context = EmptyStatement_Context;
JavaScriptParser.ExpressionStatementContext = ExpressionStatementContext;
JavaScriptParser.IfStatementContext = IfStatementContext;
JavaScriptParser.IterationStatementContext = IterationStatementContext;
JavaScriptParser.VarModifierContext = VarModifierContext;
JavaScriptParser.ContinueStatementContext = ContinueStatementContext;
JavaScriptParser.BreakStatementContext = BreakStatementContext;
JavaScriptParser.ReturnStatementContext = ReturnStatementContext;
JavaScriptParser.YieldStatementContext = YieldStatementContext;
JavaScriptParser.WithStatementContext = WithStatementContext;
JavaScriptParser.SwitchStatementContext = SwitchStatementContext;
JavaScriptParser.CaseBlockContext = CaseBlockContext;
JavaScriptParser.CaseClausesContext = CaseClausesContext;
JavaScriptParser.CaseClauseContext = CaseClauseContext;
JavaScriptParser.DefaultClauseContext = DefaultClauseContext;
JavaScriptParser.LabelledStatementContext = LabelledStatementContext;
JavaScriptParser.ThrowStatementContext = ThrowStatementContext;
JavaScriptParser.TryStatementContext = TryStatementContext;
JavaScriptParser.CatchProductionContext = CatchProductionContext;
JavaScriptParser.FinallyProductionContext = FinallyProductionContext;
JavaScriptParser.DebuggerStatementContext = DebuggerStatementContext;
JavaScriptParser.FunctionDeclarationContext = FunctionDeclarationContext;
JavaScriptParser.ClassDeclarationContext = ClassDeclarationContext;
JavaScriptParser.ClassTailContext = ClassTailContext;
JavaScriptParser.ClassElementContext = ClassElementContext;
JavaScriptParser.MethodDefinitionContext = MethodDefinitionContext;
JavaScriptParser.FormalParameterListContext = FormalParameterListContext;
JavaScriptParser.FormalParameterArgContext = FormalParameterArgContext;
JavaScriptParser.LastFormalParameterArgContext = LastFormalParameterArgContext;
JavaScriptParser.FunctionBodyContext = FunctionBodyContext;
JavaScriptParser.SourceElementsContext = SourceElementsContext;
JavaScriptParser.ArrayLiteralContext = ArrayLiteralContext;
JavaScriptParser.ElementListContext = ElementListContext;
JavaScriptParser.ArrayElementContext = ArrayElementContext;
JavaScriptParser.PropertyAssignmentContext = PropertyAssignmentContext;
JavaScriptParser.PropertyNameContext = PropertyNameContext;
JavaScriptParser.ArgumentsContext = ArgumentsContext;
JavaScriptParser.ArgumentContext = ArgumentContext;
JavaScriptParser.ExpressionSequenceContext = ExpressionSequenceContext;
JavaScriptParser.SingleExpressionContext = SingleExpressionContext;
JavaScriptParser.AssignableContext = AssignableContext;
JavaScriptParser.ObjectLiteralContext = ObjectLiteralContext;
JavaScriptParser.AnonymousFunctionContext = AnonymousFunctionContext;
JavaScriptParser.ArrowFunctionParametersContext = ArrowFunctionParametersContext;
JavaScriptParser.ArrowFunctionBodyContext = ArrowFunctionBodyContext;
JavaScriptParser.AssignmentOperatorContext = AssignmentOperatorContext;
JavaScriptParser.LiteralContext = LiteralContext;
JavaScriptParser.TemplateStringLiteralContext = TemplateStringLiteralContext;
JavaScriptParser.TemplateStringAtomContext = TemplateStringAtomContext;
JavaScriptParser.NumericLiteralContext = NumericLiteralContext;
JavaScriptParser.BigintLiteralContext = BigintLiteralContext;
JavaScriptParser.GetterContext = GetterContext;
JavaScriptParser.SetterContext = SetterContext;
JavaScriptParser.IdentifierNameContext = IdentifierNameContext;
JavaScriptParser.IdentifierContext = IdentifierContext;
JavaScriptParser.ReservedWordContext = ReservedWordContext;
JavaScriptParser.KeywordContext = KeywordContext;
JavaScriptParser.Let_Context = Let_Context;
JavaScriptParser.EosContext = EosContext;
module.exports = __toCommonJS(JavaScriptParser_exports);
