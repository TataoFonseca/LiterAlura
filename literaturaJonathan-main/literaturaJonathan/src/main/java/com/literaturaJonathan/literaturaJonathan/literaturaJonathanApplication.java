package com.literaturaJonathan.literaturaJonathan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.literaturaJonathan.literaturaJonathan.principal.Principal;
import com.literaturaJonathan.literaturaJonathan.repository.AutorRepository;
import com.literaturaJonathan.literaturaJonathan.repository.LibroRepository;

@SpringBootApplication
public class literaturaJonathanApplication implements CommandLineRunner {

	@Autowired
	private AutorRepository autorRepository;
	@Autowired
	private LibroRepository libroRepository;

	public static void main(String[] args) {
		SpringApplication.run(literaturaJonathanApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepository, libroRepository);
		principal.muestraElMenu();
	}
}