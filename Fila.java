/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiobrito
 */
public class Fila {
    private Pacote[] pacotes;
    private int total=0;
    private int last=0;
    private int first=0;

    public Fila(Pacote pacote, int total, int last, int first) {
        this.total = total;
        this.last = last;
        this.first = first;
        pacotes = new Pacote[11];
    }

    
    public void insert(Pacote pacote){
        pacotes[last]=pacote;
        last++;
        if(last==11){//if the last is the same size of the vector, then the last becomes the first
            last=0;
        }
        total++;
    }
    public Pacote remove(){
        Pacote aux=pacotes[first];
        first++;
        total--;
        return aux;
    }
    
}
