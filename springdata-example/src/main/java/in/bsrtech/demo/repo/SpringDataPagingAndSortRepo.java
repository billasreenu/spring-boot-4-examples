package in.bsrtech.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.bsrtech.demo.dto.UserDetailsDTO;

public interface SpringDataPagingAndSortRepo extends PagingAndSortingRepository<UserDetailsDTO, Long> {

}
