package com.astrovoluntario.controller;

import com.astrovoluntario.dto.UserRequestDTO;
import com.astrovoluntario.dto.UserResponseDTO;
import com.astrovoluntario.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> listarUsuarios() {
        List<UserResponseDTO> usuarios = userService.listarTodos();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<UserResponseDTO> criarUsuario(@Valid @RequestBody UserRequestDTO request){
        UserResponseDTO response = userService.criarUsuario(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
