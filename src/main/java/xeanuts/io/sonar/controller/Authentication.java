package xeanuts.io.sonar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xeanuts.io.sonar.dto.AuthData;


@Controller
public class Authentication {
    
    @GetMapping("/getAuthenticate")
    @ResponseBody
    public String getAuthenticate(@RequestBody AuthData data) {
        return getAuthenticate(data);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam String name) {
        return ("Hi." + name);
    }

    @GetMapping("/check")
    public String checkOnlineStatus(@RequestParam String session) {
        return session;
    }
    
}
