package br.com.coralcobragames.domain.port.api.usecase.games;

import br.com.coralcobragames.domain.exceptions.GamesNotFoundException;
import br.com.coralcobragames.domain.port.api.games.DeleteGames;
import br.com.coralcobragames.domain.port.spi.GamesPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteGamesUseCase implements DeleteGames {

    private GamesPort port;

    public void delete(Long id){
        this.port.findById(id).orElseThrow(() -> new GamesNotFoundException(id));
        this.port.delete(id);
    }
}
