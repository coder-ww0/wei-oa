package com.wei.oa.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author wei
 * @date 2021/10/16 12:17
 * @description: TODO
 */
public class MD5Utils {
    public static String md5Digest(String source) {
        return DigestUtils.md5Hex(source);
    }

    public static String md5Digest(String source, Integer salt) {
        // 转化成字符数组
        char[] ca = source.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            ca[i] = (char) (ca[i] + salt);
        }
        String target = new String(ca);
        String md5 = DigestUtils.md5Hex(target);
        return md5;
    }
}
