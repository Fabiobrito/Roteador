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
    private int Terminador; 
    private String Dados;  
    private String Destino;
    
    public Pacote(){
    }
    public Pacote(String Cabeçalho, int Terminador, String Dados, String Destino) {
        this.Cabeçalho = Cabeçalho;
        this.Terminador = Terminador;
        this.Dados = Dados;
        this.Destino = Destino;
    }
    
    
    public String getDados() {
        return Dados;
    }

    public void setDados(String Dados) {
        this.Dados = Dados;
    }

    

    
    
}
