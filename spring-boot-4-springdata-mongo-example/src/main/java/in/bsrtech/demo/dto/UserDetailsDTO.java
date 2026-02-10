package in.bsrtech.demo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("tbl_user_details")
public class UserDetailsDTO {

	@Id
	private Long userId;

	private String userName;

	private String firstName;

	private String lastName;

	@Override
	public String toString() {
		return "UserDetailsDTO [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

}
