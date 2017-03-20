/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author jonej9442
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner created 
        Scanner input = new Scanner(System.in);
        //sqaures start at 1 
        double total = 1;
        //while loop created 
        while (total < 100) {
            System.out.println("Enter the numbers:");
            double N = input.nextDouble();

            //calculations 
            total = N + total;

            //snakes 
            if (total == 54) {
                total = 19;
            }
            if (total == 90) {
                total = 48;
            }
            if (total == 99) {
                total = 77;
            }

            //ladders 
            if (total == 9) {
                total = 34;
            }
            if (total == 40) {
                total = 64;
            }
            if (total == 67) {
                total = 86;
            }

            //tell location 
            System.out.println("You are on" + total);

            // if reached 100, then you win 
            //print out 
            if (total == 100) {
                System.out.println("You Won!");
            }
        }









    }
}
