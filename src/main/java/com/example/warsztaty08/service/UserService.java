package com.example.warsztaty08.service;

import com.example.warsztaty08.Dto.UserDto;
import com.example.warsztaty08.Entities.User;

public class UserService {

    public User getCurrentUser() {
    }

    public UserDto save(UserDto dto) {
        User user = new User(dto.getLogin());
    }
}
