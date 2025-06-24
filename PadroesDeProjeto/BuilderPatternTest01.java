package PadroesDeProjeto;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
        .firstName("Pedro")
        .lastName("Paes")
        .username("pedropaes25")
        .email("pedro@email.com")
        .build();

        System.out.println(person);
    }
}
