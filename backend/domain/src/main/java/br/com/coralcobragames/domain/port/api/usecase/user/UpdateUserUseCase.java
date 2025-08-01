package br.com.coralcobragames.domain.port.api.usecase.user;

import br.com.coralcobragames.domain.exceptions.UserAlreadyExistsException;
import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.api.user.UpdateUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;


@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserUseCase implements UpdateUser {

    private UserPort port;

    @Override
    public User update(User user, Long id) {
        Optional<User> foundName = this.port.findById(id);
        Optional<User> name = this.port.findByName(user.getName());
        if (foundName.equals(name)) {
            throw new UserAlreadyExistsException(user.getName());
        }
        return this.port.update(user, id);
    }
}
