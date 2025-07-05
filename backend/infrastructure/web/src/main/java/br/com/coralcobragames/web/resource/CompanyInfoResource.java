package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.web.facade.CompanyInfoFacade;
import br.com.coralcobragames.web.model.CompanyInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/companyinfo")
public class CompanyInfoResource {

    @Autowired
    private CompanyInfoFacade facade;

    @PostMapping
    ResponseEntity<CompanyInfoDTO> create(@RequestBody CompanyInfoDTO companyInfoDTO) {
        return ResponseEntity.ok().body(this.facade.create(companyInfoDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<CompanyInfoDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<CompanyInfoDTO> update(@RequestBody CompanyInfoDTO companyInfoDTO, @PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.update(companyInfoDTO, id));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }
}
