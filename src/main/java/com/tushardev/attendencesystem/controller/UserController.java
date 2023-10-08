package com.tushardev.attendencesystem.controller;

import com.tushardev.attendencesystem.entity.User;
import com.tushardev.attendencesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add-user")
    public ResponseEntity<?> addUser(@RequestBody User user){

       Boolean response= userService.addUser(user);

        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/update-user")
    public ResponseEntity<?> updateUser( @RequestBody User user){

        Boolean response= userService.updateUser(user);

        return ResponseEntity.ok().body(response);
    }


}
