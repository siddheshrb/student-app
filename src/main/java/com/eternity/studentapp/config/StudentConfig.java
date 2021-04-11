package com.eternity.studentapp.config;

import com.eternity.studentapp.dao.StudentRepository;
import com.eternity.studentapp.model.Student;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        List<Student> studentList = new ArrayList<>();
        return args -> {
            for(int i=1; i<=5; i++) {
                Faker faker = new Faker(new Locale("en-IND"));
                Student student = new Student(
                        faker.name().fullName(),
                        getFakeEmail(faker),
                        29,
                        LocalDate.of(1992, Month.JANUARY, 1));

                studentList.add(student);
            }
            repository.saveAll(studentList);
        };
    }

    private String getFakeEmail(Faker faker) {
        return faker.name().firstName() + "." + faker.name().lastName() + "@" + faker.company().name() + ".com";
    }
}
