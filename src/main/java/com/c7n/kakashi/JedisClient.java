package com.c7n.kakashi;

import redis.clients.jedis.Jedis;

/**
 * 实例化Redis操作
 *
 * @author jialong.wang
 * @Date on 2020/12/23 4:43 PM
 * @since 1.0
 */
public class JedisClient {

    public static Jedis jedis;

    public static Jedis getJedisConnection() {
        if (jedis == null) {
            jedis = new Jedis("127.0.0.1", 6379);
        }
        return jedis;
    }
}
