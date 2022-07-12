package net.javaguides.springboot;

import net.javaguides.springboot.model.Package;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.PackageRepository;
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

	@Autowired
	private PackageRepository packageRepository;

	@Override
	public void run(String... args) throws Exception {

		Package packages = new Package();
		packages.setSenderName("Mohammed");
		packages.setSenderAddress("Princess Gate");
		packages.setSenderContact("07667733");
		packages.setReceiverName("Ismail");
		packages.setReceiverAddress("Princess street");
		packages.setReceiverContact("07667733");
		packages.setDriverName("yoosuf");
		packages.setDriverContact("07667733");
		packages.setFromOperationalCentre("colombo 12");
		packages.setToOperationalCentre("colombo 4");
		packages.setHeight("12");
		packages.setWeight("12");
		packages.setLength("12");
		packages.setWidth("12");
		packages.setPrice(1200);
		packages.setType(2);
		packages.setStatus(4);
		packageRepository.save(packages);

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
