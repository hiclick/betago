/**
 * 学习子表达式
 */
var SRC = "//imgad0.pconline.com.cn/ivy/image/201612/1/14805616961920.swf#1100x120"
var w = 1 * SRC.replace(/^.*#(\d+)x(\d+).*$|^.*$/, '$1');
if (w < 1)w = 990;
var h = 1 * SRC.replace(/^.*#(\d+)x(\d+).*$|^.*$/, '$2');
if (h < 1)h = 90;
console.log(w);
console.log(h);

/**
 * 学习RegExp对象
 */
var test_str = "The best 2 things in life are free and love.";
// 直接量语法
var patt1 = /\d+/gi;
console.log(patt1.test(test_str));
/**
 * i 执行对大小写不敏感的匹配
 * g 执行全局匹配（查找所有匹配而非在找到第一个匹配后停止）
 * @type {RegExp}
 */
var patt2 = new RegExp("Best", "gi");
console.log(patt2.exec(test_str));

var patt3 = new RegExp("([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})", "g");
console.log("是否包含IP？");
console.log(patt3.test(test_str + ". from 192.168.99.10"));
//console.log(patt3.exec(test_str + " from 192.168.99.10"));

var patt4 = new RegExp("\\d+", "g");
console.log(patt4.test("This an one thing"));
console.log(patt4.exec("This a 1 thing"));


/**
 * 学习子表达式
 */
var temp = "Gates Bill";
var name =  temp.replace(/(\w+)\s*(\w+)/, "$2 $1");
console.log(name); // Bill Gates