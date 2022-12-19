/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.duplicatefin2;

/**
 *
 * @author Abi
 */
public class Duplicatefin2 {

    public static void main(String[] args) {
        String str1="welcome to SATHYAM CINEMAS";
        String str2=str1.toLowerCase();
        int count,i;
        char arr[]=str2.toCharArray();
        for (i =0;i<str2.length();i++){
            count=1;
            for(int j=i+1;j<str2.length();j++){
                if(arr[i]==arr[j]&&arr[i]!=' ')
                {
                    count++;
                    arr[j]='0';
                }
        }
        if(count>1&&arr[i]!='0')
        System.out.println(arr[i]);
    }
    }
}

