package net.ratelimit.ratelimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"net","net.ratelimit", "net.ratelimit.ratelimit"})
public class RatelimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatelimitApplication.class, args);
	}

}
