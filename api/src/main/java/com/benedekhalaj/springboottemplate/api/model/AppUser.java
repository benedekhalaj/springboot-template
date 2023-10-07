package com.benedekhalaj.springboottemplate.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class AppUser {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String email;
    private Gender gender;
}
