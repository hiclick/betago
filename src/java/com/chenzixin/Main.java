package com.chenzixin;

import com.chenzixin.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.stat.StatUtils;

/**
 * Created by christen on 2/3/2017.
 */
public class Main {
    public static void main(String[] args) {

        String name = "";

        User user = new User();
        user.setName("Christen");
        user.setAge(36);

        double[] dArray = { 1.2, 3.4, 5.6, 7.8, 9.0};

        System.out.println(StringUtils.isBlank(name));
        System.out.println(user);
        System.out.println(StringUtils.isBlank(user.getName()));
        System.out.println(StatUtils.max(dArray));
    }
}