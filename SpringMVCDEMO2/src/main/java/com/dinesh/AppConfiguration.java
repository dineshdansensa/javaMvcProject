package com.dinesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.dinesh")
public class AppConfiguration  {
	@Bean
	public InternalResourceViewResolver resolveView() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/jsp1/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
