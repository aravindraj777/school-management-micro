package com.springmicro.student.repo;

import com.springmicro.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    List<Student>findAllBySchoolId(Integer schoolId);
}
