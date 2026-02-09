package in.bsrtech.demo.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoomandLineRunnerExample implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		IO.println("Spring Boot 4 command line runner example");

	}

}
