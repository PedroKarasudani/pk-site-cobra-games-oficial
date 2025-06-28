package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.ContactMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessageEntity, Long> {
}
