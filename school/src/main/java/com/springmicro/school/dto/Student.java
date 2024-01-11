package com.springmicro.school.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String firstname;
    private String lastname;
    private String email;
}
