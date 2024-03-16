package com.enesakdn.n11finaluserService.entity;
import com.enesakdn.n11finaluserService.general.BaseEntity;
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
@Table(name = "aaa")
public class User extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aaa")
    @SequenceGenerator(name = "aaa", sequenceName = "aaa_ID_SEQ")
    @Id
    private Long id;


    @Column(name = "NAME", length = 100, nullable = false)
    private String name;


    @Column(name = "SURNAME", length = 100, nullable = false)
    private String surname;


    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;


    @Column(name = "USERNAME", length = 100, nullable = false)
    private String username;

    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;


    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

}
