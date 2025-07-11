package br.com.coralcobragames.domain.port.api.usecase.banner;

import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.domain.port.api.banner.CreateBanner;
import br.com.coralcobragames.domain.port.spi.BannerPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateBannerUseCase implements CreateBanner {

    private BannerPort port;

    public Banner create(Banner banner){
        return this.port.create(banner);
    }
}
