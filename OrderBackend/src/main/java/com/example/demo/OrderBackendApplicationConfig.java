package com.example.demo;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrderBackendApplicationConfig {
	
	@Named
	static class JerseyConfig extends ResourceConfig{
		
		public JerseyConfig() {
			this.packages("com.example.demo");
		}
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
