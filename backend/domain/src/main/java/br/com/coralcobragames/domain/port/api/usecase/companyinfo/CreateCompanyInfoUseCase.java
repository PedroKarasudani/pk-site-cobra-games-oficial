package br.com.coralcobragames.domain.port.api.usecase.companyinfo;

import br.com.coralcobragames.domain.model.CompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.CreateCompanyInfo;
import br.com.coralcobragames.domain.port.spi.CompanyInfoPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyInfoUseCase implements CreateCompanyInfo {

    private CompanyInfoPort port;

    @Override
    public CompanyInfo create(CompanyInfo companyInfo) {
        return this.port.create(companyInfo);
    }
}
