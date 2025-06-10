package br.com.coralcobragames.domain.port.api.usecase.user;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.api.user.CreateUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateUserUseCase implements CreateUser {

    private UserPort port;

    @Override
    public User create(User user) {
        return this.port.create(user);
    }
}
