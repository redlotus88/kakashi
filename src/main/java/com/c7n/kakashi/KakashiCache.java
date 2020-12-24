package com.c7n.kakashi;

import com.c7n.kakashi.model.ClipboardText;
import org.apache.commons.lang3.StringUtils;

/**
 * KakashiCache
 *
 * @author jialong.wang
 * @Date on 2020/12/24 9:57 AM
 * @since 1.0
 */
public class KakashiCache {

    private static String currentClipboardTextMd5 = "";

    public static boolean sync(ClipboardText clipboardText) {
        if (StringUtils.equals(currentClipboardTextMd5, clipboardText.getMd5())) {
            return false;
        }

        currentClipboardTextMd5 = clipboardText.getMd5();
        return true;
    }
}
