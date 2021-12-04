package austin.enums;

import austin.dto.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 发送渠道类型枚举
 */

@Getter
@ToString
@AllArgsConstructor
public enum ChannelType {

    IM(10,"IM(站内信)", ImContentModel.class),
    PUSH(20,"push(通知栏)", PushContentModel.class),
    SMS(30,"sms(短信)", SmsContentModel.class),
    EMAIL(40,"email(邮件)", EmailContentModel.class),
    OFFICIAL_ACCOUNT(50,"official_accounts(服务号)", OfficialAccountsContentModel.class),
    MINI_PROGRAM(60,"mini_program(小程序)", MiniProgramContentModel.class),

    ;

    /**
     * 编码值
     */
    private Integer code;

    /**
     * 描述
     */
    private String desc;

    /**
     * 内容模型Class
     */
    private Class contantModelClass;
}
