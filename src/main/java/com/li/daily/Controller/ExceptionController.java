package com.li.daily.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
@Slf4j
public class ExceptionController {
    @ExceptionHandler(value = Exception.class)
    public String check(Exception ex) {

        return "dd";
    }
}
