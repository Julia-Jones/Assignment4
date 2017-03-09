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
        System.out.println("Please enter your first number.");
        Scanner input = new Scanner(System.in);
        String number1 = input.nextLine();

        System.out.println("Please enter your second number.");
        String number2 = input.nextLine();

        System.out.println("Please enter your third number.");
        String number3 = input.nextLine();

        System.out.println("Please enter your forth number.");
        String number4 = input.nextLine();

        System.out.println("Your numbers were " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ".");




    }
}
