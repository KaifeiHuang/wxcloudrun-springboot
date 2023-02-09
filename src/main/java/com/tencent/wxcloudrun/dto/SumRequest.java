/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.tencent.wxcloudrun.dto;

import lombok.Data;

/**
 * @author huangkaifei
 * @version : SumRequest.java, v 0.1 2023年02月09日 3:47 PM huangkaifei Exp $
 */
@Data
public class SumRequest {
    private Integer firstNum;
    private Integer secondNum;

    @Override
    public String toString() {
        return "SumRequest{" +
                "firstNum=" + firstNum +
                ", secondNum=" + secondNum +
                '}';
    }
}