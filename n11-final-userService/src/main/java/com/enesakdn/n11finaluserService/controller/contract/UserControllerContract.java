package com.enesakdn.n11finaluserService.controller.contract;

import com.enesakdn.n11finaluserService.dto.UserDTO;
import com.enesakdn.n11finaluserService.request.UserSaveRequest;
import com.enesakdn.n11finaluserService.request.UserUpdateRequest;

import java.util.List;

public interface UserControllerContract {
    UserDTO saveUser(UserSaveRequest request);

    List<UserDTO> getAllUsers();

    UserDTO updateUser(UserUpdateRequest request);

    UserDTO getUserById(Long id);

    void deleteUser(Long id);
}
