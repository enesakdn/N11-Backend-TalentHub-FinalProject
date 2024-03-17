package com.enesakdn.n11finaluserService.controller.contract;

import com.enesakdn.n11finaluserService.controller.contract.impl.UserControllerContractImpl;
import com.enesakdn.n11finaluserService.dto.UserDTO;
import com.enesakdn.n11finaluserService.entity.User;
import com.enesakdn.n11finaluserService.request.UserSaveRequest;
import com.enesakdn.n11finaluserService.request.UserUpdateRequest;
import com.enesakdn.n11finaluserService.service.UserEntityService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UserControllerContractImplTest {

    @Mock
    private UserEntityService userEntityService;

    @InjectMocks
    private UserControllerContractImpl userControllerContract;

    @Test
    void saveUserTest() {
        UserSaveRequest request = new UserSaveRequest();
        when(userEntityService.save(any())).thenReturn(new User());
        UserDTO savedUser = userControllerContract.saveUser(request);
        assertEquals(new UserDTO(), savedUser);
    }

    @Test
    void getAllUsersTest() {
        List<User> userList = new ArrayList<>();
        when(userEntityService.findAll()).thenReturn(userList);
        List<UserDTO> allUsers = userControllerContract.getAllUsers();
        assertEquals(userList.size(), allUsers.size());
    }

    @Test
    void updateUserTest() {
        UserUpdateRequest request = new UserUpdateRequest();
        when(userEntityService.findByIdWithControl(anyLong())).thenReturn(new User());
        when(userEntityService.save(any())).thenReturn(new User());
        UserDTO updatedUser = userControllerContract.updateUser(request);
        assertEquals(new UserDTO(), updatedUser);
    }

    @Test
    void getUserByIdTest() {
        Long id = 1L;
        when(userEntityService.findByIdWithControl(anyLong())).thenReturn(new User());
        UserDTO userById = userControllerContract.getUserById(id);
        assertEquals(new UserDTO(), userById);
    }

    @Test
    void deleteUserTest() {
        Long id = 1L;
        doNothing().when(userEntityService).delete(anyLong());
        userControllerContract.deleteUser(id);
        verify(userEntityService, times(1)).delete(id);
    }
}
