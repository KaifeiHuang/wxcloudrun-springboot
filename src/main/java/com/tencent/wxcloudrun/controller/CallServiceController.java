/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.tencent.wxcloudrun.controller;

import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author huangkaifei
 * @version : CallServiceController.java, v 0.1 2023年04月13日 4:23 PM huangkaifei Exp $
 */
@Slf4j
@RestController
@RequestMapping("/callService")
public class CallServiceController {

    @GetMapping()
    public String hi(){
        return "welcome to use callService api!!!";
    }

    @GetMapping("/get")
    public String callGetReq(@RequestParam(value = "schema", required = false) String schema,
                             @RequestParam(value = "service", required = false) String service,
                             @RequestParam(value = "path", required = false) String path) throws IOException {
        log.info("callGetReq, schema: {}, service: {}, path: {}", schema, service, path);
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .get().url(String.format("%s:/%s/%s", schema, service, path))
                .build();
        Response response = client.newCall(request).execute();
        String res = response.body().string();
        log.info("rep: {}", res);
        return res;
    }
}