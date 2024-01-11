package com.springmicro.school.service;

import com.springmicro.school.dto.FullSchoolResponse;
import com.springmicro.school.entity.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolService {

    void saveSchool(School school);
    List<School> findAllSchools();

    FullSchoolResponse findSchoolWithStudents(Integer schoolId);
}
