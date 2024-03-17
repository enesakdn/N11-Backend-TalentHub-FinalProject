package com.enesakdn.n11finaluserService.controller.contract.impl;

import com.enesakdn.n11finaluserService.controller.contract.UserControllerContract;
import com.enesakdn.n11finaluserService.dto.UserDTO;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.mapper.UserMapper;
import com.enesakdn.n11finaluserService.request.UserSaveRequest;
import com.enesakdn.n11finaluserService.request.UserUpdateRequest;
import com.enesakdn.n11finaluserService.service.UserEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UserControllerContractImpl implements UserControllerContract {

    private final UserEntityService userEntityService;
    @Override
    public UserDTO saveUser(UserSaveRequest request) {

         User user  = UserMapper.INSTANCE.convertToUser(request);

         user = userEntityService.save(user);

         UserDTO userDTO = UserMapper.INSTANCE.convertToUserDTO(user);

         return userDTO;
    }

    @Override
    public List<UserDTO> getAllUsers() {

        List<User> userList = userEntityService.findAll();

        List<UserDTO> userDTOList = UserMapper.INSTANCE.convertToUserDTOs(userList);

        return userDTOList;
    }

    @Override
    public UserDTO updateUser(UserUpdateRequest request) {

        User user = userEntityService.findByIdWithControl(request.id());

        UserMapper.INSTANCE.updateUserFields(user, request);

        userEntityService.save(user);

        UserDTO customerDTO = UserMapper.INSTANCE.convertToUserDTO(user);

        return customerDTO;
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userEntityService.findByIdWithControl(id);
        return UserMapper.INSTANCE.convertToUserDTO(user);
    }

    @Override
    public void deleteUser(Long id) {
        userEntityService.delete(id);
    }


}
