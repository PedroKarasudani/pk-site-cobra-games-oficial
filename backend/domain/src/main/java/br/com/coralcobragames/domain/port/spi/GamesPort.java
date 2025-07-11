package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.Games;

import java.util.Optional;

public interface GamesPort {

    Games create(Games games);
    void delete(Long id);
    Optional<Games> findById(Long id);
    Games update(Games games, Long id);
}
