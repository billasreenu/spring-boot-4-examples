package in.bsrtech.demo.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerExample implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		IO.println("Spring Boot 4 application runner example");
	}

}
