package xeanutsp.io.transmitter.service;

import org.springframework.data.jdbc.repository.query.Query;

import xeanutsp.io.transmitter.entity.User;

public interface UsersService {
    @Query("SELECT * FROM users WHERE id = :id")
    public User getUser(Long id);
    @Query("SELECT * FROM users")
    public User getAllUsers();
    @Query("INSERT INTO users (name, email) VALUES (:name, :email)")
    public User addUser(User user);
    @Query("UPDATE users SET name = :name, email = :email WHERE id = :id")
    public User updateUser(Long id, User user);
    @Query("DELETE FROM users WHERE id = :id")
    public void deleteUser(Long id);
}
