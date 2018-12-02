package com.csrproject;

import com.csrproject.model.Challenges;
import com.csrproject.repository.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsrprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CsrprojectApplication.class, args);
    }

    @Autowired
    ChallengeRepository challengeRepository;

    @Override
    public void run(String... strings) throws Exception {
        for(int i=0; i<9; i++){
            challengeRepository.save( new Challenges("Reusable Straws","Nice Trick to Reuse the Straws"));
        }
    }
}
