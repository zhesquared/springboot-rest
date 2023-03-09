package ru.netology.springbootrest.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    @NotBlank(message = "Required field!")
    private String user;

    @NotBlank(message = "Required field!")
    private String password;
}
