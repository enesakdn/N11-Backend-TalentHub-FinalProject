package com.enesakdn.n11finaluserService.dto;

import java.time.LocalDate;

public record UserDTO(Long id,
                      String name,
                      String surname,
                      LocalDate birthDate,
                      String username,
                      String phoneNumber,
                      String email,
                      Double latitude,
                      Double longitude) {
}
