package in.bsrtech.demo.repo;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import in.bsrtech.demo.dto.UserDetailsDTO;

@Repository
public interface SpringDataCrudRepo extends ListCrudRepository<UserDetailsDTO, Long> {

}
