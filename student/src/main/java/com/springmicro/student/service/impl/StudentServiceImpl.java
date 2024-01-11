package com.springmicro.student.service.impl;

import com.springmicro.student.entity.Student;
import com.springmicro.student.repo.StudentRepository;
import com.springmicro.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl  implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findAllBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
