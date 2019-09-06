package com.zbf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.DefaultApiService;

/**
 * Description:
 *
 * @author 创建者
 * @author 修改者
 * @version 2019/9/6 17:12
 * @since 2019/9/6 17:12
 */
@RestController
public class DemoConsumerController {

    @Autowired
    private DefaultApiService defaultService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return defaultService.defaultMethod(name);
    }
}
