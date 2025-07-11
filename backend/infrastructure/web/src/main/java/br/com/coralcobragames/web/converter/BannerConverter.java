package br.com.coralcobragames.web.converter;

import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.web.model.BannerDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BannerConverter {

    public Banner toDomain(BannerDTO bannerDTO){
        return Banner.builder()
                .id(bannerDTO.getId())
                .imageUrl(bannerDTO.getImageUrl())
                .videoUrl(bannerDTO.getVideoUrl())
                .title(bannerDTO.getTitle())
                .subtitle(bannerDTO.getSubtitle())
                .build();
    }

    public BannerDTO toDTO(Banner banner){
        return BannerDTO.builder()
                .id(banner.getId())
                .imageUrl(banner.getImageUrl())
                .videoUrl(banner.getVideoUrl())
                .title(banner.getTitle())
                .subtitle(banner.getSubtitle())
                .build();
    }
}
