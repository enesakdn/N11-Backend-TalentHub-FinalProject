package com.enesakdn.n11finaluserService.request;

import java.time.LocalDate;

public record UserUpdateRequest(Long id,
                                String name,
                                String surname,
                                LocalDate birthDate,
                                String phoneNumber,
                                String email,
                                Double latitude,
                                Double longitude) {
}
