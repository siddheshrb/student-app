package com.eternity.studentapp.controller;

import com.eternity.studentapp.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(
                        1L,
                        "Jack",
                        "jack@gmail.com",
                        29,
                        LocalDate.of(1992, Month.JANUARY, 1)
                )
        );
    }


}
