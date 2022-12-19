/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloworld;
import java. util. Scanner;
/**
 *
 * @author Abi
 */
public class Helloworld {

    public static void main(String[] args) {
        int a[]= {2,3};
        int b[]=new int[2];
        int i;
        Scanner sc=new Scanner(System. in);
        
        for(i=0;i<2;i++)
        {
        System. out. println("Enter array values ");
        b[i]=sc. nextInt();
        }
        for(i=0;i<2;i++)
        {
            if(a[i]==b[i])
            {
                System. out. println("false");
            }
            else
            {
                System. out. println("true");
            }
        }
        
        
        
     
    }
}

