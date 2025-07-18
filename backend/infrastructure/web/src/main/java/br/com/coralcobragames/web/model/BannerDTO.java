package br.com.coralcobragames.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BannerDTO {

    private Long id;
    private String imageUrl;
    private String videoUrl;
    private String title;
    private String subtitle;
    private GamesDTO gamesDTO;

}
