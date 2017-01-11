package com.uip.panel.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SampleRestController {

    @RequestMapping("/h")
    public String h() {
        return "1212";
    }
}
