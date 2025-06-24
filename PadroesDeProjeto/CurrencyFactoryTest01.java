package PadroesDeProjeto;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = new CurrencyFactory().newCurrency(Country.BRAZIL);

        System.out.println(currency.getSymbol());
    }
}
