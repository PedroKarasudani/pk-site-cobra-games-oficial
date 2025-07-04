package br.com.coralcobragames.persistence;

import br.com.coralcobragames.domain.model.Update;
import br.com.coralcobragames.domain.port.spi.UpdatePort;
import br.com.coralcobragames.persistence.model.UpdateEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UpdateRepositoryAdapter implements UpdatePort {

    private final UpdateRepository repository;

    public UpdateRepositoryAdapter(UpdateRepository repository) {
        this.repository = repository;
    }

    @Override
    public Update create(Update update) {
        return this.repository.save(UpdateEntity.fromDomain(update, null)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Optional<Update> findById(Long id) {
        return this.repository.findById(id).stream().map(UpdateEntity::toDomain).findFirst();
    }

    @Override
    public Update update(Update update, Long id) {
        return this.repository.save(UpdateEntity.fromDomain(update, id)).toDomain();
    }
}
