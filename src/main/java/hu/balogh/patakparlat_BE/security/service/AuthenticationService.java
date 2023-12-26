package hu.balogh.patakparlat_BE.security.service;

import hu.balogh.patakparlat_BE.security.controller.dto.LoginResponseDto;
import hu.balogh.patakparlat_BE.security.entity.AppUser;
import hu.balogh.patakparlat_BE.security.entity.Role;
import hu.balogh.patakparlat_BE.security.repository.RoleRepository;
import hu.balogh.patakparlat_BE.security.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class AuthenticationService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
    @Autowired
    public AuthenticationService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager, TokenService tokenService) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    public AppUser registerUser(String username, String password){
        String encodedPass = passwordEncoder.encode(password);
        Role userRole = roleRepository.findByAuthority("ADMIN").get();

        Set<Role> authorities = new HashSet<>();

        authorities.add(userRole);

        return userRepository.save(new AppUser(0, username, encodedPass, authorities));
    }

    public LoginResponseDto loginUser(String username, String password){

        try{

            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

            String token = tokenService.generateJwt(auth);

            return new LoginResponseDto(userRepository.findByUsername(username).get(), token);

        }catch (AuthenticationException e){
            return new LoginResponseDto(null, "");
        }
    }



}
