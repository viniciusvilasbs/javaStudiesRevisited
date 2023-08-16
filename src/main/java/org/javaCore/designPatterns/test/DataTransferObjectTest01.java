package org.javaCore.designPatterns.test;

import org.javaCore.designPatterns.domain.dto.ReportDto;
import org.javaCore.designPatterns.domain.factory.CountryFactory;
import org.javaCore.designPatterns.domain.factory.CurrencyFactory;
import org.javaCore.designPatterns.domain.factory.CurrencyFactoryInterface;
import org.javaCore.designPatterns.domain.factory.PersonFactory;
import org.javaCore.designPatterns.domain.singleton.AircraftSingle;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        AircraftSingle aircraftSingle = new AircraftSingle("777");
        CountryFactory country = CountryFactory.BRAZIL;
        CurrencyFactoryInterface currency = CurrencyFactory.newCurrency(country);
        PersonFactory personBuild = PersonFactory.PersonFactoryBuilder
                .builder()
                .firstName("Vinicius")
//                .lastName("Silva")
//                .userName("Vinymax")
//                .email("viny@mail.com")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraftName(aircraftSingle.getName())
                .country(country)
                .currency(currency)
                .personName(personBuild.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
