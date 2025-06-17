package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
