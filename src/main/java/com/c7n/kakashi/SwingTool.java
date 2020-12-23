package com.c7n.kakashi;

import javax.swing.*;

/**
 * <功能描述>
 *
 * @author jialong.wang
 * @Date on 2020/12/23 11:12 AM
 * @since 1.0
 */
public class SwingTool {

    public static JFrame createGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame jFrame = new JFrame("Kakashi App");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 显示窗口
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setSize(350, 250);
        return jFrame;
    }

    public static JLabel addLabel(JFrame frame, String text) {
        JLabel label = new JLabel(text);
        frame.add(label);
        return label;
    }
}
