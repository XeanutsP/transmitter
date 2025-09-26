package xeanutsp.io.transmitter;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import xeanutsp.io.transmitter.entity.User;
import xeanutsp.io.transmitter.service.UsersService;

@SpringBootTest
class TransmitterApplicationTests {

	@Mock
	private UsersService usersService;


	@BeforeEach
	void setUp() {
		usersService = Mockito.mock(UsersService.class);
	}

	@Test
	void contextLoads() {
		User user = new User();
		user.setId(1L);
		user.setName("John Doe");
		user.setUsername("johndoe");
		user.setEmail("Test@domain");
		user.setPhone("123-456-7890");
		user.setWebsite("www.test.com");

		List<User> usersList = List.of(user);

		Mockito.when(usersService.addUser(user)).thenReturn(user);
		Mockito.when(usersService.getUser(1L)).thenReturn(user);
		Mockito.doReturn(usersList).when(usersService.getAllUsers());

		user.setName("Will Smith");
		Mockito.when(usersService.updateUser(1L, user)).thenReturn(user);

		usersService.deleteUser(1L);
	}

}
