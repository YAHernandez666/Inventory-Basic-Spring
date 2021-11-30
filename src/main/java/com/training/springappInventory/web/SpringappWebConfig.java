package com.training.springappInventory.web;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.context.support.ResourceBundleMessageSource;


@Configuration
@ComponentScan
@EnableWebMvc
public class SpringappWebConfig {
	 @Bean
	    public ViewResolver internalResourceViewResolver() {
	        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
	        internalResourceViewResolver.setSuffix(".jsp");
	        return internalResourceViewResolver;
	    }
	 
	 @Bean
	    public ResourceBundleMessageSource messageSource() {
	        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	        messageSource.setBasename("Messages");
	        return messageSource;
	    }

}
