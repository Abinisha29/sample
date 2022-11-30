/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2;

/**
 *
 * @author Abi
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank icici = new Bank();
        icici.bank_name = "ICICI";
        icici.interest = 7f;
        icici.display_interest();
                
        Bank sbi = new Bank();
        sbi.bank_name = "SBI";
        sbi.interest = 8f;
        sbi.display_interest();
        
        
        Bank iob = new Bank();
        iob.bank_name = "IOB";
        iob.interest = 9f;
        iob.display_interest();
        
           
        
    }
    
}
