package br.com.coralcobragames.web.converter;


import br.com.coralcobragames.domain.model.TeamMember;
import br.com.coralcobragames.web.model.TeamMemberDTO;

public class TeamMemberConverter {

    public TeamMemberDTO toDTO(TeamMember teamMember) {
        return TeamMemberDTO.builder()
                .id(teamMember.getId())
                .name(teamMember.getName())
                .photoUrl(teamMember.getPhotoUrl())
                .role(teamMember.getRole())
                .linkedinUrl(teamMember.getLinkedinUrl())
                .build();
    }

    public TeamMember toDomain(TeamMemberDTO teamMemberDTO) {
        return TeamMember.builder()
                .id(teamMemberDTO.getId())
                .name(teamMemberDTO.getName())
                .photoUrl(teamMemberDTO.getPhotoUrl())
                .role(teamMemberDTO.getRole())
                .linkedinUrl(teamMemberDTO.getLinkedinUrl())
                .build();
    }
}
