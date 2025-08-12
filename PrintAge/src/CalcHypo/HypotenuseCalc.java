/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CalcHypo;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class HypotenuseCalc {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        
        int side1 = 0, side2 = 0;
        
        System.out.println("Digite o tamanho do lado 1 do quadrado: ");
        side1 = inputScanner.nextInt();
        
        System.out.println("Digite o tamnho do lado 2 do quadrado:  ");
        side2 = inputScanner.nextInt();
        
        System.out.println("O tamanho da hipotenusa eh: " + (side1 * side1)+(side2 * side2));
    }
}
