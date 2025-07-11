package br.com.coralcobragames.domain.port.api.usecase.games;

import br.com.coralcobragames.domain.model.Games;
import br.com.coralcobragames.domain.port.api.games.UpdateGames;
import br.com.coralcobragames.domain.port.spi.GamesPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateGamesUseCase implements UpdateGames {

    private GamesPort port;

    public Games update(Games games, Long id){
        return this.port.update(games, id);
    }
}
