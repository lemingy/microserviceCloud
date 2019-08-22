package com.explore.democommon.exception;

import com.explore.democommon.enums.RespCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.text.MessageFormat;

/**
 * @description：
 * @author: yinlm
 * @date: 2019/8/22 16:14
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class NdjException extends Exception {
    private RespCodeEnum codeEnum;



    public NdjException(RespCodeEnum respCodeEnum) {
        super(respCodeEnum.getErrMsg());
        codeEnum = respCodeEnum;

    }

    public NdjException(RespCodeEnum respCodeEnum, String errMsg) {
        super(errMsg);
        codeEnum = respCodeEnum;
    }
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
    @Override
    public String toString() {
        return MessageFormat.format("{0}[{1}]",this.codeEnum.getCode(),super.getLocalizedMessage());
    }
}
