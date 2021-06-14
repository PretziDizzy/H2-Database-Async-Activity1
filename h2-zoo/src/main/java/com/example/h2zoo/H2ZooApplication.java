package com.example.h2zoo;

import com.example.h2zoo.model.Reptile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.h2zoo.repository.ReptileRepository;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
		SpringApplication.run(H2ZooApplication.class, args);

		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);

		Reptile kingCobra = new Reptile("Slither", "Snake", "Blake Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));

	}

}
