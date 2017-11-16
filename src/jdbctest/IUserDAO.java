package jdbctest;

import java.util.List;

public interface IUserDAO {

	void addUser(final UserDTO user);

	List<UserDTO> getAllUsers();

	void update(UserDTO user);

	void delete(UserDTO id);

}
