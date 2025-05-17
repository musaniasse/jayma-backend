package com.jayma.jaymaservice.dto;

public record GetUserDto(
        Long id,
        String username,
        String email
) {
}
