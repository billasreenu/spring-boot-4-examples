package in.bsrtech.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import in.bsrtech.demo.interceptor.SpringAppExampleInterceptor;

@Configuration
public class SpringAppWebConfig implements WebMvcConfigurer {

	@Autowired
	private SpringAppExampleInterceptor myInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor).addPathPatterns("/greeting");

	}
}