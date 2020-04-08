package com.chenma.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Author: hoiwing
 * Create at: 2020-04-08 11:34:43
 * Description:
 */
@Data
@AllArgsConstructor // 会生成一个包含所有变量(全参)的构造方法
@NoArgsConstructor  // 生成一个无参数的构造方法
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null); // 调用全参
    }

}
