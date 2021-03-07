package com.li.daily.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class LoggerController {

    @GetMapping("test")
    public String test(){
        String cc=null;
        cc.length();
        return "dd";
    }
}
