package com.lion.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MessageAction {
    @ResponseBody
    @RequestMapping("/")
        public String echo() {
        return "你好，这是第一个SpringBoot程序";
        }
}
