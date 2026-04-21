package com.astrovoluntario.service;

import com.astrovoluntario.dto.UserRequestDTO;
import com.astrovoluntario.dto.UserResponseDTO;
import com.astrovoluntario.entity.User;
import com.astrovoluntario.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public UserResponseDTO criarUsuario(UserRequestDTO request){
        User user = User.builder()
                .nome(request.getNome())
                .email(request.getEmail())
                .build();

        User usuarioSalvo = userRepository.save(user);

        return new UserResponseDTO(
                usuarioSalvo.getId(),
                usuarioSalvo.getNome(),
                usuarioSalvo.getEmail()
        );
    }

    public List<UserResponseDTO> listarTodos() {
        return userRepository.findAll().stream().map(user -> new UserResponseDTO(
                user.getId(),
                user.getNome(),
                user.getEmail()
        )).toList();
    }
}
