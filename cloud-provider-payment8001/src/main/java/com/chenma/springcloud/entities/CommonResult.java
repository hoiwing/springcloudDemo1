package com.chenma.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: hoiwing
 * Create at: 2020-04-07 16:43:43
 * Description:
 */
@Data
@AllArgsConstructor // 会生成一个包含所有变量(全参)的构造方法
@NoArgsConstructor  // 生成一个无参数的构造方法
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null); // 调用全参
    }

}
