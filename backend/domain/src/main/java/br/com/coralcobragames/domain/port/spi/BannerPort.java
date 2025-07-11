package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.Banner;

import java.util.Optional;

public interface BannerPort {

    Banner create(Banner banner);
    void delete(Long id);
    Optional<Banner> findById(Long id);
    Banner update(Banner banner, Long id);
}
