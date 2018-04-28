package com.gregwoodfill.kotlinspringdemo.controller

import com.gregwoodfill.kotlinspringdemo.config.DemoConfigurationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(val configProperties: DemoConfigurationProperties) {
    @GetMapping("/demo")
    fun get() = mapOf("url" to configProperties.url)
}
