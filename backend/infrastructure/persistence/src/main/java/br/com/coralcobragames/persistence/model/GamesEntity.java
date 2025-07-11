package br.com.coralcobragames.persistence.model;

import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.domain.model.Games;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_games")
public class GamesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String platform;
    private String linkDownload;
    private LocalDateTime releaseDate;
    @OneToOne
    private BannerEntity banner;

    public static GamesEntity fromDomain(Games games, Long id) {
        return GamesEntity.builder()
                .id(id)
                .title(games.getTitle())
                .description(games.getDescription())
                .platform(games.getPlatform())
                .linkDownload(games.getLinkDownload())
                .releaseDate(games.getReleaseDate())
                .banner(BannerEntity.fromDomain(games.getBanner(), id))
                .build();
    }

    public Games toDomain() {
        return Games.builder()
                .id(this.getId())
                .title(this.getTitle())
                .description(this.getDescription())
                .platform(this.getPlatform())
                .linkDownload(this.getLinkDownload())
                .releaseDate(this.getReleaseDate())
                .banner(this.getBanner().toDomain())
                .build();
    }
}
