package com.dh.domain;

public class Lanche {

    private double preco;
    private int tempoDePreparo;
    private final static int TEMPO_ENTREGA_POR_KM = 10;

    // Construtor da superclasse (classe abstrata)
    public Lanche() {
        this.preco=0;
        this.tempoDePreparo =0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Lanche(double preco, int tempoDePreparo, int tempoDeEntrega) {
        this.preco = preco;
        this.tempoDePreparo = tempoDePreparo;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

//    public int getTempoDeEntrega() {
//        return tempoDeEntrega;
//    }
//
//    public void setTempoDeEntrega(int tempoDeEntrega) {
//        this.tempoDeEntrega = tempoDeEntrega;
//    }
//
//    public int calcularTempoEntrega (int distancia ){
//        return getTempoDeEntrega()*distancia;
//    }
}