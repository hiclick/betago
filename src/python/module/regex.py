# -*- coding: utf-8 -*-
import re


def main():
    # 标准CJK文字 ([\u4E00-\u9FA5]+)
    pattern_str = u'[0-9]+([\u4E00-\u9FA5]+)[0-9]+'
    pattern = re.compile(pattern_str)
    test_str_1 = u'ab123hanzi123'
    m = pattern.search(test_str_1)
    print m.group() if m is not None else None
    print m.group(1) if m is not None else None
    print '\n'

    test_str_2 = u'ab123中國汉字の氵乛123'
    m = pattern.search(test_str_2)
    print m.group() if m is not None else None
    print m.group(1) if m is not None else None
    print '\n'

    # ([\x80-\xFF]+)
    test_str_3 = 'ab123中國，汉字の氵乛123'
    pattern_str = '[0-9]+([\x80-\xFF]+)[0-9]+'
    pattern = re.compile(pattern_str)
    m = pattern.search(test_str_3)
    print m.group().decode('utf-8') if m is not None else None
    print m.group(1).decode('utf-8') if m is not None else None
    print '\n'

    # ([\u2E80-\u9FFF]+)
    test_str_3 = u'ab123中國汉字の氵乛123测试'
    pattern_str = u'[0-9]+([\u2E80-\u9FFF]+)[0-9]+'
    pattern = re.compile(pattern_str)
    m = pattern.search(test_str_3)
    print m.group() if m is not None else None
    print m.group(1) if m is not None else None
    print '\n'

    # 可匹配标点
    test_str_4 = u'ab123中國，汉字氵乛123测试'
    pattern_str = u'[0-9]+([\u3400-\u4DB5\u4E00-\u9FA5\u9FA6-\u9FBB\uF900-\uFA2D\uFA30-\uFA6A\uFA70-\uFAD9\uFF00-\uFFEF\u2E80-\u2EFF\u3000-\u303F\u31C0-\u31EF]+)[0-9]+'
    pattern = re.compile(pattern_str)
    m = pattern.search(test_str_4)
    print m.group() if m is not None else None
    print m.group(1) if m is not None else None
    print '\n'


if __name__ == '__main__':
    main()
