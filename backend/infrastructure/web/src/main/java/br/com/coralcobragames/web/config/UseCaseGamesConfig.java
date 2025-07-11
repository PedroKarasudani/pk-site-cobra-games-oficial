package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.games.CreateGames;
import br.com.coralcobragames.domain.port.api.games.DeleteGames;
import br.com.coralcobragames.domain.port.api.games.FindGames;
import br.com.coralcobragames.domain.port.api.games.UpdateGames;
import br.com.coralcobragames.domain.port.api.usecase.games.CreateGamesUseCase;
import br.com.coralcobragames.domain.port.api.usecase.games.DeleteGamesUseCase;
import br.com.coralcobragames.domain.port.api.usecase.games.FindGamesUseCase;
import br.com.coralcobragames.domain.port.api.usecase.games.UpdateGamesUseCase;
import br.com.coralcobragames.domain.port.spi.GamesPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseGamesConfig {

    @Bean
    public CreateGames createGames(GamesPort port) {
        return new CreateGamesUseCase(port);
    }

    @Bean
    public FindGames findGames(GamesPort port) {
        return new FindGamesUseCase(port);
    }

    @Bean
    public DeleteGames deleteGames(GamesPort port) {
        return new DeleteGamesUseCase(port);
    }

    @Bean
    public UpdateGames updateGames(GamesPort port) {
        return new UpdateGamesUseCase(port);
    }
}
