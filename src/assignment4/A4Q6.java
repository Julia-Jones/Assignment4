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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Please enter the speed limit");
        Scanner input = new Scanner(System.in);
        double limit1 = input.nextDouble();

        System.out.println("Enter the recorded speed of the car");
        double speed1 = input.nextDouble();

        double speeding = (speed1 - limit1);
        if (speed1 <= limit1) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else if (speed1 >= limit1) {
            double over = (speed1 - limit1);
            
            
            if (over <= 20) {
                System.out.println("You are speeding and your fine is $100.");
            }
            if (over >= 21 && over <= 30) {
                System.out.println("You are speeding and your fine is $270.");
            }
            
            if (over >= 31) {
                System.out.println("You are speeding and your fine is $500.");
            }
        }

    }
}
