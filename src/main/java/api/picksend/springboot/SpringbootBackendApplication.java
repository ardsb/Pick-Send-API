package api.picksend.springboot;

import api.picksend.springboot.model.*;
import api.picksend.springboot.model.Package;
import api.picksend.springboot.repository.*;
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
	private PackageTracksRepository packageTracksRepository;

	@Autowired
	private OperationCenterRepository operationCenterRepository;

	@Autowired
	private PackageRepository packageRepository;

	@Autowired
	private PackageChargesRepository packageChargesRepository;

	@Override
	public void run(String... args) throws Exception {


		PackageTracks packageTracks = new PackageTracks();
		packageTracks.setPackageId("2");
		packageTracks.setPackageStatus("Picked Up Deliver");
		packageTracks.setDateCreated("2/03/2022");
		packageTracksRepository.save(packageTracks);

		//adding new packages
		Package packages = new Package();
		packages.setSenderName("Mohammed");
		packages.setSenderAddress("Princess Gate");
		packages.setSenderContact("07667733");
		packages.setReceiverName("Ismail");
		packages.setReceiverAddress("Princess street");
		packages.setReceiverContact("07667733");


		packages.setWeight("12");
		packages.setSize("4*4");
		packages.setPrice("1200");
		packages.setType("Food");
		packages.setPackageStatus("Pending to send");
		packages.setDateCreated("2/04/2021");
		packages.setSenderAvailability("");
		packageRepository.save(packages);

		Package packages2 = new Package();
		packages2.setSenderName("iqbal");
		packages2.setSenderAddress(" maligawatte Gate");
		packages2.setSenderContact("076611113");
		packages2.setReceiverName("arkam");
		packages2.setReceiverAddress("vavuvinya street");
		packages2.setReceiverContact("07667733");


		packages2.setWeight("12");
		packages2.setSize("4*4");
		packages2.setPrice("1200");
		packages2.setType("Food");
		packages2.setPackageStatus("Pending to send");
		packages2.setDateCreated("2/04/2021");
		packages2.setSenderAvailability("");
		packageRepository.save(packages2);




        //adding new users
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


		//adding new operation centers
		OperationCenter operationCenter = new OperationCenter();
		operationCenter.setCityName("Colombo 12");
		operationCenter.setAddress("65 Princess Gate");
		operationCenter.setTelNumber("0119288462");

		operationCenterRepository.save(operationCenter);

		OperationCenter operationCenter1 = new OperationCenter();
		operationCenter1.setCityName("Dehiwala");
		operationCenter1.setAddress("167 Sri Saranankara Rd");
		operationCenter1.setTelNumber("0117384927");
		operationCenterRepository.save(operationCenter1);


		//Adding package amounts
		PackageCharges packageCharges = new PackageCharges();
		packageCharges.setWeightAmount1kg(850);
		packageCharges.setWeightAmount2kg(1150);
		packageCharges.setWeightAmount3Kg(1450);
		packageCharges.setWeightAmount4Kg(1850);

		packageCharges.setSizeAmount2By2(550);
		packageCharges.setSizeAmount4By4(950);
		packageCharges.setSizeAmount6By6(1350);
		packageCharges.setSizeAmount8By8(1650);

		packageChargesRepository.save(packageCharges);


	}
}
