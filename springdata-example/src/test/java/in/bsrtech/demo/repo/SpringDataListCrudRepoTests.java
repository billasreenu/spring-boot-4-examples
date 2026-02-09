package in.bsrtech.demo.repo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.bsrtech.demo.dto.UserDetailsDTO;

@SpringBootTest
public class SpringDataListCrudRepoTests {

	@Autowired
	SpringDataListCrudRepo repo;

	@Test
	void testFindAllUsers() {
		List<UserDetailsDTO> list = repo.findAll();
		for (UserDetailsDTO dto : list)
			IO.println(dto);

	}

	@Test
	void testFindUserById() {
		Optional<UserDetailsDTO> optDto = repo.findById(1l);
		UserDetailsDTO dto = optDto.get();

		IO.println("Username = " + dto.getUserName());

	}

}
