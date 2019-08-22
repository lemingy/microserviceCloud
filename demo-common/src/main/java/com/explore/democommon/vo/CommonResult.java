package com.explore.democommon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description：
 * @author: yinlm
 * @date: 2019/8/22 16:16
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 是否成功
     * @return 成功/失败
     */
//    @JsonIgnore
    public boolean isSucc() {
        return code == 0;
    }
}
