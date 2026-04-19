package com.example.spring_boot_tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student datDT = new Student(
                    "DatDT",
                    "dangtrongdat1998@gmail.com",
                    LocalDate.of(1998, Month.MARCH, 9),
                    28
            );

            Student alex = new Student(
                    "Alex",
                    "alexangtrongdat98@gmail.com",
                    LocalDate.of(2000, Month.MARCH, 9),
                    21
            );

            repository.saveAll(List.of(datDT, alex)
            );
        };
    }
}
