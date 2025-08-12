/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package BMICalculator;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class BMICalculator {
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Digite sua altura em metros:");
        float h = inputScanner.nextFloat();
        
        System.out.println("Digite seu peso em Kg:");
        float w = inputScanner.nextFloat();
        
       float bmi = w / (h*h);
       
        System.out.print("Sua situacao se encontra em:  ");
       if (bmi >= 40){
           System.out.print("Obedidade grau III ou morbida. You'll die...");
       }
       else if (bmi < 40 && bmi >= 35){
           System.out.print("Obesidade grau II.");
       }
       else if (bmi < 35 && bmi >= 30)
       {
           System.out.print("Obesidade grau I.");
       }
       else if (bmi < 30 && bmi >= 25){
           System.out.print("Sobrepeso.");
       }
       else if (bmi < 25 && bmi >= 18.5){
           System.out.print("Peso normal.");
       }
       else if (bmi < 18.5){
           System.out.print("Abaixo do peso.");
       }
       else {
           System.out.println("------------------> ERROR <------------------");
       }
       
       /*
        - Abaixo de 18,5: Abaixo do peso
        - Entre 18,5 e 24,9: Peso normal
        - Entre 25 e 29,9: Sobrepeso
        - Entre 30 e 34,9: Obesidade grau I
        - Entre 35 e 39,9: Obesidade grau II
        - 40 ou mais: Obesidade grau III ou mórbida
       */
    }
}
