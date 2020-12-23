package com.c7n.kakashi;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

/**
 * PasteTool
 *
 * @author jialong.wang
 * @Date on 2020/12/23 11:01 AM
 * @since 1.0
 */
public class PasteTool {


    /**
     * 将指定文本复制到剪贴板上
     *
     * @param text String
     */
    public static void setClipboardString(String text) {
        final Clipboard clipboard = ClipboardUtils.getClipboard();
        Transferable trans = new StringSelection(text);
        clipboard.setContents(trans, null);
    }
}
