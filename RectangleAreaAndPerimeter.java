/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangleareaandperimeter;

/**
 *
 * @author Zanele Mabaso
 */
public class RectangleAreaAndPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Zanele'code
        double length= 5.6;
        double width=8.5;
        
        double area=length * width;
        double perimeter = 2*(length + width);
        
        System.out.printf("Area is %.1f * %.1f = %.2f%n", length, width, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", length, width, perimeter);
    }
        
    }
    

