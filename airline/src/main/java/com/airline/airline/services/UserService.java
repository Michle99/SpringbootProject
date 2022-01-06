package com.airline.airline.services;

import java.util.List;

import com.airline.airline.models.User;
import com.airline.airline.repository.UserRepository;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public void  saveUser(User user);
    public List<User> findAllUser();
}
