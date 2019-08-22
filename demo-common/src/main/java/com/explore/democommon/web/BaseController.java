package com.explore.democommon.web;

import com.explore.democommon.enums.RespCodeEnum;
import com.explore.democommon.exception.NdjException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.io.Serializable;

/**
 * @description：
 * @author: yinlm
 * @date: 2019/8/22 16:13
 **/
public class BaseController implements Serializable {
    private static final long serialVersionUID = 4934309637742225301L;

    //参数校验
    protected void verification(BindingResult bindingResult) throws NdjException {
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldErrors().stream().findAny().get();
            throw new NdjException(RespCodeEnum.IMG_UPLOAD_ERROR,fieldError.getDefaultMessage());
        }

    }
}
