package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService extends UserDetailsService {
    User findUserById(Long id);
    User findUserByUsername(String username);
    List<User> findAllUsers();
    void saveUser(User user);
    void deleteUserById(Long id);
}
