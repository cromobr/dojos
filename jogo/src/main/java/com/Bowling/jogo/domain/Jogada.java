package com.Bowling.jogo.domain;

public class Jogada {
    private Integer nroPinosJogada1;
    private Integer nroPinosJogada2;
    private Integer reservaJogada1;
    private Integer reservaJogada2;
    private Integer anterior; //0: none 1: spare 2:strike;

    public Integer getAnterior() {
        return anterior;
    }
    public Jogada(Integer nroPinosJogada1, Integer nroPinosJogada2,
                  Integer reservaJogada1, Integer reservaJogada2,
                  Integer anterior) {
        this.nroPinosJogada1 = nroPinosJogada1;
        this.nroPinosJogada2 = nroPinosJogada2;
        this.reservaJogada1 = reservaJogada1;
        this.reservaJogada2 = reservaJogada2;
        this.anterior = anterior;
    }
    public void setNroPinosJogada1(Integer nroPinosJogada1) {
        this.nroPinosJogada1 = nroPinosJogada1;
    }
    public void setNroPinosJogada2(Integer nroPinosJogada2) {
        this.nroPinosJogada2 = nroPinosJogada2;
    }
    public Integer getNroPinosJogada1() {
        return nroPinosJogada1;
    }
    public Integer getNroPinosJogada2() {
        return nroPinosJogada2;
    }
    public Integer somaPontos(){
        return this.nroPinosJogada1+this.nroPinosJogada2+this.reservaJogada1+this.reservaJogada2;
    }
}
