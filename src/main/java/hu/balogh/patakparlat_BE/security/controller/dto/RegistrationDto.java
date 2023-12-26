package hu.balogh.patakparlat_BE.security.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private String username;
    private String password;

}
