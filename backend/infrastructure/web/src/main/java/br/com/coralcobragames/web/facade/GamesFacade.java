package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.domain.model.Games;
import br.com.coralcobragames.domain.port.api.games.CreateGames;
import br.com.coralcobragames.domain.port.api.games.DeleteGames;
import br.com.coralcobragames.domain.port.api.games.FindGames;
import br.com.coralcobragames.domain.port.api.games.UpdateGames;
import br.com.coralcobragames.web.converter.BannerConverter;
import br.com.coralcobragames.web.converter.GamesConverter;
import br.com.coralcobragames.web.model.GamesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamesFacade {

    private final CreateGames createGames;
    private final FindGames findGames;
    private final DeleteGames deleteGames;
    private final UpdateGames updateGames;
    private final GamesConverter gamesConverter;
    private final BannerConverter bannerConverter;

    @Autowired
    public GamesFacade(CreateGames createGames, FindGames findGames, DeleteGames deleteGames, UpdateGames updateGames, GamesConverter gamesConverter, BannerConverter bannerConverter) {
        this.createGames = createGames;
        this.findGames = findGames;
        this.deleteGames = deleteGames;
        this.updateGames = updateGames;
        this.gamesConverter = gamesConverter;
        this.bannerConverter = bannerConverter;
    }

    public Games toDomain(GamesDTO dto){
        Games game = gamesConverter.toDomain(dto);
        if (dto.getBannerDTO() != null) {
            Banner banner = bannerConverter.toDomain(dto.getBannerDTO());
            banner.setGame(game);
            game.setBanner(banner);
        }
        return game;
    }

    public GamesDTO toDTO(Games entity){
        GamesDTO dto = gamesConverter.toDTO(entity);
        if (entity.getBanner() != null) {
            dto.setBannerDTO(bannerConverter.toDTO(entity.getBanner()));
        }
        return dto;
    }

    public GamesDTO create(GamesDTO gamesDTO){
        return this.gamesConverter.toDTO(this.createGames.create(this.gamesConverter.toDomain(gamesDTO)));
    }

    public GamesDTO findById(Long id) {
        return this.gamesConverter.toDTO(this.findGames.findById(id).get());
    }

    public void delete(Long id){
        this.deleteGames.delete(id);
    }

    public GamesDTO update(GamesDTO gamesDTO, Long id){
        return this.gamesConverter.toDTO(this.updateGames.update(this.gamesConverter.toDomain(gamesDTO),id));
    }
}
