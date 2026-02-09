package in.bsrtech.demo.repo;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import in.bsrtech.demo.dto.UserDetailsDTO;

public interface SpringDataListPagingAndSortRepo extends ListPagingAndSortingRepository<UserDetailsDTO, Long> {

}
