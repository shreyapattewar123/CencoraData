package com.pack.myexample.config;

import com.pack.myexample.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConf {
    @Bean()
    public Student GetStudents(){
        return new Student(11,"Shreya","Java");
    }

}
