package net.javaguides.springboot;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setFirstName("Mohammed");
		user.setLastName("Arkam");
		user.setEmailId("Arkam@gmail.com");
		user.setPassword("test123");
		user.setUserRole("SENDER");
		userRepository.save(user);

		User user1 = new User();
		user1.setFirstName("Mohammed");
		user1.setLastName("Ismail");
		user1.setEmailId("Ismail@gmail.com");
		user1.setPassword("test123");
		user1.setUserRole("RECEIVER");
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Mohammed");
		user2.setLastName("Irfan");
		user2.setEmailId("Irfan@gmail.com");
		user2.setPassword("test123");
		user2.setUserRole("RIDER");
		userRepository.save(user2);

	}
}
