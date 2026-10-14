/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decimal.to.hexadecimal.converter;

/**
 *
 * @author Zanele Mabaso
 */
public class DecimalToHexadecimalConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Zanele's code 
        int number = 15;
        
         String  hexaDecimalNum=Integer.toHexString( number).toUpperCase();
        
        System.out.println("Hexadecimal number is : " + hexaDecimalNum);
    }
    
}
