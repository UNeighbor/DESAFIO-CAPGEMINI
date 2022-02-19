/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg3;

import java.util.Arrays; 

import java.util.HashMap;
import java.util.Scanner;

/**
 *

 */
public class Questão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Digite uma palavra qualquer:");
        subString(word.next());
    }
    
    static void subString(String s){ 

        HashMap<String, Integer> map= new HashMap<>(); 

  

        for(int i = 0; i < s.length(); i++){ 

            for(int j = i; j < s.length(); j++){ 

                char[] valC = s.substring(i, j+1).toCharArray(); 

                Arrays.sort(valC); 

                String val = new String(valC); 

                if (map.containsKey(val))  

                    map.put(val, map.get(val)+1); 

                else 

                    map.put(val, 1); 

            } 

        } 

        int QtdAnagram = 0; 

        QtdAnagram = map.keySet().stream().map((key) -> map.get(key)).map((n) -> (n * (n-1))/2).reduce(QtdAnagram, Integer::sum); 

        System.out.println("Quantidade de anagramas:"+QtdAnagram); 

    } 
}
