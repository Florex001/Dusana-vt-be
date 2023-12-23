package hu.balogh.dusanaVT.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI(){
        Info info = new Info()
                .title("Dusána Vadásztársaság API")
                .description("Dusána Vadásztársaság API.")
                .license(new License()
                        .name("Apache 2.0")
                        .url("https://www.apache.org/licenses/LICENSE-2.0"))
                .contact(new Contact()
                        .name("Balogh Dávid")
                        .url("https://baloghjavadev.com/")
                        .email("balogh.david.web@gmail.com")
                );

        return new OpenAPI().info(info);
    }

}
