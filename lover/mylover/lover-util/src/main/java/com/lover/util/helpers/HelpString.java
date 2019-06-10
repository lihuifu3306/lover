package com.lover.util.helpers;

import java.util.UUID;

/**
 * @Author: 李惠福
 * @Create: 2019/6/10  10:49
 */
public class HelpString {
    /**
     * 生成uuid
     * @return String
     */
    public static String getGUID () {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("\\-", "");
    }
}
