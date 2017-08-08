package com.example.demo;

import javax.inject.Named;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductBackendApplicationConfig {
	
	@Named
	static class JerseyConfig extends ResourceConfig{
		
		public JerseyConfig() {
			this.packages("com.example.demo.rest");
		}
	}

}
