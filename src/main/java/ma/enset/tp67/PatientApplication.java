package ma.enset.tp67;

import ma.enset.tp67.entities.Patient;
import ma.enset.tp67.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientApplication.class, args);
    }

    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){

        return args -> {
            patientRepository.save(new Patient(null,"wissale",new Date(),false,9));
            patientRepository.save(new Patient(null,"salma",new Date(),true,15));
            patientRepository.save(new Patient(null,"imane",new Date(),false,78));
            patientRepository.save(new Patient(null,"sarah",new Date(),true,95));
            patientRepository.save(new Patient(null,"wissale",new Date(),false,9));
            patientRepository.save(new Patient(null,"salma",new Date(),true,15));
            patientRepository.save(new Patient(null,"imane",new Date(),false,78));
            patientRepository.save(new Patient(null,"sarah",new Date(),true,95));

            patientRepository.findAll().forEach(p->
            {
                System.out.println("nom : " + p.getNom());
            });

        };
    }
}
