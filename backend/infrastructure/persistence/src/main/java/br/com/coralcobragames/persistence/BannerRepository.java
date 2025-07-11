package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.BannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BannerRepository extends JpaRepository<BannerEntity, Long> {
}
