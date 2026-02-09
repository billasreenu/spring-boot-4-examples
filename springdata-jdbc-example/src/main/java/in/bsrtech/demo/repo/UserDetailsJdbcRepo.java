package in.bsrtech.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bsrtech.demo.dto.UserDetailsDTO;

@Repository
public interface UserDetailsJdbcRepo extends CrudRepository<UserDetailsDTO, Long> {

}
