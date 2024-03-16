package com.enesakdn.n11finaluserService.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import jakarta.validation.constraints.Email;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User")
    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")
    @Id
    private Long id;

    @NotNull
    @Length(min = 1, max = 100)
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @NotNull
    @Length(min = 1, max = 100)
    @Column(name = "SURNAME", length = 100, nullable = false)
    private String surname;

    @Past
    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @NotBlank
    @Column(name = "USERNAME", length = 100, nullable = false)
    private String username;

    @NotBlank
    @Column(name = "PASSWORD", length = 100, nullable = false)
    private String password;

    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;

    @Email
    @NotBlank
    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

}
