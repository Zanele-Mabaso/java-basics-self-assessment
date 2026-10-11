/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swapvariables;

/**
 *
 * @author Zanele Mabaso
 */
public class SwapVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Zanele ' s code
       int a = 15;
        int b = 27;

        System.out.println("Before swapping : a, b = " + a + ", " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a, b = " + a + ", " + b);
       
       
    }
    
}
