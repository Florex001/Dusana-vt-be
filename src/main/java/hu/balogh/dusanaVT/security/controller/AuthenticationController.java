package hu.balogh.dusanaVT.security.controller;

import hu.balogh.dusanaVT.security.controller.dto.LoginDto;
import hu.balogh.dusanaVT.security.controller.dto.LoginResponseDto;
import hu.balogh.dusanaVT.security.controller.dto.RegistrationDto;
import hu.balogh.dusanaVT.security.entity.AppUser;
import hu.balogh.dusanaVT.security.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {"https://kossuth-vt-xgjc.vercel.app", "https://kossuth-vt-8zfc.vercel.app", "http://localhost:3000"},
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE},
        allowedHeaders = "*", allowCredentials = "true")
public class AuthenticationController {

    private final AuthenticationService authenticationService;
    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/register")
    public AppUser registerUser(@RequestBody RegistrationDto registrationDto){
        return authenticationService.registerUser(registrationDto.getUsername(), registrationDto.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDto loginUser(@RequestBody LoginDto loginDto){
        return authenticationService.loginUser(loginDto.getUsername(), loginDto.getPassword());
    }


}
