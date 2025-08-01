package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByNameIgnoreCase(String name);
}
