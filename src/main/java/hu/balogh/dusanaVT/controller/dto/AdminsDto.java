package hu.balogh.dusanaVT.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdminsDto {

    private Integer id;
    private String username;
    private String password;

}
