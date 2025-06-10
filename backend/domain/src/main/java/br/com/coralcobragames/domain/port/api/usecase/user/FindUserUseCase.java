package br.com.coralcobragames.domain.port.api.usecase.user;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.api.user.FindUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class FindUserUseCase implements FindUser {

    private UserPort port;

    @Override
    public User findById(Long id) {
        return this.port.findById(id);
    }
}
