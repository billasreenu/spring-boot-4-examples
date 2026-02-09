package in.bsrtech.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.bsrtech.demo.dto.UserDetailsDTO;
import in.bsrtech.demo.repo.UserDetailsJpaRepo;

@SpringBootTest
class SpringBoot4ExamplesApplicationTests {

	@Autowired
	UserDetailsJpaRepo repo;

	@Test
	void contextLoads() {
		List<UserDetailsDTO> userList = repo.findAll();

		for (UserDetailsDTO user : userList)
			IO.println(user);
	}

}
