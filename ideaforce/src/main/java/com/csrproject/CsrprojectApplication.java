package com.csrproject;

import com.csrproject.model.Challenges;
import com.csrproject.repository.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsrprojectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CsrprojectApplication.class, args);
	}

	@Autowired
	ChallengeRepository challengeRepository;

	@Override
	public void run(String... strings) throws Exception {
//		challengeRepository.save( new Challenges("Reusable Straws","Nice Trick to Reuse the Straws"));
//		challengeRepository.save(new Challenges("Change the current bulbs to energy savers","they consume 60% less electricity than a traditional bulb. Open the refrigerator only when necessary."));
//		challengeRepository.save( new Challenges("Plant trees ","this will increase the resilience of the ecosystem and maintain biodiversity. It is said that one hectare of forest, eliminates in one year, the carbon dioxide produced by four families during that same time."));
	}
}
