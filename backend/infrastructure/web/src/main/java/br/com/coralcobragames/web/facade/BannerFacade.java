package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.port.api.banner.CreateBanner;
import br.com.coralcobragames.domain.port.api.banner.DeleteBanner;
import br.com.coralcobragames.domain.port.api.banner.FindBanner;
import br.com.coralcobragames.domain.port.api.banner.UpdateBanner;
import br.com.coralcobragames.web.converter.BannerConverter;
import br.com.coralcobragames.web.model.BannerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerFacade {

    @Autowired
    private CreateBanner createBanner;
    @Autowired
    private FindBanner findBanner;
    @Autowired
    private DeleteBanner deleteBanner;
    @Autowired
    private UpdateBanner updateBanner;

    private final BannerConverter converter = new BannerConverter();

    public BannerDTO create(BannerDTO bannerDTO){
        return this.converter.toDTO(this.createBanner.create(this.converter.toDomain(bannerDTO)));
    }

    public BannerDTO findById(Long id) {
        return this.converter.toDTO(this.findBanner.findById(id).get());
    }

    public void delete(Long id){
        this.deleteBanner.delete(id);
    }

    public BannerDTO update(BannerDTO bannerDTO, Long id){
        return this.converter.toDTO(this.updateBanner.update(this.converter.toDomain(bannerDTO),id));
    }
}
