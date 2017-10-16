package com.absurd.fireboom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * @author Absurd.
 */
@SpringBootApplication
public class SpringBootInitApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        setRegisterErrorPageFilter(false);
        return builder.sources(SpringBootInitApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootInitApplication.class,args);
    }
}
