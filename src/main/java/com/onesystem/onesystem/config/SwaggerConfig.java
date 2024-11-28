package com.onesystem.onesystem.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API One System")
                        .description("Documentación de las APIs REST para la prueba técnica de One System")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Jhonatan Petro Ruiz")
                                .email("jpetroruiz@gmail.com")
                                .url("https://portfolio-sure--portfolio-sure.netlify.app/")));
    }
}
