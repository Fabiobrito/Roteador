/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiobrito
 */
public class Roteador extends DispositivoDeRede{
    private int Portas;
    private Fila Buffers;
    
    public Roteador(){
    }
    public Roteador(String IP, String MAC, int Portas, Fila Buffers){
       this.Portas=Portas;
       this.Buffers= Buffers;
       
    }      
    public void checaPrioridade(){
    }
    public void roteamento(Pacote pacote){
        
    }
}
