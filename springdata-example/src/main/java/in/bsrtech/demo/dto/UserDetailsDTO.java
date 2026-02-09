package in.bsrtech.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_user_details")
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
