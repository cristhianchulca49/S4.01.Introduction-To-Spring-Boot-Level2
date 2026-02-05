package cat.itacademy.userapi.model;

import java.util.UUID;

public record User(UUID id, String name, String email) {
}
