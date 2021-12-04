package austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 发送消息类型枚举
 */
@Getter
@ToString
@AllArgsConstructor
public enum MessageType {
    NOTICE(10,"通知类消息"),
    MARKETING(20,"营销类消息"),
    AUTH(30,"验证类消息"),

    ;
    /**
     * 编码值
     */
    private Integer code;

    /**
     * 描述
     */
    private String desc;
}
