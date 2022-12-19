/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array1;

/**
 *
 * @author Abi
 */
import java.util.ArrayList;
public class Array1 {

    public static void main(String[] args) {
       ArrayList<String>flowers=new ArrayList<String>();
       
       flowers.add("Rose");
       flowers.add("jasmine");
       flowers.add("marigold");
       flowers.add("lilly");
       
       
       System.out.println(flowers);
       System.out.println(flowers.get(2));
    }
}
