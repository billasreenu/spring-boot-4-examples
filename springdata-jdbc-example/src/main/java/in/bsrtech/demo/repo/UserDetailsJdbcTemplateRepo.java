package in.bsrtech.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.bsrtech.demo.dto.UserDetailsDTO;
import in.bsrtech.demo.mapper.UserDetailsMapper;

@Repository
public class UserDetailsJdbcTemplateRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private final UserDetailsMapper userMapper = new UserDetailsMapper();

	public List<UserDetailsDTO> listUsers() throws DataAccessException {
		String SQL = "select * from tbl_user_details";
		return jdbcTemplate.query(SQL, userMapper);
	}

	private static final String INS_QUERY = "insert into tbl_user_details (user_id, user_name,first_name,last_name) VALUES (?, ?, ?, ?)";

	public void createUser(UserDetailsDTO userDetails) throws DataAccessException {
		jdbcTemplate.update(INS_QUERY, userDetails.getUserId(), userDetails.getUserName(), userDetails.getFirstName(),
				userDetails.getLastName());
	}

	String QRY_SQL = "select * from tbl_user_details where user_id = ?";

	public UserDetailsDTO getUserByUserId(Integer userId) throws DataAccessException {
		return jdbcTemplate.queryForObject(QRY_SQL, userMapper, userId);
	}

	public void updateUser(UserDetailsDTO userDetails) throws DataAccessException {
		String SQL = "update tbl_user_details set first_name = ?, last_name = ? WHERE user_id = ?";
		jdbcTemplate.update(SQL, userDetails.getFirstName(), userDetails.getLastName(), userDetails.getUserId());
	}

	public void deleteUser(Integer id) throws DataAccessException {
		String SQL = "delete from tbl_user_details where user_id = ?";
		jdbcTemplate.update(SQL, id);
	}

}
