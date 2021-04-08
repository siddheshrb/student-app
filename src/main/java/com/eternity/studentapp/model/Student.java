package com.eternity.studentapp.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private LocalDate dob;

    public Student() {
    }

    public Student(Long id,
                   String name,
                   String email,
                   Integer age,
                   LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    public Student(String name,
                   String email,
                   Integer age,
                   LocalDate dob) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
