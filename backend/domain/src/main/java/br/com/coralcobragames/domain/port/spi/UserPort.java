package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.User;

public interface UserPort {

    User create(User user);

    User findById(Long id);

    User update(User user, Long id);

    void deleteById(Long id);
}
