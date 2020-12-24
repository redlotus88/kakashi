package com.c7n.kakashi.model;

import com.c7n.kakashi.KakashiUtils;
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ClipboardText
 *
 * @author jialong.wang
 * @Date on 2020/12/24 10:15 AM
 * @since 1.0
 */
@Data
public class ClipboardText {

    private String text;
    private String md5;

    public ClipboardText(String text) {
        this.text = text;
        this.md5 = KakashiUtils.md5(text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ClipboardText that = (ClipboardText) o;

        return new EqualsBuilder()
                .append(md5, that.md5)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(md5)
                .toHashCode();
    }
}
