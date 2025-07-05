package br.com.coralcobragames.domain.port.api.usecase.companyinfo;

import br.com.coralcobragames.domain.model.CompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.UpdateCompanyInfo;
import br.com.coralcobragames.domain.port.spi.CompanyInfoPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateCompanyInfoUseCase implements UpdateCompanyInfo {

    private CompanyInfoPort port;

    @Override
    public CompanyInfo update(CompanyInfo companyInfo, Long id) {
        return this.update(companyInfo, id);
    }
}
