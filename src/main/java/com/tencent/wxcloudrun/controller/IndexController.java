package com.tencent.wxcloudrun.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * index控制器
 */
@Slf4j
@RestController
public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping("/index")
  public String index() {
    log.info("index ===== ");
    String result = "欢迎使用云托管!服务版本：" + System.getenv("PUB_SERVICE_REVISION") + "\n实例主机：" + System.getenv("HOSTNAME") + "\n当前时间：" + LocalDateTime.now().format(
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    return result;
  }

}
