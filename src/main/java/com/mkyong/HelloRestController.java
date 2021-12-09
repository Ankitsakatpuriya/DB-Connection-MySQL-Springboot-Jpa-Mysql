package com.mkyong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	private static final Logger log = LoggerFactory.getLogger(HelloRestController.class);

	@GetMapping("/")
	public String hello() {
		log.info("Database Connection Successfully");
		return "Hello & Welcome to Ankit Database Connection Successful !!!";

	}

}
