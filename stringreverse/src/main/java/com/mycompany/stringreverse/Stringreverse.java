/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringreverse;

/**
 *
 * @author Abi
 */
public class Stringreverse {

    public static void main(String[] args) {
        String word="MADAM";
        String word2=" ";
                for(int i=word.length()-1;i>=0;i--)
                {
                    System.out.println(word.charAt(i));
                    word2=word2+word.charAt(i);
                }
                System.out.println(word2);
                if(word.equals(word2))
                {
                    System.out.println("palindrome");
                }
                else
                    
                {
                    System.out.println("not palindrome");
                }
    }
}
