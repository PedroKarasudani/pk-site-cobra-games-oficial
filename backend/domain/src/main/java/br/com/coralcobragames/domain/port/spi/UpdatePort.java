package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.Update;
import br.com.coralcobragames.domain.model.User;

import java.util.Optional;

public interface UpdatePort {

    Update create(Update update);
    void deleteById(Long id);
    Optional<Update> findById(Long id);
    Update update(Update update, Long id);
}
