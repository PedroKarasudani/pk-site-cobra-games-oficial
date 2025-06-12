package br.com.coralcobragames.persistence;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.spi.UserPort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryAdapter implements UserPort {
    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public User update(User user, Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
