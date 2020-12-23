import com.c7n.kakashi.JedisClient;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * <功能描述>
 *
 * @author jialong.wang
 * @Date on 2020/12/23 4:44 PM
 * @since 1.0
 */
public class JedisTest {

    @Test
    public void testSetString() {
        final String TEST_KEY = "testJedis";
        final String TEST_VALUE = "123";

        final Jedis jedisConnection = JedisClient.getJedisConnection();
        jedisConnection.set(TEST_KEY, TEST_VALUE);
        final String testJedis = jedisConnection.get(TEST_KEY);

        Assert.assertTrue(StringUtils.equals(testJedis, TEST_VALUE));
        jedisConnection.del(TEST_KEY);
    }
}
