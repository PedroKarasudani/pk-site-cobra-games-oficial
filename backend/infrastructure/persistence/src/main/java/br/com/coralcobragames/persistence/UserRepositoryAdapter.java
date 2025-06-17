package br.com.coralcobragames.persistence;

import br.com.coralcobragames.domain.model.User;
import br.com.coralcobragames.domain.port.spi.UserPort;
import br.com.coralcobragames.persistence.model.UserEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryAdapter implements UserPort {

    private final UserRepository userRepository;

    public UserRepositoryAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return this.userRepository.save(UserEntity.fromDomain(user,null)).toDomain();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id).stream().map(UserEntity::toDomain).findFirst();
    }

    @Override
    public User update(User user, Long id) {
        return userRepository.save(UserEntity.fromDomain(user, id)).toDomain();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
