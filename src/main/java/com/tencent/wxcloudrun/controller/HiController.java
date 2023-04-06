/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.tencent.wxcloudrun.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 调用其他容器controller
 *
 * @author huangkaifei
 * @version : HiController.java, v 0.1 2023年04月03日 4:57 PM huangkaifei Exp $
 */
@Slf4j
@RestController
public class HiController {

    @GetMapping
    public String callHi() {
        return "hello !!!!";
    }

}