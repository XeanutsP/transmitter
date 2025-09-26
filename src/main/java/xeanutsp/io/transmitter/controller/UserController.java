package xeanutsp.io.transmitter.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class UserController {
    @GetMapping("/user/{id}")
    public User getUsers(@PathParam("id") Long id, @RequestParam User param) {
        if (id != null) {
            // fetch user from database
        } else {
            // return all users
        }
        return param;
    }

    @PostMapping("/user")
    public String addUser(@RequestBody String entity) {

        return entity;
    }

    @PutMapping("user/{id}")
    public User putMethodName(@PathVariable Long id, @RequestBody User entity) {
        
        return entity;
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable Long id) {
        
    }

}
