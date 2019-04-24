package com.liuyanqi.scaffold;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.liuyanqi")
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        //app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
