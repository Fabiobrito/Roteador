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
    private Portas porta;
    private Fila Buffers;
    
    public Roteador(){
    
    }
    public Roteador(String IP){
    super(IP);
    this.IP=IP;
    }

    public Roteador(String IP, String MAC,Portas porta, Fila Buffers){
       super(IP);
       this.porta=porta;
       this.Buffers= Buffers;
       
    }      
    @Override
    public void setIP(String IP) {
        this.IP = IP; 
    }
    @Override
    public String getIP() {
        return IP;
    }
    public void checaPrioridade(){
    }
    public void roteamento(Pacote pacote){
        
    }

    

  

    
}
