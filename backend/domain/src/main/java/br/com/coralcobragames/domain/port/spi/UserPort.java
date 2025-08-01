package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserPort {

    User create(User user);

    Optional<User> findById(Long id);

    User update(User user, Long id);

    void deleteById(Long id);

    Optional<User> findByName(String name);

    List<User> findAll();
}
