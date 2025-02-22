package com.example.payment.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Payment API")
                        .version("1.0")
                        .description("API para gerenciamento de pagamentos")
                        .termsOfService("http://swagger.io/terms/")
                        .contact(new Contact()
                                .name("Suporte API")
                                .url("http://example.com/contact")
                                .email("suporte@example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")));
    }
}
