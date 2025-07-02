package br.com.coralcobragames.domain.port.api.update;

import br.com.coralcobragames.domain.model.Update;

import java.util.Optional;

public interface FindUpdate {

    Optional<Update> findById(Long id);
}
