package br.com.coralcobragames.web.converter;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.web.model.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<UserDTO> toDTO(List<User> userList) {
        return userList.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
