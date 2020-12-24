package com.c7n.kakashi;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 实例化Redis操作
 *
 * @author jialong.wang
 * @Date on 2020/12/23 4:43 PM
 * @since 1.0
 */
public class JedisClient {

    private static Jedis jedis;

    private static JedisPool jedisPool;

    public static Jedis getJedisResource() {
        if (jedisPool == null) {
            jedisPool = newJedisPool();
        }
        return jedisPool.getResource();
    }

    public static JedisPool newJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(100);
        config.setMaxIdle(5);
        config.setMaxWaitMillis(1000);
        return new JedisPool(config, "139.224.49.1", 6379, 180000, "q2u7LR$e", 0);
    }

}
