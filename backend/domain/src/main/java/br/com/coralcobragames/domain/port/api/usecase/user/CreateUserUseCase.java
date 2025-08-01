package br.com.coralcobragames.domain.port.api.usecase.user;

import br.com.coralcobragames.domain.exceptions.UserAlreadyExistsException;
import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.api.user.CreateUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class CreateUserUseCase implements CreateUser {

    private UserPort port;

    @Override
    public User create(User user) {
        Optional<User> name = this.port.findByName(user.getName());
        if(name.equals(user.getName())) {
            throw new UserAlreadyExistsException(user.getName());
        }
        return this.port.create(user);
    }
}
