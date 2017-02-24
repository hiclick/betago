(function() {
    /* window.padex = window['padex'] || {};
     window.padex = {
     getCookie: _getCookie
     }*/

    var _padex = {
        debug: false,
        projectName: 'padex',
        cookieKEY: 'u',
        domain: 'pcauto',
        _getDomain: function() {
            var THIS = this,
                domain = THIS.domain;

            switch(domain) {
                case 'pconline':
                    return document.domain.replace(/\w+(\.pconline.com.cn)/, "$1");
                case 'pcauto':
                    return document.domain.replace(/\w+(\.pcauto.com.cn)/, "$1");
                case 'pcbaby':
                    return document.domain.replace(/\w+(\.pcbaby.com.cn)/, "$1");
                case 'pchouse':
                    return document.domain.replace(/\w+(\.pchouse.com.cn)/, "$1");
                case 'pclady':
                    return document.domain.replace(/\w+(\.pclady.com.cn)/, "$1");
                case 'all':
                    return document.domain.replace(/\w+((\.\w+)+)/, "$1");
                default:
                    return undefined;

            }
        },
        _cookieURL: function(cookieId) {
            // return this.debug ? 'http://v84.pcauto.com.cn:8001/i/cookie.jsp?cc_p_open_id=' + cookieId : 'http://play7.pconline.com.cn/padex/i/cookie.jsp?cc_p_open_id=' + cookieId;
            return this.debug ? 'http://spencer.pcauto.com.cn/i/cookie.jsp?cc_p_open_id=' + cookieId : 'http://agent1.pconline.com.cn:8060/counter/adAnalyse/fflloogg.jsp?m=add&f=toyotoPDB&c=' + cookieId;
        },
        _getCookie: function(key) {
            var cookies = document.cookie ? document.cookie.split('; ') : [],
                i = 0,
                l = cookies.length;

            for(; i < l; i++) {
                var parts = cookies[i].split('='),
                    name = parts.shift(),
                    cookie = parts.join('=');

                if(key == name) {
                    return cookie;
                }
            }

            return undefined;
        },
        _sendCookie: function() {
            var THIS = this;

            var cookieId = THIS._getCookie(THIS.cookieKEY),
                sentCookieId = THIS._getCookie(THIS.projectName);


            if(cookieId && cookieId != '0' && (!sentCookieId || cookieId != sentCookieId)) {
                var expiresDate = new Date(2099, 10, 30);

                var domain = THIS._getDomain();

                document.cookie = THIS.projectName + '=' + cookieId + ';domain=' + domain + ';path=/;expires=' + expiresDate.toGMTString();

                if(!THIS.debug) document.write('<img src="http://cm.mct01.com/cgi?cc_p_open_id=' + cookieId + '&cc_pid=887&cc_acid=andc"/>');


                document.write('<img style=display:none src="' + THIS._cookieURL(cookieId) + '"/>');
            }
        }
    };

    window.onload = function() {



        _padex._sendCookie();
    };
})();