package hu.balogh.dummyapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DummyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyApiApplication.class, args);
	}

	@Bean
	public OpenAPI openAPI(){
		Info info = new Info()
				.title("Pancser Team Horgásztársaság API.")
				.description("Pancser Team Horgásztársaság API.")
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
