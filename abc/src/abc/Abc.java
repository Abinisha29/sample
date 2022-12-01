/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abc;

/**
 *
 * @author Abi
 */
public class Abc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bank icici=new bank();
       icici.bank_name="ICICI";
       icici.interest=7;
       icici.display_interest();
       
       bank iob=new bank();
       iob.bank_name="IOB";
       iob.interest=8;
       iob.display_interest();
       
       bank sbi=new bank();
       sbi.bank_name="SBI";
       sbi.interest=9;
       sbi.display_interest();
    }
    
}
