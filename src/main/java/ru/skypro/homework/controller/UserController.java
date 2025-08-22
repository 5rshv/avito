package ru.skypro.homework.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPassword;
import ru.skypro.homework.dto.UpdateUser;
import ru.skypro.homework.dto.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/set_password")
    public ResponseEntity<Void> SetPassword(@RequestBody NewPassword request) {
        return ResponseEntity.ok().build(); // Заглушка
    }

    @GetMapping("/me")
    public ResponseEntity<User> getUserData() {
        return ResponseEntity.ok(new User()); // Пустой объект
    }

    @PatchMapping("/me")
    public ResponseEntity<UpdateUser> updateUserData(@RequestBody UpdateUser updateUser) {
        return ResponseEntity.ok(new UpdateUser()); // Пустой объект
    }

    @PatchMapping(path = "/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> updateUserImage(@RequestPart("image") MultipartFile image) {
        return ResponseEntity.ok().build(); // Заглушка
    }
}

