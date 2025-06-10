package br.com.coralcobragames.domain.port.api.user;

import br.com.coralcobragames.domain.model.User;

import java.util.Optional;

public interface FindUser {

    Optional<User> findById(Long id);
}
