
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabiobrito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    //File  arq  =new File ("/home/fabiobrito/Documentos/UFRN/19.2/lp2/roteamento/ips.txt");
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File  arq  =new File ("/home/fabiobrito/Documentos/UFRN/19.2/lp2/Roteador/src/ips.txt");
        int i,j;
        String[] aux = new String[9];
        Roteador[][] matriz=new Roteador[3][3];
        Scanner ler=new Scanner(arq);
        while(ler.hasNext()){    
            try{ 
                 
                for(i=0;i<9;i++){
                        aux[i]=ler.nextLine();
                        
                    }
                    int cont=0;
                    for(i=0;i<3;i++){
                        for(j=0;j<3;j++){
                            matriz[i][j]=new Roteador(aux[cont]);
                            cont++;
                        }
                    }
                   /*for(i=0;i<3;i++){ //verificava se os roteadores recebiam mesmo os ips
                        for(j=0;j<3;j++){
                           System.out.println(matriz[i][j].getIP());
                        }
                    }*/
                
            }
            catch(Exception ex){
            }
        }
       
    ler.close();
    }
}
