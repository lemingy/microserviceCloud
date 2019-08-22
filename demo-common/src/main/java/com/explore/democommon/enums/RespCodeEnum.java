package com.explore.democommon.enums;

import com.explore.democommon.vo.CommonResult;
import lombok.ToString;

@ToString
public enum RespCodeEnum {

    /**
     * 成功
     */
    OK(0, "成功"),
    /**
     * 失败,发生异常
     */
    ERROR(500, "服务器异常, 请稍后再试"),


    /** 参数错误：10001-19999 */
    PARAM_IS_INVALID(10001, "参数无效"),
    PARAM_IS_BLANK(10002, "参数为空"),
    PARAM_TYPE_BIND_ERROR(10003, "参数类型错误"),
    PARAM_NOT_COMPLETE(10004, "参数缺失"),

    /** 用户错误：20001-29999*/
    USER_NOT_LOGGED_IN(20001, "用户未登录"),
    USER_LOGIN_ERROR(20002, "账号不存在或密码错误"),
    USER_ACCOUNT_FORBIDDEN(20003, "账号已被禁用"),
    USER_NOT_EXIST(20004, "用户不存在"),
    USER_HAS_EXISTED(20005, "用户已存在"),
    USER_LOGIN_EXPIRED(20006, "登陆超时,请重新登陆"),
    USER_HAS_LOGGED(20007, "账户已登陆"),
    USER_CODE_SEND_ERROR(20008, "发送验证码失败,请稍后再试"),
    USER_CODE_INVALID_ERROR(20009, "验证码已失效,请稍后重新发送"),



    /** 基础业务错误：30001-39999 */
    IMG_UPLOAD_ERROR(30001, "上传图片失败, 请稍后再试"),
    IMG_NULL_ERROR(30002, "指定图片不存在"),

    /** 病虫害库业务错误: 31001-31999*/
    PD_CROP_ADD_ERROR(31001,"新增作物失败, 请稍后再试"),
    PD_CROP_NULL_ERROR(31002, "该作物不存在"),
    PD_PD_NULL_ERROR(33001, "该病虫害不存在"),
    /** AI识别业务错误: 32001-32999*/
    DI_CREATE_DIAGNOSIS_RECORD_ERROR(32001,"新增诊断记录失败"),
    /** 后台管理业务错误: 33001-34999*/






    /** 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

    /** 数据错误：50001-599999 */
    RESULE_DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "数据已存在"),

    /** 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),
    INTERFACE_OUTTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),

    /** 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限");






    private Integer code;

    private String errMsg;


    RespCodeEnum(Integer code, String errMsg) {
        this.code = code;
        this.errMsg = errMsg;
    }

    public Integer getCode() {
        return code;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public boolean isSucc(CommonResult<Object> resp) {
        return RespCodeEnum.OK.code.equals(resp.getCode());
    }

    public boolean isSucc(RespCodeEnum codeEnum) {
        return RespCodeEnum.OK.equals(codeEnum);
    }

}
