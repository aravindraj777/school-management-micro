package com.springmicro.school.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FullSchoolResponse {

    private String name;
    private String email;
    private List<Student> students;
}
