package cat.itacademy.userapi.dto;

public class UserDto {
    private String name;
    private String email;

    UserDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
