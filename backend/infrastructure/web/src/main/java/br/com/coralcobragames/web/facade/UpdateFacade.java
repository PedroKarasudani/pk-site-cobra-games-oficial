package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.model.Update;
import br.com.coralcobragames.domain.port.api.usecase.update.CreateUpdateUseCase;
import br.com.coralcobragames.domain.port.api.usecase.update.DeleteUpdateUseCase;
import br.com.coralcobragames.domain.port.api.usecase.update.FindUpdateUseCase;
import br.com.coralcobragames.domain.port.api.usecase.update.UpdateUpdateUseCase;
import br.com.coralcobragames.web.converter.UpdateConverter;
import br.com.coralcobragames.web.model.UpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateFacade {

    private final UpdateConverter converter = new UpdateConverter();

    @Autowired
    private FindUpdateUseCase findUpdateUseCase;
    @Autowired
    private CreateUpdateUseCase createUpdateUseCase;
    @Autowired
    private UpdateUpdateUseCase updateUpdateUseCase;
    @Autowired
    private DeleteUpdateUseCase deleteUpdateUseCase;

    public UpdateDTO findById (Long id) {
        return this.converter.toDTO(this.findUpdateUseCase.findById(id).get());
    }

    public UpdateDTO create (UpdateDTO updateDTO) {
        return this.converter.toDTO(this.createUpdateUseCase.create(this.converter.toDomain(updateDTO)));
    }

    public UpdateDTO update (UpdateDTO updateDTO, Long id) {
        return this.converter.toDTO(this.updateUpdateUseCase.update(this.converter.toDomain(updateDTO), id));
    }

    public void delete (Long id) {
        this.deleteUpdateUseCase.delete(id);
    }
}
