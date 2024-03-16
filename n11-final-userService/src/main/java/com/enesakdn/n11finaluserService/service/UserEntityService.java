package com.enesakdn.n11finaluserService.service;

import com.enesakdn.n11finaluserService.dao.UserRepository;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.general.BaseEntityService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserEntityService extends BaseEntityService<User,UserRepository> {
    protected UserEntityService(UserRepository repository) {
        super(repository);
    }
}
