package com.c7n.kakashi;

import java.awt.*;
import java.awt.datatransfer.Clipboard;

/**
 * ClipboardUtils
 *
 * @author jialong.wang
 * @Date on 2020/12/23 1:29 PM
 * @since 1.0
 */
public class ClipboardUtils {

    public static Clipboard getClipboard() {
        return Toolkit.getDefaultToolkit().getSystemClipboard();
    }
}
