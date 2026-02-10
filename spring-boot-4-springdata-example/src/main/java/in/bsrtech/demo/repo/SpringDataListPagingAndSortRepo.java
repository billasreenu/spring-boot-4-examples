package in.bsrtech.demo.repo;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.bsrtech.demo.dto.UserDetailsDTO;

@Repository
public interface SpringDataListPagingAndSortRepo extends ListPagingAndSortingRepository<UserDetailsDTO, Long> {

}
