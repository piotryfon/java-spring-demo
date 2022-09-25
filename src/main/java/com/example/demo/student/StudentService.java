package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> GetStudents(){
        return List.of(
                new Student(
                        1L,
                        "John Doe",
                        "johndoe@yahoo.com",
                        21,
                        LocalDate.of(2000, Month.JUNE, 5)
                )
        );
    }
}
