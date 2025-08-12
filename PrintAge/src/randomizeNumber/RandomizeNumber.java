/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package randomizeNumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class RandomizeNumber {

    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Digite quantos numeros aleatorios voce quer:    ");
        int n = inputScanner.nextInt();
        
        System.out.print("|");
        
        for(int i = 0; i < n; i++){
            System.out.print(" " + random.nextInt(100) + " |");
        }
    }
}
