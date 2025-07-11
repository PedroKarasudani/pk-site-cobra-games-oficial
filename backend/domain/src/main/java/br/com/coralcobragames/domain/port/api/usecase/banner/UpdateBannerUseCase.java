package br.com.coralcobragames.domain.port.api.usecase.banner;

import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.domain.port.api.banner.UpdateBanner;
import br.com.coralcobragames.domain.port.spi.BannerPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateBannerUseCase implements UpdateBanner {

    private BannerPort port;

    public Banner update(Banner banner, Long id){
        return this.port.update(banner, id);
    }
}
