package br.com.coralcobragames.persistence.model;

import br.com.coralcobragames.domain.model.User;
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
@Table(name = "tb_users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
    private Boolean enabled;

    public static UserEntity fromDomain(User user, Long id) {
        return UserEntity.builder()
                .id(id)
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .role(user.getRole())
                .enabled(user.getEnabled())
                .build();
    }

    public User toDomain() {
        return User.builder()
                .id(this.getId())
                .name(this.getName())
                .email(this.getEmail())
                .password(this.getPassword())
                .role(this.getRole())
                .enabled(this.getEnabled())
                .build();
    }
}
