package cat.itacademy.userapi.service;

import cat.itacademy.userapi.dto.UserDto;
import cat.itacademy.userapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> dataBase = new ArrayList<>();

    public List<User> getUsers() {
        return List.copyOf(dataBase);
    }

    public User createUser(UserDto userDto) {
        User user = new User(userDto.getName(), userDto.getEmail());
        dataBase.add(user);
        return user;
    }
}
