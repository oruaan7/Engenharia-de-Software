package Exercicios;

import java.util.HashSet;
import java.util.Set;

public class CadastroUsuarios {
    public static void main(String[] args) {

        Set<String> usuarios = new HashSet<>();

        usuarios.add("Ruan");
        usuarios.add("Carlos");
        usuarios.add("Maria");
        usuarios.add("Joao");

        boolean adicionado = usuarios.add("Ruan");

        if (adicionado) {
            System.out.println("Ruan cadastrado com sucesso!");
        } else {
            System.out.println("Ruan ja estava cadastrado!");
        }



        System.out.println("=== Mostrando os Usuarios Cadastrados ===");
        for (String usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("=== Qtd de Usuarios Cadastrados ===");
        System.out.println(usuarios.size() + " usuarios");

        System.out.println("=== Verificando se 'Maria' esta cadastrada ===");
        if (usuarios.contains("Maria")) {
            System.out.println("Maria esta cadastrada!");
        } else {
            System.out.println("Maria nao esta cadastrada!");
        }

        System.out.println("Tentando adicionar Maria novamente...");
        boolean adicionou = usuarios.add("Maria");

        if (adicionou) {
            System.out.println("Maria cadastrada!");
        } else {
            System.out.println("Maria ja esta cadastrada!");
        }

        System.out.println("=== Removendo 'Carlos' ===");
        usuarios.remove("Carlos");
        System.out.println("'Carlos' foi removido!");

        System.out.println("Mostrando novamente os usuarios cadastrados...");
        for (String usuario : usuarios) {
            System.out.println(usuario);
        }

        System.out.println("=== Verificando se a lista esta vazia ===");
        System.out.println(usuarios.isEmpty());
    }
}
