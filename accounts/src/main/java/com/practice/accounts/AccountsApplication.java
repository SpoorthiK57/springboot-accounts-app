package com.practice.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.models.annotations.OpenAPI31;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef="auditAwareImpl")
@OpenAPIDefinition(
		info=@Info(
				title ="Accounts microservice REST API  Documentation",
				description=" SpringBoot Accounts microservice REST API  Documentation",
				version="v1",
				contact=@Contact(
						name="Spoorthi",
						email="spoorthi@gmail.com",
						url="https://github.com/Spoorthi57"
				),
				license = @License(
						name="Spoorthi",
						url="https://github.com/Spoorthi57"
				)
		),
		externalDocs = @ExternalDocumentation(
				description=" SpringBoot Accounts microservice REST API  Documentation",
				url="https://github.com/Spoorthi57"

		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
