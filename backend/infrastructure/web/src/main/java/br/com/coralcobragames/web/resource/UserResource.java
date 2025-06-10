package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.web.facade.UserFacade;
import br.com.coralcobragames.web.model.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserResource {

    private UserFacade facade;

    @GetMapping("/{id}")
    ResponseEntity<UserDTO> findById (@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }
}
