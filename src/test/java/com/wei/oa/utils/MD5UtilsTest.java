package com.wei.oa.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wei
 * @date 2021/10/16 12:19
 * @description: TODO
 */
public class MD5UtilsTest {
    @Test
    public void md5Digest() {
        System.out.println(MD5Utils.md5Digest("test"));
        String data = "hello";
        char[] translate_data = data.toCharArray();
        System.out.println(translate_data);
    }

    @Test
    public void md5Digest2() {
        // f57e762e3fb7e1e3ec8ec4db6a1248e1
        for (int i = 188; i <= 197; i++) {
            System.out.println(MD5Utils.md5Digest("test", i));
        }
    }
}