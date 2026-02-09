package in.bsrtech.demo.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerExample implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		IO.println("Spring Boot 4 application runner example");

		IO.println("***** Print non option args");
		List<String> nonOptionList = args.getNonOptionArgs();
		for (String value : nonOptionList) {
			System.out.println("-->" + value);
		}

		IO.println("***** Print option args");
		Set<String> optionList = args.getOptionNames();
		for (String value : optionList) {
			System.out.println("-->" + value);
		}

		IO.println("***** Print un processed args");
		String unProcessedArgs[] = args.getSourceArgs();
		for (String value : unProcessedArgs) {
			System.out.println("-->" + value);
		}

		IO.println("--------------------------------------");
	}

}
