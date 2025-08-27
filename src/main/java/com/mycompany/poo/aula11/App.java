package com.mycompany.poo.aula11;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // Change the value
        pessoa.setNome("Leonardo");
        pessoa.setIdade(26);

        // Access the value
        System.out.printf("O %s tem %d anos de idade\n",
                pessoa.getNome(), pessoa.getIdade());
    }
}
