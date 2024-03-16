package com.enesakdn.n11finaluserService.controller;

import com.enesakdn.n11finaluserService.controller.contrat.UserControllerContract;
import com.enesakdn.n11finaluserService.dto.UserDTO;
import com.enesakdn.n11finaluserService.general.RestResponse;
import com.enesakdn.n11finaluserService.request.UserSaveRequest;
import com.enesakdn.n11finaluserService.request.UserUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserControllerContract userControllerContract;

    @GetMapping
    public ResponseEntity<RestResponse<List<UserDTO>>> getAllUsers() {
        List<UserDTO> allUsers = userControllerContract.getAllUsers();
        return ResponseEntity.ok(RestResponse.of(allUsers));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<UserDTO>> getUserById(@PathVariable Long id) {
        UserDTO userById = userControllerContract.getUserById(id);
        return ResponseEntity.ok(RestResponse.of(userById));
    }

    @PostMapping
    public ResponseEntity<RestResponse<UserDTO>> saveUser(@RequestBody UserSaveRequest request) {
        UserDTO userDTO = userControllerContract.saveUser(request);
        return ResponseEntity.ok(RestResponse.of(userDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Void>> deleteUser(@PathVariable Long id) {
        userControllerContract.deleteUser(id);
        return ResponseEntity.ok(RestResponse.empty());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<UserDTO>> updateUser(@PathVariable Long id, @RequestBody UserUpdateRequest request) {
        UserDTO userDTO = userControllerContract.updateUser(request);
        return ResponseEntity.ok(RestResponse.of(userDTO));
    }
}
