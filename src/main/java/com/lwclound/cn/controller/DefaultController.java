package com.lwclound.cn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李旺
 * @project_name lwMusic
 * @ClassName:DefaultController
 * @company 思盈网络科技-技术部
 * @Level P6
 * @create 2022/3/11-5:29 PM
 * @Package com.lwclound.cn.controller
 * @Description: (用一句话描述该文件做什么)
 */
@RestController
@RequestMapping("/hello")
public class DefaultController {
    @GetMapping("/test")
    public String sayHello(){
        return "技术测试";
    }
}
