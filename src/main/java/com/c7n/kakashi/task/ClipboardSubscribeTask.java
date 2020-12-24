package com.c7n.kakashi.task;

import com.c7n.kakashi.ClipboardSubListener;
import com.c7n.kakashi.JedisClient;
import com.c7n.kakashi.KakashiConstant;
import redis.clients.jedis.Jedis;

/**
 * ClipboardSubscribeTask
 *
 * 订阅模式本身是redis自带的方法，但是订阅模式是恒阻塞的，一旦进入订阅的方法，就会一直监听发布方是否发布了消息，导致监听阻塞，无法使调用方程序顺序执行
 *
 * @author jialong.wang
 * @Date on 2020/12/24 10:44 AM
 * @since 1.0
 */
public class ClipboardSubscribeTask extends Thread {

    @Override
    public void run() {
        System.out.println("订阅线程启动");
        final Jedis jedisConnection = JedisClient.newJedisPool().getResource();
        ClipboardSubListener listener = new ClipboardSubListener();
        jedisConnection.subscribe(listener, KakashiConstant.REDIS_PUB_CHANNEL);
    }
}
