package br.com.coralcobragames.web.model;

import br.com.coralcobragames.domain.model.TeamMember;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateDTO {

    private Long id;
    private String title;
    private String fullText;
    private LocalDateTime date;
    private String type;
    private TeamMember author;
}
