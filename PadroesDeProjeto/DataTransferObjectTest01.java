package PadroesDeProjeto;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        Country country = Country.BRAZIL;
        Currency currency = new CurrencyFactory().newCurrency(country);
        Person person = new Person
            .PersonBuilder()
            .firstName("Pedro")
            .lastName("Paes")
            .build();
        ReportDto reportDto = new ReportDto
            .ReportDtoBuilder()
            .aircraftName(aircraft.getName())
            .country(country)
            .currency(currency)
            .personName(person.getFirstName())
            .build();

        System.out.println(reportDto);
    }
}
