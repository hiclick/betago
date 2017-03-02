# coding=utf-8

c_str = raw_input('Please input a string you need to change: ')

new_list = c_str.split(' ')
for i in new_list:
    print i.capitalize(),
    # 以下两种方法均会添加换行
    # print i.capitalize(), ' '
    # print i.capitalize()

print '\n'

# Python 中有 title 方法，可以直接实现上述效果

t_str = raw_input('Please input a string you need to change: ')

print t_str.title()
