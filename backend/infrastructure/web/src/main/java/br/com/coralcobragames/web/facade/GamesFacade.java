package br.com.coralcobragames.web.facade;

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
    private final GamesConverter converter;

    @Autowired
    public GamesFacade(CreateGames createGames, FindGames findGames, DeleteGames deleteGames, UpdateGames updateGames, GamesConverter converter) {
        this.createGames = createGames;
        this.findGames = findGames;
        this.deleteGames = deleteGames;
        this.updateGames = updateGames;
        this.converter = converter;
    }

    public GamesDTO create(GamesDTO gamesDTO){
        return this.converter.toDTO(this.createGames.create(this.converter.toDomain(gamesDTO)));
    }

    public GamesDTO findById(Long id) {
        return this.converter.toDTO(this.findGames.findById(id).get());
    }

    public void delete(Long id){
        this.deleteGames.delete(id);
    }

    public GamesDTO update(GamesDTO gamesDTO, Long id){
        return this.converter.toDTO(this.updateGames.update(this.converter.toDomain(gamesDTO),id));
    }
}
