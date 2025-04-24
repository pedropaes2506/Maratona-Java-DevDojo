package Generics.Wildcard;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }

}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }

}

public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}
