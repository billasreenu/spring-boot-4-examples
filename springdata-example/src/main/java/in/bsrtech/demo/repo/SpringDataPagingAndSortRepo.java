package in.bsrtech.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.bsrtech.demo.dto.UserDetailsDTO;

@Repository
public interface SpringDataPagingAndSortRepo extends PagingAndSortingRepository<UserDetailsDTO, Long> {

}
