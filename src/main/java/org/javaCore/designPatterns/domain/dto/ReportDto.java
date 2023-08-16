package org.javaCore.designPatterns.domain.dto;

import org.javaCore.designPatterns.domain.factory.CountryFactory;
import org.javaCore.designPatterns.domain.factory.CurrencyFactoryInterface;

public class ReportDto {
    private String aircraftName;
    private CountryFactory country;
    private CurrencyFactoryInterface currency;
    private String personName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private CountryFactory country;
        private CurrencyFactoryInterface currency;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(CountryFactory country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(CurrencyFactoryInterface currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.aircraftName = this.aircraftName;
            reportDto.currency = this.currency;
            reportDto.country = this.country;
            reportDto.personName = this.personName;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency.getSymbol() +
                ", personName='" + personName + '\'' +
                '}';
    }
}
