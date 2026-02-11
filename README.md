
# LEVEL 2 — In-Memory User Management

## 🎯 Objective
Implement a REST API to manage users using an in-memory list as a simulated database.

---

## 📌 Implemented Features

### 1️⃣ User Model

Properties:
- UUID id
- String name
- String email

---

### 2️⃣ Simulated Database

- Static list inside `UserController`
- Initially empty

---

### 3️⃣ GET /users

- Returns all users
- Initially returns []

---

### 4️⃣ POST /users

- Receives JSON with name and email
- Generates UUID
- Stores user in list
- Returns created user

---

### 5️⃣ GET /users/{id}

- Uses @PathVariable
- Returns user if found
- Returns 404 if not found

---

### 6️⃣ GET /users?name=...

- Uses @RequestParam
- Case-insensitive filtering
- If no parameter → return all users

---

### 7️⃣ Controller Tests

Test type:
@WebMvcTest(UserController.class)

Tests include:
- Initial empty list
- User creation
- Get user by id
- 404 when not found
- Name filtering

Best practices:
- Descriptive test names
- Verify status and response body
- Use ObjectMapper

---

## 🛠 Technologies Used

- Java 17 / 21
- Spring Boot
- Spring Web
- Spring Boot Test
- JUnit 5
- MockMvc
- Jackson
- Maven
- Git
- IntelliJ IDEA

---

## 🛠️ Installation

Clone this repository:
```git
git clone https://github.com/cristhianchulca49/S4.01.Introduction-To-Spring-Boot-Level2.git
```
---

## 🤝 Contributions are welcome! 
Please follow these steps to contribute:
  
- Fork the repository Create a new branch: git checkout -b feature/NewFeature 
- Make your changes and commit them: git commit -m 'Add New Feature' 
- Push the changes to your branch: git push origin feature/NewFeature 
- Open a Pull Request
