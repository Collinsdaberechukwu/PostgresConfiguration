package com.example.postgresconfiguration.service;

import com.example.postgresconfiguration.dto.Login;
import com.example.postgresconfiguration.dto.StudentsRegister;
import com.example.postgresconfiguration.entity.Students;

public interface StudentService {
    Students signUp (StudentsRegister signup);
    Students logIn(Login login);
}
