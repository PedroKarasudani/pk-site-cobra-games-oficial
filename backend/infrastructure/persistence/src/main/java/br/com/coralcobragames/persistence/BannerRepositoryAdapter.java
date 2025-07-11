package br.com.coralcobragames.persistence;

import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.domain.port.spi.BannerPort;
import br.com.coralcobragames.persistence.model.BannerEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BannerRepositoryAdapter implements BannerPort {

    private final BannerRepository repository;

    public BannerRepositoryAdapter(BannerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Banner create(Banner banner) {
        return this.repository.save(BannerEntity.fromDomain(banner, null)).toDomain();
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Optional<Banner> findById(Long id) {
        return this.repository.findById(id).stream().map(BannerEntity::toDomain).findFirst();
    }

    @Override
    public Banner update(Banner banner, Long id) {
        return this.repository.save(BannerEntity.fromDomain(banner, id)).toDomain();
    }
}
