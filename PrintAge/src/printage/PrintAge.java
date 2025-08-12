/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printage;

import java.util.Scanner;

/**
 *
 * @author lucas
 */

public class PrintAge {
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int year, month, day;
    
        System.out.println("Digite quantos anos:   ");
        year = inputScanner.nextInt();
        
        System.out.println("Digite quantos meses:   ");
        month = inputScanner.nextInt();
        
        System.out.println("Digite os dias:     ");
        day = inputScanner.nextInt();
        
        System.out.println("A conversão dos dados deu " + ((year * 365)+(month * 30)+day) + " dias.");
    }
    
}
