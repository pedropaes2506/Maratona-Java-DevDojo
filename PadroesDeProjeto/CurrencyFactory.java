package PadroesDeProjeto;

public class CurrencyFactory {
    public Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL: 
                return new Real();
            default: 
                throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
