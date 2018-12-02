package com.csrproject;

<<<<<<< HEAD
import com.csrproject.model.Challenges;
import com.csrproject.repository.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
=======
>>>>>>> 99674b4777a58e8f898f564638aa99ec4f8a4780
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
<<<<<<< HEAD
public class CsrprojectApplication implements CommandLineRunner{
=======
public class CsrprojectApplication {
>>>>>>> 99674b4777a58e8f898f564638aa99ec4f8a4780

	public static void main(String[] args) {
		SpringApplication.run(CsrprojectApplication.class, args);
	}
<<<<<<< HEAD

	@Autowired
	ChallengeRepository challengeRepository;

	@Override
	public void run(String... strings) throws Exception {
		for(int i=0; i<9; i++){
			challengeRepository.save( new Challenges("Reusable Straws","Nice Trick to Reuse the Straws"));
		}
	}
=======
>>>>>>> 99674b4777a58e8f898f564638aa99ec4f8a4780
}
