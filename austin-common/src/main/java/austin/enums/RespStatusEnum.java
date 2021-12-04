package austin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 全局相应消息枚举
 */
@Getter
@ToString
@AllArgsConstructor
public enum RespStatusEnum {

    /**
     * OK:操作成功
     */
    SUCCESS("0000","操作成功"),
    FAIL("0001","操作失败"),

    /**
     * 客户端操作
     */
    CLIENT_BAD_PARAMETERS("A0001","客户端参数异常"),
    TEMPLATE_NOT_FOUND("A0002","模板获取失败"),

    /**
     * 系统
     */
    SERVICE_ERROR("B0001","服务执行异常"),
    RESOURCE_NOT_FOUND("B0002","资源不存在"),

    /**
     * pipline -> 业务流程
     */
    CONTEXT_IS_NULL("P0001","流程上下文为空"),
    BUSINESS_CODE_IS_NULL("P0002","业务代码为空"),
    PROCESS_TEMPLATE_CONFIG_IS_NULL("P0003","流程模板为空"),
    PROCESS_LIST_CONFIG_IS_NULL("P0004","业务处理器配置为空"),



    ;
    /**
     * 响应状态码
     */
    private final String code;

    /**
     * 响应消息
     */
    private final String msg;
}
