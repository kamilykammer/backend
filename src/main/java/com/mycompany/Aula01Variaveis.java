package com.mycompany;

public class Aula01Variaveis {
    public static void main(String[] args) {
        // Varíavel lógica

        // Tipo primitivo
        boolean valorLogicoPrimitivo = true;
        // Exibe o valor
        System.out.println(valorLogicoPrimitivo);

        // Tipo abstrato
        Boolean valorLogicoAbstrato = false;
        // Exibe com texto
        System.out.println("O valor da varíavel valorLogicoAbstrato é: " + valorLogicoAbstrato);

        // Variaveis inteiras

        // Tipo primitivo
        int valorInteiro = 10; // 32 bits
        long valorInteiroLongo = 10L; // 64 bits

        // Tipo Abstrato
        Integer valorInteiroAbs = 20;
        Long valorLongoAbs = 20L;

        System.out.println("o valor de valorInteiro é: " + valorInteiro +", e o valor de valorInteiroLongo é:" + valorInteiroLongo);
    }    
}
