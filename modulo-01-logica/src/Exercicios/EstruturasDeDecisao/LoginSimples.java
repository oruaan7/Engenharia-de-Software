package Exercicios.EstruturasDeDecisao;

import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario, senha;
        String senhaCorreta = "1234";

        System.out.println("Digite seu usuario: ");
        usuario = sc.nextLine();
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals(senhaCorreta)) {
            System.out.println("Login realizado com sucesso!");
        }
        else {
            System.out.println("Usuário ou senha inválidos.");
        }

        sc.close();
    }
}
