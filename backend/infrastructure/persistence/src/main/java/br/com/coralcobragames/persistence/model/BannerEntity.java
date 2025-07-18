package br.com.coralcobragames.persistence.model;

import br.com.coralcobragames.domain.model.Banner;
import br.com.coralcobragames.domain.model.Games;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_banner")
public class BannerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageUrl;
    private String videoUrl;
    private String title;
    private String subtitle;
    @OneToOne(mappedBy = "banner")
    private GamesEntity game;

    public static BannerEntity fromDomain(Banner banner, Long id) {
        return BannerEntity.builder()
                .id(id)
                .imageUrl(banner.getImageUrl())
                .videoUrl(banner.getVideoUrl())
                .title(banner.getTitle())
                .subtitle(banner.getSubtitle())
                .build();
    }

    public Banner toDomain() {
        return Banner.builder()
                .id(this.getId())
                .imageUrl(this.getImageUrl())
                .videoUrl(this.getVideoUrl())
                .title(this.getTitle())
                .subtitle(this.getSubtitle())
                .game(this.game != null ? this.game.toDomainShallow() : null)
                .build();
    }

    public Banner toDomainShallow() {
        return Banner.builder()
                .id(this.getId())
                .imageUrl(this.getImageUrl())
                .videoUrl(this.getVideoUrl())
                .title(this.getTitle())
                .subtitle(this.getSubtitle())
                .build();
    }
}
