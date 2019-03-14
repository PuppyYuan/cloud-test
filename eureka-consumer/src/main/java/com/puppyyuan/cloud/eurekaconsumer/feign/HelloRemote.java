package com.puppyyuan.cloud.eurekaconsumer.feign;

import com.puppyyuan.cloud.eurekaconsumer.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yuanpeng
 * @Date: 2019-03-14 09:45
 * @Description:
 */
@FeignClient(name = "eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);
}
