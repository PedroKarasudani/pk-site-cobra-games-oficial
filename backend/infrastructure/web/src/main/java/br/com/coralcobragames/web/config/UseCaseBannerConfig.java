package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.banner.CreateBanner;
import br.com.coralcobragames.domain.port.api.banner.DeleteBanner;
import br.com.coralcobragames.domain.port.api.banner.FindBanner;
import br.com.coralcobragames.domain.port.api.banner.UpdateBanner;
import br.com.coralcobragames.domain.port.api.usecase.banner.CreateBannerUseCase;
import br.com.coralcobragames.domain.port.api.usecase.banner.DeleteBannerUseCase;
import br.com.coralcobragames.domain.port.api.usecase.banner.FindBannerUseCase;
import br.com.coralcobragames.domain.port.api.usecase.banner.UpdateBannerUseCase;
import br.com.coralcobragames.domain.port.spi.BannerPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBannerConfig {

    @Bean
    public CreateBanner createBanner(BannerPort port) {
        return new CreateBannerUseCase(port);
    }

    @Bean
    public FindBanner findBanner(BannerPort port) {
        return new FindBannerUseCase(port);
    }

    @Bean
    public DeleteBanner deleteBanner(BannerPort port) {
        return new DeleteBannerUseCase(port);
    }

    @Bean
    public UpdateBanner updateBanner(BannerPort port) {
        return new UpdateBannerUseCase(port);
    }
}
