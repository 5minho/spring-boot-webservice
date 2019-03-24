package me.minomi.springbootservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@RestController
public class WebRestController {
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
}
