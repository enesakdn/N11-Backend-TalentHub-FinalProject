package com.enesakdn.n11finaluserService.service;

import com.enesakdn.n11finaluserService.general.BaseEntityService;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserEntityService extends BaseEntityService {
    protected UserEntityService(JpaRepository repository) {
        super(repository);
    }
}
