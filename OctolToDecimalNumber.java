/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package octoltodecimalnumber;

/**
 *
 * @author Zanele Mabso
 */
public class OctolToDecimalNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zanele's code 
        String octalNumber ="10";
        
        int decimalNumber=Integer.parseInt(octalNumber,8);
        System.out.println("Equivalent decimal number is:" + decimalNumber);
        
    }
    
}
