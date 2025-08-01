package br.com.coralcobragames.domain.port.api.usecase.update;

import br.com.coralcobragames.domain.exceptions.UpdateNotFoundException;
import br.com.coralcobragames.domain.port.api.update.DeleteUpdate;
import br.com.coralcobragames.domain.port.spi.UpdatePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteUpdateUseCase implements DeleteUpdate {

    private UpdatePort port;

    @Override
    public void delete(Long id) {
        this.port.findById(id).orElseThrow(() -> new UpdateNotFoundException(id));
        this.port.deleteById(id);
    }
}
