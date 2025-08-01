package br.com.coralcobragames.domain.port.api.usecase.banner;

import br.com.coralcobragames.domain.exceptions.BannerNotFoundException;
import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.domain.port.api.banner.FindBanner;
import br.com.coralcobragames.domain.port.spi.BannerPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindBannerUseCase implements FindBanner {

    private BannerPort port;

    public Optional<Banner> findById(Long id) {
        return Optional.of(this.port.findById(id).orElseThrow(() -> new BannerNotFoundException(id)));
    }
}
