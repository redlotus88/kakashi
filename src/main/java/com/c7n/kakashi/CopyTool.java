package com.c7n.kakashi;

import org.apache.commons.lang3.StringUtils;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * 剪贴板拷贝工具类
 *
 * @author jialong.wang
 * @Date on 2020/12/23 11:01 AM
 * @since 1.0
 */
public class CopyTool {

    /**
     * 从剪贴板拷贝文字内容
     *
     * @return String
     */
    public static String copyTextFromClipboard() {
        final Clipboard systemClipboard = ClipboardUtils.getClipboard();
        String text = null;
        if (systemClipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
            try {
                text = (String) systemClipboard.getData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException e) {
                text = StringUtils.EMPTY;
            }
        }
        return text;
    }
}
