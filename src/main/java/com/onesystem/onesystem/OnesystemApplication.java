package com.onesystem.onesystem;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnesystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnesystemApplication.class, args);
		Logger logger = Logger.getLogger("Sure");
		logger.info("Test");
	}

}
