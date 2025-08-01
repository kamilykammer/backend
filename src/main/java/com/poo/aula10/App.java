package com.poo.aula10;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Kamily";
        pessoa.idade = 17;
        // pessoa.salario = 155.000; atributos privados não são visíveis

        // Instanciando classes que estão declaradas em outros arquivos
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Kamily";
        pessoa1.idade = 17;
        pessoa1.altura = 1.65;

        pessoa2.nome = "João";
        pessoa2.idade = 18;
        pessoa2.altura = 1.82;

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        /*System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura (m): " + pessoa1.altura);

        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("Altura (m): " + pessoa2.altura);*/

    }
}
