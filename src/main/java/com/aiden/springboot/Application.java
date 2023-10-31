package com.aiden.springboot;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{

    public static void main(String[] args) {
        // 应用启动
        SpringApplication.run(Application.class, args);

        // 人为产生一个异常
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            // 使用 Sentry 捕获并记录异常
            Sentry.captureException(e);
        }
    }
}