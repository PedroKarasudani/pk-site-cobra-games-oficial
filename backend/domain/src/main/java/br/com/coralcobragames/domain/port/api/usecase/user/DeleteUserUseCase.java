package br.com.coralcobragames.domain.port.api.usecase.user;

import br.com.coralcobragames.domain.exceptions.UserNotFoundException;
import br.com.coralcobragames.domain.port.api.user.DeleteUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteUserUseCase implements DeleteUser {

    private UserPort port;

    @Override
    public void deleteById(Long id) {
        this.port.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        this.port.deleteById(id);
    }
}
