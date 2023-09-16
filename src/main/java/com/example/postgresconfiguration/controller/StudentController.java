package com.example.postgresconfiguration.controller;

import com.example.postgresconfiguration.dto.Login;
import com.example.postgresconfiguration.dto.StudentsRegister;
import com.example.postgresconfiguration.entity.Students;
import com.example.postgresconfiguration.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stud")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("signUp")
    public ResponseEntity<StudentsRegister> signUp(@RequestBody StudentsRegister studentsRegister){
//              Students registeredUsers = studentService.signUp(studentsRegister);
//              return new ResponseEntity<>(studentsRegister, HttpStatus.CREATED);
        studentService.signUp(studentsRegister);
//        return ResponseEntity.ok("SignUp successfully ").getBody();
        return  new ResponseEntity<>(studentsRegister,HttpStatus.CREATED);
    }

    @PostMapping("login")
    public String login(@RequestBody Login login){
        studentService.logIn(login);
        return ResponseEntity.ok("Welcome to Decagon University").getBody();
    }
}
//return ResponseEntity.ok().body(response);