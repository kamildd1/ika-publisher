/**
 * This package includes main class application
 */
package com.ikea.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * This class contains main method in PublisherApplication
 */
@SpringBootApplication
public class PublisherApplication extends SpringBootServletInitializer {
	/**
	 * This method contain Spring Initializer
	 * @param application Parameter containing builder application
	 * @return Configuration for application
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PublisherApplication.class);
	}

	/**
	 * Main method in PublisherApplication
	 * @param args Arguments for method
	 */
	public static void main(String[] args) {
		SpringApplication.run(PublisherApplication.class, args);
	}

}