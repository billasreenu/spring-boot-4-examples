package in.bsrtech.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.bsrtech.demo.dto.UserDetailsDTO;

public class UserDetailsMapper implements RowMapper<UserDetailsDTO> {

	@Override
	public UserDetailsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserDetailsDTO dto = new UserDetailsDTO();
		dto.setUserId(rs.getLong("user_id"));
		dto.setUserName(rs.getString("user_name"));
		dto.setFirstName(rs.getString("first_name"));
		dto.setLastName(rs.getString("last_name"));

		return dto;
	}

}
