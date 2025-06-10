package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.port.api.user.CreateUser;
import br.com.coralcobragames.domain.port.api.user.DeleteUser;
import br.com.coralcobragames.domain.port.api.user.FindUser;
import br.com.coralcobragames.domain.port.api.user.UpdateUser;
import br.com.coralcobragames.web.converter.UserConverter;
import br.com.coralcobragames.web.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class UserFacade {

    private final UserConverter converter = new UserConverter();

    @Autowired
    private CreateUser createUser;
    @Autowired
    private FindUser findUser;
    @Autowired
    private UpdateUser updateUser;
    @Autowired
    private DeleteUser deleteUser;


    public UserDTO findById(Long id) {
        return this.converter.toDTO(this.findUser.findById(id).get());
    }
}
