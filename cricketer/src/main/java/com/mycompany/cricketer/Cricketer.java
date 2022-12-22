/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cricketer;

/**
 *
 * @author Abi
 */
public class Cricketer {

    String name;
    String age;
    
    void bating()
    {
        System.out.println("cricketer will play");
    }
    }
class Batsman extends Cricketer{
    String batsman="bating";
    
    public Batsman(String name,String age){
        super.name=name;
        super.age=age;
    }
    void bating(){
        System.out.println("Batsman Score more");
    }
    public static void main(String[]args){
        Batsman kholi=new Batsman( "kholi","45");
        Batsman doni=new Batsman(  "doni", "56");
        
        kholi.bating();
        System.out.println(doni.age);
        
    }
   }

