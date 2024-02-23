package com.example.project_02.service;

import com.example.project_02.dto.AdminDTO;
import com.example.project_02.ex.UserNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdminService extends UserDetailsService {
    public AdminDTO search(String email, String password) throws UserNotFoundException;
}
