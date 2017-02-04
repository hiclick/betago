package com.chenzixin;

import com.chenzixin.entity.User;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by christen on 2/3/2017.
 */
public class Main {
    public static void main(String[] args) {

        String name = "";
        User user = new User();
        user.setName("Christen");
        user.setAge(36);

        System.out.println(StringUtils.isBlank(name));
        System.out.println(user);
        System.out.println(StringUtils.isBlank(user.getName()));
    }
}
