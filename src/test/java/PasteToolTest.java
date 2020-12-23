import com.c7n.kakashi.CopyTool;
import com.c7n.kakashi.PasteTool;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * <功能描述>
 *
 * @author jialong.wang
 * @Date on 2020/12/23 1:31 PM
 * @since 1.0
 */
public class PasteToolTest {

    @Test
    public void testSetClipboardString() {
        String text = "这是一个测试文本";

        PasteTool.setClipboardString(text);
        final String s = CopyTool.copyTextFromClipboard();
        Assert.assertTrue(StringUtils.equals(s, text));
    }
}
