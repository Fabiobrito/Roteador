/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiobrito
 */
public class Pacote {
    private String Cabeçalho;
    private String Terminador; 
    private int Dados;  
    private String Destino;

    public Pacote(String Cabeçalho, String Terminador, int Dados, String Destino) {
        this.Cabeçalho = Cabeçalho;
        this.Terminador = Terminador;
        this.Dados = Dados;
        this.Destino = Destino;
    }
    
    
    public int getDados() {
        return Dados;
    }

    public void setDados(int Dados) {
        this.Dados = Dados;
    }

    

    
    
}
