/**
 * Created by Christen on 2017/3/2.
 */

console.log("10进制转其它进制");
var x = 110;
console.log(x.toString(2));
console.log(x.toString(4));
console.log(x.toString(8));
console.log(x.toString(10));
console.log(x.toString(16));
console.log(x.toString(32));

console.log("其它进制转10进制");
var y = "10";
// http://www.w3school.com.cn/jsref/jsref_parseInt.asp
console.log(parseInt(y, 2));
console.log(parseInt(y, 4));
console.log(parseInt(y, 8));
console.log(parseInt(y, 10));
console.log(parseInt(y, 16));
console.log(parseInt(y, 32));
console.log("不明所以");

console.log("操作16进制");
//先用parseInt转成十进制再用toString转到目标进制
console.log(parseInt("0xff").toString(2)); // 默认16进制
console.log(parseInt("ff", 16).toString(2));
console.log(parseInt("ff", 16).toString(4));
console.log(parseInt("ff", 16).toString(8));
console.log(parseInt("ff", 16).toString(10));
console.log(parseInt("ff", 16).toString(16));
console.log(parseInt("ff", 16).toString(32));

console.log("操作8进制");
// Alt + Shift + Left Click
console.log(parseInt("07").toString(2)); // 默认8进制
console.log(parseInt("07", 8).toString(2));
console.log(parseInt("07", 8).toString(4));
console.log(parseInt("07", 8).toString(8));
console.log(parseInt("07", 8).toString(10));
console.log(parseInt("07", 8).toString(16));
console.log(parseInt("07", 8).toString(32));
