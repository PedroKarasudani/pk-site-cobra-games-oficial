package br.com.coralcobragames.web.resource;

import br.com.coralcobragames.domain.model.TeamMember;
import br.com.coralcobragames.web.facade.TeamMemberFacade;
import br.com.coralcobragames.web.model.TeamMemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/team_member")
public class TeamMemberResource {

    @Autowired
    private TeamMemberFacade facade;

    @PostMapping
    public ResponseEntity<TeamMemberDTO> create(@RequestBody TeamMemberDTO teamMemberDTO) {
        return ResponseEntity.ok().body(this.facade.create(teamMemberDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamMemberDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.facade.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeamMemberDTO> update(@RequestBody TeamMemberDTO teamMemberDTO, @PathVariable Long id) {
        return ResponseEntity.ok().body(this.facade.update(teamMemberDTO, id));
    }
}
