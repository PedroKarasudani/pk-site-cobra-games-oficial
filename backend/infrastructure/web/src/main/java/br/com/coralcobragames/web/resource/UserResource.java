package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.web.facade.UserFacade;
import br.com.coralcobragames.web.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    @Autowired
    private UserFacade facade;

    @GetMapping("/{id}")
    ResponseEntity<UserDTO> findById (@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @PostMapping
    ResponseEntity<UserDTO> create (@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok().body(this.facade.create(userDTO));
    }

    @PutMapping("/{id}")
    ResponseEntity<UserDTO> update (@RequestBody UserDTO userDTO,@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.update(userDTO, id));
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete (@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }
}
