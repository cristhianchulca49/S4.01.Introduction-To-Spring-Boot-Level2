package cat.itacademy.userapi.controller;

import cat.itacademy.userapi.model.User;
import cat.itacademy.userapi.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUserList() {
        return ResponseEntity.ok(service.getUsers());
    }
}
