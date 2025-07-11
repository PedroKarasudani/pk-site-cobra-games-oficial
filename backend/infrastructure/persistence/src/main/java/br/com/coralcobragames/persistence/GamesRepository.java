package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.GamesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<GamesEntity, Long> {
}
