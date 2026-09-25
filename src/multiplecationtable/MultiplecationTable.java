/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplecationtable;

/**
 *
 * @author HP
 */
public class MultiplecationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Zanele's code
       
        //declaring the variables
        int number=8;
        int product;
        
    
        
        //for loop to print the multiplecation table 
        for(int i=1;i<=10;++i)
        {  
        product = number * i;
        System.out.println(number+ " x " + i + " = " + product); 
   
        }
         
         
    }
    
}
