package com.c7n.kakashi;

import com.c7n.kakashi.model.ClipboardText;
import com.google.gson.Gson;
import redis.clients.jedis.JedisPubSub;

/**
 * ClipboardSubListener
 *
 * @author jialong.wang
 * @Date on 2020/12/24 10:45 AM
 * @since 1.0
 */
public class ClipboardSubListener extends JedisPubSub {

    @Override
    public void onMessage(String channel, String message) {
        System.out.println("接受消息：" + message);
        try {
            Gson gson = new Gson();
            final ClipboardText clipboardText = gson.fromJson(message, ClipboardText.class);
            if (KakashiCache.sync(clipboardText)) {
                PasteTool.setClipboardString(message);
            }
        } catch (Exception e) {
        }
    }
}
