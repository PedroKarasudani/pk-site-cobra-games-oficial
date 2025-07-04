package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.port.api.update.CreateUpdate;
import br.com.coralcobragames.domain.port.api.update.DeleteUpdate;
import br.com.coralcobragames.domain.port.api.update.FindUpdate;
import br.com.coralcobragames.domain.port.api.update.UpdateUpdate;
import br.com.coralcobragames.web.converter.UpdateConverter;
import br.com.coralcobragames.web.model.UpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateFacade {

    private final UpdateConverter converter = new UpdateConverter();

    @Autowired
    private FindUpdate findUpdate;
    @Autowired
    private CreateUpdate createUpdate;
    @Autowired
    private UpdateUpdate updateUpdate;
    @Autowired
    private DeleteUpdate deleteUpdate;

    public UpdateDTO findById (Long id) {
        return this.converter.toDTO(this.findUpdate.findById(id).get());
    }

    public UpdateDTO create (UpdateDTO updateDTO) {
        return this.converter.toDTO(this.createUpdate.create(this.converter.toDomain(updateDTO)));
    }

    public UpdateDTO update (UpdateDTO updateDTO, Long id) {
        return this.converter.toDTO(this.updateUpdate.update(this.converter.toDomain(updateDTO), id));
    }

    public void delete (Long id) {
        this.deleteUpdate.delete(id);
    }
}
