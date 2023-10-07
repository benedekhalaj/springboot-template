package com.benedekhalaj.springboottemplate.database.entity;

import com.benedekhalaj.springboottemplate.api.model.Gender;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.AccessType;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
@ToString(onlyExplicitlyIncluded = true)
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, updatable = false, length = 64)
    @AccessType(AccessType.Type.PROPERTY)
    @ToString.Include
    private UUID id;

    @Column(name = "first_name", nullable = false, length = 128)
    @EqualsAndHashCode.Include
    @ToString.Include
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 128)
    @EqualsAndHashCode.Include
    @ToString.Include
    private String lastName;

    @Column(name = "date_of_birth", nullable = false, columnDefinition = "date")
    private LocalDate dateOfBirth;

    @Column(name = "email", unique = true, nullable = false, length = 128)
    @EqualsAndHashCode.Include
    @ToString.Include
    private String email;

    @Column(name = "gender", nullable = false, length = 32)
    @EqualsAndHashCode.Include
    @ToString.Include
    private Gender gender;
}
