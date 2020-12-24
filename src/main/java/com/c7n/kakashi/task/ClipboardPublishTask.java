package com.c7n.kakashi.task;

import com.c7n.kakashi.*;
import com.c7n.kakashi.model.ClipboardText;
import com.google.gson.Gson;
import lombok.SneakyThrows;
import redis.clients.jedis.Jedis;

/**
 * ClipboardPublishTask
 *
 * @author jialong.wang
 * @Date on 2020/12/24 10:08 AM
 * @since 1.0
 */
public class ClipboardPublishTask extends Thread {

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            final String text = CopyTool.copyTextFromClipboard();
            ClipboardText clipboardText = new ClipboardText(text);
            if (KakashiCache.sync(clipboardText)) {
                Gson gson = new Gson();
                final String jsonString = gson.toJson(clipboardText);
                final Jedis jedisConnection = JedisClient.getJedisResource();
                System.out.println("发送消息, " + jsonString);
                jedisConnection.set("kakashi_dragon", jsonString);
                jedisConnection.publish(KakashiConstant.REDIS_PUB_CHANNEL, jsonString);
            }
            Thread.sleep(1000L);
        }
    }
}
