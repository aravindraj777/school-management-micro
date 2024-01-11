package com.springmicro.school.controller;

import com.springmicro.school.dto.FullSchoolResponse;
import com.springmicro.school.entity.School;
import com.springmicro.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        service.saveSchool(school);
    }

    public ResponseEntity<List<School>> findAllSchools(){
        return ResponseEntity.ok(service.findAllSchools());
    }


    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findWithSchools(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(service.findSchoolWithStudents(schoolId));
    }

}
