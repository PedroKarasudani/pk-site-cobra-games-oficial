package br.com.coralcobragames.domain.port.api.usecase.games;

import br.com.coralcobragames.domain.model.Games;
import br.com.coralcobragames.domain.port.api.games.CreateGames;
import br.com.coralcobragames.domain.port.spi.GamesPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateGamesUseCase implements CreateGames {

    private GamesPort port;

    public Games create(Games games){
        return this.port.create(games);
    }
}
