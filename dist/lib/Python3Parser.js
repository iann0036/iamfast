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
var Python3Parser_exports = {};
__export(Python3Parser_exports, {
  default: () => Python3Parser
});
var import_antlr4 = __toESM(require("antlr4"), 1);
var import_Python3ParserListener = __toESM(require("./Python3ParserListener.js"), 1);
var import_Python3ParserVisitor = __toESM(require("./Python3ParserVisitor.js"), 1);
const serializedATN = [
  "\u608B\uA72A\u8133\uB9ED\u417C\u3BE7\u7786",
  "\u5964e\u0452		",
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
  "U	UV	VW	W",
  "\xB4\n\x07",
  "\xB8\n\f\xBB\v",
  "\x07\xC1\n\f",
  "\xC4\v",
  "\xCC\n",
  "\xCF\n",
  "\xD4\n\r\xD5\x07\x07",
  "\x07\x07\x07\xDC\n\x07\b\b",
  "\b						\xE6\n		",
  "		\n\n\n\xED\n\n\n\n",
  "\v\v\v\v\xF4\n\v\v",
  "\v\v\v\v\xFA\n\v\x07",
  "\v\xFC\n\v\f\v\v\xFF\v\v\v",
  "\v\v\v\u0104\n\v\v",
  "\v\v\v\v\u010A\n\v\x07\v",
  "\u010C\n\v\f\v\v\u010F\v\v\v",
  "\v\v\v\v\u0115\n\v\v",
  "\u0117\n\v\v\u0119\n\v\v\v",
  "\v\v\u011E\n\v\v\u0120\n\v\v",
  "\u0122\n\v\v\v\v\u0126\n\v",
  "\v\v\v\v\v\u012C\n\v",
  "\x07\v\u012E\n\v\f\v\v\u0131\v\v",
  "\v\v\v\v\v\u0137\n\v",
  "\v\u0139\n\v\v\u013B\n\v\v",
  "\v\v\v\u0140\n\v\v\u0142\n\v",
  "\f\f\f\f\u0147\n\f\r\r\r",
  "\r\u014C\n\r\r\r\r\r\r\u0152\n\r\x07",
  "\r\u0154\n\r\f\r\r\u0157\v\r\r\r\r",
  "\r\u015C\n\r\r\r\r\r\r\u0162\n\r\x07",
  "\r\u0164\n\r\f\r\r\u0167\v\r\r\r\r",
  "\r\r\u016D\n\r\r\u016F\n\r\r\u0171\n\r\r",
  "\r\r\r\u0176\n\r\r\u0178\n\r\r\u017A\n\r",
  "\r\r\r\u017E\n\r\r\r\r\r\r",
  "\u0184\n\r\x07\r\u0186\n\r\f\r\r\u0189\v\r\r",
  "\r\r\r\r\u018F\n\r\r\u0191\n\r\r\u0193",
  "\n\r\r\r\r\r\u0198\n\r\r\u019A\n\r",
  "\u01A0\n",
  "\x07\u01A5\n\f",
  "\u01A8\v\u01AB\n",
  "",
  "\u01B7\n",
  "",
  "\u01BE\n",
  "\u01C3\n\x07\u01C5\n\f\u01C8\v",
  "\u01CA\n",
  "\u01D0\n",
  "\u01D4\n",
  "\u01D9\n\x07\u01DB\n\f\u01DE\v",
  "\u01E1\n",
  "",
  "\u01EF\n",
  "\x1B",
  "\x1B\x1B\u01F7\n\x1B",
  "\u01FF\n",
  "\u0201\n\u0205\n",
  "  \x07 \u020C\n \f",
  "  \u020F\v    \u0213\n \r  \u0214",
  " \u0217\n        ",
  ' \u0220\n !!!!\u0225\n!""',
  '""\u022A\n"###\x07#\u022F\n#\f##',
  "\u0232\v###\u0235\n#$$$\x07$\u023A",
  "\n$\f$$\u023D\v$%%%\x07%\u0242\n%\f%",
  "%\u0245\v%&&&&\x07&\u024B\n&\f&",
  "&\u024E\v&''''\x07'\u0254\n'\f'",
  "'\u0257\v'(((((\u025D\n(",
  "))))))))))\u0268",
  "\n)*****\u026E\n*++",
  "+++++++\x07+\u0279\n+\f+",
  "+\u027C\v+++++\u0281\n+,,",
  ",,,,,,\u028A\n,---",
  "-------\u0295\n-..",
  "......\u029E\n.\r..\u029F",
  "....\u02A5\n.....\u02AA\n",
  ".....\u02AF\n.////\x07",
  "/\u02B5\n/\f//\u02B8\v////0",
  "000\u02C0\n011111\u02C6\n",
  "11\u02C8\n122222\u02CE\n2\r2",
  "2\u02CF222\u02D4\n23333",
  "333\u02DC\n333\u02DF\n344",
  "4\u02E3\n4555\u02E7\n5555",
  "666\u02EE\n6666777\x07",
  "7\u02F6\n7\f77\u02F9\v7888\x078\u02FE",
  "\n8\f88\u0301\v89999\u0306\n9",
  "::::\x07:\u030C\n:\f::\u030F\v:",
  ";;;;;;;;;;",
  ";;;;\u031E\n;<<<==",
  "=\x07=\u0326\n=\f==\u0329\v=>>>\x07",
  ">\u032E\n>\f>>\u0331\v>???\x07?\u0336",
  "\n?\f??\u0339\v?@@@\x07@\u033E\n@\f@",
  "@\u0341\v@AAA\x07A\u0346\nA\fAA\u0349",
  "\vABBB\x07B\u034E\nB\fBB\u0351\vB",
  "CCCC\u0356\nCDDDD\u035B",
  "\nDEE\u035E\nEEE\x07E\u0362\nE\fEE\u0365",
  "\vEFFFF\u036A\nFFFF",
  "F\u036F\nFFFFF\u0374\nFFF",
  "FFF\u037A\nF\rFF\u037BFFF",
  "FF\u0382\nFGGG\u0386\nGGG",
  "GGG\u038C\nG\x07G\u038E\nG\fGG\u0391\vG",
  "GG\u0394\nGG\u0396\nGHHH\u039A\nH",
  "HHHHHHHH\u03A3\nHI",
  "II\x07I\u03A8\nI\fII\u03AB\vIII\u03AE",
  "\nIJJJ\u03B2\nJJJJ\u03B6\nJ",
  "JJ\u03B9\nJJ\u03BB\nJKKK\u03BF\nK",
  "LLL\u03C3\nLLLLL\u03C8\nL\x07",
  "L\u03CA\nL\fLL\u03CD\vLLL\u03D0\nLM",
  "MM\x07M\u03D5\nM\fMM\u03D8\vMMM\u03DB",
  "\nMNNNNNNN\u03E3\nN",
  "NNNNNNNNN\u03ED\nN\x07",
  "N\u03EF\nN\fNN\u03F2\vNNN\u03F5\nNN\u03F7",
  "\nNNNN\u03FB\nNNNNN",
  "N\u0401\nN\x07N\u0403\nN\fNN\u0406\vNNN\u0409",
  "\nNN\u040B\nNN\u040D\nNOOOO",
  "O\u0413\nOOO\u0416\nOOOOP",
  "PP\x07P\u041E\nP\fPP\u0421\vPPP\u0424",
  "\nPQQQ\u0428\nQQQQQ",
  "QQQQQ\u0432\nQRRR\u0436\n",
  "RSS\u0439\nSSSSSSS\u0440",
  "\nSTTTT\u0445\nTUUV",
  "VV\u044B\nVWWWW\u0450\nWW",
  "X\b\n\f",
  ' "$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|',
  "~\x80\x82\x84\x86\x88\x8A\x8C\x8E\x90\x92\x94",
  "\x96\x98\x9A\x9C\x9E\xA0\xA2\xA4\xA6\xA8\xAA\xAC",
  "\bWc56DEFG",
  "77HJUUFGKK\u04CF\xB3",
  "\xB9\xBE",
  "\b\xC7\n\xD3",
  "\f\xD7\xDD",
  "\xE0\xEA",
  "\u0141\u0143",
  "\u0199\u019B",
  "\u019F\u01A1",
  ' \u01B6"\u01B8$\u01CB',
  "&\u01D3(\u01E2",
  "*\u01E4,\u01E7",
  ".\u01EE0\u01F0",
  "2\u01F24\u01F4",
  "6\u01F88\u01FA:\u0204",
  "<\u0206>\u0209",
  "@\u0221B\u0226",
  "D\u022BF\u0236",
  "H\u023EJ\u0246",
  "L\u024FN\u0258P\u0267",
  "R\u0269T\u026F",
  "V\u0282X\u028B",
  "Z\u0296\\\u02B0",
  "^\u02BC`\u02C1",
  "b\u02D3d\u02DEf\u02E2",
  "h\u02E4j\u02EB",
  "l\u02F2n\u02FA",
  "p\u0305r\u0307",
  "t\u031Dv\u031F",
  "x\u0322z\u032A|\u0332",
  "~\u033A\x80\u0342",
  "\x82\u034A\x84\u0355",
  "\x86\u0357\x88\u035D",
  "\x8A\u0381\x8C\u0385",
  "\x8E\u03A2\x90\u03A4",
  "\x92\u03BA\x94\u03BC",
  "\x96\u03C2\x98\u03D1",
  "\x9A\u040C\x9C\u040E",
  "\x9E\u041A\xA0\u0431",
  "\xA2\u0435\xA4\u0438",
  "\xA6\u0441\xA8\u0446",
  "\xAA\u0448\xAC\u044F",
  "\xAE\xB4\x07+\xAF\xB4",
  "\xB0\xB1P)\xB1\xB2\x07",
  "+\xB2\xB4\xB3\xAE",
  "\xB3\xAF\xB3\xB0",
  "\xB4\xB5\xB8\x07",
  "+\xB6\xB8\xB7\xB5",
  "\xB7\xB6\xB8\xBB",
  "\xB9\xB7\xB9\xBA",
  "\xBA\xBC\xBB\xB9",
  "\xBC\xBD\x07\xBD",
  "\xBE\xC2\x98M\xBF\xC1\x07",
  "+\xC0\xBF\xC1\xC4",
  "\xC2\xC0\xC2\xC3",
  "\xC3\xC5\xC4\xC2",
  "\xC5\xC6\x07\xC6\x07",
  "\xC7\xC8\x07U\xC8\xCE",
  "H%\xC9\xCB\x078\xCA\xCC\x9EP",
  "\xCB\xCA\xCB\xCC",
  "\xCC\xCD\xCD\xCF\x079",
  "\xCE\xC9\xCE\xCF",
  "\xCF\xD0\xD0\xD1\x07+",
  "\xD1	\xD2\xD4\b\xD3",
  "\xD2\xD4\xD5\xD5",
  "\xD3\xD5\xD6\xD6",
  "\v\xD7\xDB\n\xD8",
  "\xDC\x9CO\xD9\xDC	\xDA\xDC",
  "\b\xDB\xD8\xDB\xD9",
  "\xDB\xDA\xDC\r",
  "\xDD\xDE\x07)\xDE\xDF",
  "	\xDF\xE0\xE1",
  "\x07\b\xE1\xE2\x07,\xE2\xE5",
  "\n\xE3\xE4\x07V\xE4\xE6d3",
  "\xE5\xE3\xE5\xE6",
  "\xE6\xE7\xE7\xE8\x07;",
  "\xE8\xE9b2\xE9\xEA",
  "\xEC\x078\xEB\xED\v\xEC",
  "\xEB\xEC\xED\xED",
  "\xEE\xEE\xEF\x079\xEF",
  "\xF0\xF3\f\xF1",
  "\xF2\x07>\xF2\xF4d3\xF3\xF1",
  "\xF3\xF4\xF4\xFD",
  "\xF5\xF6\x07:\xF6\xF9",
  "\f\xF7\xF8\x07>\xF8\xFAd3",
  "\xF9\xF7\xF9\xFA",
  "\xFA\xFC\xFB\xF5",
  "\xFC\xFF\xFD\xFB",
  "\xFD\xFE\xFE\u0121",
  "\xFF\xFD\u0100\u011F\x07:",
  "\u0101\u0103\x077\u0102\u0104\f\u0103",
  "\u0102\u0103\u0104\u0104",
  "\u010D\u0105\u0106\x07:\u0106",
  "\u0109\f\u0107\u0108\x07>\u0108\u010A",
  "d3\u0109\u0107\u0109\u010A",
  "\u010A\u010C\u010B\u0105",
  "\u010C\u010F\u010D\u010B",
  "\u010D\u010E\u010E\u0118",
  "\u010F\u010D\u0110\u0116\x07",
  ":\u0111\u0112\x07=\u0112\u0114",
  "\f\u0113\u0115\x07:\u0114\u0113",
  "\u0114\u0115\u0115\u0117",
  "\u0116\u0111\u0116\u0117",
  "\u0117\u0119\u0118\u0110",
  "\u0118\u0119\u0119\u0120",
  "\u011A\u011B\x07=\u011B\u011D\f",
  "\u011C\u011E\x07:\u011D\u011C",
  "\u011D\u011E\u011E\u0120",
  "\u011F\u0101\u011F\u011A",
  "\u011F\u0120\u0120\u0122",
  "\u0121\u0100\u0121\u0122",
  "\u0122\u0142\u0123\u0125\x077",
  "\u0124\u0126\f\u0125\u0124",
  "\u0125\u0126\u0126\u012F",
  "\u0127\u0128\x07:\u0128\u012B\f\u0129",
  "\u012A\x07>\u012A\u012Cd3\u012B\u0129",
  "\u012B\u012C\u012C\u012E",
  "\u012D\u0127\u012E\u0131",
  "\u012F\u012D\u012F\u0130",
  "\u0130\u013A\u0131\u012F",
  "\u0132\u0138\x07:\u0133\u0134\x07",
  "=\u0134\u0136\f\u0135\u0137\x07:",
  "\u0136\u0135\u0136\u0137",
  "\u0137\u0139\u0138\u0133",
  "\u0138\u0139\u0139\u013B",
  "\u013A\u0132\u013A\u013B",
  "\u013B\u0142\u013C\u013D\x07=",
  "\u013D\u013F\f\u013E\u0140\x07:",
  "\u013F\u013E\u013F\u0140",
  "\u0140\u0142\u0141\xF0",
  "\u0141\u0123\u0141\u013C",
  "\u0142\u0143\u0146\x07,",
  "\u0144\u0145\x07;\u0145\u0147d3\u0146\u0144",
  "\u0146\u0147\u0147",
  "\u0148\u014B\u0149\u014A",
  "\x07>\u014A\u014Cd3\u014B\u0149",
  "\u014B\u014C\u014C\u0155",
  "\u014D\u014E\x07:\u014E\u0151",
  "\u014F\u0150\x07>\u0150\u0152d3",
  "\u0151\u014F\u0151\u0152",
  "\u0152\u0154\u0153\u014D",
  "\u0154\u0157\u0155\u0153",
  "\u0155\u0156\u0156\u0179",
  "\u0157\u0155\u0158\u0177\x07:",
  "\u0159\u015B\x077\u015A\u015C",
  "\u015B\u015A\u015B\u015C",
  "\u015C\u0165\u015D\u015E\x07:",
  "\u015E\u0161\u015F\u0160\x07>",
  "\u0160\u0162d3\u0161\u015F\u0161",
  "\u0162\u0162\u0164\u0163",
  "\u015D\u0164\u0167\u0165",
  "\u0163\u0165\u0166\u0166",
  "\u0170\u0167\u0165\u0168",
  "\u016E\x07:\u0169\u016A\x07=\u016A\u016C",
  "\u016B\u016D\x07:\u016C\u016B",
  "\u016C\u016D\u016D\u016F",
  "\u016E\u0169\u016E\u016F",
  "\u016F\u0171\u0170\u0168",
  "\u0170\u0171\u0171\u0178",
  "\u0172\u0173\x07=\u0173\u0175",
  "\u0174\u0176\x07:\u0175\u0174",
  "\u0175\u0176\u0176\u0178",
  "\u0177\u0159\u0177\u0172",
  "\u0177\u0178\u0178\u017A",
  "\u0179\u0158\u0179\u017A",
  "\u017A\u019A\u017B\u017D",
  "\x077\u017C\u017E\u017D\u017C",
  "\u017D\u017E\u017E\u0187",
  "\u017F\u0180\x07:\u0180\u0183",
  "\u0181\u0182\x07>\u0182\u0184",
  "d3\u0183\u0181\u0183\u0184",
  "\u0184\u0186\u0185\u017F",
  "\u0186\u0189\u0187\u0185",
  "\u0187\u0188\u0188\u0192",
  "\u0189\u0187\u018A\u0190\x07",
  ":\u018B\u018C\x07=\u018C\u018E",
  "\u018D\u018F\x07:\u018E\u018D",
  "\u018E\u018F\u018F\u0191",
  "\u0190\u018B\u0190\u0191",
  "\u0191\u0193\u0192\u018A",
  "\u0192\u0193\u0193\u019A",
  "\u0194\u0195\x07=\u0195\u0197",
  "\u0196\u0198\x07:\u0197\u0196",
  "\u0197\u0198\u0198\u019A",
  "\u0199\u0148\u0199\u017B",
  "\u0199\u0194\u019A",
  "\u019B\u019C\x07,\u019C\x1B",
  "\u019D\u01A0\u019E\u01A0P",
  ")\u019F\u019D\u019F\u019E",
  "\u01A0\u01A1\u01A6 ",
  "\u01A2\u01A3\x07<\u01A3\u01A5 ",
  "\u01A4\u01A2\u01A5\u01A8",
  "\u01A6\u01A4\u01A6\u01A7",
  "\u01A7\u01AA\u01A8\u01A6",
  "\u01A9\u01AB\x07<\u01AA\u01A9",
  "\u01AA\u01AB\u01AB\u01AC",
  "\u01AC\u01AD\x07+\u01AD",
  '\u01AE\u01B7"\u01AF\u01B7*',
  "\u01B0\u01B7,\u01B1\u01B7.\u01B2",
  "\u01B7:\u01B3\u01B7J&\u01B4\u01B7",
  "L'\u01B5\u01B7N(\u01B6\u01AE",
  "\u01B6\u01AF\u01B6\u01B0",
  "\u01B6\u01B1\u01B6\u01B2",
  "\u01B6\u01B3\u01B6\u01B4",
  "\u01B6\u01B5\u01B7!",
  "\u01B8\u01C9&\u01B9\u01CA$\u01BA",
  "\u01BD(\u01BB\u01BE\xAAV\u01BC\u01BE",
  "\x98M\u01BD\u01BB\u01BD\u01BC",
  "\u01BE\u01CA\u01BF\u01C2",
  "\x07>\u01C0\u01C3\xAAV\u01C1\u01C3",
  "&\u01C2\u01C0\u01C2\u01C1",
  "\u01C3\u01C5\u01C4\u01BF",
  "\u01C5\u01C8\u01C6\u01C4",
  "\u01C6\u01C7\u01C7\u01CA",
  "\u01C8\u01C6\u01C9\u01B9",
  "\u01C9\u01BA\u01C9\u01C6",
  "\u01CA#\u01CB\u01CC\x07",
  ";\u01CC\u01CFd3\u01CD\u01CE\x07>",
  "\u01CE\u01D0d3\u01CF\u01CD\u01CF",
  "\u01D0\u01D0%\u01D1",
  "\u01D4d3\u01D2\u01D4v<\u01D3\u01D1",
  "\u01D3\u01D2\u01D4\u01DC",
  "\u01D5\u01D8\x07:\u01D6\u01D9d3",
  "\u01D7\u01D9v<\u01D8\u01D6\u01D8",
  "\u01D7\u01D9\u01DB\u01DA",
  "\u01D5\u01DB\u01DE\u01DC",
  "\u01DA\u01DC\u01DD\u01DD",
  "\u01E0\u01DE\u01DC\u01DF",
  "\u01E1\x07:\u01E0\u01DF\u01E0",
  "\u01E1\u01E1'\u01E2",
  "\u01E3	\u01E3)\u01E4\u01E5",
  "\x07%\u01E5\u01E6\x96L\u01E6+",
  "\u01E7\u01E8\x07&\u01E8-",
  "\u01E9\u01EF0\u01EA\u01EF2",
  "\u01EB\u01EF4\x1B\u01EC\u01EF8\u01ED",
  "\u01EF6\u01EE\u01E9\u01EE",
  "\u01EA\u01EE\u01EB\u01EE",
  "\u01EC\u01EE\u01ED\u01EF",
  "/\u01F0\u01F1\x07(\u01F11",
  "\u01F2\u01F3\x07'\u01F33",
  "\u01F4\u01F6\x07	\u01F5\u01F7\x98",
  "M\u01F6\u01F5\u01F6\u01F7",
  "\u01F75\u01F8\u01F9\xAA",
  "V\u01F97\u01FA\u0200\x07\n",
  "\u01FB\u01FEd3\u01FC\u01FD\x07\v\u01FD",
  "\u01FFd3\u01FE\u01FC\u01FE\u01FF",
  "\u01FF\u0201\u0200\u01FB",
  "\u0200\u0201\u02019",
  "\u0202\u0205<\u0203\u0205",
  "> \u0204\u0202\u0204\u0203",
  "\u0205;\u0206\u0207\x07",
  "\f\u0207\u0208F$\u0208=",
  "\u0209\u0216\x07\v\u020A\u020C	",
  "\u020B\u020A\u020C\u020F",
  "\u020D\u020B\u020D\u020E",
  "\u020E\u0210\u020F\u020D",
  "\u0210\u0217H%\u0211\u0213	\u0212\u0211",
  "\u0213\u0214\u0214\u0212",
  "\u0214\u0215\u0215\u0217",
  "\u0216\u020D\u0216\u0212",
  "\u0217\u0218\u0218\u021F",
  "\x07\f\u0219\u0220\x077\u021A\u021B\x07",
  "8\u021B\u021CD#\u021C\u021D\x079",
  "\u021D\u0220\u021E\u0220D#\u021F",
  "\u0219\u021F\u021A\u021F",
  "\u021E\u0220?\u0221",
  "\u0224\x07,\u0222\u0223\x07\r\u0223\u0225",
  "\x07,\u0224\u0222\u0224\u0225",
  "\u0225A\u0226\u0229",
  "H%\u0227\u0228\x07\r\u0228\u022A\x07,",
  "\u0229\u0227\u0229\u022A",
  "\u022AC\u022B\u0230@!\u022C",
  "\u022D\x07:\u022D\u022F@!\u022E\u022C",
  "\u022F\u0232\u0230\u022E",
  "\u0230\u0231\u0231\u0234",
  "\u0232\u0230\u0233\u0235\x07",
  ":\u0234\u0233\u0234\u0235",
  "\u0235E\u0236\u023B",
  'B"\u0237\u0238\x07:\u0238\u023AB"',
  "\u0239\u0237\u023A\u023D",
  "\u023B\u0239\u023B\u023C",
  "\u023CG\u023D\u023B",
  "\u023E\u0243\x07,\u023F\u0240\x075\u0240",
  "\u0242\x07,\u0241\u023F\u0242",
  "\u0245\u0243\u0241\u0243",
  "\u0244\u0244I\u0245",
  "\u0243\u0246\u0247\x07\u0247",
  "\u024C\x07,\u0248\u0249\x07:\u0249\u024B",
  "\x07,\u024A\u0248\u024B\u024E",
  "\u024C\u024A\u024C\u024D",
  "\u024DK\u024E\u024C",
  "\u024F\u0250\x07\u0250\u0255",
  "\x07,\u0251\u0252\x07:\u0252\u0254\x07",
  ",\u0253\u0251\u0254\u0257",
  "\u0255\u0253\u0255\u0256",
  "\u0256M\u0257\u0255",
  "\u0258\u0259\x07\u0259\u025C",
  "d3\u025A\u025B\x07:\u025B\u025Dd3\u025C",
  "\u025A\u025C\u025D\u025D",
  "O\u025E\u0268T+\u025F\u0268",
  "V,\u0260\u0268X-\u0261\u0268Z.\u0262\u0268",
  "\\/\u0263\u0268	\u0264\u0268\x9C",
  "O\u0265\u0268\f\x07\u0266\u0268R*\u0267",
  "\u025E\u0267\u025F\u0267",
  "\u0260\u0267\u0261\u0267",
  "\u0262\u0267\u0263\u0267",
  "\u0264\u0267\u0265\u0267",
  "\u0266\u0268Q\u0269",
  "\u026D\x07)\u026A\u026E	\u026B\u026E",
  "\\/\u026C\u026EX-\u026D\u026A",
  "\u026D\u026B\u026D\u026C",
  "\u026ES\u026F\u0270\x07",
  "\u0270\u0271d3\u0271\u0272\x07;\u0272",
  "\u027Ab2\u0273\u0274\x07\u0274\u0275",
  "d3\u0275\u0276\x07;\u0276\u0277b2",
  "\u0277\u0279\u0278\u0273",
  "\u0279\u027C\u027A\u0278",
  "\u027A\u027B\u027B\u0280",
  "\u027C\u027A\u027D\u027E\x07",
  "\u027E\u027F\x07;\u027F\u0281b2\u0280\u027D",
  "\u0280\u0281\u0281U",
  "\u0282\u0283\x07\u0283\u0284",
  "d3\u0284\u0285\x07;\u0285\u0289b2",
  "\u0286\u0287\x07\u0287\u0288\x07;",
  "\u0288\u028Ab2\u0289\u0286\u0289",
  "\u028A\u028AW\u028B",
  "\u028C\x07\u028C\u028D\x96L\u028D",
  "\u028E\x07\u028E\u028F\x98M\u028F",
  "\u0290\x07;\u0290\u0294b2\u0291\u0292\x07",
  "\u0292\u0293\x07;\u0293\u0295",
  "b2\u0294\u0291\u0294\u0295",
  "\u0295Y\u0296\u0297\x07",
  "\u0297\u0298\x07;\u0298\u02AEb2",
  "\u0299\u029A`1\u029A\u029B\x07;\u029B\u029C",
  "b2\u029C\u029E\u029D\u0299",
  "\u029E\u029F\u029F\u029D",
  "\u029F\u02A0\u02A0\u02A4",
  "\u02A1\u02A2\x07\u02A2\u02A3\x07",
  ";\u02A3\u02A5b2\u02A4\u02A1",
  "\u02A4\u02A5\u02A5\u02A9",
  "\u02A6\u02A7\x07\u02A7\u02A8\x07;",
  "\u02A8\u02AAb2\u02A9\u02A6",
  "\u02A9\u02AA\u02AA\u02AF",
  "\u02AB\u02AC\x07\u02AC\u02AD\x07;",
  "\u02AD\u02AFb2\u02AE\u029D\u02AE",
  "\u02AB\u02AF[\u02B0",
  "\u02B1\x07\u02B1\u02B6^0\u02B2\u02B3",
  "\x07:\u02B3\u02B5^0\u02B4\u02B2",
  "\u02B5\u02B8\u02B6\u02B4",
  "\u02B6\u02B7\u02B7\u02B9",
  "\u02B8\u02B6\u02B9\u02BA\x07;",
  "\u02BA\u02BBb2\u02BB]",
  "\u02BC\u02BFd3\u02BD\u02BE\x07\r\u02BE\u02C0",
  "x=\u02BF\u02BD\u02BF\u02C0",
  "\u02C0_\u02C1\u02C7\x07",
  "\u02C2\u02C5d3\u02C3\u02C4\x07\r",
  "\u02C4\u02C6\x07,\u02C5\u02C3",
  "\u02C5\u02C6\u02C6\u02C8",
  "\u02C7\u02C2\u02C7\u02C8",
  "\u02C8a\u02C9\u02D4",
  "\u02CA\u02CB\x07+\u02CB\u02CD\x07",
  "\u02CC\u02CE\u02CD\u02CC",
  "\u02CE\u02CF\u02CF\u02CD",
  "\u02CF\u02D0\u02D0\u02D1",
  "\u02D1\u02D2\x07\u02D2\u02D4",
  "\u02D3\u02C9\u02D3\u02CA",
  "\u02D4c\u02D5\u02DBl7\u02D6",
  "\u02D7\x07\u02D7\u02D8l7\u02D8\u02D9",
  "\x07\u02D9\u02DAd3\u02DA\u02DC",
  "\u02DB\u02D6\u02DB\u02DC",
  "\u02DC\u02DF\u02DD\u02DF",
  "h5\u02DE\u02D5\u02DE\u02DD",
  "\u02DFe\u02E0\u02E3l7",
  "\u02E1\u02E3j6\u02E2\u02E0\u02E2",
  "\u02E1\u02E3g\u02E4",
  "\u02E6\x07\x1B\u02E5\u02E7\r\u02E6",
  "\u02E5\u02E6\u02E7\u02E7",
  "\u02E8\u02E8\u02E9\x07;\u02E9",
  "\u02EAd3\u02EAi\u02EB\u02ED\x07",
  "\x1B\u02EC\u02EE\r\u02ED\u02EC",
  "\u02ED\u02EE\u02EE\u02EF",
  "\u02EF\u02F0\x07;\u02F0\u02F1",
  "f4\u02F1k\u02F2\u02F7n8\u02F3",
  "\u02F4\x07\u02F4\u02F6n8\u02F5\u02F3",
  "\u02F6\u02F9\u02F7\u02F5",
  "\u02F7\u02F8\u02F8m",
  "\u02F9\u02F7\u02FA\u02FF",
  "p9\u02FB\u02FC\x07\u02FC\u02FE",
  "p9\u02FD\u02FB\u02FE\u0301",
  "\u02FF\u02FD\u02FF\u0300",
  "\u0300o\u0301\u02FF",
  "\u0302\u0303\x07\u0303\u0306p",
  "9\u0304\u0306r:\u0305\u0302",
  "\u0305\u0304\u0306q",
  "\u0307\u030Dx=\u0308\u0309t;\u0309\u030A",
  "x=\u030A\u030C\u030B\u0308",
  "\u030C\u030F\u030D\u030B",
  "\u030D\u030E\u030Es",
  "\u030F\u030D\u0310\u031E\x07N",
  "\u0311\u031E\x07O\u0312\u031E\x07P",
  "\u0313\u031E\x07Q\u0314\u031E\x07R",
  "\u0315\u031E\x07S\u0316\u031E\x07T\u0317",
  "\u031E\x07\u0318\u0319\x07\u0319",
  "\u031E\x07\u031A\u031E\x07\u031B",
  "\u031C\x07\u031C\u031E\x07\u031D",
  "\u0310\u031D\u0311\u031D",
  "\u0312\u031D\u0313\u031D",
  "\u0314\u031D\u0315\u031D",
  "\u0316\u031D\u0317\u031D",
  "\u0318\u031D\u031A\u031D",
  "\u031B\u031Eu\u031F",
  "\u0320\x077\u0320\u0321x=\u0321w",
  "\u0322\u0327z>\u0323\u0324\x07A",
  "\u0324\u0326z>\u0325\u0323\u0326",
  "\u0329\u0327\u0325\u0327",
  "\u0328\u0328y\u0329",
  "\u0327\u032A\u032F|?\u032B\u032C",
  "\x07B\u032C\u032E|?\u032D\u032B",
  "\u032E\u0331\u032F\u032D",
  "\u032F\u0330\u0330{",
  "\u0331\u032F\u0332\u0337~",
  "@\u0333\u0334\x07C\u0334\u0336~@\u0335",
  "\u0333\u0336\u0339\u0337",
  "\u0335\u0337\u0338\u0338",
  "}\u0339\u0337\u033A",
  "\u033F\x80A\u033B\u033C	\u033C\u033E",
  "\x80A\u033D\u033B\u033E\u0341",
  "\u033F\u033D\u033F\u0340",
  "\u0340\x7F\u0341\u033F",
  "\u0342\u0347\x82B\u0343\u0344",
  "	\u0344\u0346\x82B\u0345\u0343",
  "\u0346\u0349\u0347\u0345",
  "\u0347\u0348\u0348\x81",
  "\u0349\u0347\u034A\u034F",
  "\x84C\u034B\u034C	\u034C\u034E\x84",
  "C\u034D\u034B\u034E\u0351",
  "\u034F\u034D\u034F\u0350",
  "\u0350\x83\u0351\u034F",
  "\u0352\u0353	\x07\u0353\u0356\x84",
  "C\u0354\u0356\x86D\u0355\u0352",
  "\u0355\u0354\u0356\x85",
  "\u0357\u035A\x88E\u0358\u0359\x07=",
  "\u0359\u035B\x84C\u035A\u0358",
  "\u035A\u035B\u035B\x87",
  "\u035C\u035E\x07*\u035D\u035C",
  "\u035D\u035E\u035E\u035F",
  "\u035F\u0363\x8AF\u0360\u0362\x8EH\u0361",
  "\u0360\u0362\u0365\u0363",
  "\u0361\u0363\u0364\u0364",
  "\x89\u0365\u0363\u0366",
  "\u0369\x078\u0367\u036A\xAAV\u0368\u036A",
  "\x8CG\u0369\u0367\u0369\u0368",
  "\u0369\u036A\u036A\u036B",
  "\u036B\u0382\x079\u036C\u036E",
  "\x07?\u036D\u036F\x8CG\u036E\u036D",
  "\u036E\u036F\u036F\u0370",
  "\u0370\u0382\x07@\u0371\u0373\x07",
  "L\u0372\u0374\x9AN\u0373\u0372",
  "\u0373\u0374\u0374\u0375",
  "\u0375\u0382\x07M\u0376\u0382\x07,",
  "\u0377\u0382\x07\u0378\u037A\x07",
  "\u0379\u0378\u037A\u037B",
  "\u037B\u0379\u037B\u037C",
  "\u037C\u0382\u037D\u0382\x076",
  "\u037E\u0382\x07 \u037F\u0382\x07!",
  '\u0380\u0382\x07"\u0381\u0366',
  "\u0381\u036C\u0381\u0371",
  "\u0381\u0376\u0381\u0377",
  "\u0381\u0379\u0381\u037D",
  "\u0381\u037E\u0381\u037F",
  "\u0381\u0380\u0382\x8B",
  "\u0383\u0386d3\u0384\u0386v<\u0385\u0383",
  "\u0385\u0384\u0386\u0395",
  "\u0387\u0396\xA4S\u0388\u038B\x07",
  ":\u0389\u038Cd3\u038A\u038Cv<\u038B",
  "\u0389\u038B\u038A\u038C",
  "\u038E\u038D\u0388\u038E",
  "\u0391\u038F\u038D\u038F",
  "\u0390\u0390\u0393\u0391",
  "\u038F\u0392\u0394\x07:\u0393",
  "\u0392\u0393\u0394\u0394",
  "\u0396\u0395\u0387\u0395",
  "\u038F\u0396\x8D\u0397",
  "\u0399\x078\u0398\u039A\x9EP\u0399\u0398",
  "\u0399\u039A\u039A\u039B",
  "\u039B\u03A3\x079\u039C\u039D",
  "\x07?\u039D\u039E\x90I\u039E\u039F\x07",
  "@\u039F\u03A3\u03A0\u03A1\x07",
  "5\u03A1\u03A3\x07,\u03A2\u0397",
  "\u03A2\u039C\u03A2\u03A0",
  "\u03A3\x8F\u03A4\u03A9\x92",
  "J\u03A5\u03A6\x07:\u03A6\u03A8\x92J",
  "\u03A7\u03A5\u03A8\u03AB",
  "\u03A9\u03A7\u03A9\u03AA",
  "\u03AA\u03AD\u03AB\u03A9",
  "\u03AC\u03AE\x07:\u03AD\u03AC",
  "\u03AD\u03AE\u03AE\x91",
  "\u03AF\u03BBd3\u03B0\u03B2d3\u03B1\u03B0",
  "\u03B1\u03B2\u03B2\u03B3",
  "\u03B3\u03B5\x07;\u03B4\u03B6",
  "d3\u03B5\u03B4\u03B5\u03B6",
  "\u03B6\u03B8\u03B7\u03B9\x94",
  "K\u03B8\u03B7\u03B8\u03B9",
  "\u03B9\u03BB\u03BA\u03AF",
  "\u03BA\u03B1\u03BB\x93",
  "\u03BC\u03BE\x07;\u03BD\u03BFd3",
  "\u03BE\u03BD\u03BE\u03BF",
  "\u03BF\x95\u03C0\u03C3x=\u03C1",
  "\u03C3v<\u03C2\u03C0\u03C2\u03C1",
  "\u03C3\u03CB\u03C4\u03C7",
  "\x07:\u03C5\u03C8x=\u03C6\u03C8v<",
  "\u03C7\u03C5\u03C7\u03C6",
  "\u03C8\u03CA\u03C9\u03C4",
  "\u03CA\u03CD\u03CB\u03C9",
  "\u03CB\u03CC\u03CC\u03CF",
  "\u03CD\u03CB\u03CE\u03D0\x07:",
  "\u03CF\u03CE\u03CF\u03D0",
  "\u03D0\x97\u03D1\u03D6d3\u03D2",
  "\u03D3\x07:\u03D3\u03D5d3\u03D4\u03D2",
  "\u03D5\u03D8\u03D6\u03D4",
  "\u03D6\u03D7\u03D7\u03DA",
  "\u03D8\u03D6\u03D9\u03DB\x07",
  ":\u03DA\u03D9\u03DA\u03DB",
  "\u03DB\x99\u03DC\u03DD",
  "d3\u03DD\u03DE\x07;\u03DE\u03DFd3\u03DF",
  "\u03E3\u03E0\u03E1\x07=\u03E1",
  "\u03E3x=\u03E2\u03DC\u03E2\u03E0",
  "\u03E3\u03F6\u03E4\u03F7",
  "\xA4S\u03E5\u03EC\x07:\u03E6\u03E7",
  "d3\u03E7\u03E8\x07;\u03E8\u03E9d3\u03E9",
  "\u03ED\u03EA\u03EB\x07=\u03EB",
  "\u03EDx=\u03EC\u03E6\u03EC\u03EA",
  "\u03ED\u03EF\u03EE\u03E5",
  "\u03EF\u03F2\u03F0\u03EE",
  "\u03F0\u03F1\u03F1\u03F4",
  "\u03F2\u03F0\u03F3\u03F5",
  "\x07:\u03F4\u03F3\u03F4\u03F5",
  "\u03F5\u03F7\u03F6\u03E4",
  "\u03F6\u03F0\u03F7\u040D",
  "\u03F8\u03FBd3\u03F9\u03FB",
  "v<\u03FA\u03F8\u03FA\u03F9",
  "\u03FB\u040A\u03FC\u040B\xA4",
  "S\u03FD\u0400\x07:\u03FE\u0401d3\u03FF",
  "\u0401v<\u0400\u03FE\u0400\u03FF",
  "\u0401\u0403\u0402\u03FD",
  "\u0403\u0406\u0404\u0402",
  "\u0404\u0405\u0405\u0408",
  "\u0406\u0404\u0407\u0409",
  "\x07:\u0408\u0407\u0408\u0409",
  "\u0409\u040B\u040A\u03FC",
  "\u040A\u0404\u040B\u040D",
  "\u040C\u03E2\u040C\u03FA",
  "\u040D\x9B\u040E\u040F",
  "\x07#\u040F\u0415\x07,\u0410\u0412\x07",
  "8\u0411\u0413\x9EP\u0412\u0411",
  "\u0412\u0413\u0413\u0414",
  "\u0414\u0416\x079\u0415\u0410",
  "\u0415\u0416\u0416\u0417",
  "\u0417\u0418\x07;\u0418\u0419b2",
  "\u0419\x9D\u041A\u041F\xA0Q",
  "\u041B\u041C\x07:\u041C\u041E\xA0Q\u041D",
  "\u041B\u041E\u0421\u041F",
  "\u041D\u041F\u0420\u0420",
  "\u0423\u0421\u041F\u0422",
  "\u0424\x07:\u0423\u0422\u0423",
  "\u0424\u0424\x9F\u0425",
  "\u0427d3\u0426\u0428\xA4S\u0427\u0426",
  "\u0427\u0428\u0428\u0432",
  "\u0429\u042Ad3\u042A\u042B\x07>",
  "\u042B\u042Cd3\u042C\u0432",
  "\u042D\u042E\x07=\u042E\u0432d3\u042F\u0430",
  "\x077\u0430\u0432d3\u0431\u0425",
  "\u0431\u0429\u0431\u042D",
  "\u0431\u042F\u0432\xA1",
  "\u0433\u0436\xA4S\u0434\u0436\xA6",
  "T\u0435\u0433\u0435\u0434",
  "\u0436\xA3\u0437\u0439\x07)",
  "\u0438\u0437\u0438\u0439",
  "\u0439\u043A\u043A\u043B\x07",
  "\u043B\u043C\x96L\u043C\u043D\x07",
  "\u043D\u043Fl7\u043E\u0440\xA2R",
  "\u043F\u043E\u043F\u0440",
  "\u0440\xA5\u0441\u0442\x07",
  "\u0442\u0444f4\u0443\u0445\xA2R\u0444\u0443",
  "\u0444\u0445\u0445\xA7",
  "\u0446\u0447\x07,\u0447\xA9",
  "\u0448\u044A\x07$\u0449\u044B",
  "\xACW\u044A\u0449\u044A\u044B",
  "\u044B\xAB\u044C\u044D",
  "\x07\v\u044D\u0450d3\u044E\u0450",
  "\x98M\u044F\u044C\u044F\u044E",
  "\u0450\xAD\xA8\xB3\xB7",
  "\xB9\xC2\xCB\xCE\xD5\xDB\xE5\xEC\xF3\xF9\xFD\u0103",
  "\u0109\u010D\u0114\u0116\u0118\u011D\u011F\u0121\u0125\u012B\u012F\u0136",
  "\u0138\u013A\u013F\u0141\u0146\u014B\u0151\u0155\u015B\u0161\u0165\u016C",
  "\u016E\u0170\u0175\u0177\u0179\u017D\u0183\u0187\u018E\u0190\u0192\u0197",
  "\u0199\u019F\u01A6\u01AA\u01B6\u01BD\u01C2\u01C6\u01C9\u01CF\u01D3\u01D8",
  "\u01DC\u01E0\u01EE\u01F6\u01FE\u0200\u0204\u020D\u0214\u0216\u021F\u0224",
  "\u0229\u0230\u0234\u023B\u0243\u024C\u0255\u025C\u0267\u026D\u027A\u0280",
  "\u0289\u0294\u029F\u02A4\u02A9\u02AE\u02B6\u02BF\u02C5\u02C7\u02CF\u02D3",
  "\u02DB\u02DE\u02E2\u02E6\u02ED\u02F7\u02FF\u0305\u030D\u031D\u0327\u032F",
  "\u0337\u033F\u0347\u034F\u0355\u035A\u035D\u0363\u0369\u036E\u0373\u037B",
  "\u0381\u0385\u038B\u038F\u0393\u0395\u0399\u03A2\u03A9\u03AD\u03B1\u03B5",
  "\u03B8\u03BA\u03BE\u03C2\u03C7\u03CB\u03CF\u03D6\u03DA\u03E2\u03EC\u03F0",
  "\u03F4\u03F6\u03FA\u0400\u0404\u0408\u040A\u040C\u0412\u0415\u041F\u0423",
  "\u0427\u0431\u0435\u0438\u043F\u0444\u044A\u044F"
].join("");
const atn = new import_antlr4.default.atn.ATNDeserializer().deserialize(serializedATN);
const decisionsToDFA = atn.decisionToState.map((ds, index) => new import_antlr4.default.dfa.DFA(ds, index));
const sharedContextCache = new import_antlr4.default.PredictionContextCache();
class Python3Parser extends import_antlr4.default.Parser {
  static grammarFileName = "Python3Parser.g4";
  static literalNames = [
    null,
    null,
    null,
    null,
    null,
    null,
    "'def'",
    "'return'",
    "'raise'",
    "'from'",
    "'import'",
    "'as'",
    "'global'",
    "'nonlocal'",
    "'assert'",
    "'if'",
    "'elif'",
    "'else'",
    "'while'",
    "'for'",
    "'in'",
    "'try'",
    "'finally'",
    "'with'",
    "'except'",
    "'lambda'",
    "'or'",
    "'and'",
    "'not'",
    "'is'",
    "'None'",
    "'True'",
    "'False'",
    "'class'",
    "'yield'",
    "'del'",
    "'pass'",
    "'continue'",
    "'break'",
    "'async'",
    "'await'",
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
    "'.'",
    "'...'",
    "'*'",
    "'('",
    "')'",
    "','",
    "':'",
    "';'",
    "'**'",
    "'='",
    "'['",
    "']'",
    "'|'",
    "'^'",
    "'&'",
    "'<<'",
    "'>>'",
    "'+'",
    "'-'",
    "'/'",
    "'%'",
    "'//'",
    "'~'",
    "'{'",
    "'}'",
    "'<'",
    "'>'",
    "'=='",
    "'>='",
    "'<='",
    "'<>'",
    "'!='",
    "'@'",
    "'->'",
    "'+='",
    "'-='",
    "'*='",
    "'@='",
    "'/='",
    "'%='",
    "'&='",
    "'|='",
    "'^='",
    "'<<='",
    "'>>='",
    "'**='",
    "'//='"
  ];
  static symbolicNames = [
    null,
    "INDENT",
    "DEDENT",
    "STRING",
    "NUMBER",
    "INTEGER",
    "DEF",
    "RETURN",
    "RAISE",
    "FROM",
    "IMPORT",
    "AS",
    "GLOBAL",
    "NONLOCAL",
    "ASSERT",
    "IF",
    "ELIF",
    "ELSE",
    "WHILE",
    "FOR",
    "IN",
    "TRY",
    "FINALLY",
    "WITH",
    "EXCEPT",
    "LAMBDA",
    "OR",
    "AND",
    "NOT",
    "IS",
    "NONE",
    "TRUE",
    "FALSE",
    "CLASS",
    "YIELD",
    "DEL",
    "PASS",
    "CONTINUE",
    "BREAK",
    "ASYNC",
    "AWAIT",
    "NEWLINE",
    "NAME",
    "STRING_LITERAL",
    "BYTES_LITERAL",
    "DECIMAL_INTEGER",
    "OCT_INTEGER",
    "HEX_INTEGER",
    "BIN_INTEGER",
    "FLOAT_NUMBER",
    "IMAG_NUMBER",
    "DOT",
    "ELLIPSIS",
    "STAR",
    "OPEN_PAREN",
    "CLOSE_PAREN",
    "COMMA",
    "COLON",
    "SEMI_COLON",
    "POWER",
    "ASSIGN",
    "OPEN_BRACK",
    "CLOSE_BRACK",
    "OR_OP",
    "XOR",
    "AND_OP",
    "LEFT_SHIFT",
    "RIGHT_SHIFT",
    "ADD",
    "MINUS",
    "DIV",
    "MOD",
    "IDIV",
    "NOT_OP",
    "OPEN_BRACE",
    "CLOSE_BRACE",
    "LESS_THAN",
    "GREATER_THAN",
    "EQUALS",
    "GT_EQ",
    "LT_EQ",
    "NOT_EQ_1",
    "NOT_EQ_2",
    "AT",
    "ARROW",
    "ADD_ASSIGN",
    "SUB_ASSIGN",
    "MULT_ASSIGN",
    "AT_ASSIGN",
    "DIV_ASSIGN",
    "MOD_ASSIGN",
    "AND_ASSIGN",
    "OR_ASSIGN",
    "XOR_ASSIGN",
    "LEFT_SHIFT_ASSIGN",
    "RIGHT_SHIFT_ASSIGN",
    "POWER_ASSIGN",
    "IDIV_ASSIGN",
    "SKIP_",
    "UNKNOWN_CHAR"
  ];
  static ruleNames = [
    "single_input",
    "file_input",
    "eval_input",
    "decorator",
    "decorators",
    "decorated",
    "async_funcdef",
    "funcdef",
    "parameters",
    "typedargslist",
    "tfpdef",
    "varargslist",
    "vfpdef",
    "stmt",
    "simple_stmt",
    "small_stmt",
    "expr_stmt",
    "annassign",
    "testlist_star_expr",
    "augassign",
    "del_stmt",
    "pass_stmt",
    "flow_stmt",
    "break_stmt",
    "continue_stmt",
    "return_stmt",
    "yield_stmt",
    "raise_stmt",
    "import_stmt",
    "import_name",
    "import_from",
    "import_as_name",
    "dotted_as_name",
    "import_as_names",
    "dotted_as_names",
    "dotted_name",
    "global_stmt",
    "nonlocal_stmt",
    "assert_stmt",
    "compound_stmt",
    "async_stmt",
    "if_stmt",
    "while_stmt",
    "for_stmt",
    "try_stmt",
    "with_stmt",
    "with_item",
    "except_clause",
    "suite",
    "test",
    "test_nocond",
    "lambdef",
    "lambdef_nocond",
    "or_test",
    "and_test",
    "not_test",
    "comparison",
    "comp_op",
    "star_expr",
    "expr",
    "xor_expr",
    "and_expr",
    "shift_expr",
    "arith_expr",
    "term",
    "factor",
    "power",
    "atom_expr",
    "atom",
    "testlist_comp",
    "trailer",
    "subscriptlist",
    "subscript_",
    "sliceop",
    "exprlist",
    "testlist",
    "dictorsetmaker",
    "classdef",
    "arglist",
    "argument",
    "comp_iter",
    "comp_for",
    "comp_if",
    "encoding_decl",
    "yield_expr",
    "yield_arg"
  ];
  constructor(input) {
    super(input);
    this._interp = new import_antlr4.default.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = Python3Parser.ruleNames;
    this.literalNames = Python3Parser.literalNames;
    this.symbolicNames = Python3Parser.symbolicNames;
  }
  get atn() {
    return atn;
  }
  single_input() {
    let localctx = new Single_inputContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, Python3Parser.RULE_single_input);
    try {
      this.state = 177;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.NEWLINE:
          this.enterOuterAlt(localctx, 1);
          this.state = 172;
          this.match(Python3Parser.NEWLINE);
          break;
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.RETURN:
        case Python3Parser.RAISE:
        case Python3Parser.FROM:
        case Python3Parser.IMPORT:
        case Python3Parser.GLOBAL:
        case Python3Parser.NONLOCAL:
        case Python3Parser.ASSERT:
        case Python3Parser.LAMBDA:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.YIELD:
        case Python3Parser.DEL:
        case Python3Parser.PASS:
        case Python3Parser.CONTINUE:
        case Python3Parser.BREAK:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.STAR:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 2);
          this.state = 173;
          this.simple_stmt();
          break;
        case Python3Parser.DEF:
        case Python3Parser.IF:
        case Python3Parser.WHILE:
        case Python3Parser.FOR:
        case Python3Parser.TRY:
        case Python3Parser.WITH:
        case Python3Parser.CLASS:
        case Python3Parser.ASYNC:
        case Python3Parser.AT:
          this.enterOuterAlt(localctx, 3);
          this.state = 174;
          this.compound_stmt();
          this.state = 175;
          this.match(Python3Parser.NEWLINE);
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
  file_input() {
    let localctx = new File_inputContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, Python3Parser.RULE_file_input);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 183;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.DEF | 1 << Python3Parser.RETURN | 1 << Python3Parser.RAISE | 1 << Python3Parser.FROM | 1 << Python3Parser.IMPORT | 1 << Python3Parser.GLOBAL | 1 << Python3Parser.NONLOCAL | 1 << Python3Parser.ASSERT | 1 << Python3Parser.IF | 1 << Python3Parser.WHILE | 1 << Python3Parser.FOR | 1 << Python3Parser.TRY | 1 << Python3Parser.WITH | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.CLASS - 32 | 1 << Python3Parser.YIELD - 32 | 1 << Python3Parser.DEL - 32 | 1 << Python3Parser.PASS - 32 | 1 << Python3Parser.CONTINUE - 32 | 1 << Python3Parser.BREAK - 32 | 1 << Python3Parser.ASYNC - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NEWLINE - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.STAR - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68 | 1 << Python3Parser.AT - 68)) !== 0) {
        this.state = 181;
        this._errHandler.sync(this);
        switch (this._input.LA(1)) {
          case Python3Parser.NEWLINE:
            this.state = 179;
            this.match(Python3Parser.NEWLINE);
            break;
          case Python3Parser.STRING:
          case Python3Parser.NUMBER:
          case Python3Parser.DEF:
          case Python3Parser.RETURN:
          case Python3Parser.RAISE:
          case Python3Parser.FROM:
          case Python3Parser.IMPORT:
          case Python3Parser.GLOBAL:
          case Python3Parser.NONLOCAL:
          case Python3Parser.ASSERT:
          case Python3Parser.IF:
          case Python3Parser.WHILE:
          case Python3Parser.FOR:
          case Python3Parser.TRY:
          case Python3Parser.WITH:
          case Python3Parser.LAMBDA:
          case Python3Parser.NOT:
          case Python3Parser.NONE:
          case Python3Parser.TRUE:
          case Python3Parser.FALSE:
          case Python3Parser.CLASS:
          case Python3Parser.YIELD:
          case Python3Parser.DEL:
          case Python3Parser.PASS:
          case Python3Parser.CONTINUE:
          case Python3Parser.BREAK:
          case Python3Parser.ASYNC:
          case Python3Parser.AWAIT:
          case Python3Parser.NAME:
          case Python3Parser.ELLIPSIS:
          case Python3Parser.STAR:
          case Python3Parser.OPEN_PAREN:
          case Python3Parser.OPEN_BRACK:
          case Python3Parser.ADD:
          case Python3Parser.MINUS:
          case Python3Parser.NOT_OP:
          case Python3Parser.OPEN_BRACE:
          case Python3Parser.AT:
            this.state = 180;
            this.stmt();
            break;
          default:
            throw new import_antlr4.default.error.NoViableAltException(this);
        }
        this.state = 185;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 186;
      this.match(Python3Parser.EOF);
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
  eval_input() {
    let localctx = new Eval_inputContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, Python3Parser.RULE_eval_input);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 188;
      this.testlist();
      this.state = 192;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.NEWLINE) {
        this.state = 189;
        this.match(Python3Parser.NEWLINE);
        this.state = 194;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 195;
      this.match(Python3Parser.EOF);
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
  decorator() {
    let localctx = new DecoratorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, Python3Parser.RULE_decorator);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 197;
      this.match(Python3Parser.AT);
      this.state = 198;
      this.dotted_name();
      this.state = 204;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.OPEN_PAREN) {
        this.state = 199;
        this.match(Python3Parser.OPEN_PAREN);
        this.state = 201;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.STAR - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.POWER - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
          this.state = 200;
          this.arglist();
        }
        this.state = 203;
        this.match(Python3Parser.CLOSE_PAREN);
      }
      this.state = 206;
      this.match(Python3Parser.NEWLINE);
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
  decorators() {
    let localctx = new DecoratorsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, Python3Parser.RULE_decorators);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 209;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      do {
        this.state = 208;
        this.decorator();
        this.state = 211;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      } while (_la === Python3Parser.AT);
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
  decorated() {
    let localctx = new DecoratedContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, Python3Parser.RULE_decorated);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 213;
      this.decorators();
      this.state = 217;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.CLASS:
          this.state = 214;
          this.classdef();
          break;
        case Python3Parser.DEF:
          this.state = 215;
          this.funcdef();
          break;
        case Python3Parser.ASYNC:
          this.state = 216;
          this.async_funcdef();
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
  async_funcdef() {
    let localctx = new Async_funcdefContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, Python3Parser.RULE_async_funcdef);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 219;
      this.match(Python3Parser.ASYNC);
      this.state = 220;
      this.funcdef();
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
  funcdef() {
    let localctx = new FuncdefContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, Python3Parser.RULE_funcdef);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 222;
      this.match(Python3Parser.DEF);
      this.state = 223;
      this.match(Python3Parser.NAME);
      this.state = 224;
      this.parameters();
      this.state = 227;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.ARROW) {
        this.state = 225;
        this.match(Python3Parser.ARROW);
        this.state = 226;
        this.test();
      }
      this.state = 229;
      this.match(Python3Parser.COLON);
      this.state = 230;
      this.suite();
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
    this.enterRule(localctx, 16, Python3Parser.RULE_parameters);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 232;
      this.match(Python3Parser.OPEN_PAREN);
      this.state = 234;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 42 & ~31) == 0 && (1 << _la - 42 & (1 << Python3Parser.NAME - 42 | 1 << Python3Parser.STAR - 42 | 1 << Python3Parser.POWER - 42)) !== 0) {
        this.state = 233;
        this.typedargslist();
      }
      this.state = 236;
      this.match(Python3Parser.CLOSE_PAREN);
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
  typedargslist() {
    let localctx = new TypedargslistContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, Python3Parser.RULE_typedargslist);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 319;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.NAME:
          this.state = 238;
          this.tfpdef();
          this.state = 241;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.ASSIGN) {
            this.state = 239;
            this.match(Python3Parser.ASSIGN);
            this.state = 240;
            this.test();
          }
          this.state = 251;
          this._errHandler.sync(this);
          var _alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
          while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt === 1) {
              this.state = 243;
              this.match(Python3Parser.COMMA);
              this.state = 244;
              this.tfpdef();
              this.state = 247;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.ASSIGN) {
                this.state = 245;
                this.match(Python3Parser.ASSIGN);
                this.state = 246;
                this.test();
              }
            }
            this.state = 253;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input, 12, this._ctx);
          }
          this.state = 287;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COMMA) {
            this.state = 254;
            this.match(Python3Parser.COMMA);
            this.state = 285;
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
              case Python3Parser.STAR:
                this.state = 255;
                this.match(Python3Parser.STAR);
                this.state = 257;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if (_la === Python3Parser.NAME) {
                  this.state = 256;
                  this.tfpdef();
                }
                this.state = 267;
                this._errHandler.sync(this);
                var _alt = this._interp.adaptivePredict(this._input, 15, this._ctx);
                while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt === 1) {
                    this.state = 259;
                    this.match(Python3Parser.COMMA);
                    this.state = 260;
                    this.tfpdef();
                    this.state = 263;
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    if (_la === Python3Parser.ASSIGN) {
                      this.state = 261;
                      this.match(Python3Parser.ASSIGN);
                      this.state = 262;
                      this.test();
                    }
                  }
                  this.state = 269;
                  this._errHandler.sync(this);
                  _alt = this._interp.adaptivePredict(this._input, 15, this._ctx);
                }
                this.state = 278;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if (_la === Python3Parser.COMMA) {
                  this.state = 270;
                  this.match(Python3Parser.COMMA);
                  this.state = 276;
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                  if (_la === Python3Parser.POWER) {
                    this.state = 271;
                    this.match(Python3Parser.POWER);
                    this.state = 272;
                    this.tfpdef();
                    this.state = 274;
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    if (_la === Python3Parser.COMMA) {
                      this.state = 273;
                      this.match(Python3Parser.COMMA);
                    }
                  }
                }
                break;
              case Python3Parser.POWER:
                this.state = 280;
                this.match(Python3Parser.POWER);
                this.state = 281;
                this.tfpdef();
                this.state = 283;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if (_la === Python3Parser.COMMA) {
                  this.state = 282;
                  this.match(Python3Parser.COMMA);
                }
                break;
              case Python3Parser.CLOSE_PAREN:
                break;
              default:
                break;
            }
          }
          break;
        case Python3Parser.STAR:
          this.state = 289;
          this.match(Python3Parser.STAR);
          this.state = 291;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.NAME) {
            this.state = 290;
            this.tfpdef();
          }
          this.state = 301;
          this._errHandler.sync(this);
          var _alt = this._interp.adaptivePredict(this._input, 24, this._ctx);
          while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt === 1) {
              this.state = 293;
              this.match(Python3Parser.COMMA);
              this.state = 294;
              this.tfpdef();
              this.state = 297;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.ASSIGN) {
                this.state = 295;
                this.match(Python3Parser.ASSIGN);
                this.state = 296;
                this.test();
              }
            }
            this.state = 303;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input, 24, this._ctx);
          }
          this.state = 312;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COMMA) {
            this.state = 304;
            this.match(Python3Parser.COMMA);
            this.state = 310;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if (_la === Python3Parser.POWER) {
              this.state = 305;
              this.match(Python3Parser.POWER);
              this.state = 306;
              this.tfpdef();
              this.state = 308;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.COMMA) {
                this.state = 307;
                this.match(Python3Parser.COMMA);
              }
            }
          }
          break;
        case Python3Parser.POWER:
          this.state = 314;
          this.match(Python3Parser.POWER);
          this.state = 315;
          this.tfpdef();
          this.state = 317;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COMMA) {
            this.state = 316;
            this.match(Python3Parser.COMMA);
          }
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
  tfpdef() {
    let localctx = new TfpdefContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, Python3Parser.RULE_tfpdef);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 321;
      this.match(Python3Parser.NAME);
      this.state = 324;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COLON) {
        this.state = 322;
        this.match(Python3Parser.COLON);
        this.state = 323;
        this.test();
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
  varargslist() {
    let localctx = new VarargslistContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, Python3Parser.RULE_varargslist);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 407;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.NAME:
          this.state = 326;
          this.vfpdef();
          this.state = 329;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.ASSIGN) {
            this.state = 327;
            this.match(Python3Parser.ASSIGN);
            this.state = 328;
            this.test();
          }
          this.state = 339;
          this._errHandler.sync(this);
          var _alt = this._interp.adaptivePredict(this._input, 33, this._ctx);
          while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt === 1) {
              this.state = 331;
              this.match(Python3Parser.COMMA);
              this.state = 332;
              this.vfpdef();
              this.state = 335;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.ASSIGN) {
                this.state = 333;
                this.match(Python3Parser.ASSIGN);
                this.state = 334;
                this.test();
              }
            }
            this.state = 341;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input, 33, this._ctx);
          }
          this.state = 375;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COMMA) {
            this.state = 342;
            this.match(Python3Parser.COMMA);
            this.state = 373;
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
              case Python3Parser.STAR:
                this.state = 343;
                this.match(Python3Parser.STAR);
                this.state = 345;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if (_la === Python3Parser.NAME) {
                  this.state = 344;
                  this.vfpdef();
                }
                this.state = 355;
                this._errHandler.sync(this);
                var _alt = this._interp.adaptivePredict(this._input, 36, this._ctx);
                while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
                  if (_alt === 1) {
                    this.state = 347;
                    this.match(Python3Parser.COMMA);
                    this.state = 348;
                    this.vfpdef();
                    this.state = 351;
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    if (_la === Python3Parser.ASSIGN) {
                      this.state = 349;
                      this.match(Python3Parser.ASSIGN);
                      this.state = 350;
                      this.test();
                    }
                  }
                  this.state = 357;
                  this._errHandler.sync(this);
                  _alt = this._interp.adaptivePredict(this._input, 36, this._ctx);
                }
                this.state = 366;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if (_la === Python3Parser.COMMA) {
                  this.state = 358;
                  this.match(Python3Parser.COMMA);
                  this.state = 364;
                  this._errHandler.sync(this);
                  _la = this._input.LA(1);
                  if (_la === Python3Parser.POWER) {
                    this.state = 359;
                    this.match(Python3Parser.POWER);
                    this.state = 360;
                    this.vfpdef();
                    this.state = 362;
                    this._errHandler.sync(this);
                    _la = this._input.LA(1);
                    if (_la === Python3Parser.COMMA) {
                      this.state = 361;
                      this.match(Python3Parser.COMMA);
                    }
                  }
                }
                break;
              case Python3Parser.POWER:
                this.state = 368;
                this.match(Python3Parser.POWER);
                this.state = 369;
                this.vfpdef();
                this.state = 371;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
                if (_la === Python3Parser.COMMA) {
                  this.state = 370;
                  this.match(Python3Parser.COMMA);
                }
                break;
              case Python3Parser.COLON:
                break;
              default:
                break;
            }
          }
          break;
        case Python3Parser.STAR:
          this.state = 377;
          this.match(Python3Parser.STAR);
          this.state = 379;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.NAME) {
            this.state = 378;
            this.vfpdef();
          }
          this.state = 389;
          this._errHandler.sync(this);
          var _alt = this._interp.adaptivePredict(this._input, 45, this._ctx);
          while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt === 1) {
              this.state = 381;
              this.match(Python3Parser.COMMA);
              this.state = 382;
              this.vfpdef();
              this.state = 385;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.ASSIGN) {
                this.state = 383;
                this.match(Python3Parser.ASSIGN);
                this.state = 384;
                this.test();
              }
            }
            this.state = 391;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input, 45, this._ctx);
          }
          this.state = 400;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COMMA) {
            this.state = 392;
            this.match(Python3Parser.COMMA);
            this.state = 398;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            if (_la === Python3Parser.POWER) {
              this.state = 393;
              this.match(Python3Parser.POWER);
              this.state = 394;
              this.vfpdef();
              this.state = 396;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.COMMA) {
                this.state = 395;
                this.match(Python3Parser.COMMA);
              }
            }
          }
          break;
        case Python3Parser.POWER:
          this.state = 402;
          this.match(Python3Parser.POWER);
          this.state = 403;
          this.vfpdef();
          this.state = 405;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COMMA) {
            this.state = 404;
            this.match(Python3Parser.COMMA);
          }
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
  vfpdef() {
    let localctx = new VfpdefContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, Python3Parser.RULE_vfpdef);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 409;
      this.match(Python3Parser.NAME);
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
  stmt() {
    let localctx = new StmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, Python3Parser.RULE_stmt);
    try {
      this.state = 413;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.RETURN:
        case Python3Parser.RAISE:
        case Python3Parser.FROM:
        case Python3Parser.IMPORT:
        case Python3Parser.GLOBAL:
        case Python3Parser.NONLOCAL:
        case Python3Parser.ASSERT:
        case Python3Parser.LAMBDA:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.YIELD:
        case Python3Parser.DEL:
        case Python3Parser.PASS:
        case Python3Parser.CONTINUE:
        case Python3Parser.BREAK:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.STAR:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 1);
          this.state = 411;
          this.simple_stmt();
          break;
        case Python3Parser.DEF:
        case Python3Parser.IF:
        case Python3Parser.WHILE:
        case Python3Parser.FOR:
        case Python3Parser.TRY:
        case Python3Parser.WITH:
        case Python3Parser.CLASS:
        case Python3Parser.ASYNC:
        case Python3Parser.AT:
          this.enterOuterAlt(localctx, 2);
          this.state = 412;
          this.compound_stmt();
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
  simple_stmt() {
    let localctx = new Simple_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, Python3Parser.RULE_simple_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 415;
      this.small_stmt();
      this.state = 420;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 52, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 416;
          this.match(Python3Parser.SEMI_COLON);
          this.state = 417;
          this.small_stmt();
        }
        this.state = 422;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 52, this._ctx);
      }
      this.state = 424;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.SEMI_COLON) {
        this.state = 423;
        this.match(Python3Parser.SEMI_COLON);
      }
      this.state = 426;
      this.match(Python3Parser.NEWLINE);
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
  small_stmt() {
    let localctx = new Small_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, Python3Parser.RULE_small_stmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 436;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.LAMBDA:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.STAR:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.state = 428;
          this.expr_stmt();
          break;
        case Python3Parser.DEL:
          this.state = 429;
          this.del_stmt();
          break;
        case Python3Parser.PASS:
          this.state = 430;
          this.pass_stmt();
          break;
        case Python3Parser.RETURN:
        case Python3Parser.RAISE:
        case Python3Parser.YIELD:
        case Python3Parser.CONTINUE:
        case Python3Parser.BREAK:
          this.state = 431;
          this.flow_stmt();
          break;
        case Python3Parser.FROM:
        case Python3Parser.IMPORT:
          this.state = 432;
          this.import_stmt();
          break;
        case Python3Parser.GLOBAL:
          this.state = 433;
          this.global_stmt();
          break;
        case Python3Parser.NONLOCAL:
          this.state = 434;
          this.nonlocal_stmt();
          break;
        case Python3Parser.ASSERT:
          this.state = 435;
          this.assert_stmt();
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
  expr_stmt() {
    let localctx = new Expr_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, Python3Parser.RULE_expr_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 438;
      this.testlist_star_expr();
      this.state = 455;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.COLON:
          this.state = 439;
          this.annassign();
          break;
        case Python3Parser.ADD_ASSIGN:
        case Python3Parser.SUB_ASSIGN:
        case Python3Parser.MULT_ASSIGN:
        case Python3Parser.AT_ASSIGN:
        case Python3Parser.DIV_ASSIGN:
        case Python3Parser.MOD_ASSIGN:
        case Python3Parser.AND_ASSIGN:
        case Python3Parser.OR_ASSIGN:
        case Python3Parser.XOR_ASSIGN:
        case Python3Parser.LEFT_SHIFT_ASSIGN:
        case Python3Parser.RIGHT_SHIFT_ASSIGN:
        case Python3Parser.POWER_ASSIGN:
        case Python3Parser.IDIV_ASSIGN:
          this.state = 440;
          this.augassign();
          this.state = 443;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.YIELD:
              this.state = 441;
              this.yield_expr();
              break;
            case Python3Parser.STRING:
            case Python3Parser.NUMBER:
            case Python3Parser.LAMBDA:
            case Python3Parser.NOT:
            case Python3Parser.NONE:
            case Python3Parser.TRUE:
            case Python3Parser.FALSE:
            case Python3Parser.AWAIT:
            case Python3Parser.NAME:
            case Python3Parser.ELLIPSIS:
            case Python3Parser.OPEN_PAREN:
            case Python3Parser.OPEN_BRACK:
            case Python3Parser.ADD:
            case Python3Parser.MINUS:
            case Python3Parser.NOT_OP:
            case Python3Parser.OPEN_BRACE:
              this.state = 442;
              this.testlist();
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
          }
          break;
        case Python3Parser.NEWLINE:
        case Python3Parser.SEMI_COLON:
        case Python3Parser.ASSIGN:
          this.state = 452;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          while (_la === Python3Parser.ASSIGN) {
            this.state = 445;
            this.match(Python3Parser.ASSIGN);
            this.state = 448;
            this._errHandler.sync(this);
            switch (this._input.LA(1)) {
              case Python3Parser.YIELD:
                this.state = 446;
                this.yield_expr();
                break;
              case Python3Parser.STRING:
              case Python3Parser.NUMBER:
              case Python3Parser.LAMBDA:
              case Python3Parser.NOT:
              case Python3Parser.NONE:
              case Python3Parser.TRUE:
              case Python3Parser.FALSE:
              case Python3Parser.AWAIT:
              case Python3Parser.NAME:
              case Python3Parser.ELLIPSIS:
              case Python3Parser.STAR:
              case Python3Parser.OPEN_PAREN:
              case Python3Parser.OPEN_BRACK:
              case Python3Parser.ADD:
              case Python3Parser.MINUS:
              case Python3Parser.NOT_OP:
              case Python3Parser.OPEN_BRACE:
                this.state = 447;
                this.testlist_star_expr();
                break;
              default:
                throw new import_antlr4.default.error.NoViableAltException(this);
            }
            this.state = 454;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          }
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
  annassign() {
    let localctx = new AnnassignContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, Python3Parser.RULE_annassign);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 457;
      this.match(Python3Parser.COLON);
      this.state = 458;
      this.test();
      this.state = 461;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.ASSIGN) {
        this.state = 459;
        this.match(Python3Parser.ASSIGN);
        this.state = 460;
        this.test();
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
  testlist_star_expr() {
    let localctx = new Testlist_star_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 36, Python3Parser.RULE_testlist_star_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 465;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.LAMBDA:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.state = 463;
          this.test();
          break;
        case Python3Parser.STAR:
          this.state = 464;
          this.star_expr();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
      this.state = 474;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 62, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 467;
          this.match(Python3Parser.COMMA);
          this.state = 470;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.STRING:
            case Python3Parser.NUMBER:
            case Python3Parser.LAMBDA:
            case Python3Parser.NOT:
            case Python3Parser.NONE:
            case Python3Parser.TRUE:
            case Python3Parser.FALSE:
            case Python3Parser.AWAIT:
            case Python3Parser.NAME:
            case Python3Parser.ELLIPSIS:
            case Python3Parser.OPEN_PAREN:
            case Python3Parser.OPEN_BRACK:
            case Python3Parser.ADD:
            case Python3Parser.MINUS:
            case Python3Parser.NOT_OP:
            case Python3Parser.OPEN_BRACE:
              this.state = 468;
              this.test();
              break;
            case Python3Parser.STAR:
              this.state = 469;
              this.star_expr();
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
          }
        }
        this.state = 476;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 62, this._ctx);
      }
      this.state = 478;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COMMA) {
        this.state = 477;
        this.match(Python3Parser.COMMA);
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
  augassign() {
    let localctx = new AugassignContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, Python3Parser.RULE_augassign);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 480;
      _la = this._input.LA(1);
      if (!((_la - 85 & ~31) == 0 && (1 << _la - 85 & (1 << Python3Parser.ADD_ASSIGN - 85 | 1 << Python3Parser.SUB_ASSIGN - 85 | 1 << Python3Parser.MULT_ASSIGN - 85 | 1 << Python3Parser.AT_ASSIGN - 85 | 1 << Python3Parser.DIV_ASSIGN - 85 | 1 << Python3Parser.MOD_ASSIGN - 85 | 1 << Python3Parser.AND_ASSIGN - 85 | 1 << Python3Parser.OR_ASSIGN - 85 | 1 << Python3Parser.XOR_ASSIGN - 85 | 1 << Python3Parser.LEFT_SHIFT_ASSIGN - 85 | 1 << Python3Parser.RIGHT_SHIFT_ASSIGN - 85 | 1 << Python3Parser.POWER_ASSIGN - 85 | 1 << Python3Parser.IDIV_ASSIGN - 85)) !== 0)) {
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
  del_stmt() {
    let localctx = new Del_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 40, Python3Parser.RULE_del_stmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 482;
      this.match(Python3Parser.DEL);
      this.state = 483;
      this.exprlist();
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
  pass_stmt() {
    let localctx = new Pass_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 42, Python3Parser.RULE_pass_stmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 485;
      this.match(Python3Parser.PASS);
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
  flow_stmt() {
    let localctx = new Flow_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 44, Python3Parser.RULE_flow_stmt);
    try {
      this.state = 492;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.BREAK:
          this.enterOuterAlt(localctx, 1);
          this.state = 487;
          this.break_stmt();
          break;
        case Python3Parser.CONTINUE:
          this.enterOuterAlt(localctx, 2);
          this.state = 488;
          this.continue_stmt();
          break;
        case Python3Parser.RETURN:
          this.enterOuterAlt(localctx, 3);
          this.state = 489;
          this.return_stmt();
          break;
        case Python3Parser.RAISE:
          this.enterOuterAlt(localctx, 4);
          this.state = 490;
          this.raise_stmt();
          break;
        case Python3Parser.YIELD:
          this.enterOuterAlt(localctx, 5);
          this.state = 491;
          this.yield_stmt();
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
  break_stmt() {
    let localctx = new Break_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 46, Python3Parser.RULE_break_stmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 494;
      this.match(Python3Parser.BREAK);
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
  continue_stmt() {
    let localctx = new Continue_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 48, Python3Parser.RULE_continue_stmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 496;
      this.match(Python3Parser.CONTINUE);
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
  return_stmt() {
    let localctx = new Return_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 50, Python3Parser.RULE_return_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 498;
      this.match(Python3Parser.RETURN);
      this.state = 500;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
        this.state = 499;
        this.testlist();
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
  yield_stmt() {
    let localctx = new Yield_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 52, Python3Parser.RULE_yield_stmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 502;
      this.yield_expr();
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
  raise_stmt() {
    let localctx = new Raise_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 54, Python3Parser.RULE_raise_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 504;
      this.match(Python3Parser.RAISE);
      this.state = 510;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
        this.state = 505;
        this.test();
        this.state = 508;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === Python3Parser.FROM) {
          this.state = 506;
          this.match(Python3Parser.FROM);
          this.state = 507;
          this.test();
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
  import_stmt() {
    let localctx = new Import_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 56, Python3Parser.RULE_import_stmt);
    try {
      this.state = 514;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.IMPORT:
          this.enterOuterAlt(localctx, 1);
          this.state = 512;
          this.import_name();
          break;
        case Python3Parser.FROM:
          this.enterOuterAlt(localctx, 2);
          this.state = 513;
          this.import_from();
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
  import_name() {
    let localctx = new Import_nameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 58, Python3Parser.RULE_import_name);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 516;
      this.match(Python3Parser.IMPORT);
      this.state = 517;
      this.dotted_as_names();
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
  import_from() {
    let localctx = new Import_fromContext(this, this._ctx, this.state);
    this.enterRule(localctx, 60, Python3Parser.RULE_import_from);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 519;
      this.match(Python3Parser.FROM);
      this.state = 532;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 71, this._ctx);
      switch (la_) {
        case 1:
          this.state = 523;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          while (_la === Python3Parser.DOT || _la === Python3Parser.ELLIPSIS) {
            this.state = 520;
            _la = this._input.LA(1);
            if (!(_la === Python3Parser.DOT || _la === Python3Parser.ELLIPSIS)) {
              this._errHandler.recoverInline(this);
            } else {
              this._errHandler.reportMatch(this);
              this.consume();
            }
            this.state = 525;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          }
          this.state = 526;
          this.dotted_name();
          break;
        case 2:
          this.state = 528;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          do {
            this.state = 527;
            _la = this._input.LA(1);
            if (!(_la === Python3Parser.DOT || _la === Python3Parser.ELLIPSIS)) {
              this._errHandler.recoverInline(this);
            } else {
              this._errHandler.reportMatch(this);
              this.consume();
            }
            this.state = 530;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          } while (_la === Python3Parser.DOT || _la === Python3Parser.ELLIPSIS);
          break;
      }
      this.state = 534;
      this.match(Python3Parser.IMPORT);
      this.state = 541;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STAR:
          this.state = 535;
          this.match(Python3Parser.STAR);
          break;
        case Python3Parser.OPEN_PAREN:
          this.state = 536;
          this.match(Python3Parser.OPEN_PAREN);
          this.state = 537;
          this.import_as_names();
          this.state = 538;
          this.match(Python3Parser.CLOSE_PAREN);
          break;
        case Python3Parser.NAME:
          this.state = 540;
          this.import_as_names();
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
  import_as_name() {
    let localctx = new Import_as_nameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 62, Python3Parser.RULE_import_as_name);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 543;
      this.match(Python3Parser.NAME);
      this.state = 546;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.AS) {
        this.state = 544;
        this.match(Python3Parser.AS);
        this.state = 545;
        this.match(Python3Parser.NAME);
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
  dotted_as_name() {
    let localctx = new Dotted_as_nameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 64, Python3Parser.RULE_dotted_as_name);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 548;
      this.dotted_name();
      this.state = 551;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.AS) {
        this.state = 549;
        this.match(Python3Parser.AS);
        this.state = 550;
        this.match(Python3Parser.NAME);
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
  import_as_names() {
    let localctx = new Import_as_namesContext(this, this._ctx, this.state);
    this.enterRule(localctx, 66, Python3Parser.RULE_import_as_names);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 553;
      this.import_as_name();
      this.state = 558;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 75, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 554;
          this.match(Python3Parser.COMMA);
          this.state = 555;
          this.import_as_name();
        }
        this.state = 560;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 75, this._ctx);
      }
      this.state = 562;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COMMA) {
        this.state = 561;
        this.match(Python3Parser.COMMA);
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
  dotted_as_names() {
    let localctx = new Dotted_as_namesContext(this, this._ctx, this.state);
    this.enterRule(localctx, 68, Python3Parser.RULE_dotted_as_names);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 564;
      this.dotted_as_name();
      this.state = 569;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.COMMA) {
        this.state = 565;
        this.match(Python3Parser.COMMA);
        this.state = 566;
        this.dotted_as_name();
        this.state = 571;
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
  dotted_name() {
    let localctx = new Dotted_nameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 70, Python3Parser.RULE_dotted_name);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 572;
      this.match(Python3Parser.NAME);
      this.state = 577;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.DOT) {
        this.state = 573;
        this.match(Python3Parser.DOT);
        this.state = 574;
        this.match(Python3Parser.NAME);
        this.state = 579;
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
  global_stmt() {
    let localctx = new Global_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 72, Python3Parser.RULE_global_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 580;
      this.match(Python3Parser.GLOBAL);
      this.state = 581;
      this.match(Python3Parser.NAME);
      this.state = 586;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.COMMA) {
        this.state = 582;
        this.match(Python3Parser.COMMA);
        this.state = 583;
        this.match(Python3Parser.NAME);
        this.state = 588;
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
  nonlocal_stmt() {
    let localctx = new Nonlocal_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 74, Python3Parser.RULE_nonlocal_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 589;
      this.match(Python3Parser.NONLOCAL);
      this.state = 590;
      this.match(Python3Parser.NAME);
      this.state = 595;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.COMMA) {
        this.state = 591;
        this.match(Python3Parser.COMMA);
        this.state = 592;
        this.match(Python3Parser.NAME);
        this.state = 597;
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
  assert_stmt() {
    let localctx = new Assert_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 76, Python3Parser.RULE_assert_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 598;
      this.match(Python3Parser.ASSERT);
      this.state = 599;
      this.test();
      this.state = 602;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COMMA) {
        this.state = 600;
        this.match(Python3Parser.COMMA);
        this.state = 601;
        this.test();
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
  compound_stmt() {
    let localctx = new Compound_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 78, Python3Parser.RULE_compound_stmt);
    try {
      this.state = 613;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.IF:
          this.enterOuterAlt(localctx, 1);
          this.state = 604;
          this.if_stmt();
          break;
        case Python3Parser.WHILE:
          this.enterOuterAlt(localctx, 2);
          this.state = 605;
          this.while_stmt();
          break;
        case Python3Parser.FOR:
          this.enterOuterAlt(localctx, 3);
          this.state = 606;
          this.for_stmt();
          break;
        case Python3Parser.TRY:
          this.enterOuterAlt(localctx, 4);
          this.state = 607;
          this.try_stmt();
          break;
        case Python3Parser.WITH:
          this.enterOuterAlt(localctx, 5);
          this.state = 608;
          this.with_stmt();
          break;
        case Python3Parser.DEF:
          this.enterOuterAlt(localctx, 6);
          this.state = 609;
          this.funcdef();
          break;
        case Python3Parser.CLASS:
          this.enterOuterAlt(localctx, 7);
          this.state = 610;
          this.classdef();
          break;
        case Python3Parser.AT:
          this.enterOuterAlt(localctx, 8);
          this.state = 611;
          this.decorated();
          break;
        case Python3Parser.ASYNC:
          this.enterOuterAlt(localctx, 9);
          this.state = 612;
          this.async_stmt();
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
  async_stmt() {
    let localctx = new Async_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 80, Python3Parser.RULE_async_stmt);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 615;
      this.match(Python3Parser.ASYNC);
      this.state = 619;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.DEF:
          this.state = 616;
          this.funcdef();
          break;
        case Python3Parser.WITH:
          this.state = 617;
          this.with_stmt();
          break;
        case Python3Parser.FOR:
          this.state = 618;
          this.for_stmt();
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
  if_stmt() {
    let localctx = new If_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 82, Python3Parser.RULE_if_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 621;
      this.match(Python3Parser.IF);
      this.state = 622;
      this.test();
      this.state = 623;
      this.match(Python3Parser.COLON);
      this.state = 624;
      this.suite();
      this.state = 632;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.ELIF) {
        this.state = 625;
        this.match(Python3Parser.ELIF);
        this.state = 626;
        this.test();
        this.state = 627;
        this.match(Python3Parser.COLON);
        this.state = 628;
        this.suite();
        this.state = 634;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 638;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.ELSE) {
        this.state = 635;
        this.match(Python3Parser.ELSE);
        this.state = 636;
        this.match(Python3Parser.COLON);
        this.state = 637;
        this.suite();
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
  while_stmt() {
    let localctx = new While_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 84, Python3Parser.RULE_while_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 640;
      this.match(Python3Parser.WHILE);
      this.state = 641;
      this.test();
      this.state = 642;
      this.match(Python3Parser.COLON);
      this.state = 643;
      this.suite();
      this.state = 647;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.ELSE) {
        this.state = 644;
        this.match(Python3Parser.ELSE);
        this.state = 645;
        this.match(Python3Parser.COLON);
        this.state = 646;
        this.suite();
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
  for_stmt() {
    let localctx = new For_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 86, Python3Parser.RULE_for_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 649;
      this.match(Python3Parser.FOR);
      this.state = 650;
      this.exprlist();
      this.state = 651;
      this.match(Python3Parser.IN);
      this.state = 652;
      this.testlist();
      this.state = 653;
      this.match(Python3Parser.COLON);
      this.state = 654;
      this.suite();
      this.state = 658;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.ELSE) {
        this.state = 655;
        this.match(Python3Parser.ELSE);
        this.state = 656;
        this.match(Python3Parser.COLON);
        this.state = 657;
        this.suite();
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
  try_stmt() {
    let localctx = new Try_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 88, Python3Parser.RULE_try_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 660;
      this.match(Python3Parser.TRY);
      this.state = 661;
      this.match(Python3Parser.COLON);
      this.state = 662;
      this.suite();
      this.state = 684;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.EXCEPT:
          this.state = 667;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          do {
            this.state = 663;
            this.except_clause();
            this.state = 664;
            this.match(Python3Parser.COLON);
            this.state = 665;
            this.suite();
            this.state = 669;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          } while (_la === Python3Parser.EXCEPT);
          this.state = 674;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.ELSE) {
            this.state = 671;
            this.match(Python3Parser.ELSE);
            this.state = 672;
            this.match(Python3Parser.COLON);
            this.state = 673;
            this.suite();
          }
          this.state = 679;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.FINALLY) {
            this.state = 676;
            this.match(Python3Parser.FINALLY);
            this.state = 677;
            this.match(Python3Parser.COLON);
            this.state = 678;
            this.suite();
          }
          break;
        case Python3Parser.FINALLY:
          this.state = 681;
          this.match(Python3Parser.FINALLY);
          this.state = 682;
          this.match(Python3Parser.COLON);
          this.state = 683;
          this.suite();
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
  with_stmt() {
    let localctx = new With_stmtContext(this, this._ctx, this.state);
    this.enterRule(localctx, 90, Python3Parser.RULE_with_stmt);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 686;
      this.match(Python3Parser.WITH);
      this.state = 687;
      this.with_item();
      this.state = 692;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.COMMA) {
        this.state = 688;
        this.match(Python3Parser.COMMA);
        this.state = 689;
        this.with_item();
        this.state = 694;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
      }
      this.state = 695;
      this.match(Python3Parser.COLON);
      this.state = 696;
      this.suite();
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
  with_item() {
    let localctx = new With_itemContext(this, this._ctx, this.state);
    this.enterRule(localctx, 92, Python3Parser.RULE_with_item);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 698;
      this.test();
      this.state = 701;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.AS) {
        this.state = 699;
        this.match(Python3Parser.AS);
        this.state = 700;
        this.expr();
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
  except_clause() {
    let localctx = new Except_clauseContext(this, this._ctx, this.state);
    this.enterRule(localctx, 94, Python3Parser.RULE_except_clause);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 703;
      this.match(Python3Parser.EXCEPT);
      this.state = 709;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
        this.state = 704;
        this.test();
        this.state = 707;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if (_la === Python3Parser.AS) {
          this.state = 705;
          this.match(Python3Parser.AS);
          this.state = 706;
          this.match(Python3Parser.NAME);
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
  suite() {
    let localctx = new SuiteContext(this, this._ctx, this.state);
    this.enterRule(localctx, 96, Python3Parser.RULE_suite);
    var _la = 0;
    try {
      this.state = 721;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.RETURN:
        case Python3Parser.RAISE:
        case Python3Parser.FROM:
        case Python3Parser.IMPORT:
        case Python3Parser.GLOBAL:
        case Python3Parser.NONLOCAL:
        case Python3Parser.ASSERT:
        case Python3Parser.LAMBDA:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.YIELD:
        case Python3Parser.DEL:
        case Python3Parser.PASS:
        case Python3Parser.CONTINUE:
        case Python3Parser.BREAK:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.STAR:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 1);
          this.state = 711;
          this.simple_stmt();
          break;
        case Python3Parser.NEWLINE:
          this.enterOuterAlt(localctx, 2);
          this.state = 712;
          this.match(Python3Parser.NEWLINE);
          this.state = 713;
          this.match(Python3Parser.INDENT);
          this.state = 715;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          do {
            this.state = 714;
            this.stmt();
            this.state = 717;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          } while ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.DEF | 1 << Python3Parser.RETURN | 1 << Python3Parser.RAISE | 1 << Python3Parser.FROM | 1 << Python3Parser.IMPORT | 1 << Python3Parser.GLOBAL | 1 << Python3Parser.NONLOCAL | 1 << Python3Parser.ASSERT | 1 << Python3Parser.IF | 1 << Python3Parser.WHILE | 1 << Python3Parser.FOR | 1 << Python3Parser.TRY | 1 << Python3Parser.WITH | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.CLASS - 32 | 1 << Python3Parser.YIELD - 32 | 1 << Python3Parser.DEL - 32 | 1 << Python3Parser.PASS - 32 | 1 << Python3Parser.CONTINUE - 32 | 1 << Python3Parser.BREAK - 32 | 1 << Python3Parser.ASYNC - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.STAR - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68 | 1 << Python3Parser.AT - 68)) !== 0);
          this.state = 719;
          this.match(Python3Parser.DEDENT);
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
  test() {
    let localctx = new TestContext(this, this._ctx, this.state);
    this.enterRule(localctx, 98, Python3Parser.RULE_test);
    var _la = 0;
    try {
      this.state = 732;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 1);
          this.state = 723;
          this.or_test();
          this.state = 729;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.IF) {
            this.state = 724;
            this.match(Python3Parser.IF);
            this.state = 725;
            this.or_test();
            this.state = 726;
            this.match(Python3Parser.ELSE);
            this.state = 727;
            this.test();
          }
          break;
        case Python3Parser.LAMBDA:
          this.enterOuterAlt(localctx, 2);
          this.state = 731;
          this.lambdef();
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
  test_nocond() {
    let localctx = new Test_nocondContext(this, this._ctx, this.state);
    this.enterRule(localctx, 100, Python3Parser.RULE_test_nocond);
    try {
      this.state = 736;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 1);
          this.state = 734;
          this.or_test();
          break;
        case Python3Parser.LAMBDA:
          this.enterOuterAlt(localctx, 2);
          this.state = 735;
          this.lambdef_nocond();
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
  lambdef() {
    let localctx = new LambdefContext(this, this._ctx, this.state);
    this.enterRule(localctx, 102, Python3Parser.RULE_lambdef);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 738;
      this.match(Python3Parser.LAMBDA);
      this.state = 740;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 42 & ~31) == 0 && (1 << _la - 42 & (1 << Python3Parser.NAME - 42 | 1 << Python3Parser.STAR - 42 | 1 << Python3Parser.POWER - 42)) !== 0) {
        this.state = 739;
        this.varargslist();
      }
      this.state = 742;
      this.match(Python3Parser.COLON);
      this.state = 743;
      this.test();
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
  lambdef_nocond() {
    let localctx = new Lambdef_nocondContext(this, this._ctx, this.state);
    this.enterRule(localctx, 104, Python3Parser.RULE_lambdef_nocond);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 745;
      this.match(Python3Parser.LAMBDA);
      this.state = 747;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 42 & ~31) == 0 && (1 << _la - 42 & (1 << Python3Parser.NAME - 42 | 1 << Python3Parser.STAR - 42 | 1 << Python3Parser.POWER - 42)) !== 0) {
        this.state = 746;
        this.varargslist();
      }
      this.state = 749;
      this.match(Python3Parser.COLON);
      this.state = 750;
      this.test_nocond();
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
  or_test() {
    let localctx = new Or_testContext(this, this._ctx, this.state);
    this.enterRule(localctx, 106, Python3Parser.RULE_or_test);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 752;
      this.and_test();
      this.state = 757;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.OR) {
        this.state = 753;
        this.match(Python3Parser.OR);
        this.state = 754;
        this.and_test();
        this.state = 759;
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
  and_test() {
    let localctx = new And_testContext(this, this._ctx, this.state);
    this.enterRule(localctx, 108, Python3Parser.RULE_and_test);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 760;
      this.not_test();
      this.state = 765;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.AND) {
        this.state = 761;
        this.match(Python3Parser.AND);
        this.state = 762;
        this.not_test();
        this.state = 767;
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
  not_test() {
    let localctx = new Not_testContext(this, this._ctx, this.state);
    this.enterRule(localctx, 110, Python3Parser.RULE_not_test);
    try {
      this.state = 771;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.NOT:
          this.enterOuterAlt(localctx, 1);
          this.state = 768;
          this.match(Python3Parser.NOT);
          this.state = 769;
          this.not_test();
          break;
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 2);
          this.state = 770;
          this.comparison();
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
  comparison() {
    let localctx = new ComparisonContext(this, this._ctx, this.state);
    this.enterRule(localctx, 112, Python3Parser.RULE_comparison);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 773;
      this.expr();
      this.state = 779;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.IN | 1 << Python3Parser.NOT | 1 << Python3Parser.IS)) !== 0 || (_la - 76 & ~31) == 0 && (1 << _la - 76 & (1 << Python3Parser.LESS_THAN - 76 | 1 << Python3Parser.GREATER_THAN - 76 | 1 << Python3Parser.EQUALS - 76 | 1 << Python3Parser.GT_EQ - 76 | 1 << Python3Parser.LT_EQ - 76 | 1 << Python3Parser.NOT_EQ_1 - 76 | 1 << Python3Parser.NOT_EQ_2 - 76)) !== 0) {
        this.state = 774;
        this.comp_op();
        this.state = 775;
        this.expr();
        this.state = 781;
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
  comp_op() {
    let localctx = new Comp_opContext(this, this._ctx, this.state);
    this.enterRule(localctx, 114, Python3Parser.RULE_comp_op);
    try {
      this.state = 795;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 107, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 782;
          this.match(Python3Parser.LESS_THAN);
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 783;
          this.match(Python3Parser.GREATER_THAN);
          break;
        case 3:
          this.enterOuterAlt(localctx, 3);
          this.state = 784;
          this.match(Python3Parser.EQUALS);
          break;
        case 4:
          this.enterOuterAlt(localctx, 4);
          this.state = 785;
          this.match(Python3Parser.GT_EQ);
          break;
        case 5:
          this.enterOuterAlt(localctx, 5);
          this.state = 786;
          this.match(Python3Parser.LT_EQ);
          break;
        case 6:
          this.enterOuterAlt(localctx, 6);
          this.state = 787;
          this.match(Python3Parser.NOT_EQ_1);
          break;
        case 7:
          this.enterOuterAlt(localctx, 7);
          this.state = 788;
          this.match(Python3Parser.NOT_EQ_2);
          break;
        case 8:
          this.enterOuterAlt(localctx, 8);
          this.state = 789;
          this.match(Python3Parser.IN);
          break;
        case 9:
          this.enterOuterAlt(localctx, 9);
          this.state = 790;
          this.match(Python3Parser.NOT);
          this.state = 791;
          this.match(Python3Parser.IN);
          break;
        case 10:
          this.enterOuterAlt(localctx, 10);
          this.state = 792;
          this.match(Python3Parser.IS);
          break;
        case 11:
          this.enterOuterAlt(localctx, 11);
          this.state = 793;
          this.match(Python3Parser.IS);
          this.state = 794;
          this.match(Python3Parser.NOT);
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
  star_expr() {
    let localctx = new Star_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 116, Python3Parser.RULE_star_expr);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 797;
      this.match(Python3Parser.STAR);
      this.state = 798;
      this.expr();
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
  expr() {
    let localctx = new ExprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 118, Python3Parser.RULE_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 800;
      this.xor_expr();
      this.state = 805;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.OR_OP) {
        this.state = 801;
        this.match(Python3Parser.OR_OP);
        this.state = 802;
        this.xor_expr();
        this.state = 807;
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
  xor_expr() {
    let localctx = new Xor_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 120, Python3Parser.RULE_xor_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 808;
      this.and_expr();
      this.state = 813;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.XOR) {
        this.state = 809;
        this.match(Python3Parser.XOR);
        this.state = 810;
        this.and_expr();
        this.state = 815;
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
  and_expr() {
    let localctx = new And_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 122, Python3Parser.RULE_and_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 816;
      this.shift_expr();
      this.state = 821;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.AND_OP) {
        this.state = 817;
        this.match(Python3Parser.AND_OP);
        this.state = 818;
        this.shift_expr();
        this.state = 823;
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
  shift_expr() {
    let localctx = new Shift_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 124, Python3Parser.RULE_shift_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 824;
      this.arith_expr();
      this.state = 829;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.LEFT_SHIFT || _la === Python3Parser.RIGHT_SHIFT) {
        this.state = 825;
        _la = this._input.LA(1);
        if (!(_la === Python3Parser.LEFT_SHIFT || _la === Python3Parser.RIGHT_SHIFT)) {
          this._errHandler.recoverInline(this);
        } else {
          this._errHandler.reportMatch(this);
          this.consume();
        }
        this.state = 826;
        this.arith_expr();
        this.state = 831;
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
  arith_expr() {
    let localctx = new Arith_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 126, Python3Parser.RULE_arith_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 832;
      this.term();
      this.state = 837;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while (_la === Python3Parser.ADD || _la === Python3Parser.MINUS) {
        this.state = 833;
        _la = this._input.LA(1);
        if (!(_la === Python3Parser.ADD || _la === Python3Parser.MINUS)) {
          this._errHandler.recoverInline(this);
        } else {
          this._errHandler.reportMatch(this);
          this.consume();
        }
        this.state = 834;
        this.term();
        this.state = 839;
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
  term() {
    let localctx = new TermContext(this, this._ctx, this.state);
    this.enterRule(localctx, 128, Python3Parser.RULE_term);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 840;
      this.factor();
      this.state = 845;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while ((_la - 53 & ~31) == 0 && (1 << _la - 53 & (1 << Python3Parser.STAR - 53 | 1 << Python3Parser.DIV - 53 | 1 << Python3Parser.MOD - 53 | 1 << Python3Parser.IDIV - 53 | 1 << Python3Parser.AT - 53)) !== 0) {
        this.state = 841;
        _la = this._input.LA(1);
        if (!((_la - 53 & ~31) == 0 && (1 << _la - 53 & (1 << Python3Parser.STAR - 53 | 1 << Python3Parser.DIV - 53 | 1 << Python3Parser.MOD - 53 | 1 << Python3Parser.IDIV - 53 | 1 << Python3Parser.AT - 53)) !== 0)) {
          this._errHandler.recoverInline(this);
        } else {
          this._errHandler.reportMatch(this);
          this.consume();
        }
        this.state = 842;
        this.factor();
        this.state = 847;
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
  factor() {
    let localctx = new FactorContext(this, this._ctx, this.state);
    this.enterRule(localctx, 130, Python3Parser.RULE_factor);
    var _la = 0;
    try {
      this.state = 851;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
          this.enterOuterAlt(localctx, 1);
          this.state = 848;
          _la = this._input.LA(1);
          if (!((_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68)) !== 0)) {
            this._errHandler.recoverInline(this);
          } else {
            this._errHandler.reportMatch(this);
            this.consume();
          }
          this.state = 849;
          this.factor();
          break;
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 2);
          this.state = 850;
          this.power();
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
  power() {
    let localctx = new PowerContext(this, this._ctx, this.state);
    this.enterRule(localctx, 132, Python3Parser.RULE_power);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 853;
      this.atom_expr();
      this.state = 856;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.POWER) {
        this.state = 854;
        this.match(Python3Parser.POWER);
        this.state = 855;
        this.factor();
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
  atom_expr() {
    let localctx = new Atom_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 134, Python3Parser.RULE_atom_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 859;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.AWAIT) {
        this.state = 858;
        this.match(Python3Parser.AWAIT);
      }
      this.state = 861;
      this.atom();
      this.state = 865;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      while ((_la - 51 & ~31) == 0 && (1 << _la - 51 & (1 << Python3Parser.DOT - 51 | 1 << Python3Parser.OPEN_PAREN - 51 | 1 << Python3Parser.OPEN_BRACK - 51)) !== 0) {
        this.state = 862;
        this.trailer();
        this.state = 867;
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
  atom() {
    let localctx = new AtomContext(this, this._ctx, this.state);
    this.enterRule(localctx, 136, Python3Parser.RULE_atom);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 895;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.OPEN_PAREN:
          this.state = 868;
          this.match(Python3Parser.OPEN_PAREN);
          this.state = 871;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.YIELD:
              this.state = 869;
              this.yield_expr();
              break;
            case Python3Parser.STRING:
            case Python3Parser.NUMBER:
            case Python3Parser.LAMBDA:
            case Python3Parser.NOT:
            case Python3Parser.NONE:
            case Python3Parser.TRUE:
            case Python3Parser.FALSE:
            case Python3Parser.AWAIT:
            case Python3Parser.NAME:
            case Python3Parser.ELLIPSIS:
            case Python3Parser.STAR:
            case Python3Parser.OPEN_PAREN:
            case Python3Parser.OPEN_BRACK:
            case Python3Parser.ADD:
            case Python3Parser.MINUS:
            case Python3Parser.NOT_OP:
            case Python3Parser.OPEN_BRACE:
              this.state = 870;
              this.testlist_comp();
              break;
            case Python3Parser.CLOSE_PAREN:
              break;
            default:
              break;
          }
          this.state = 873;
          this.match(Python3Parser.CLOSE_PAREN);
          break;
        case Python3Parser.OPEN_BRACK:
          this.state = 874;
          this.match(Python3Parser.OPEN_BRACK);
          this.state = 876;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.STAR - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
            this.state = 875;
            this.testlist_comp();
          }
          this.state = 878;
          this.match(Python3Parser.CLOSE_BRACK);
          break;
        case Python3Parser.OPEN_BRACE:
          this.state = 879;
          this.match(Python3Parser.OPEN_BRACE);
          this.state = 881;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.STAR - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.POWER - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
            this.state = 880;
            this.dictorsetmaker();
          }
          this.state = 883;
          this.match(Python3Parser.CLOSE_BRACE);
          break;
        case Python3Parser.NAME:
          this.state = 884;
          this.match(Python3Parser.NAME);
          break;
        case Python3Parser.NUMBER:
          this.state = 885;
          this.match(Python3Parser.NUMBER);
          break;
        case Python3Parser.STRING:
          this.state = 887;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          do {
            this.state = 886;
            this.match(Python3Parser.STRING);
            this.state = 889;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
          } while (_la === Python3Parser.STRING);
          break;
        case Python3Parser.ELLIPSIS:
          this.state = 891;
          this.match(Python3Parser.ELLIPSIS);
          break;
        case Python3Parser.NONE:
          this.state = 892;
          this.match(Python3Parser.NONE);
          break;
        case Python3Parser.TRUE:
          this.state = 893;
          this.match(Python3Parser.TRUE);
          break;
        case Python3Parser.FALSE:
          this.state = 894;
          this.match(Python3Parser.FALSE);
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
  testlist_comp() {
    let localctx = new Testlist_compContext(this, this._ctx, this.state);
    this.enterRule(localctx, 138, Python3Parser.RULE_testlist_comp);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 899;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.LAMBDA:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.state = 897;
          this.test();
          break;
        case Python3Parser.STAR:
          this.state = 898;
          this.star_expr();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
      this.state = 915;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.FOR:
        case Python3Parser.ASYNC:
          this.state = 901;
          this.comp_for();
          break;
        case Python3Parser.CLOSE_PAREN:
        case Python3Parser.COMMA:
        case Python3Parser.CLOSE_BRACK:
          this.state = 909;
          this._errHandler.sync(this);
          var _alt = this._interp.adaptivePredict(this._input, 125, this._ctx);
          while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
            if (_alt === 1) {
              this.state = 902;
              this.match(Python3Parser.COMMA);
              this.state = 905;
              this._errHandler.sync(this);
              switch (this._input.LA(1)) {
                case Python3Parser.STRING:
                case Python3Parser.NUMBER:
                case Python3Parser.LAMBDA:
                case Python3Parser.NOT:
                case Python3Parser.NONE:
                case Python3Parser.TRUE:
                case Python3Parser.FALSE:
                case Python3Parser.AWAIT:
                case Python3Parser.NAME:
                case Python3Parser.ELLIPSIS:
                case Python3Parser.OPEN_PAREN:
                case Python3Parser.OPEN_BRACK:
                case Python3Parser.ADD:
                case Python3Parser.MINUS:
                case Python3Parser.NOT_OP:
                case Python3Parser.OPEN_BRACE:
                  this.state = 903;
                  this.test();
                  break;
                case Python3Parser.STAR:
                  this.state = 904;
                  this.star_expr();
                  break;
                default:
                  throw new import_antlr4.default.error.NoViableAltException(this);
              }
            }
            this.state = 911;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input, 125, this._ctx);
          }
          this.state = 913;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COMMA) {
            this.state = 912;
            this.match(Python3Parser.COMMA);
          }
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
  trailer() {
    let localctx = new TrailerContext(this, this._ctx, this.state);
    this.enterRule(localctx, 140, Python3Parser.RULE_trailer);
    var _la = 0;
    try {
      this.state = 928;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.OPEN_PAREN:
          this.enterOuterAlt(localctx, 1);
          this.state = 917;
          this.match(Python3Parser.OPEN_PAREN);
          this.state = 919;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.STAR - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.POWER - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
            this.state = 918;
            this.arglist();
          }
          this.state = 921;
          this.match(Python3Parser.CLOSE_PAREN);
          break;
        case Python3Parser.OPEN_BRACK:
          this.enterOuterAlt(localctx, 2);
          this.state = 922;
          this.match(Python3Parser.OPEN_BRACK);
          this.state = 923;
          this.subscriptlist();
          this.state = 924;
          this.match(Python3Parser.CLOSE_BRACK);
          break;
        case Python3Parser.DOT:
          this.enterOuterAlt(localctx, 3);
          this.state = 926;
          this.match(Python3Parser.DOT);
          this.state = 927;
          this.match(Python3Parser.NAME);
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
  subscriptlist() {
    let localctx = new SubscriptlistContext(this, this._ctx, this.state);
    this.enterRule(localctx, 142, Python3Parser.RULE_subscriptlist);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 930;
      this.subscript_();
      this.state = 935;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 130, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 931;
          this.match(Python3Parser.COMMA);
          this.state = 932;
          this.subscript_();
        }
        this.state = 937;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 130, this._ctx);
      }
      this.state = 939;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COMMA) {
        this.state = 938;
        this.match(Python3Parser.COMMA);
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
  subscript_() {
    let localctx = new Subscript_Context(this, this._ctx, this.state);
    this.enterRule(localctx, 144, Python3Parser.RULE_subscript_);
    var _la = 0;
    try {
      this.state = 952;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 135, this._ctx);
      switch (la_) {
        case 1:
          this.enterOuterAlt(localctx, 1);
          this.state = 941;
          this.test();
          break;
        case 2:
          this.enterOuterAlt(localctx, 2);
          this.state = 943;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
            this.state = 942;
            this.test();
          }
          this.state = 945;
          this.match(Python3Parser.COLON);
          this.state = 947;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
            this.state = 946;
            this.test();
          }
          this.state = 950;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.COLON) {
            this.state = 949;
            this.sliceop();
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
  sliceop() {
    let localctx = new SliceopContext(this, this._ctx, this.state);
    this.enterRule(localctx, 146, Python3Parser.RULE_sliceop);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 954;
      this.match(Python3Parser.COLON);
      this.state = 956;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
        this.state = 955;
        this.test();
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
  exprlist() {
    let localctx = new ExprlistContext(this, this._ctx, this.state);
    this.enterRule(localctx, 148, Python3Parser.RULE_exprlist);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 960;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.state = 958;
          this.expr();
          break;
        case Python3Parser.STAR:
          this.state = 959;
          this.star_expr();
          break;
        default:
          throw new import_antlr4.default.error.NoViableAltException(this);
      }
      this.state = 969;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 139, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 962;
          this.match(Python3Parser.COMMA);
          this.state = 965;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.STRING:
            case Python3Parser.NUMBER:
            case Python3Parser.NONE:
            case Python3Parser.TRUE:
            case Python3Parser.FALSE:
            case Python3Parser.AWAIT:
            case Python3Parser.NAME:
            case Python3Parser.ELLIPSIS:
            case Python3Parser.OPEN_PAREN:
            case Python3Parser.OPEN_BRACK:
            case Python3Parser.ADD:
            case Python3Parser.MINUS:
            case Python3Parser.NOT_OP:
            case Python3Parser.OPEN_BRACE:
              this.state = 963;
              this.expr();
              break;
            case Python3Parser.STAR:
              this.state = 964;
              this.star_expr();
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
          }
        }
        this.state = 971;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 139, this._ctx);
      }
      this.state = 973;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COMMA) {
        this.state = 972;
        this.match(Python3Parser.COMMA);
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
  testlist() {
    let localctx = new TestlistContext(this, this._ctx, this.state);
    this.enterRule(localctx, 150, Python3Parser.RULE_testlist);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 975;
      this.test();
      this.state = 980;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 141, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 976;
          this.match(Python3Parser.COMMA);
          this.state = 977;
          this.test();
        }
        this.state = 982;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 141, this._ctx);
      }
      this.state = 984;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COMMA) {
        this.state = 983;
        this.match(Python3Parser.COMMA);
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
  dictorsetmaker() {
    let localctx = new DictorsetmakerContext(this, this._ctx, this.state);
    this.enterRule(localctx, 152, Python3Parser.RULE_dictorsetmaker);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1034;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 153, this._ctx);
      switch (la_) {
        case 1:
          this.state = 992;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.STRING:
            case Python3Parser.NUMBER:
            case Python3Parser.LAMBDA:
            case Python3Parser.NOT:
            case Python3Parser.NONE:
            case Python3Parser.TRUE:
            case Python3Parser.FALSE:
            case Python3Parser.AWAIT:
            case Python3Parser.NAME:
            case Python3Parser.ELLIPSIS:
            case Python3Parser.OPEN_PAREN:
            case Python3Parser.OPEN_BRACK:
            case Python3Parser.ADD:
            case Python3Parser.MINUS:
            case Python3Parser.NOT_OP:
            case Python3Parser.OPEN_BRACE:
              this.state = 986;
              this.test();
              this.state = 987;
              this.match(Python3Parser.COLON);
              this.state = 988;
              this.test();
              break;
            case Python3Parser.POWER:
              this.state = 990;
              this.match(Python3Parser.POWER);
              this.state = 991;
              this.expr();
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
          }
          this.state = 1012;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.FOR:
            case Python3Parser.ASYNC:
              this.state = 994;
              this.comp_for();
              break;
            case Python3Parser.COMMA:
            case Python3Parser.CLOSE_BRACE:
              this.state = 1006;
              this._errHandler.sync(this);
              var _alt = this._interp.adaptivePredict(this._input, 145, this._ctx);
              while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
                if (_alt === 1) {
                  this.state = 995;
                  this.match(Python3Parser.COMMA);
                  this.state = 1002;
                  this._errHandler.sync(this);
                  switch (this._input.LA(1)) {
                    case Python3Parser.STRING:
                    case Python3Parser.NUMBER:
                    case Python3Parser.LAMBDA:
                    case Python3Parser.NOT:
                    case Python3Parser.NONE:
                    case Python3Parser.TRUE:
                    case Python3Parser.FALSE:
                    case Python3Parser.AWAIT:
                    case Python3Parser.NAME:
                    case Python3Parser.ELLIPSIS:
                    case Python3Parser.OPEN_PAREN:
                    case Python3Parser.OPEN_BRACK:
                    case Python3Parser.ADD:
                    case Python3Parser.MINUS:
                    case Python3Parser.NOT_OP:
                    case Python3Parser.OPEN_BRACE:
                      this.state = 996;
                      this.test();
                      this.state = 997;
                      this.match(Python3Parser.COLON);
                      this.state = 998;
                      this.test();
                      break;
                    case Python3Parser.POWER:
                      this.state = 1e3;
                      this.match(Python3Parser.POWER);
                      this.state = 1001;
                      this.expr();
                      break;
                    default:
                      throw new import_antlr4.default.error.NoViableAltException(this);
                  }
                }
                this.state = 1008;
                this._errHandler.sync(this);
                _alt = this._interp.adaptivePredict(this._input, 145, this._ctx);
              }
              this.state = 1010;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.COMMA) {
                this.state = 1009;
                this.match(Python3Parser.COMMA);
              }
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
          }
          break;
        case 2:
          this.state = 1016;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.STRING:
            case Python3Parser.NUMBER:
            case Python3Parser.LAMBDA:
            case Python3Parser.NOT:
            case Python3Parser.NONE:
            case Python3Parser.TRUE:
            case Python3Parser.FALSE:
            case Python3Parser.AWAIT:
            case Python3Parser.NAME:
            case Python3Parser.ELLIPSIS:
            case Python3Parser.OPEN_PAREN:
            case Python3Parser.OPEN_BRACK:
            case Python3Parser.ADD:
            case Python3Parser.MINUS:
            case Python3Parser.NOT_OP:
            case Python3Parser.OPEN_BRACE:
              this.state = 1014;
              this.test();
              break;
            case Python3Parser.STAR:
              this.state = 1015;
              this.star_expr();
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
          }
          this.state = 1032;
          this._errHandler.sync(this);
          switch (this._input.LA(1)) {
            case Python3Parser.FOR:
            case Python3Parser.ASYNC:
              this.state = 1018;
              this.comp_for();
              break;
            case Python3Parser.COMMA:
            case Python3Parser.CLOSE_BRACE:
              this.state = 1026;
              this._errHandler.sync(this);
              var _alt = this._interp.adaptivePredict(this._input, 150, this._ctx);
              while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
                if (_alt === 1) {
                  this.state = 1019;
                  this.match(Python3Parser.COMMA);
                  this.state = 1022;
                  this._errHandler.sync(this);
                  switch (this._input.LA(1)) {
                    case Python3Parser.STRING:
                    case Python3Parser.NUMBER:
                    case Python3Parser.LAMBDA:
                    case Python3Parser.NOT:
                    case Python3Parser.NONE:
                    case Python3Parser.TRUE:
                    case Python3Parser.FALSE:
                    case Python3Parser.AWAIT:
                    case Python3Parser.NAME:
                    case Python3Parser.ELLIPSIS:
                    case Python3Parser.OPEN_PAREN:
                    case Python3Parser.OPEN_BRACK:
                    case Python3Parser.ADD:
                    case Python3Parser.MINUS:
                    case Python3Parser.NOT_OP:
                    case Python3Parser.OPEN_BRACE:
                      this.state = 1020;
                      this.test();
                      break;
                    case Python3Parser.STAR:
                      this.state = 1021;
                      this.star_expr();
                      break;
                    default:
                      throw new import_antlr4.default.error.NoViableAltException(this);
                  }
                }
                this.state = 1028;
                this._errHandler.sync(this);
                _alt = this._interp.adaptivePredict(this._input, 150, this._ctx);
              }
              this.state = 1030;
              this._errHandler.sync(this);
              _la = this._input.LA(1);
              if (_la === Python3Parser.COMMA) {
                this.state = 1029;
                this.match(Python3Parser.COMMA);
              }
              break;
            default:
              throw new import_antlr4.default.error.NoViableAltException(this);
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
  classdef() {
    let localctx = new ClassdefContext(this, this._ctx, this.state);
    this.enterRule(localctx, 154, Python3Parser.RULE_classdef);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1036;
      this.match(Python3Parser.CLASS);
      this.state = 1037;
      this.match(Python3Parser.NAME);
      this.state = 1043;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.OPEN_PAREN) {
        this.state = 1038;
        this.match(Python3Parser.OPEN_PAREN);
        this.state = 1040;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.STAR - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.POWER - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
          this.state = 1039;
          this.arglist();
        }
        this.state = 1042;
        this.match(Python3Parser.CLOSE_PAREN);
      }
      this.state = 1045;
      this.match(Python3Parser.COLON);
      this.state = 1046;
      this.suite();
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
  arglist() {
    let localctx = new ArglistContext(this, this._ctx, this.state);
    this.enterRule(localctx, 156, Python3Parser.RULE_arglist);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1048;
      this.argument();
      this.state = 1053;
      this._errHandler.sync(this);
      var _alt = this._interp.adaptivePredict(this._input, 156, this._ctx);
      while (_alt != 2 && _alt != import_antlr4.default.atn.ATN.INVALID_ALT_NUMBER) {
        if (_alt === 1) {
          this.state = 1049;
          this.match(Python3Parser.COMMA);
          this.state = 1050;
          this.argument();
        }
        this.state = 1055;
        this._errHandler.sync(this);
        _alt = this._interp.adaptivePredict(this._input, 156, this._ctx);
      }
      this.state = 1057;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.COMMA) {
        this.state = 1056;
        this.match(Python3Parser.COMMA);
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
  argument() {
    let localctx = new ArgumentContext(this, this._ctx, this.state);
    this.enterRule(localctx, 158, Python3Parser.RULE_argument);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1071;
      this._errHandler.sync(this);
      var la_ = this._interp.adaptivePredict(this._input, 159, this._ctx);
      switch (la_) {
        case 1:
          this.state = 1059;
          this.test();
          this.state = 1061;
          this._errHandler.sync(this);
          _la = this._input.LA(1);
          if (_la === Python3Parser.FOR || _la === Python3Parser.ASYNC) {
            this.state = 1060;
            this.comp_for();
          }
          break;
        case 2:
          this.state = 1063;
          this.test();
          this.state = 1064;
          this.match(Python3Parser.ASSIGN);
          this.state = 1065;
          this.test();
          break;
        case 3:
          this.state = 1067;
          this.match(Python3Parser.POWER);
          this.state = 1068;
          this.test();
          break;
        case 4:
          this.state = 1069;
          this.match(Python3Parser.STAR);
          this.state = 1070;
          this.test();
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
  comp_iter() {
    let localctx = new Comp_iterContext(this, this._ctx, this.state);
    this.enterRule(localctx, 160, Python3Parser.RULE_comp_iter);
    try {
      this.state = 1075;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.FOR:
        case Python3Parser.ASYNC:
          this.enterOuterAlt(localctx, 1);
          this.state = 1073;
          this.comp_for();
          break;
        case Python3Parser.IF:
          this.enterOuterAlt(localctx, 2);
          this.state = 1074;
          this.comp_if();
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
  comp_for() {
    let localctx = new Comp_forContext(this, this._ctx, this.state);
    this.enterRule(localctx, 162, Python3Parser.RULE_comp_for);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1078;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if (_la === Python3Parser.ASYNC) {
        this.state = 1077;
        this.match(Python3Parser.ASYNC);
      }
      this.state = 1080;
      this.match(Python3Parser.FOR);
      this.state = 1081;
      this.exprlist();
      this.state = 1082;
      this.match(Python3Parser.IN);
      this.state = 1083;
      this.or_test();
      this.state = 1085;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 15 & ~31) == 0 && (1 << _la - 15 & (1 << Python3Parser.IF - 15 | 1 << Python3Parser.FOR - 15 | 1 << Python3Parser.ASYNC - 15)) !== 0) {
        this.state = 1084;
        this.comp_iter();
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
  comp_if() {
    let localctx = new Comp_ifContext(this, this._ctx, this.state);
    this.enterRule(localctx, 164, Python3Parser.RULE_comp_if);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1087;
      this.match(Python3Parser.IF);
      this.state = 1088;
      this.test_nocond();
      this.state = 1090;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la - 15 & ~31) == 0 && (1 << _la - 15 & (1 << Python3Parser.IF - 15 | 1 << Python3Parser.FOR - 15 | 1 << Python3Parser.ASYNC - 15)) !== 0) {
        this.state = 1089;
        this.comp_iter();
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
  encoding_decl() {
    let localctx = new Encoding_declContext(this, this._ctx, this.state);
    this.enterRule(localctx, 166, Python3Parser.RULE_encoding_decl);
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1092;
      this.match(Python3Parser.NAME);
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
  yield_expr() {
    let localctx = new Yield_exprContext(this, this._ctx, this.state);
    this.enterRule(localctx, 168, Python3Parser.RULE_yield_expr);
    var _la = 0;
    try {
      this.enterOuterAlt(localctx, 1);
      this.state = 1094;
      this.match(Python3Parser.YIELD);
      this.state = 1096;
      this._errHandler.sync(this);
      _la = this._input.LA(1);
      if ((_la & ~31) == 0 && (1 << _la & (1 << Python3Parser.STRING | 1 << Python3Parser.NUMBER | 1 << Python3Parser.FROM | 1 << Python3Parser.LAMBDA | 1 << Python3Parser.NOT | 1 << Python3Parser.NONE | 1 << Python3Parser.TRUE)) !== 0 || (_la - 32 & ~31) == 0 && (1 << _la - 32 & (1 << Python3Parser.FALSE - 32 | 1 << Python3Parser.AWAIT - 32 | 1 << Python3Parser.NAME - 32 | 1 << Python3Parser.ELLIPSIS - 32 | 1 << Python3Parser.OPEN_PAREN - 32 | 1 << Python3Parser.OPEN_BRACK - 32)) !== 0 || (_la - 68 & ~31) == 0 && (1 << _la - 68 & (1 << Python3Parser.ADD - 68 | 1 << Python3Parser.MINUS - 68 | 1 << Python3Parser.NOT_OP - 68 | 1 << Python3Parser.OPEN_BRACE - 68)) !== 0) {
        this.state = 1095;
        this.yield_arg();
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
  yield_arg() {
    let localctx = new Yield_argContext(this, this._ctx, this.state);
    this.enterRule(localctx, 170, Python3Parser.RULE_yield_arg);
    try {
      this.state = 1101;
      this._errHandler.sync(this);
      switch (this._input.LA(1)) {
        case Python3Parser.FROM:
          this.enterOuterAlt(localctx, 1);
          this.state = 1098;
          this.match(Python3Parser.FROM);
          this.state = 1099;
          this.test();
          break;
        case Python3Parser.STRING:
        case Python3Parser.NUMBER:
        case Python3Parser.LAMBDA:
        case Python3Parser.NOT:
        case Python3Parser.NONE:
        case Python3Parser.TRUE:
        case Python3Parser.FALSE:
        case Python3Parser.AWAIT:
        case Python3Parser.NAME:
        case Python3Parser.ELLIPSIS:
        case Python3Parser.OPEN_PAREN:
        case Python3Parser.OPEN_BRACK:
        case Python3Parser.ADD:
        case Python3Parser.MINUS:
        case Python3Parser.NOT_OP:
        case Python3Parser.OPEN_BRACE:
          this.enterOuterAlt(localctx, 2);
          this.state = 1100;
          this.testlist();
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
}
Python3Parser.EOF = import_antlr4.default.Token.EOF;
Python3Parser.INDENT = 1;
Python3Parser.DEDENT = 2;
Python3Parser.STRING = 3;
Python3Parser.NUMBER = 4;
Python3Parser.INTEGER = 5;
Python3Parser.DEF = 6;
Python3Parser.RETURN = 7;
Python3Parser.RAISE = 8;
Python3Parser.FROM = 9;
Python3Parser.IMPORT = 10;
Python3Parser.AS = 11;
Python3Parser.GLOBAL = 12;
Python3Parser.NONLOCAL = 13;
Python3Parser.ASSERT = 14;
Python3Parser.IF = 15;
Python3Parser.ELIF = 16;
Python3Parser.ELSE = 17;
Python3Parser.WHILE = 18;
Python3Parser.FOR = 19;
Python3Parser.IN = 20;
Python3Parser.TRY = 21;
Python3Parser.FINALLY = 22;
Python3Parser.WITH = 23;
Python3Parser.EXCEPT = 24;
Python3Parser.LAMBDA = 25;
Python3Parser.OR = 26;
Python3Parser.AND = 27;
Python3Parser.NOT = 28;
Python3Parser.IS = 29;
Python3Parser.NONE = 30;
Python3Parser.TRUE = 31;
Python3Parser.FALSE = 32;
Python3Parser.CLASS = 33;
Python3Parser.YIELD = 34;
Python3Parser.DEL = 35;
Python3Parser.PASS = 36;
Python3Parser.CONTINUE = 37;
Python3Parser.BREAK = 38;
Python3Parser.ASYNC = 39;
Python3Parser.AWAIT = 40;
Python3Parser.NEWLINE = 41;
Python3Parser.NAME = 42;
Python3Parser.STRING_LITERAL = 43;
Python3Parser.BYTES_LITERAL = 44;
Python3Parser.DECIMAL_INTEGER = 45;
Python3Parser.OCT_INTEGER = 46;
Python3Parser.HEX_INTEGER = 47;
Python3Parser.BIN_INTEGER = 48;
Python3Parser.FLOAT_NUMBER = 49;
Python3Parser.IMAG_NUMBER = 50;
Python3Parser.DOT = 51;
Python3Parser.ELLIPSIS = 52;
Python3Parser.STAR = 53;
Python3Parser.OPEN_PAREN = 54;
Python3Parser.CLOSE_PAREN = 55;
Python3Parser.COMMA = 56;
Python3Parser.COLON = 57;
Python3Parser.SEMI_COLON = 58;
Python3Parser.POWER = 59;
Python3Parser.ASSIGN = 60;
Python3Parser.OPEN_BRACK = 61;
Python3Parser.CLOSE_BRACK = 62;
Python3Parser.OR_OP = 63;
Python3Parser.XOR = 64;
Python3Parser.AND_OP = 65;
Python3Parser.LEFT_SHIFT = 66;
Python3Parser.RIGHT_SHIFT = 67;
Python3Parser.ADD = 68;
Python3Parser.MINUS = 69;
Python3Parser.DIV = 70;
Python3Parser.MOD = 71;
Python3Parser.IDIV = 72;
Python3Parser.NOT_OP = 73;
Python3Parser.OPEN_BRACE = 74;
Python3Parser.CLOSE_BRACE = 75;
Python3Parser.LESS_THAN = 76;
Python3Parser.GREATER_THAN = 77;
Python3Parser.EQUALS = 78;
Python3Parser.GT_EQ = 79;
Python3Parser.LT_EQ = 80;
Python3Parser.NOT_EQ_1 = 81;
Python3Parser.NOT_EQ_2 = 82;
Python3Parser.AT = 83;
Python3Parser.ARROW = 84;
Python3Parser.ADD_ASSIGN = 85;
Python3Parser.SUB_ASSIGN = 86;
Python3Parser.MULT_ASSIGN = 87;
Python3Parser.AT_ASSIGN = 88;
Python3Parser.DIV_ASSIGN = 89;
Python3Parser.MOD_ASSIGN = 90;
Python3Parser.AND_ASSIGN = 91;
Python3Parser.OR_ASSIGN = 92;
Python3Parser.XOR_ASSIGN = 93;
Python3Parser.LEFT_SHIFT_ASSIGN = 94;
Python3Parser.RIGHT_SHIFT_ASSIGN = 95;
Python3Parser.POWER_ASSIGN = 96;
Python3Parser.IDIV_ASSIGN = 97;
Python3Parser.SKIP_ = 98;
Python3Parser.UNKNOWN_CHAR = 99;
Python3Parser.RULE_single_input = 0;
Python3Parser.RULE_file_input = 1;
Python3Parser.RULE_eval_input = 2;
Python3Parser.RULE_decorator = 3;
Python3Parser.RULE_decorators = 4;
Python3Parser.RULE_decorated = 5;
Python3Parser.RULE_async_funcdef = 6;
Python3Parser.RULE_funcdef = 7;
Python3Parser.RULE_parameters = 8;
Python3Parser.RULE_typedargslist = 9;
Python3Parser.RULE_tfpdef = 10;
Python3Parser.RULE_varargslist = 11;
Python3Parser.RULE_vfpdef = 12;
Python3Parser.RULE_stmt = 13;
Python3Parser.RULE_simple_stmt = 14;
Python3Parser.RULE_small_stmt = 15;
Python3Parser.RULE_expr_stmt = 16;
Python3Parser.RULE_annassign = 17;
Python3Parser.RULE_testlist_star_expr = 18;
Python3Parser.RULE_augassign = 19;
Python3Parser.RULE_del_stmt = 20;
Python3Parser.RULE_pass_stmt = 21;
Python3Parser.RULE_flow_stmt = 22;
Python3Parser.RULE_break_stmt = 23;
Python3Parser.RULE_continue_stmt = 24;
Python3Parser.RULE_return_stmt = 25;
Python3Parser.RULE_yield_stmt = 26;
Python3Parser.RULE_raise_stmt = 27;
Python3Parser.RULE_import_stmt = 28;
Python3Parser.RULE_import_name = 29;
Python3Parser.RULE_import_from = 30;
Python3Parser.RULE_import_as_name = 31;
Python3Parser.RULE_dotted_as_name = 32;
Python3Parser.RULE_import_as_names = 33;
Python3Parser.RULE_dotted_as_names = 34;
Python3Parser.RULE_dotted_name = 35;
Python3Parser.RULE_global_stmt = 36;
Python3Parser.RULE_nonlocal_stmt = 37;
Python3Parser.RULE_assert_stmt = 38;
Python3Parser.RULE_compound_stmt = 39;
Python3Parser.RULE_async_stmt = 40;
Python3Parser.RULE_if_stmt = 41;
Python3Parser.RULE_while_stmt = 42;
Python3Parser.RULE_for_stmt = 43;
Python3Parser.RULE_try_stmt = 44;
Python3Parser.RULE_with_stmt = 45;
Python3Parser.RULE_with_item = 46;
Python3Parser.RULE_except_clause = 47;
Python3Parser.RULE_suite = 48;
Python3Parser.RULE_test = 49;
Python3Parser.RULE_test_nocond = 50;
Python3Parser.RULE_lambdef = 51;
Python3Parser.RULE_lambdef_nocond = 52;
Python3Parser.RULE_or_test = 53;
Python3Parser.RULE_and_test = 54;
Python3Parser.RULE_not_test = 55;
Python3Parser.RULE_comparison = 56;
Python3Parser.RULE_comp_op = 57;
Python3Parser.RULE_star_expr = 58;
Python3Parser.RULE_expr = 59;
Python3Parser.RULE_xor_expr = 60;
Python3Parser.RULE_and_expr = 61;
Python3Parser.RULE_shift_expr = 62;
Python3Parser.RULE_arith_expr = 63;
Python3Parser.RULE_term = 64;
Python3Parser.RULE_factor = 65;
Python3Parser.RULE_power = 66;
Python3Parser.RULE_atom_expr = 67;
Python3Parser.RULE_atom = 68;
Python3Parser.RULE_testlist_comp = 69;
Python3Parser.RULE_trailer = 70;
Python3Parser.RULE_subscriptlist = 71;
Python3Parser.RULE_subscript_ = 72;
Python3Parser.RULE_sliceop = 73;
Python3Parser.RULE_exprlist = 74;
Python3Parser.RULE_testlist = 75;
Python3Parser.RULE_dictorsetmaker = 76;
Python3Parser.RULE_classdef = 77;
Python3Parser.RULE_arglist = 78;
Python3Parser.RULE_argument = 79;
Python3Parser.RULE_comp_iter = 80;
Python3Parser.RULE_comp_for = 81;
Python3Parser.RULE_comp_if = 82;
Python3Parser.RULE_encoding_decl = 83;
Python3Parser.RULE_yield_expr = 84;
Python3Parser.RULE_yield_arg = 85;
class Single_inputContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_single_input;
  }
  NEWLINE() {
    return this.getToken(Python3Parser.NEWLINE, 0);
  }
  simple_stmt() {
    return this.getTypedRuleContext(Simple_stmtContext, 0);
  }
  compound_stmt() {
    return this.getTypedRuleContext(Compound_stmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterSingle_input(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitSingle_input(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitSingle_input(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class File_inputContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_file_input;
  }
  EOF() {
    return this.getToken(Python3Parser.EOF, 0);
  }
  NEWLINE = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.NEWLINE);
    } else {
      return this.getToken(Python3Parser.NEWLINE, i);
    }
  };
  stmt = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(StmtContext);
    } else {
      return this.getTypedRuleContext(StmtContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterFile_input(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitFile_input(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitFile_input(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Eval_inputContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_eval_input;
  }
  testlist() {
    return this.getTypedRuleContext(TestlistContext, 0);
  }
  EOF() {
    return this.getToken(Python3Parser.EOF, 0);
  }
  NEWLINE = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.NEWLINE);
    } else {
      return this.getToken(Python3Parser.NEWLINE, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterEval_input(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitEval_input(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitEval_input(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DecoratorContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_decorator;
  }
  AT() {
    return this.getToken(Python3Parser.AT, 0);
  }
  dotted_name() {
    return this.getTypedRuleContext(Dotted_nameContext, 0);
  }
  NEWLINE() {
    return this.getToken(Python3Parser.NEWLINE, 0);
  }
  OPEN_PAREN() {
    return this.getToken(Python3Parser.OPEN_PAREN, 0);
  }
  CLOSE_PAREN() {
    return this.getToken(Python3Parser.CLOSE_PAREN, 0);
  }
  arglist() {
    return this.getTypedRuleContext(ArglistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDecorator(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDecorator(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDecorator(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DecoratorsContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_decorators;
  }
  decorator = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(DecoratorContext);
    } else {
      return this.getTypedRuleContext(DecoratorContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDecorators(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDecorators(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDecorators(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DecoratedContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_decorated;
  }
  decorators() {
    return this.getTypedRuleContext(DecoratorsContext, 0);
  }
  classdef() {
    return this.getTypedRuleContext(ClassdefContext, 0);
  }
  funcdef() {
    return this.getTypedRuleContext(FuncdefContext, 0);
  }
  async_funcdef() {
    return this.getTypedRuleContext(Async_funcdefContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDecorated(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDecorated(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDecorated(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Async_funcdefContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_async_funcdef;
  }
  ASYNC() {
    return this.getToken(Python3Parser.ASYNC, 0);
  }
  funcdef() {
    return this.getTypedRuleContext(FuncdefContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAsync_funcdef(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAsync_funcdef(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAsync_funcdef(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FuncdefContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_funcdef;
  }
  DEF() {
    return this.getToken(Python3Parser.DEF, 0);
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  parameters() {
    return this.getTypedRuleContext(ParametersContext, 0);
  }
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  suite() {
    return this.getTypedRuleContext(SuiteContext, 0);
  }
  ARROW() {
    return this.getToken(Python3Parser.ARROW, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterFuncdef(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitFuncdef(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitFuncdef(this);
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
    this.ruleIndex = Python3Parser.RULE_parameters;
  }
  OPEN_PAREN() {
    return this.getToken(Python3Parser.OPEN_PAREN, 0);
  }
  CLOSE_PAREN() {
    return this.getToken(Python3Parser.CLOSE_PAREN, 0);
  }
  typedargslist() {
    return this.getTypedRuleContext(TypedargslistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterParameters(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitParameters(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitParameters(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TypedargslistContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_typedargslist;
  }
  tfpdef = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TfpdefContext);
    } else {
      return this.getTypedRuleContext(TfpdefContext, i);
    }
  };
  STAR() {
    return this.getToken(Python3Parser.STAR, 0);
  }
  POWER() {
    return this.getToken(Python3Parser.POWER, 0);
  }
  ASSIGN = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.ASSIGN);
    } else {
      return this.getToken(Python3Parser.ASSIGN, i);
    }
  };
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTypedargslist(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTypedargslist(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTypedargslist(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TfpdefContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_tfpdef;
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTfpdef(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTfpdef(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTfpdef(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class VarargslistContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_varargslist;
  }
  vfpdef = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(VfpdefContext);
    } else {
      return this.getTypedRuleContext(VfpdefContext, i);
    }
  };
  STAR() {
    return this.getToken(Python3Parser.STAR, 0);
  }
  POWER() {
    return this.getToken(Python3Parser.POWER, 0);
  }
  ASSIGN = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.ASSIGN);
    } else {
      return this.getToken(Python3Parser.ASSIGN, i);
    }
  };
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterVarargslist(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitVarargslist(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitVarargslist(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class VfpdefContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_vfpdef;
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterVfpdef(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitVfpdef(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitVfpdef(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class StmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_stmt;
  }
  simple_stmt() {
    return this.getTypedRuleContext(Simple_stmtContext, 0);
  }
  compound_stmt() {
    return this.getTypedRuleContext(Compound_stmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterStmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitStmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitStmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Simple_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_simple_stmt;
  }
  small_stmt = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Small_stmtContext);
    } else {
      return this.getTypedRuleContext(Small_stmtContext, i);
    }
  };
  NEWLINE() {
    return this.getToken(Python3Parser.NEWLINE, 0);
  }
  SEMI_COLON = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.SEMI_COLON);
    } else {
      return this.getToken(Python3Parser.SEMI_COLON, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterSimple_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitSimple_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitSimple_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Small_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_small_stmt;
  }
  expr_stmt() {
    return this.getTypedRuleContext(Expr_stmtContext, 0);
  }
  del_stmt() {
    return this.getTypedRuleContext(Del_stmtContext, 0);
  }
  pass_stmt() {
    return this.getTypedRuleContext(Pass_stmtContext, 0);
  }
  flow_stmt() {
    return this.getTypedRuleContext(Flow_stmtContext, 0);
  }
  import_stmt() {
    return this.getTypedRuleContext(Import_stmtContext, 0);
  }
  global_stmt() {
    return this.getTypedRuleContext(Global_stmtContext, 0);
  }
  nonlocal_stmt() {
    return this.getTypedRuleContext(Nonlocal_stmtContext, 0);
  }
  assert_stmt() {
    return this.getTypedRuleContext(Assert_stmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterSmall_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitSmall_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitSmall_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Expr_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_expr_stmt;
  }
  testlist_star_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Testlist_star_exprContext);
    } else {
      return this.getTypedRuleContext(Testlist_star_exprContext, i);
    }
  };
  annassign() {
    return this.getTypedRuleContext(AnnassignContext, 0);
  }
  augassign() {
    return this.getTypedRuleContext(AugassignContext, 0);
  }
  yield_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Yield_exprContext);
    } else {
      return this.getTypedRuleContext(Yield_exprContext, i);
    }
  };
  testlist() {
    return this.getTypedRuleContext(TestlistContext, 0);
  }
  ASSIGN = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.ASSIGN);
    } else {
      return this.getToken(Python3Parser.ASSIGN, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterExpr_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitExpr_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitExpr_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class AnnassignContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_annassign;
  }
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  ASSIGN() {
    return this.getToken(Python3Parser.ASSIGN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAnnassign(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAnnassign(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAnnassign(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Testlist_star_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_testlist_star_expr;
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  star_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Star_exprContext);
    } else {
      return this.getTypedRuleContext(Star_exprContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTestlist_star_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTestlist_star_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTestlist_star_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class AugassignContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_augassign;
  }
  ADD_ASSIGN() {
    return this.getToken(Python3Parser.ADD_ASSIGN, 0);
  }
  SUB_ASSIGN() {
    return this.getToken(Python3Parser.SUB_ASSIGN, 0);
  }
  MULT_ASSIGN() {
    return this.getToken(Python3Parser.MULT_ASSIGN, 0);
  }
  AT_ASSIGN() {
    return this.getToken(Python3Parser.AT_ASSIGN, 0);
  }
  DIV_ASSIGN() {
    return this.getToken(Python3Parser.DIV_ASSIGN, 0);
  }
  MOD_ASSIGN() {
    return this.getToken(Python3Parser.MOD_ASSIGN, 0);
  }
  AND_ASSIGN() {
    return this.getToken(Python3Parser.AND_ASSIGN, 0);
  }
  OR_ASSIGN() {
    return this.getToken(Python3Parser.OR_ASSIGN, 0);
  }
  XOR_ASSIGN() {
    return this.getToken(Python3Parser.XOR_ASSIGN, 0);
  }
  LEFT_SHIFT_ASSIGN() {
    return this.getToken(Python3Parser.LEFT_SHIFT_ASSIGN, 0);
  }
  RIGHT_SHIFT_ASSIGN() {
    return this.getToken(Python3Parser.RIGHT_SHIFT_ASSIGN, 0);
  }
  POWER_ASSIGN() {
    return this.getToken(Python3Parser.POWER_ASSIGN, 0);
  }
  IDIV_ASSIGN() {
    return this.getToken(Python3Parser.IDIV_ASSIGN, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAugassign(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAugassign(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAugassign(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Del_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_del_stmt;
  }
  DEL() {
    return this.getToken(Python3Parser.DEL, 0);
  }
  exprlist() {
    return this.getTypedRuleContext(ExprlistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDel_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDel_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDel_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Pass_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_pass_stmt;
  }
  PASS() {
    return this.getToken(Python3Parser.PASS, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterPass_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitPass_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitPass_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Flow_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_flow_stmt;
  }
  break_stmt() {
    return this.getTypedRuleContext(Break_stmtContext, 0);
  }
  continue_stmt() {
    return this.getTypedRuleContext(Continue_stmtContext, 0);
  }
  return_stmt() {
    return this.getTypedRuleContext(Return_stmtContext, 0);
  }
  raise_stmt() {
    return this.getTypedRuleContext(Raise_stmtContext, 0);
  }
  yield_stmt() {
    return this.getTypedRuleContext(Yield_stmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterFlow_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitFlow_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitFlow_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Break_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_break_stmt;
  }
  BREAK() {
    return this.getToken(Python3Parser.BREAK, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterBreak_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitBreak_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitBreak_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Continue_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_continue_stmt;
  }
  CONTINUE() {
    return this.getToken(Python3Parser.CONTINUE, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterContinue_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitContinue_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitContinue_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Return_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_return_stmt;
  }
  RETURN() {
    return this.getToken(Python3Parser.RETURN, 0);
  }
  testlist() {
    return this.getTypedRuleContext(TestlistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterReturn_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitReturn_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitReturn_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Yield_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_yield_stmt;
  }
  yield_expr() {
    return this.getTypedRuleContext(Yield_exprContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterYield_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitYield_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitYield_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Raise_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_raise_stmt;
  }
  RAISE() {
    return this.getToken(Python3Parser.RAISE, 0);
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  FROM() {
    return this.getToken(Python3Parser.FROM, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterRaise_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitRaise_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitRaise_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Import_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_import_stmt;
  }
  import_name() {
    return this.getTypedRuleContext(Import_nameContext, 0);
  }
  import_from() {
    return this.getTypedRuleContext(Import_fromContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterImport_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitImport_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitImport_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Import_nameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_import_name;
  }
  IMPORT() {
    return this.getToken(Python3Parser.IMPORT, 0);
  }
  dotted_as_names() {
    return this.getTypedRuleContext(Dotted_as_namesContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterImport_name(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitImport_name(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitImport_name(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Import_fromContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_import_from;
  }
  FROM() {
    return this.getToken(Python3Parser.FROM, 0);
  }
  IMPORT() {
    return this.getToken(Python3Parser.IMPORT, 0);
  }
  dotted_name() {
    return this.getTypedRuleContext(Dotted_nameContext, 0);
  }
  STAR() {
    return this.getToken(Python3Parser.STAR, 0);
  }
  OPEN_PAREN() {
    return this.getToken(Python3Parser.OPEN_PAREN, 0);
  }
  import_as_names() {
    return this.getTypedRuleContext(Import_as_namesContext, 0);
  }
  CLOSE_PAREN() {
    return this.getToken(Python3Parser.CLOSE_PAREN, 0);
  }
  DOT = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.DOT);
    } else {
      return this.getToken(Python3Parser.DOT, i);
    }
  };
  ELLIPSIS = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.ELLIPSIS);
    } else {
      return this.getToken(Python3Parser.ELLIPSIS, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterImport_from(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitImport_from(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitImport_from(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Import_as_nameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_import_as_name;
  }
  NAME = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.NAME);
    } else {
      return this.getToken(Python3Parser.NAME, i);
    }
  };
  AS() {
    return this.getToken(Python3Parser.AS, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterImport_as_name(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitImport_as_name(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitImport_as_name(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Dotted_as_nameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_dotted_as_name;
  }
  dotted_name() {
    return this.getTypedRuleContext(Dotted_nameContext, 0);
  }
  AS() {
    return this.getToken(Python3Parser.AS, 0);
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDotted_as_name(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDotted_as_name(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDotted_as_name(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Import_as_namesContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_import_as_names;
  }
  import_as_name = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Import_as_nameContext);
    } else {
      return this.getTypedRuleContext(Import_as_nameContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterImport_as_names(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitImport_as_names(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitImport_as_names(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Dotted_as_namesContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_dotted_as_names;
  }
  dotted_as_name = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Dotted_as_nameContext);
    } else {
      return this.getTypedRuleContext(Dotted_as_nameContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDotted_as_names(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDotted_as_names(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDotted_as_names(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Dotted_nameContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_dotted_name;
  }
  NAME = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.NAME);
    } else {
      return this.getToken(Python3Parser.NAME, i);
    }
  };
  DOT = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.DOT);
    } else {
      return this.getToken(Python3Parser.DOT, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDotted_name(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDotted_name(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDotted_name(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Global_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_global_stmt;
  }
  GLOBAL() {
    return this.getToken(Python3Parser.GLOBAL, 0);
  }
  NAME = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.NAME);
    } else {
      return this.getToken(Python3Parser.NAME, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterGlobal_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitGlobal_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitGlobal_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Nonlocal_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_nonlocal_stmt;
  }
  NONLOCAL() {
    return this.getToken(Python3Parser.NONLOCAL, 0);
  }
  NAME = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.NAME);
    } else {
      return this.getToken(Python3Parser.NAME, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterNonlocal_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitNonlocal_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitNonlocal_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Assert_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_assert_stmt;
  }
  ASSERT() {
    return this.getToken(Python3Parser.ASSERT, 0);
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  COMMA() {
    return this.getToken(Python3Parser.COMMA, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAssert_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAssert_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAssert_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Compound_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_compound_stmt;
  }
  if_stmt() {
    return this.getTypedRuleContext(If_stmtContext, 0);
  }
  while_stmt() {
    return this.getTypedRuleContext(While_stmtContext, 0);
  }
  for_stmt() {
    return this.getTypedRuleContext(For_stmtContext, 0);
  }
  try_stmt() {
    return this.getTypedRuleContext(Try_stmtContext, 0);
  }
  with_stmt() {
    return this.getTypedRuleContext(With_stmtContext, 0);
  }
  funcdef() {
    return this.getTypedRuleContext(FuncdefContext, 0);
  }
  classdef() {
    return this.getTypedRuleContext(ClassdefContext, 0);
  }
  decorated() {
    return this.getTypedRuleContext(DecoratedContext, 0);
  }
  async_stmt() {
    return this.getTypedRuleContext(Async_stmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterCompound_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitCompound_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitCompound_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Async_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_async_stmt;
  }
  ASYNC() {
    return this.getToken(Python3Parser.ASYNC, 0);
  }
  funcdef() {
    return this.getTypedRuleContext(FuncdefContext, 0);
  }
  with_stmt() {
    return this.getTypedRuleContext(With_stmtContext, 0);
  }
  for_stmt() {
    return this.getTypedRuleContext(For_stmtContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAsync_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAsync_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAsync_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class If_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_if_stmt;
  }
  IF() {
    return this.getToken(Python3Parser.IF, 0);
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  COLON = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COLON);
    } else {
      return this.getToken(Python3Parser.COLON, i);
    }
  };
  suite = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SuiteContext);
    } else {
      return this.getTypedRuleContext(SuiteContext, i);
    }
  };
  ELIF = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.ELIF);
    } else {
      return this.getToken(Python3Parser.ELIF, i);
    }
  };
  ELSE() {
    return this.getToken(Python3Parser.ELSE, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterIf_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitIf_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitIf_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class While_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_while_stmt;
  }
  WHILE() {
    return this.getToken(Python3Parser.WHILE, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  COLON = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COLON);
    } else {
      return this.getToken(Python3Parser.COLON, i);
    }
  };
  suite = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SuiteContext);
    } else {
      return this.getTypedRuleContext(SuiteContext, i);
    }
  };
  ELSE() {
    return this.getToken(Python3Parser.ELSE, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterWhile_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitWhile_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitWhile_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class For_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_for_stmt;
  }
  FOR() {
    return this.getToken(Python3Parser.FOR, 0);
  }
  exprlist() {
    return this.getTypedRuleContext(ExprlistContext, 0);
  }
  IN() {
    return this.getToken(Python3Parser.IN, 0);
  }
  testlist() {
    return this.getTypedRuleContext(TestlistContext, 0);
  }
  COLON = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COLON);
    } else {
      return this.getToken(Python3Parser.COLON, i);
    }
  };
  suite = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SuiteContext);
    } else {
      return this.getTypedRuleContext(SuiteContext, i);
    }
  };
  ELSE() {
    return this.getToken(Python3Parser.ELSE, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterFor_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitFor_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitFor_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Try_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_try_stmt;
  }
  TRY() {
    return this.getToken(Python3Parser.TRY, 0);
  }
  COLON = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COLON);
    } else {
      return this.getToken(Python3Parser.COLON, i);
    }
  };
  suite = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(SuiteContext);
    } else {
      return this.getTypedRuleContext(SuiteContext, i);
    }
  };
  FINALLY() {
    return this.getToken(Python3Parser.FINALLY, 0);
  }
  except_clause = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Except_clauseContext);
    } else {
      return this.getTypedRuleContext(Except_clauseContext, i);
    }
  };
  ELSE() {
    return this.getToken(Python3Parser.ELSE, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTry_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTry_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTry_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class With_stmtContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_with_stmt;
  }
  WITH() {
    return this.getToken(Python3Parser.WITH, 0);
  }
  with_item = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(With_itemContext);
    } else {
      return this.getTypedRuleContext(With_itemContext, i);
    }
  };
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  suite() {
    return this.getTypedRuleContext(SuiteContext, 0);
  }
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterWith_stmt(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitWith_stmt(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitWith_stmt(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class With_itemContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_with_item;
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  AS() {
    return this.getToken(Python3Parser.AS, 0);
  }
  expr() {
    return this.getTypedRuleContext(ExprContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterWith_item(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitWith_item(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitWith_item(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Except_clauseContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_except_clause;
  }
  EXCEPT() {
    return this.getToken(Python3Parser.EXCEPT, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  AS() {
    return this.getToken(Python3Parser.AS, 0);
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterExcept_clause(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitExcept_clause(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitExcept_clause(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SuiteContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_suite;
  }
  simple_stmt() {
    return this.getTypedRuleContext(Simple_stmtContext, 0);
  }
  NEWLINE() {
    return this.getToken(Python3Parser.NEWLINE, 0);
  }
  INDENT() {
    return this.getToken(Python3Parser.INDENT, 0);
  }
  DEDENT() {
    return this.getToken(Python3Parser.DEDENT, 0);
  }
  stmt = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(StmtContext);
    } else {
      return this.getTypedRuleContext(StmtContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterSuite(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitSuite(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitSuite(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TestContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_test;
  }
  or_test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Or_testContext);
    } else {
      return this.getTypedRuleContext(Or_testContext, i);
    }
  };
  IF() {
    return this.getToken(Python3Parser.IF, 0);
  }
  ELSE() {
    return this.getToken(Python3Parser.ELSE, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  lambdef() {
    return this.getTypedRuleContext(LambdefContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTest(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTest(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTest(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Test_nocondContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_test_nocond;
  }
  or_test() {
    return this.getTypedRuleContext(Or_testContext, 0);
  }
  lambdef_nocond() {
    return this.getTypedRuleContext(Lambdef_nocondContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTest_nocond(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTest_nocond(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTest_nocond(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class LambdefContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_lambdef;
  }
  LAMBDA() {
    return this.getToken(Python3Parser.LAMBDA, 0);
  }
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  varargslist() {
    return this.getTypedRuleContext(VarargslistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterLambdef(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitLambdef(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitLambdef(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Lambdef_nocondContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_lambdef_nocond;
  }
  LAMBDA() {
    return this.getToken(Python3Parser.LAMBDA, 0);
  }
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  test_nocond() {
    return this.getTypedRuleContext(Test_nocondContext, 0);
  }
  varargslist() {
    return this.getTypedRuleContext(VarargslistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterLambdef_nocond(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitLambdef_nocond(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitLambdef_nocond(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Or_testContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_or_test;
  }
  and_test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(And_testContext);
    } else {
      return this.getTypedRuleContext(And_testContext, i);
    }
  };
  OR = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.OR);
    } else {
      return this.getToken(Python3Parser.OR, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterOr_test(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitOr_test(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitOr_test(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class And_testContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_and_test;
  }
  not_test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Not_testContext);
    } else {
      return this.getTypedRuleContext(Not_testContext, i);
    }
  };
  AND = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.AND);
    } else {
      return this.getToken(Python3Parser.AND, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAnd_test(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAnd_test(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAnd_test(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Not_testContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_not_test;
  }
  NOT() {
    return this.getToken(Python3Parser.NOT, 0);
  }
  not_test() {
    return this.getTypedRuleContext(Not_testContext, 0);
  }
  comparison() {
    return this.getTypedRuleContext(ComparisonContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterNot_test(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitNot_test(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitNot_test(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ComparisonContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_comparison;
  }
  expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExprContext);
    } else {
      return this.getTypedRuleContext(ExprContext, i);
    }
  };
  comp_op = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Comp_opContext);
    } else {
      return this.getTypedRuleContext(Comp_opContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterComparison(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitComparison(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitComparison(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Comp_opContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_comp_op;
  }
  LESS_THAN() {
    return this.getToken(Python3Parser.LESS_THAN, 0);
  }
  GREATER_THAN() {
    return this.getToken(Python3Parser.GREATER_THAN, 0);
  }
  EQUALS() {
    return this.getToken(Python3Parser.EQUALS, 0);
  }
  GT_EQ() {
    return this.getToken(Python3Parser.GT_EQ, 0);
  }
  LT_EQ() {
    return this.getToken(Python3Parser.LT_EQ, 0);
  }
  NOT_EQ_1() {
    return this.getToken(Python3Parser.NOT_EQ_1, 0);
  }
  NOT_EQ_2() {
    return this.getToken(Python3Parser.NOT_EQ_2, 0);
  }
  IN() {
    return this.getToken(Python3Parser.IN, 0);
  }
  NOT() {
    return this.getToken(Python3Parser.NOT, 0);
  }
  IS() {
    return this.getToken(Python3Parser.IS, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterComp_op(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitComp_op(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitComp_op(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Star_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_star_expr;
  }
  STAR() {
    return this.getToken(Python3Parser.STAR, 0);
  }
  expr() {
    return this.getTypedRuleContext(ExprContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterStar_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitStar_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitStar_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_expr;
  }
  xor_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Xor_exprContext);
    } else {
      return this.getTypedRuleContext(Xor_exprContext, i);
    }
  };
  OR_OP = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.OR_OP);
    } else {
      return this.getToken(Python3Parser.OR_OP, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterExpr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitExpr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitExpr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Xor_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_xor_expr;
  }
  and_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(And_exprContext);
    } else {
      return this.getTypedRuleContext(And_exprContext, i);
    }
  };
  XOR = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.XOR);
    } else {
      return this.getToken(Python3Parser.XOR, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterXor_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitXor_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitXor_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class And_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_and_expr;
  }
  shift_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Shift_exprContext);
    } else {
      return this.getTypedRuleContext(Shift_exprContext, i);
    }
  };
  AND_OP = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.AND_OP);
    } else {
      return this.getToken(Python3Parser.AND_OP, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAnd_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAnd_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAnd_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Shift_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_shift_expr;
  }
  arith_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Arith_exprContext);
    } else {
      return this.getTypedRuleContext(Arith_exprContext, i);
    }
  };
  LEFT_SHIFT = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.LEFT_SHIFT);
    } else {
      return this.getToken(Python3Parser.LEFT_SHIFT, i);
    }
  };
  RIGHT_SHIFT = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.RIGHT_SHIFT);
    } else {
      return this.getToken(Python3Parser.RIGHT_SHIFT, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterShift_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitShift_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitShift_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Arith_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_arith_expr;
  }
  term = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TermContext);
    } else {
      return this.getTypedRuleContext(TermContext, i);
    }
  };
  ADD = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.ADD);
    } else {
      return this.getToken(Python3Parser.ADD, i);
    }
  };
  MINUS = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.MINUS);
    } else {
      return this.getToken(Python3Parser.MINUS, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterArith_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitArith_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitArith_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TermContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_term;
  }
  factor = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(FactorContext);
    } else {
      return this.getTypedRuleContext(FactorContext, i);
    }
  };
  STAR = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.STAR);
    } else {
      return this.getToken(Python3Parser.STAR, i);
    }
  };
  AT = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.AT);
    } else {
      return this.getToken(Python3Parser.AT, i);
    }
  };
  DIV = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.DIV);
    } else {
      return this.getToken(Python3Parser.DIV, i);
    }
  };
  MOD = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.MOD);
    } else {
      return this.getToken(Python3Parser.MOD, i);
    }
  };
  IDIV = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.IDIV);
    } else {
      return this.getToken(Python3Parser.IDIV, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTerm(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTerm(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTerm(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class FactorContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_factor;
  }
  factor() {
    return this.getTypedRuleContext(FactorContext, 0);
  }
  ADD() {
    return this.getToken(Python3Parser.ADD, 0);
  }
  MINUS() {
    return this.getToken(Python3Parser.MINUS, 0);
  }
  NOT_OP() {
    return this.getToken(Python3Parser.NOT_OP, 0);
  }
  power() {
    return this.getTypedRuleContext(PowerContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterFactor(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitFactor(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitFactor(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class PowerContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_power;
  }
  atom_expr() {
    return this.getTypedRuleContext(Atom_exprContext, 0);
  }
  POWER() {
    return this.getToken(Python3Parser.POWER, 0);
  }
  factor() {
    return this.getTypedRuleContext(FactorContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterPower(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitPower(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitPower(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Atom_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_atom_expr;
  }
  atom() {
    return this.getTypedRuleContext(AtomContext, 0);
  }
  AWAIT() {
    return this.getToken(Python3Parser.AWAIT, 0);
  }
  trailer = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TrailerContext);
    } else {
      return this.getTypedRuleContext(TrailerContext, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAtom_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAtom_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAtom_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class AtomContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_atom;
  }
  OPEN_PAREN() {
    return this.getToken(Python3Parser.OPEN_PAREN, 0);
  }
  CLOSE_PAREN() {
    return this.getToken(Python3Parser.CLOSE_PAREN, 0);
  }
  OPEN_BRACK() {
    return this.getToken(Python3Parser.OPEN_BRACK, 0);
  }
  CLOSE_BRACK() {
    return this.getToken(Python3Parser.CLOSE_BRACK, 0);
  }
  OPEN_BRACE() {
    return this.getToken(Python3Parser.OPEN_BRACE, 0);
  }
  CLOSE_BRACE() {
    return this.getToken(Python3Parser.CLOSE_BRACE, 0);
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  NUMBER() {
    return this.getToken(Python3Parser.NUMBER, 0);
  }
  ELLIPSIS() {
    return this.getToken(Python3Parser.ELLIPSIS, 0);
  }
  NONE() {
    return this.getToken(Python3Parser.NONE, 0);
  }
  TRUE() {
    return this.getToken(Python3Parser.TRUE, 0);
  }
  FALSE() {
    return this.getToken(Python3Parser.FALSE, 0);
  }
  yield_expr() {
    return this.getTypedRuleContext(Yield_exprContext, 0);
  }
  testlist_comp() {
    return this.getTypedRuleContext(Testlist_compContext, 0);
  }
  dictorsetmaker() {
    return this.getTypedRuleContext(DictorsetmakerContext, 0);
  }
  STRING = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.STRING);
    } else {
      return this.getToken(Python3Parser.STRING, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterAtom(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitAtom(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitAtom(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Testlist_compContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_testlist_comp;
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  star_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Star_exprContext);
    } else {
      return this.getTypedRuleContext(Star_exprContext, i);
    }
  };
  comp_for() {
    return this.getTypedRuleContext(Comp_forContext, 0);
  }
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTestlist_comp(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTestlist_comp(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTestlist_comp(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TrailerContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_trailer;
  }
  OPEN_PAREN() {
    return this.getToken(Python3Parser.OPEN_PAREN, 0);
  }
  CLOSE_PAREN() {
    return this.getToken(Python3Parser.CLOSE_PAREN, 0);
  }
  arglist() {
    return this.getTypedRuleContext(ArglistContext, 0);
  }
  OPEN_BRACK() {
    return this.getToken(Python3Parser.OPEN_BRACK, 0);
  }
  subscriptlist() {
    return this.getTypedRuleContext(SubscriptlistContext, 0);
  }
  CLOSE_BRACK() {
    return this.getToken(Python3Parser.CLOSE_BRACK, 0);
  }
  DOT() {
    return this.getToken(Python3Parser.DOT, 0);
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTrailer(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTrailer(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTrailer(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SubscriptlistContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_subscriptlist;
  }
  subscript_ = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Subscript_Context);
    } else {
      return this.getTypedRuleContext(Subscript_Context, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterSubscriptlist(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitSubscriptlist(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitSubscriptlist(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Subscript_Context extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_subscript_;
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  sliceop() {
    return this.getTypedRuleContext(SliceopContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterSubscript_(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitSubscript_(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitSubscript_(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class SliceopContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_sliceop;
  }
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterSliceop(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitSliceop(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitSliceop(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ExprlistContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_exprlist;
  }
  expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExprContext);
    } else {
      return this.getTypedRuleContext(ExprContext, i);
    }
  };
  star_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Star_exprContext);
    } else {
      return this.getTypedRuleContext(Star_exprContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterExprlist(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitExprlist(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitExprlist(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class TestlistContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_testlist;
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterTestlist(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitTestlist(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitTestlist(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class DictorsetmakerContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_dictorsetmaker;
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  COLON = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COLON);
    } else {
      return this.getToken(Python3Parser.COLON, i);
    }
  };
  POWER = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.POWER);
    } else {
      return this.getToken(Python3Parser.POWER, i);
    }
  };
  expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(ExprContext);
    } else {
      return this.getTypedRuleContext(ExprContext, i);
    }
  };
  comp_for() {
    return this.getTypedRuleContext(Comp_forContext, 0);
  }
  star_expr = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(Star_exprContext);
    } else {
      return this.getTypedRuleContext(Star_exprContext, i);
    }
  };
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterDictorsetmaker(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitDictorsetmaker(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitDictorsetmaker(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ClassdefContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_classdef;
  }
  CLASS() {
    return this.getToken(Python3Parser.CLASS, 0);
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  COLON() {
    return this.getToken(Python3Parser.COLON, 0);
  }
  suite() {
    return this.getTypedRuleContext(SuiteContext, 0);
  }
  OPEN_PAREN() {
    return this.getToken(Python3Parser.OPEN_PAREN, 0);
  }
  CLOSE_PAREN() {
    return this.getToken(Python3Parser.CLOSE_PAREN, 0);
  }
  arglist() {
    return this.getTypedRuleContext(ArglistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterClassdef(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitClassdef(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitClassdef(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class ArglistContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_arglist;
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
  COMMA = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTokens(Python3Parser.COMMA);
    } else {
      return this.getToken(Python3Parser.COMMA, i);
    }
  };
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterArglist(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitArglist(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitArglist(this);
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
    this.ruleIndex = Python3Parser.RULE_argument;
  }
  test = function(i) {
    if (i === void 0) {
      i = null;
    }
    if (i === null) {
      return this.getTypedRuleContexts(TestContext);
    } else {
      return this.getTypedRuleContext(TestContext, i);
    }
  };
  ASSIGN() {
    return this.getToken(Python3Parser.ASSIGN, 0);
  }
  POWER() {
    return this.getToken(Python3Parser.POWER, 0);
  }
  STAR() {
    return this.getToken(Python3Parser.STAR, 0);
  }
  comp_for() {
    return this.getTypedRuleContext(Comp_forContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterArgument(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitArgument(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitArgument(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Comp_iterContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_comp_iter;
  }
  comp_for() {
    return this.getTypedRuleContext(Comp_forContext, 0);
  }
  comp_if() {
    return this.getTypedRuleContext(Comp_ifContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterComp_iter(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitComp_iter(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitComp_iter(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Comp_forContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_comp_for;
  }
  FOR() {
    return this.getToken(Python3Parser.FOR, 0);
  }
  exprlist() {
    return this.getTypedRuleContext(ExprlistContext, 0);
  }
  IN() {
    return this.getToken(Python3Parser.IN, 0);
  }
  or_test() {
    return this.getTypedRuleContext(Or_testContext, 0);
  }
  ASYNC() {
    return this.getToken(Python3Parser.ASYNC, 0);
  }
  comp_iter() {
    return this.getTypedRuleContext(Comp_iterContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterComp_for(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitComp_for(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitComp_for(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Comp_ifContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_comp_if;
  }
  IF() {
    return this.getToken(Python3Parser.IF, 0);
  }
  test_nocond() {
    return this.getTypedRuleContext(Test_nocondContext, 0);
  }
  comp_iter() {
    return this.getTypedRuleContext(Comp_iterContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterComp_if(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitComp_if(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitComp_if(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Encoding_declContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_encoding_decl;
  }
  NAME() {
    return this.getToken(Python3Parser.NAME, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterEncoding_decl(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitEncoding_decl(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitEncoding_decl(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Yield_exprContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_yield_expr;
  }
  YIELD() {
    return this.getToken(Python3Parser.YIELD, 0);
  }
  yield_arg() {
    return this.getTypedRuleContext(Yield_argContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterYield_expr(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitYield_expr(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitYield_expr(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
class Yield_argContext extends import_antlr4.default.ParserRuleContext {
  constructor(parser, parent, invokingState) {
    if (parent === void 0) {
      parent = null;
    }
    if (invokingState === void 0 || invokingState === null) {
      invokingState = -1;
    }
    super(parent, invokingState);
    this.parser = parser;
    this.ruleIndex = Python3Parser.RULE_yield_arg;
  }
  FROM() {
    return this.getToken(Python3Parser.FROM, 0);
  }
  test() {
    return this.getTypedRuleContext(TestContext, 0);
  }
  testlist() {
    return this.getTypedRuleContext(TestlistContext, 0);
  }
  enterRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.enterYield_arg(this);
    }
  }
  exitRule(listener) {
    if (listener instanceof import_Python3ParserListener.default) {
      listener.exitYield_arg(this);
    }
  }
  accept(visitor) {
    if (visitor instanceof import_Python3ParserVisitor.default) {
      return visitor.visitYield_arg(this);
    } else {
      return visitor.visitChildren(this);
    }
  }
}
Python3Parser.Single_inputContext = Single_inputContext;
Python3Parser.File_inputContext = File_inputContext;
Python3Parser.Eval_inputContext = Eval_inputContext;
Python3Parser.DecoratorContext = DecoratorContext;
Python3Parser.DecoratorsContext = DecoratorsContext;
Python3Parser.DecoratedContext = DecoratedContext;
Python3Parser.Async_funcdefContext = Async_funcdefContext;
Python3Parser.FuncdefContext = FuncdefContext;
Python3Parser.ParametersContext = ParametersContext;
Python3Parser.TypedargslistContext = TypedargslistContext;
Python3Parser.TfpdefContext = TfpdefContext;
Python3Parser.VarargslistContext = VarargslistContext;
Python3Parser.VfpdefContext = VfpdefContext;
Python3Parser.StmtContext = StmtContext;
Python3Parser.Simple_stmtContext = Simple_stmtContext;
Python3Parser.Small_stmtContext = Small_stmtContext;
Python3Parser.Expr_stmtContext = Expr_stmtContext;
Python3Parser.AnnassignContext = AnnassignContext;
Python3Parser.Testlist_star_exprContext = Testlist_star_exprContext;
Python3Parser.AugassignContext = AugassignContext;
Python3Parser.Del_stmtContext = Del_stmtContext;
Python3Parser.Pass_stmtContext = Pass_stmtContext;
Python3Parser.Flow_stmtContext = Flow_stmtContext;
Python3Parser.Break_stmtContext = Break_stmtContext;
Python3Parser.Continue_stmtContext = Continue_stmtContext;
Python3Parser.Return_stmtContext = Return_stmtContext;
Python3Parser.Yield_stmtContext = Yield_stmtContext;
Python3Parser.Raise_stmtContext = Raise_stmtContext;
Python3Parser.Import_stmtContext = Import_stmtContext;
Python3Parser.Import_nameContext = Import_nameContext;
Python3Parser.Import_fromContext = Import_fromContext;
Python3Parser.Import_as_nameContext = Import_as_nameContext;
Python3Parser.Dotted_as_nameContext = Dotted_as_nameContext;
Python3Parser.Import_as_namesContext = Import_as_namesContext;
Python3Parser.Dotted_as_namesContext = Dotted_as_namesContext;
Python3Parser.Dotted_nameContext = Dotted_nameContext;
Python3Parser.Global_stmtContext = Global_stmtContext;
Python3Parser.Nonlocal_stmtContext = Nonlocal_stmtContext;
Python3Parser.Assert_stmtContext = Assert_stmtContext;
Python3Parser.Compound_stmtContext = Compound_stmtContext;
Python3Parser.Async_stmtContext = Async_stmtContext;
Python3Parser.If_stmtContext = If_stmtContext;
Python3Parser.While_stmtContext = While_stmtContext;
Python3Parser.For_stmtContext = For_stmtContext;
Python3Parser.Try_stmtContext = Try_stmtContext;
Python3Parser.With_stmtContext = With_stmtContext;
Python3Parser.With_itemContext = With_itemContext;
Python3Parser.Except_clauseContext = Except_clauseContext;
Python3Parser.SuiteContext = SuiteContext;
Python3Parser.TestContext = TestContext;
Python3Parser.Test_nocondContext = Test_nocondContext;
Python3Parser.LambdefContext = LambdefContext;
Python3Parser.Lambdef_nocondContext = Lambdef_nocondContext;
Python3Parser.Or_testContext = Or_testContext;
Python3Parser.And_testContext = And_testContext;
Python3Parser.Not_testContext = Not_testContext;
Python3Parser.ComparisonContext = ComparisonContext;
Python3Parser.Comp_opContext = Comp_opContext;
Python3Parser.Star_exprContext = Star_exprContext;
Python3Parser.ExprContext = ExprContext;
Python3Parser.Xor_exprContext = Xor_exprContext;
Python3Parser.And_exprContext = And_exprContext;
Python3Parser.Shift_exprContext = Shift_exprContext;
Python3Parser.Arith_exprContext = Arith_exprContext;
Python3Parser.TermContext = TermContext;
Python3Parser.FactorContext = FactorContext;
Python3Parser.PowerContext = PowerContext;
Python3Parser.Atom_exprContext = Atom_exprContext;
Python3Parser.AtomContext = AtomContext;
Python3Parser.Testlist_compContext = Testlist_compContext;
Python3Parser.TrailerContext = TrailerContext;
Python3Parser.SubscriptlistContext = SubscriptlistContext;
Python3Parser.Subscript_Context = Subscript_Context;
Python3Parser.SliceopContext = SliceopContext;
Python3Parser.ExprlistContext = ExprlistContext;
Python3Parser.TestlistContext = TestlistContext;
Python3Parser.DictorsetmakerContext = DictorsetmakerContext;
Python3Parser.ClassdefContext = ClassdefContext;
Python3Parser.ArglistContext = ArglistContext;
Python3Parser.ArgumentContext = ArgumentContext;
Python3Parser.Comp_iterContext = Comp_iterContext;
Python3Parser.Comp_forContext = Comp_forContext;
Python3Parser.Comp_ifContext = Comp_ifContext;
Python3Parser.Encoding_declContext = Encoding_declContext;
Python3Parser.Yield_exprContext = Yield_exprContext;
Python3Parser.Yield_argContext = Yield_argContext;
module.exports = __toCommonJS(Python3Parser_exports);
