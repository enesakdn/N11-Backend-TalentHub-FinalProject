package com.enesakdn.n11finaluserService.controller;

import com.enesakdn.n11finaluserService.controller.UserController;
import com.enesakdn.n11finaluserService.controller.contract.UserControllerContract;
import com.enesakdn.n11finaluserService.dto.UserDTO;
import com.enesakdn.n11finaluserService.request.UserSaveRequest;
import com.enesakdn.n11finaluserService.request.UserUpdateRequest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class UserControllerTest {

    @Mock
    private UserControllerContract userControllerContract;

    @InjectMocks
    private UserController userController;

    @Test
    void getAllUsersTest() {
        List<UserDTO> userDTOList = new ArrayList<>();
        when(userControllerContract.getAllUsers()).thenReturn(userDTOList);
        ResponseEntity<?> responseEntity = userController.getAllUsers();
        assertEquals(userDTOList, responseEntity.getBody());
    }

    @Test
    void getUserByIdTest() {
        Long id = 1L;
        UserDTO userDTO = new UserDTO();
        when(userControllerContract.getUserById(id)).thenReturn(userDTO);
        ResponseEntity<?> responseEntity = userController.getUserById(id);
        assertEquals(userDTO, responseEntity.getBody());
    }

    @Test
    void saveUserTest() {
        UserSaveRequest request = new UserSaveRequest();
        UserDTO userDTO = new UserDTO();
        when(userControllerContract.saveUser(request)).thenReturn(userDTO);
        ResponseEntity<?> responseEntity = userController.saveUser(request);
        assertEquals(userDTO, responseEntity.getBody());
    }

    @Test
    void deleteUserTest() {
        Long id = 1L;
        ResponseEntity<?> responseEntity = userController.deleteUser(id);
        assertEquals(ResponseEntity.ok().build(), responseEntity);
        verify(userControllerContract, times(1)).deleteUser(id);
    }

    @Test
    void updateUserTest() {
        Long id = 1L;
        UserUpdateRequest request = new UserUpdateRequest();
        UserDTO userDTO = new UserDTO();
        when(userControllerContract.updateUser(request)).thenReturn(userDTO);
        ResponseEntity<?> responseEntity = userController.updateUser(id, request);
        assertEquals(userDTO, responseEntity.getBody());
    }
}
