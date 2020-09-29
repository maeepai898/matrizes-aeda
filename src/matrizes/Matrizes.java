/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

import java.util.Scanner;


public class Matrizes {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        double matri[][] = new double[4][3];
        
       
        
        //primeiro for \\
        for(int i=0; i<4; i++){         //i = linha
        for (int j=0; j<3; j++){        //j = coluna
            
        System.out.println("adicione os números na ordem em linha e coluna");
            matri[i][j] = entrada.nextDouble();
            
            
            
            
        }
        }
        
    }
}

        
    
    

