package br.com.coralcobragames.domain.port.api.usecase.update;

import br.com.coralcobragames.domain.exceptions.UpdateNotFoundException;
import br.com.coralcobragames.domain.model.Update;
import br.com.coralcobragames.domain.port.api.update.UpdateUpdate;
import br.com.coralcobragames.domain.port.spi.UpdatePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateUpdateUseCase implements UpdateUpdate {

    private UpdatePort port;

    @Override
    public Update update(Update update, Long id) {
        this.port.findById(id).orElseThrow(() -> new UpdateNotFoundException(id));
        return this.port.update(update, id);
    }
}
