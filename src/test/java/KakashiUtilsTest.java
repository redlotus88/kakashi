import com.c7n.kakashi.KakashiUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * <功能描述>
 *
 * @author jialong.wang
 * @Date on 2020/12/24 10:00 AM
 * @since 1.0
 */
public class KakashiUtilsTest {

    @Test
    public void testMd5() {
        String md5Test = KakashiUtils.md5("test123");
        System.out.println(md5Test);
        Assert.assertTrue(StringUtils.equals("cc03e747a6afbbcbf8be7668acfebee5", md5Test));

        System.out.println("外触发点击操作");
    }

}
