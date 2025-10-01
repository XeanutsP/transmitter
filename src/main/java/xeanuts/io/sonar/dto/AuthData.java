package xeanuts.io.sonar.dto;

import lombok.Data;

@Data
public class AuthData {
    private String username;
    private String password;

    public AuthData(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
