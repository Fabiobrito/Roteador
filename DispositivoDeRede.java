/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiobrito
 */
public abstract class  DispositivoDeRede {
    private String IP;
    private String MAC;
    
    
    public DispositivoDeRede(String IP, String MAC) {
        super();
        this.IP = IP;
        this.MAC = MAC;
    }
   

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC;
    }
    
}
