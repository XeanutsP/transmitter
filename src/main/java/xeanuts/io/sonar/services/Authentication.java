package xeanuts.io.sonar.services;

import xeanuts.io.sonar.dto.AuthData;

public interface Authentication {
    String getAuthenticate(AuthData data);
}
