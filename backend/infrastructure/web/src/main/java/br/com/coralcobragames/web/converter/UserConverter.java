package br.com.coralcobragames.web.converter;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.web.model.UserDTO;

public class UserConverter {

    public User toDomain(UserDTO userDTO) {
        return User.builder()
                .id(userDTO.getId())
                .email(userDTO.getEmail())
                .name(userDTO.getName())
                .password(userDTO.getPassword())
                .role(userDTO.getRole())
                .enabled(userDTO.getEnabled())
                .build();
    }

    public UserDTO toDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .email(user.getEmail())
                .name(user.getName())
                .password(user.getPassword())
                .role(user.getRole())
                .enabled(user.getEnabled())
                .build();
    }
}
