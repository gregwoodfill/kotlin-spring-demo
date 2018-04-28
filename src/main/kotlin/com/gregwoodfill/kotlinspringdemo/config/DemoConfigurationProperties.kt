package com.gregwoodfill.kotlinspringdemo.config

import org.springframework.boot.context.properties.ConfigurationProperties
import java.net.URL

@ConfigurationProperties(prefix = "myapp")
class DemoConfigurationProperties {
    var url: URL? = null
}