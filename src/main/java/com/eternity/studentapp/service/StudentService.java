package com.eternity.studentapp.service;

import com.eternity.studentapp.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

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
