package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.web.facade.GamesFacade;
import br.com.coralcobragames.web.model.GamesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/games")
public class GamesResource {

    @Autowired
    private GamesFacade facade;

    @PostMapping
    public ResponseEntity<GamesDTO> create(@RequestBody GamesDTO gamesDTO) {
        return ResponseEntity.ok().body(this.facade.create(gamesDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GamesDTO> update(@RequestBody GamesDTO gamesDTO, @PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.update(gamesDTO, id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GamesDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }
}
