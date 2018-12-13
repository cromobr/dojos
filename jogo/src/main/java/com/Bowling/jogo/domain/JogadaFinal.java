package com.Bowling.jogo.domain;

public class JogadaFinal {
    private Integer nroPinosJogada1;
    private Integer nroPinosJogada2;
    private Integer nroPinosJogada3;
    private Integer reserva;

    public Integer getNroPinosJogada2() {
        return nroPinosJogada2;
    }

    public Integer getNroPinosJogada1() {
        return nroPinosJogada1;
    }

    public void setNroPinosJogada3(Integer nroPinosJogada3) {
        this.nroPinosJogada3 = nroPinosJogada3;
    }

    public JogadaFinal(Integer nroPinosJogada1, Integer nroPinosJogada2, Integer nroPinosJogada3, Integer reserva) {
        this.nroPinosJogada1 = nroPinosJogada1;
        this.nroPinosJogada2 = nroPinosJogada2;
        this.nroPinosJogada3 = nroPinosJogada3;
        this.reserva = reserva;
    }

    public Integer somaPontos(){
        return
                this.nroPinosJogada1 +
                this.nroPinosJogada2 +
                this.nroPinosJogada3 +
                this.reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }
}
