package com.springboot.jpademo.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public static final Contact DEFAULT_CONTACT = new Contact(
      "Sagar Behera", "www.sagarbehera.rocks", "SagarKumar.Behera@gmail.com");
  
//  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
//      "Awesome API Title", "Awesome API Description", "1.0",
//      "urn:tos", DEFAULT_CONTACT, 
//      "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", Arrays.asList());
  
  private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Sagar Test API")
				.description("API reference for developers")
				.termsOfServiceUrl("http://www.sagarbehera.rocks")
				.contact("SagarKumar.Behera@gmail.com").license("Sagar Licence Free")
				.licenseUrl("SagarKumar.Behera@gmail.com").version("1.0").build();
	}

  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
      new HashSet<String>(Arrays.asList("application/json",
          "application/xml"));

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .produces(DEFAULT_PRODUCES_AND_CONSUMES)
        .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
  }
}
