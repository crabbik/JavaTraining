package jdbctest;

import java.util.List;

public class UserDAODB implements IUserDAO {

	@Override
	public void addUser(UserDTO user) {
		user = new UserDTO();
		user.getAge();
		user.getId();

	}

	@Override
	public List<UserDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserDTO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserDTO user) {
		// TODO Auto-generated method stub

	}

}
