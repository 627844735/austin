package austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 模板枚举信息
 */

@Getter
@ToString
@AllArgsConstructor
public enum TemplateType {

    OPERATION(10,"运营类的模板"),
    TECHNOLOGY(20,"技术类的模板"),

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
