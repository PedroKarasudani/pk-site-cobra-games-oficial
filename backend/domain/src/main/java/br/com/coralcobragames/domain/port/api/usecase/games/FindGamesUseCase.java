package br.com.coralcobragames.domain.port.api.usecase.games;

import br.com.coralcobragames.domain.model.Games;
import br.com.coralcobragames.domain.port.api.games.FindGames;
import br.com.coralcobragames.domain.port.spi.GamesPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindGamesUseCase implements FindGames {

    private GamesPort port;

    public Optional<Games> findById(Long id){
        return this.port.findById(id);
    }
}
