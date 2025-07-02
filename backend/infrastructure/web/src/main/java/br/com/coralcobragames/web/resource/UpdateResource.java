package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.domain.port.api.usecase.update.FindUpdateUseCase;
import br.com.coralcobragames.web.facade.UpdateFacade;
import br.com.coralcobragames.web.model.UpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/update")
public class UpdateResource {

    @Autowired
    private UpdateFacade facade;

    @GetMapping("/{id}")
    public ResponseEntity<UpdateDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PostMapping
    public ResponseEntity<UpdateDTO> create(@RequestBody UpdateDTO updateDTO) {
        return ResponseEntity.ok().body(this.facade.create(updateDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdateDTO> update(@RequestBody UpdateDTO updateDTO, @PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.update(updateDTO, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }
}
