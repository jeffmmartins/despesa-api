package com.github.jeffmmartins.despesas_API.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customAPI(){
        return new OpenAPI().info(new Info().title("Gerenciamento de Despesas")
                        .description("Uma API RESTful para cadastrar, consultar, atualizar e deletar despesas.")
                        .contact(new Contact()
                                .name("Jefferson Martins Mendes")
                                .url("https://github.com/jeffmmartins/despesa-api")
                                .email("jeffersonmartinmendes@gmail.com"))
                        .version("1.0.0"));
    }
}
