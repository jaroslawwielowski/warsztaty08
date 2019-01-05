package com.example.warsztaty08.Controller;

import com.example.warsztaty08.Dto.UserDto;
import com.example.warsztaty08.Repository.UserRepository;
import com.example.warsztaty08.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/user")
public class UserRest {

    private final UserRepository userRepository;
    private final UserService userService;

    public UserRest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public Result post(@RequestMapping UserDto userDto){
        return Result.ok(userService.save(userDto));
    }


}
