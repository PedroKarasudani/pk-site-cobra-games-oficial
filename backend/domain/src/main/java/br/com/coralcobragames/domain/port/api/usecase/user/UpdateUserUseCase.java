package br.com.coralcobragames.domain.port.api.usecase.user;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.api.user.UpdateUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserUseCase implements UpdateUser {

    private UserPort port;

    @Override
    public User update(User user, Long id) {
        return this.port.update(user, id);
    }
}
