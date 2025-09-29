package xeanutsp.io.transmitter.controller;

import xeanutsp.io.transmitter.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.websocket.server.PathParam;
import xeanutsp.io.transmitter.service.UsersService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class UserController {
    
    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/user/{id}")
    public User getUsers(@PathParam("id") Long id, @RequestParam User param) {
        if (id != null) {
            return usersService.getUser(id);
        } else {
            return usersService.getAllUsers();
        }
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        return usersService.addUser(user);
    }

    @PutMapping("user/{id}")
    public User putMethodName(@PathVariable Long id, @RequestBody User entity) {
        
        return usersService.updateUser(id, entity);
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable Long id) {
        usersService.deleteUser(id);
    }

}
