package br.com.coralcobragames.domain.port.api.games;

import br.com.coralcobragames.domain.model.Games;

import java.util.Optional;

public interface FindGames {

    Optional<Games> findById(Long id);
}
