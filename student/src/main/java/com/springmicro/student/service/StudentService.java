package com.springmicro.student.service;

import com.springmicro.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    void saveStudent(Student student);
    List<Student> findAllStudents();

    List<Student> findAllBySchool(Integer schoolId);
}
