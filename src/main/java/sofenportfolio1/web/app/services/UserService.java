package sofenportfolio1.web.app.services;
import java.util.List;
import sofenportfolio1.web.app.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List <UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
