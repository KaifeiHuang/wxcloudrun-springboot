package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * index控制器
 */
@RestController
public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping("/index")
  public String index() {
    String result = "欢迎使用云托管!服务版本：" + System.getenv("PUB_SERVICE_REVISION") + "\n实例主机：" + System.getenv("HOSTNAME") + "\n当前时间：" + LocalDateTime.now().format(
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    return result;
  }

}
