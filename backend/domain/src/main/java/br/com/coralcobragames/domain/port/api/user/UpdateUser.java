package br.com.coralcobragames.domain.port.api.user;

import br.com.coralcobragames.domain.model.User;

public interface UpdateUser {

    User update(User user, Long id);
}
