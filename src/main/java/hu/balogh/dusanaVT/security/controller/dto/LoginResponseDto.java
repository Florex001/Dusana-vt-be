package hu.balogh.dusanaVT.security.controller.dto;

import hu.balogh.dusanaVT.security.entity.AppUser;
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
