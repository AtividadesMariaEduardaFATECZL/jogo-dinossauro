package dinossauro;

import java.math.BigDecimal;

import static dinossauro.Humor.FELIZ;
import static dinossauro.Humor.TRISTE;

public class Dinossauro {
    private BigDecimal energia = new BigDecimal("250");
    private BigDecimal velocidade = new BigDecimal("200");
    private BigDecimal temperatura = new BigDecimal("17");
    private Humor humor = FELIZ;

    public BigDecimal getEnergia() {
        return energia;
    }

    public BigDecimal getVelocidade() {
        return velocidade;
    }

    public BigDecimal getTemperatura() {
        return temperatura;
    }

    public void tomarSol() {
        this.velocidade = this.velocidade.add(new BigDecimal("30"));
        this.temperatura = this.temperatura.add(new BigDecimal("4"));
        this.humor = FELIZ;
    }

    public void comer() {
        this.energia = this.energia.add(new BigDecimal("10"));
        this.velocidade = this.velocidade.subtract(new BigDecimal("18"));
        this.humor = FELIZ;
    }

    public void correr() {
        this.energia = this.energia.subtract(new BigDecimal("34"));
        this.velocidade = this.velocidade.subtract(new BigDecimal("46"));
        this.humor = FELIZ;
    }

    public void ficarNaSombra() {
        this.energia = this.energia.add(new BigDecimal("15"));
        this.temperatura = this.temperatura.subtract(new BigDecimal("2"));
        this.humor = TRISTE;
    }

    public void cantar() {
        this.energia = energia.subtract(new BigDecimal("15"));
        this.humor = FELIZ;
    }

    public void pular() {
        this.energia = energia.subtract(new BigDecimal("24"));
        this.humor = FELIZ;
    }

    @Override
    public String toString() {
        return "Dinossauro{" +
                "energia=" + energia +
                ", velocidade=" + velocidade +
                ", temperatura=" + temperatura +
                ", humor=" + humor +
                '}';
    }
}
