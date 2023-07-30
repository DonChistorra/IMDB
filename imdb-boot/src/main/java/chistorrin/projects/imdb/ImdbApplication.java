package chistorrin.projects.imdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImdbApplication {

	protected ImdbApplication() { }
	public static void main(final String[] args) {
		SpringApplication.run(ImdbApplication.class, args);
	}

}
