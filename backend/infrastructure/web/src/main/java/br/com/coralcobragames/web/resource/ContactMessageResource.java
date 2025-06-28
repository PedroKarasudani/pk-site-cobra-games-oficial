package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.web.facade.ContactMessageFacade;
import br.com.coralcobragames.web.model.ContactMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactMessageResource {

    @Autowired
    private ContactMessageFacade facade;

    @PostMapping
    public ResponseEntity<ContactMessageDTO> create(@RequestBody ContactMessageDTO contactMessageDTO) {
        return ResponseEntity.ok().body(this.facade.create(contactMessageDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactMessageDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactMessageDTO> update(@PathVariable Long id, @RequestBody ContactMessageDTO contactMessageDTO) {
        return ResponseEntity.ok().body(this.facade.update(contactMessageDTO, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }

}
