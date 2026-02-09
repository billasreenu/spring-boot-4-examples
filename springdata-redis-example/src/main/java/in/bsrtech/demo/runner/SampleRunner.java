package in.bsrtech.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.bsrtech.demo.dto.UserDetailsDTO;
import in.bsrtech.demo.repo.SpringJdbcRepo;

@Component
public class SampleRunner implements CommandLineRunner {
	@Autowired
	SpringJdbcRepo repo;

	@Override
	public void run(String... args) throws Exception {
		Iterable<UserDetailsDTO> itr = repo.findAll();
		itr.forEach(vo -> {
			IO.println(vo);
		});

	}

}
