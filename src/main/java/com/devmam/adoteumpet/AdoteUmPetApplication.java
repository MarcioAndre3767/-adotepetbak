package com.devmam.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devmam.adoteumpet.core.models.Pet;
import com.devmam.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {
	
	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Doguinho");
		pet.setHistoria("Esse cahorrinho é muito fofinho pois ele...!!!");
		pet.setFoto("https://th.bing.com/th/id/OIP.v4wWNNjiUHJS_s-FFSB9KQHaD4?w=341&h=180&c=7&r=0&o=5&pid=1.7");
		petRepository.save(pet);
		
		
		
	}

}
