package com.target.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


// To get swagger documentation of your rest api's:
// 1. add maven dependencies
// 2. Use @EnableSwagger2WebMvc annotation
// 3. Configure swagger docket as bean

// Doing the above, exposes a new endpoint at the base url (http://localhost:8080) as /v2/api-docs
// After adding swagger-ui dependencies, you will be able to access the path /swagger-ui.html

@EnableSwagger2
@SpringBootApplication
public class ProductServiceApplication {

    // During the spring container creation (bootstrap), spring will automatically
    // call @Bean functions, collect the return value, and store it with either bean-name,
    // or method name
    @Bean(name = "api")
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}
