/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity1;

/**
 *
 * @author Abi
 */
public class Activity1 {

    public static void main(String args[]) {
        int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int c[][]={{5,6,9},{7,2,4},{4,6,3}};
        //multiplying
        
        for(int i=0;i<3;i++){
            for(int j=0;i<3;j++){
                a[i][j]=0;
                for(int k=0;i<3;k++){ 
                    a[i][j]+=a[i][j]*b[k][j]   ;         }
            
        System.out.println(a[i][j]+"");
    }
}
}
}