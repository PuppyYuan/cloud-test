package com.puppyyuan.cloud.eurekaconsumer.controller;

import com.puppyyuan.cloud.eurekaconsumer.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @Author: yuanpeng
 * @Date: 2019-03-14 09:39
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable String name) {
        return helloRemote.hello(name);
    }

}
