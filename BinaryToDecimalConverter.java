/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.to.decimal.converter;

/**
 *
 * @author Zanele Mabaso
 */
public class BinaryToDecimalConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zanele's code 
        String binaryNumber="100";
        
        
        int decimalNumber=Integer.parseInt(binaryNumber,2);
        
        System.out.println("Decimal number: " + decimalNumber);
    }
    
}
