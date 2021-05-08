package com.app.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

public class AppConfigBean {
	
	@Bean
	public Docket getAppApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.basePackage("com.player"))
//				.build();
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(info());
	}
	
	private ApiInfo info() {
		return new ApiInfo("SportyShoes REST API with MySQL", "Player with MySQL DB for an JPA for performing CRUD & Search Operations", "1.0", "All Rights Reserved to Prathyusha Kochuru", "Prathyusha Kochuru", "SportyShoes License", "sportyshoes.com");
		
	}

}
