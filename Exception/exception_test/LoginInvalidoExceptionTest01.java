package exception_test;

import java.util.Scanner;

import arquivo.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitado = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos!");
        }
        else {
            System.out.println("Logado com sucesso!");
        }
    }
}
