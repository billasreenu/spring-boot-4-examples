package in.bsrtech.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bsrtech.demo.dto.UserDetailsDTO;

@Repository
public interface UserDetailsJpaRepo extends JpaRepository<UserDetailsDTO, Long> {

}
