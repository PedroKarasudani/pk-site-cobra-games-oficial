package br.com.coralcobragames.web.converter;

import br.com.coralcobragames.domain.model.Games;
import br.com.coralcobragames.web.model.GamesDTO;
import org.springframework.stereotype.Component;

@Component
public class GamesConverter {

    public Games toDomain(GamesDTO gamesDTO){
        return Games.builder()
                .id(gamesDTO.getId())
                .title(gamesDTO.getTitle())
                .description(gamesDTO.getDescription())
                .platform(gamesDTO.getPlatform())
                .linkDownload(gamesDTO.getLinkDownload())
                .releaseDate(gamesDTO.getReleaseDate())
                .build();
    }

    public GamesDTO toDTO(Games games){
        return GamesDTO.builder()
                .id(games.getId())
                .title(games.getTitle())
                .description(games.getDescription())
                .platform(games.getPlatform())
                .linkDownload(games.getLinkDownload())
                .releaseDate(games.getReleaseDate())
                .build();
    }
}
