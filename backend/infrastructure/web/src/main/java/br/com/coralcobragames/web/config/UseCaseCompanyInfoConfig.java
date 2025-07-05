package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.companyinfo.CreateCompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.DeleteCompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.FindCompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.UpdateCompanyInfo;
import br.com.coralcobragames.domain.port.api.usecase.companyinfo.CreateCompanyInfoUseCase;
import br.com.coralcobragames.domain.port.api.usecase.companyinfo.DeleteCompanyInfoUseCase;
import br.com.coralcobragames.domain.port.api.usecase.companyinfo.FindCompanyInfoUseCase;
import br.com.coralcobragames.domain.port.api.usecase.companyinfo.UpdateCompanyInfoUseCase;
import br.com.coralcobragames.domain.port.spi.CompanyInfoPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseCompanyInfoConfig {

    @Bean
    public CreateCompanyInfo createCompanyInfo (CompanyInfoPort companyInfoPort) {
        return new CreateCompanyInfoUseCase(companyInfoPort);
    }

    @Bean
    public DeleteCompanyInfo deleteCompanyInfo (CompanyInfoPort companyInfoPort) {
        return new DeleteCompanyInfoUseCase(companyInfoPort);
    }

    @Bean
    public UpdateCompanyInfo updateCompanyInfo (CompanyInfoPort companyInfoPort) {
        return new UpdateCompanyInfoUseCase(companyInfoPort);
    }

    @Bean
    public FindCompanyInfo findCompanyInfo (CompanyInfoPort companyInfoPort) {
        return new FindCompanyInfoUseCase(companyInfoPort);
    }
}
