package br.com.coralcobragames.persistence;

import br.com.coralcobragames.domain.model.ContactMessage;
import br.com.coralcobragames.domain.port.spi.ContactMessagePort;
import br.com.coralcobragames.persistence.model.ContactMessageEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ContactMessageRepositoryAdapter implements ContactMessagePort {

    private final ContactMessageRepository contactMessageRepository;

    public ContactMessageRepositoryAdapter(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }


    @Override
    public ContactMessage create(ContactMessage contactMessage) {
        return this.contactMessageRepository.save(ContactMessageEntity.fromDomain(contactMessage, null)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        this.contactMessageRepository.deleteById(id);
    }

    @Override
    public Optional<ContactMessage> findById(Long id) {
        return this.contactMessageRepository.findById(id).stream().map(ContactMessageEntity::toDomain).findFirst();
    }

    @Override
    public ContactMessage update(ContactMessage contactMessage, Long id) {
        return this.contactMessageRepository.save(ContactMessageEntity.fromDomain(contactMessage, id)).toDomain();
    }
}
