package xeanuts.io.sonar.classes;

import xeanuts.io.sonar.dto.AuthData;

public class AuthenticationImpl {

    public String getAuthenticate(AuthData data) {
        return ("username : " + data.getUsername() + "\npassword : " + data.getPassword());
    }

    public boolean checkSession(String session){
        return  false;
    }

}
