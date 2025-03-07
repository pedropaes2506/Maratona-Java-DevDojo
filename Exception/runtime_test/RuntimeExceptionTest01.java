package runtime_test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        try {
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
            //System.out.println("Escrevendo dados no arquivo");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
