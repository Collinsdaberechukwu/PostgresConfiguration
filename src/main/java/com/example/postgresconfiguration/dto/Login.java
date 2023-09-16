package com.example.postgresconfiguration.dto;

import com.example.postgresconfiguration.Enum.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Login {
    private String firstName;
    private String lastName;
    private String email;
}
