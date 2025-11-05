package com.mycompany.poo.aula13.animais;

public class Golfinho extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("O golfinho está grunhindo... ");
    }

    @Override
    public void mover() {
        System.out.println(this.getNome() + " esta nadando... ");
    }

    @Override
    public void mover(String direcao) {
        System.out.println(this.getNome() + " esta nadando para o(a) " + direcao + " ...");
    }
}