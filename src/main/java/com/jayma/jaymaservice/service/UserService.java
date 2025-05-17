
package com.jayma.jaymaservice.service;

import com.jayma.jaymaservice.dto.GetUserDto;
import com.jayma.jaymaservice.model.User;
import com.jayma.jaymaservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapperService userMapperService;
    public UserService(UserRepository userRepository,
                       UserMapperService userMapperService,
                       EmailService emailService) {
        this.userRepository = userRepository;
        this.userMapperService = userMapperService;
    }

    public List<GetUserDto> allUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);

        return users.stream()
                .map(userMapperService::toDTO)
                .toList();
    }
}
