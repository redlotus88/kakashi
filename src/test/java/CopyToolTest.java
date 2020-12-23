import com.c7n.kakashi.CopyTool;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

/**
 * CopyToolTest
 *
 * @author jialong.wang
 * @Date on 2020/12/23 11:40 AM
 * @since 1.0
 */
public class CopyToolTest {

    @Test
    public void textCopyTextFromClipboard() {
        System.out.println("测试结果, " + CopyTool.copyTextFromClipboard());
    }
}
