/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averageofthreenumbers;

/**
 *
 * @author Zanele Mabaso
 */
import java.util.Scanner;

public class AverageOfThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Zanele's code
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the first number ");
        int number1=input.nextInt();
        
        System.out.println("Enter the second number ");
        int number2= input.nextInt();
        
        System.out.println("Enter the third number ");
        int number3=input.nextInt();
        
        input.close();
        
        int average=(number1+number2+ number3)/3;
        System.out.println("Average of three numbers is: "+ average);
         
    }  
    
    
}
