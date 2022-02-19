/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg1;

import java.util.Scanner; 

/**
 *

 */
public class Questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, j, n;
	    
	    System.out.println("Olá usuário. Bem vindo!!");
            Scanner valor = new Scanner(System.in);
	    System.out.println("Digite a quantidade de asteriscos que deseja ter no seu triangulo:");
            n = valor.nextInt();
	    
	    for(i=0; i<n; i++)
	    {
	        for(j=1*(n-i); j>=0; j--)
	        {
	            System.out.print(" ");
	        }
	        for(j=0; j<=i; j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
    }
    
}
