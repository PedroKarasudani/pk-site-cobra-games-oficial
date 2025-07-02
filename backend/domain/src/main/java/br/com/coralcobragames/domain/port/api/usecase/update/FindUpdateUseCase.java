package br.com.coralcobragames.domain.port.api.usecase.update;

import br.com.coralcobragames.domain.model.Update;
import br.com.coralcobragames.domain.port.api.update.FindUpdate;
import br.com.coralcobragames.domain.port.spi.UpdatePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindUpdateUseCase implements FindUpdate {

    private UpdatePort port;

    @Override
    public Optional<Update> findById(Long id) {
        return this.port.findById(id);
    }
}
