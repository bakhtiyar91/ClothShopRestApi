package com.epam.clothshopapp.mapper.dto;

import com.epam.clothshopapp.security.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserPostDto {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Role role;
    private List<OrderDto> orders;

}
