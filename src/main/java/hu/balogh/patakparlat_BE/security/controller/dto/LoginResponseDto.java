package hu.balogh.patakparlat_BE.security.controller.dto;

import hu.balogh.patakparlat_BE.security.entity.AppUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDto {

    private AppUser user;
    private String jwt;

}
