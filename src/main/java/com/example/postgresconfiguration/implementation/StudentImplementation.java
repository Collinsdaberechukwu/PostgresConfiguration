package com.example.postgresconfiguration.implementation;

import com.example.postgresconfiguration.dto.Login;
import com.example.postgresconfiguration.dto.StudentsRegister;
import com.example.postgresconfiguration.entity.Students;
import com.example.postgresconfiguration.repository.StudentRepository;
import com.example.postgresconfiguration.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StudentImplementation implements StudentService {
    private final StudentRepository studentRepository;

    public StudentImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Students signUp(StudentsRegister signup) {
//        if (studentRepository.findByLastName(signup.getLastName()){
//           throw new RuntimeException("User already signed up", Throwable.);
//        }
//        Students newStudent = Students.builder()
//                .firstName(signup.getFirstName())
//                .lastName(signup.getLastName())
//                .email(signup.getEmail())
//                .age(signup.getAge())
//                .status(signup.getStatus())
//                .address(signup.getAddress())
//                .build();
//       Students saved = studentRepository.save(newStudent);
//       return saved;
        Students newStudent = new Students();
        newStudent.setFirstName(signup.getFirstName());
        newStudent.setLastName(signup.getLastName());
        newStudent.setEmail(signup.getEmail());
        newStudent.setAge(signup.getAge());
        newStudent.setStatus(signup.getStatus());
        newStudent.setAddress(signup.getAddress());
      Students saved =  studentRepository.save(newStudent);
      return saved;
    }

    @Override
    public Students logIn(Login login) {
        Students log = new Students();
        log.setEmail(login.getFirstName());
        log.setFirstName(login.getFirstName());
        log.setLastName(login.getLastName());
       return studentRepository.save(log);
    }
}
