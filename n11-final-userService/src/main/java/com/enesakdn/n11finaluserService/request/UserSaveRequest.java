package com.enesakdn.n11finaluserService.request;

import java.time.LocalDate;

public record UserSaveRequest(String name,
                             String surname,
                             LocalDate birthDate,
                             String username,
                             String phoneNumber,
                             String email,
                             Double latitude,
                             Double longitude) {
}
