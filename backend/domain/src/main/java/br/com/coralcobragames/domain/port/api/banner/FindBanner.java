package br.com.coralcobragames.domain.port.api.banner;

import br.com.coralcobragames.domain.model.Banner;

import java.util.Optional;

public interface FindBanner {

    Optional<Banner> findById(Long id);
}
