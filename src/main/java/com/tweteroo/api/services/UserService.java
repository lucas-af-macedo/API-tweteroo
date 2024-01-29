package com.tweteroo.api.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.api.models.UserModel;
import com.tweteroo.api.repository.UserRepository;

@Service
public class UserService {
    final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserModel> usernameInUse(UserModel user){
        return userRepository.findByUsername(user.getUsername());
    }

    public UserModel createUser(UserModel user){
        return userRepository.save(user);
    }
}
