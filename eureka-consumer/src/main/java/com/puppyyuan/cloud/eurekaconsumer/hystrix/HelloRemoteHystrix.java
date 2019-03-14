package com.puppyyuan.cloud.eurekaconsumer.hystrix;

import com.puppyyuan.cloud.eurekaconsumer.feign.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yuanpeng
 * @Date: 2019-03-14 09:52
 * @Description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello world";
    }
}
