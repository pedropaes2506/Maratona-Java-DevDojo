package ClassesInternas;

public class OuterClassesTest02 {
    private String name = "Naruto";

    void print() {
        final String lastName = "Uzumaki";
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClass = new OuterClassesTest02();
        outerClass.print();
    }
}
