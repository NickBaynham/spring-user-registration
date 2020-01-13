package net.nickbaynham.web.applications.movr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Nick Baynham
 *
 */
@SpringBootApplication
@RestController
public class MovrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovrApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String greeting() {
		return "Hello World!";
	}

}
