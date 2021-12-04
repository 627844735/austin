package austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 短信状态
 */

@AllArgsConstructor
@Getter
@ToString
public enum SmsStatus {

    SEND_SUCCESS(10,"调用渠道接口发送成功"),
    RECEIVE_SUCCESS(20,"用户收到短信(收到渠道短信回执，状态成功)"),
    RECEIVE_FAIL(30,"用户收不到短信(收到渠道短信回执，状态失败)");

    /**
     * 编码值
     */
    private Integer code;

    /**
     * 描述
     */
    private String desc;
}
