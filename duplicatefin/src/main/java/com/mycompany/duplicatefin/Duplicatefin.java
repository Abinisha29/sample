/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.duplicatefin;

/**
 *
 * @author Abi
 */
public class Duplicatefin {

    public static void main(String[] args) {
        String word= "maheshbabu";
        int length=word.length();
        char a[]=word.toCharArray();
        for(int i=0;i<length;i++)
        {
            for(int j=i+1;j<length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("DUPLICATE CHARACTERS ARE "+a[j]);
                    break;
                }
            }
        }
    }
}
