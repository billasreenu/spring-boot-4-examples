package in.bsrtech.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.bsrtech.demo.dto.UserDetailsDTO;
import in.bsrtech.demo.repo.SpringDataListCrudRepo;

@SpringBootTest
class SpringBoot4ExamplesApplicationTests {
	@Autowired
	SpringDataListCrudRepo repo;

	@Test
	void contextLoads() {
		List<UserDetailsDTO> list = repo.findAll();
		for (UserDetailsDTO dto : list)
			IO.println(dto);

	}

}
