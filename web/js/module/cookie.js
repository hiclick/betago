/**
 * Created by Christen on 2017/2/21.
 */

function setCookie(cname, cvalue, exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    /**
     * Deprecated
     * This feature has been removed from the Web standards.
     * Though some browsers may still support it, it is in the process of being dropped.
     * Do not use it in old or new projects. Pages or Web apps using it may break at any time.
     * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toGMTString
     */
    var expires = "expires=" + d.toUTCString();
    document.cookie = cname + "=" + cvalue + "; " + expires;
}

function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for (var i = 0; i < ca.length; i++) {
        var c = ca[i].trim();
        if (c.indexOf(name) == 0) return c.substring(name.length, c.length);
    }
    return "";
}

function checkCookie() {
    var user = getCookie("username");
    if (user != "") {
        alert("Welcome again " + user);
    }
    else {
        user = prompt("Please enter your name:", "");
        if (user != "" && user != null) {
            setCookie("username", user, 365);
        }
    }
}

function delCookie(cname) {
    var exp = new Date();
    exp.setTime(exp.getTime() - 1);
    var cval = getCookie(cname);
    if (cval != null) {
        document.cookie = cname + "=" + cval + ";expires=" + exp.toUTCString();
    }
}