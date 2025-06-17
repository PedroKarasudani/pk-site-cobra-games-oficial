package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.api.user.CreateUser;
import br.com.coralcobragames.domain.port.api.user.DeleteUser;
import br.com.coralcobragames.domain.port.api.user.FindUser;
import br.com.coralcobragames.domain.port.api.user.UpdateUser;
import br.com.coralcobragames.web.converter.UserConverter;
import br.com.coralcobragames.web.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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

    public UserDTO create(UserDTO userDTO) {
        return this.converter.toDTO(this.createUser.create(this.converter.toDomain(userDTO)));
    }

    public UserDTO update(UserDTO userDTO, Long id) {
        return this.converter.toDTO(this.updateUser.update(this.converter.toDomain(userDTO), id));
    }

    public void delete(Long id) {
        this.deleteUser.deleteById(id);
    }
}
