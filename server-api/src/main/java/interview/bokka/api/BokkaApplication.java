package interview.bokka.api;

import interview.bokka.common.BasePackageLocation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = BasePackageLocation.class)
public class BokkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(BokkaApplication.class, args);
	}

}