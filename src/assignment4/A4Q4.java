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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //asking how much food and created a variable
        System.out.println("How much does the food for prom cost?");
        Scanner input = new Scanner(System.in);
        double food = input.nextDouble();
        //dj variable 
        System.out.println("How much does the DJ cost?");
        double dj = input.nextDouble();
        //cost for rent
        System.out.println("How much does it cost to rent the hall? ");
        double rent = input.nextDouble();       
        //decorations cost and variable
        System.out.println("How much does decorations cost? ");
        double decorations = input.nextDouble();
        //cost for staff
        System.out.println("How much does it cost for staff? ");
        double staff = input.nextDouble();
        //miscellaneous cost and variable
        System.out.println("How much for miscellaneous costs? ");
        double stuff = input.nextDouble();
        //adding all the cost together
        double cost = (food+ dj + rent+ decorations+ staff+ stuff);
        //how many tickets are needed
        double tickets = ( cost/35);
        //rounding up for the tickets 
        tickets = Math.ceil(tickets);
        //final sentence 
        System.out.println("The total amount for prom is " + cost + ".You will need to sell " + tickets + " tickets to break even." );
    }
}
