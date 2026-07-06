package com.aiwrapper;

import com.aiwrapper.config.AiConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AiConfig.class)
public class WrapperApplication {
    public static void main(String[] args) {
        SpringApplication.run(WrapperApplication.class, args);
    }
}
