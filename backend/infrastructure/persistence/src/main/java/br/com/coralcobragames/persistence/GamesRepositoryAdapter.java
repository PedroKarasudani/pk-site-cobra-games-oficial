package br.com.coralcobragames.persistence;

import br.com.coralcobragames.domain.model.Games;
import br.com.coralcobragames.domain.port.spi.GamesPort;
import br.com.coralcobragames.persistence.model.GamesEntity;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class GamesRepositoryAdapter implements GamesPort {

    private final GamesRepository repository;

    public GamesRepositoryAdapter(GamesRepository repository) {
        this.repository = repository;
    }

    @Override
    public Games create(Games games) {
        return this.repository.save(GamesEntity.fromDomain(games, null)).toDomain();
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Optional<Games> findById(Long id) {
        return this.repository.findById(id).stream().map(GamesEntity::toDomain).findFirst();
    }

    @Override
    public Games update(Games games, Long id) {
        return this.repository.save(GamesEntity.fromDomain(games, id)).toDomain();
    }
}
