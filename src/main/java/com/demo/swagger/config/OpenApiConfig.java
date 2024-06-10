package com.demo.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: huangzh
 * @Date: 2024/2/20 11:14
 **/
@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI springOpenAPI() {
        // 访问路径：http://localhost:8080/swagger-ui/index.html
        return new OpenAPI()
                .info(new Info()
                        .title("SpringDoc API")
                        .description("SpringDoc Simple Application")
                        .version("0.0.1")
                        .contact(new Contact()
                                .name("zhuangzh")
                                .email("email@xx.com")
                                .url("www.xxx.com")
                        )
                        .license(new License()
                                .url("xxx.lic.com")
                                .name("xx-license")
                        )
                );
    }
}
