package xyz.sadiulhakim;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class BootAdminTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAdminTestApplication.class, args);
	}

}
