package br.com.coralcobragames.domain.port.api.usecase.update;

import br.com.coralcobragames.domain.model.Update;
import br.com.coralcobragames.domain.port.api.update.CreateUpdate;
import br.com.coralcobragames.domain.port.spi.UpdatePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateUpdateUseCase implements CreateUpdate {

    private UpdatePort port;

    @Override
    public Update create(Update update) {
        return this.port.create(update);
    }
}
