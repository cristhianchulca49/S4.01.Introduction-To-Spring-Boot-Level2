package cat.itacademy.userapi.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;

    User(String name, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }
}
