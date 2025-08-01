package br.com.coralcobragames.domain.port.api.usecase.user;

import br.com.coralcobragames.domain.exceptions.UserNotFoundException;
import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.api.user.FindUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindUserUseCase implements FindUser {

    private UserPort port;

    @Override
    public Optional<User> findById(Long id) {
        return Optional.of(this.port.findById(id).orElseThrow(() -> new UserNotFoundException(id)));
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.of(this.port.findByName(name).orElseThrow(() -> new UserNotFoundException(name)));
    }

    @Override
    public List<User> findAll() {
        return this.port.findAll();
    }
}
