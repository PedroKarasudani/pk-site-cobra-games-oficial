package br.com.coralcobragames.domain.port.api.games;

import br.com.coralcobragames.domain.model.Games;

public interface UpdateGames {

    Games update(Games games, Long id);
}
