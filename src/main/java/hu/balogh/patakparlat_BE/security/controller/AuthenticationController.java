package hu.balogh.patakparlat_BE.security.controller;

import hu.balogh.patakparlat_BE.security.controller.dto.LoginDto;
import hu.balogh.patakparlat_BE.security.controller.dto.LoginResponseDto;
import hu.balogh.patakparlat_BE.security.controller.dto.RegistrationDto;
import hu.balogh.patakparlat_BE.security.entity.AppUser;
import hu.balogh.patakparlat_BE.security.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = {"https://patak-parlat.com/", "https://patak-parlat-admin.netlify.app/", "http://localhost:3000"},
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
