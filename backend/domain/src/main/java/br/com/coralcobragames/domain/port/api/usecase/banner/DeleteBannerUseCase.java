package br.com.coralcobragames.domain.port.api.usecase.banner;

import br.com.coralcobragames.domain.port.api.banner.DeleteBanner;
import br.com.coralcobragames.domain.port.spi.BannerPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteBannerUseCase implements DeleteBanner {

    private BannerPort port;

    public void delete(Long id) {
        this.port.delete(id);
    }
}
