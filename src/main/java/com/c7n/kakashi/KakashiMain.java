package com.c7n.kakashi;

import com.c7n.kakashi.task.ClipboardPublishTask;
import com.c7n.kakashi.task.ClipboardSubscribeTask;

/**
 * KakashiMain
 *
 * @author jialong.wang
 * @Date on 2020/12/23 11:00 AM
 * @since 1.0
 */
public class KakashiMain {

    public static void main(String[] args) {
        System.out.println("测试主类");

        new ClipboardPublishTask().start();
        new ClipboardSubscribeTask().start();
    }
}
