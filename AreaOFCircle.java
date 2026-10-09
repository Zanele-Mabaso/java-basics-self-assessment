/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaofcircle;

/**
 *
 * @author Zanele
 */
public class AreaOFCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Zanele's code
        
        double radius =7.5;
        
        //calculating the area using pi build in method 
        double area=Math.PI* Math.pow(radius,2);
        
        
        double circumference= 2* Math.PI*radius;
        System.out.println("Perimeter is = "+circumference);
        System.out.println("Area is = "+area);
        
    }
    
}
