package com.example.postgresconfiguration.dto;

import com.example.postgresconfiguration.Enum.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentsRegister {
    private String firstName;
    private String lastName;
    private Integer age;
    private Role status;
    private String address;
    private String email;
}
