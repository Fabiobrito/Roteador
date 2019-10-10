
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        int i,j;
        Roteador[][] matriz=new Roteador[3][3];
        FileInputStream stream = new FileInputStream("ips.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        while((linha=br.readLine())!=null){
            for(i=0;i<=3;i++){
                for(j=0;j<=3;j++){
               
                    matriz[i][j].setIP(linha);
                }
            }
              linha = br.readLine();
        }
        reader.close();
        for(i=0;i<=3;i++){
            for(j=0;j<=3;j++){
              System.out.println(matriz[i][j]);
            }
        }
    }
    
}
