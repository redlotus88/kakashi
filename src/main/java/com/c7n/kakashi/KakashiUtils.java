package com.c7n.kakashi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <功能描述>
 *
 * @author jialong.wang
 * @Date on 2020/12/24 9:58 AM
 * @since 1.0
 */
public class KakashiUtils {


    public static String md5(String text) {
        byte[] secretBytes = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes());
            secretBytes = md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        return toHexString(secretBytes);
    }

    private static String toHexString(byte[] md5) {
        int i;
        StringBuffer buf = new StringBuffer("");
        for (int offset = 0; offset < md5.length; offset++) {
            i = md5[offset];
            if (i < 0) {
                i += 256;
            }
            if (i < 16) {
                buf.append("0");
            }
            buf.append(Integer.toHexString(i));
        }
        return buf.toString();
    }

}
