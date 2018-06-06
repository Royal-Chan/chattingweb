package com.imryao.chattingweb

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration
class FirstController {
    @RequestMapping("/")
    public hello() {
        return "<h1>hello world</h1>"
    }
}
