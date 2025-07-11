package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.web.facade.BannerFacade;
import br.com.coralcobragames.web.model.BannerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/banner")
public class BannerResource {

    @Autowired
    private BannerFacade facade;

    @PostMapping
    public ResponseEntity<BannerDTO> create(@RequestBody BannerDTO bannerDTO) {
        return ResponseEntity.ok().body(this.facade.create(bannerDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BannerDTO> update(@RequestBody BannerDTO bannerDTO, @PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.update(bannerDTO, id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BannerDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }
}
