/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg2;

/**
 *

 */
public class Questão2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String pass;
        pass = "Ya3";
        long chrct = pass.chars().filter(ch-> ch != ' ').count();
        long more = (chrct - 6)*-1;
        
        System.out.println("Olá Débora!!");
        
        if (chrct < 6)
            System.out.println("Senha muito fraca :( Favor insirir mais "+
    more +" caracteres para sua senha ser aceita.");
        else
            System.out.println("Senha forte.");   
    }
    
}
