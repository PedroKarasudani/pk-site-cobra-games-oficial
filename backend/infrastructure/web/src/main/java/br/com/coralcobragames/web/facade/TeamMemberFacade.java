package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.port.api.teammember.CreateTeamMember;
import br.com.coralcobragames.domain.port.api.teammember.DeleteTeamMember;
import br.com.coralcobragames.domain.port.api.teammember.FindTeamMember;
import br.com.coralcobragames.domain.port.api.teammember.UpdateTeamMember;
import br.com.coralcobragames.web.converter.TeamMemberConverter;
import br.com.coralcobragames.web.model.TeamMemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamMemberFacade {

    @Autowired
    private CreateTeamMember createTeamMember;
    @Autowired
    private FindTeamMember findTeamMember;
    @Autowired
    private DeleteTeamMember deleteTeamMember;
    @Autowired
    private UpdateTeamMember updateTeamMember;

    private final TeamMemberConverter converter = new TeamMemberConverter();

    public TeamMemberDTO create(TeamMemberDTO teamMemberDTO) {
        return this.converter.toDTO(this.createTeamMember.create(this.converter.toDomain(teamMemberDTO)));
    }

    public TeamMemberDTO findById(Long id) {
        return this.converter.toDTO(this.findTeamMember.findById(id).get());
    }

    public void delete(Long id) {
        this.deleteTeamMember.delete(id);
    }

    public TeamMemberDTO update(TeamMemberDTO teamMemberDTO, Long id) {
        return this.converter.toDTO(this.updateTeamMember.updateById(this.converter.toDomain(teamMemberDTO), id));
    }
}
