package com.stalary.pf.user.client;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Stalary
 * @description
 * @date 2019/1/1
 */
@FeignClient(name = "message", url = "${message.server}")
@Component
@RefreshScope
public interface MessageClient {

    @GetMapping("/message/sendCount")
    void sendCount(@RequestParam("userId") Long userId);
}
