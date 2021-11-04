package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student stu1 = new Student(
                    "ABC",
                    "abc@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
                    );

            Student stu2 = new Student(
                    "ABCD",
                    "abcd@gmail.com",
                    LocalDate.of(2004, JANUARY, 10)
                    );

            studentRepository.saveAll(List.of(stu1, stu2));
        };
    }
}
