package com.mka.validation.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message = "User Name Should not be null")
    @NotEmpty(message = "User Name Should not be Empty")
    private String name;

    @NotNull(message = "User Address Should not be null")
    private  String address;

    @NotNull(message = "User Mail is not Valid")
    @Email
    private String email;

    @NotNull(message = "User Name Should not be null")
    @Min(value = 18 ,message = "Age is less than 18")
    @Max(value = 55, message = "Age is more than 55")
    private Integer age;

    private  Double salary;
    
}
