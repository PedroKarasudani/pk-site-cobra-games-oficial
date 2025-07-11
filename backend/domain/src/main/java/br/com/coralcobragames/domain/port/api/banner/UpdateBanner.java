package br.com.coralcobragames.domain.port.api.banner;

import br.com.coralcobragames.domain.model.Banner;

public interface UpdateBanner {

    Banner update(Banner banner, Long id);
}
