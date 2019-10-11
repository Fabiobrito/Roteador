/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiobrito
 */
public class Portas {
    private Pacote entrada;
    private Pacote saida;
    
    public Portas(){
    }

    public Portas(Pacote entrada, Pacote saida) {
        this.entrada = entrada;
        this.saida = saida;
    }

    public Pacote getEntrada() {
        return entrada;
    }

    public void setEntrada(Pacote entrada) {
        this.entrada = entrada;
    }

    public Pacote getSaida() {
        return saida;
    }

    public void setSaida(Pacote saida) {
        this.saida = saida;
    }
    
}
