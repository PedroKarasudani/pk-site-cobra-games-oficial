package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.UpdateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpdateRepository extends JpaRepository<UpdateEntity, Long> {
}
