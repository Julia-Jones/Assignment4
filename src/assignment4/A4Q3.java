package assignment4;

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonej9442
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //number 1 statement and variable
        System.out.println("Please enter your first number.");
        Scanner input = new Scanner(System.in);
        Double number1 = input.nextDouble();
        // number 2 statement, variable
        System.out.println("Please enter your second number.");
        Double number2 = input.nextDouble();
        // number 3 statement, variable
        System.out.println("Please enter your third number.");
        Double number3 = input.nextDouble();
        // number 4 statement, variable
        System.out.println("Please enter your forth number.");
        Double number4 = input.nextDouble();
        // final statement 
        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ".");




    }
}
