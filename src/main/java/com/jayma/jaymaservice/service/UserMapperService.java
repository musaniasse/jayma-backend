package com.jayma.jaymaservice.service;

import com.jayma.jaymaservice.dto.GetUserDto;
import com.jayma.jaymaservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapperService {

    public GetUserDto toDTO(User user) {
        return new GetUserDto(
                user.getId(),
                user.getUsername(),
                user.getEmail()
        );
    }
}
