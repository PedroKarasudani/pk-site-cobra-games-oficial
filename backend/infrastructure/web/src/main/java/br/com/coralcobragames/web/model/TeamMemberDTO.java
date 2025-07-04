package br.com.coralcobragames.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamMemberDTO {

    private Long id;
    private String name;
    private String photoUrl;
    private String role;
    private String linkedinUrl;

}
