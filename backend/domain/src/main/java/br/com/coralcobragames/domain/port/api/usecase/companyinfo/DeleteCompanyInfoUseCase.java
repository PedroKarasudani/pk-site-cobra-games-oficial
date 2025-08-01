package br.com.coralcobragames.domain.port.api.usecase.companyinfo;

import br.com.coralcobragames.domain.exceptions.CompanyInfoNotFoundException;
import br.com.coralcobragames.domain.port.api.companyinfo.DeleteCompanyInfo;
import br.com.coralcobragames.domain.port.spi.CompanyInfoPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteCompanyInfoUseCase implements DeleteCompanyInfo {

    private CompanyInfoPort port;

    @Override
    public void delete(Long id) {
        this.port.findById(id).orElseThrow(() -> new CompanyInfoNotFoundException(id));
        this.port.delete(id);
    }
}
