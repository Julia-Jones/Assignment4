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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Tell what bob needs to ask first
        System.out.println("Please enter how many Inches there are?");
        //new scanner and to copy what was entered for the first question
        Scanner input = new Scanner(System.in);
        Double amount = input.nextDouble();
        //going from inches to cm 
        Double answer = (amount * 2.54);
        //final statement
        System.out.println(amount + " inches is the same as " + answer + " cm.");


    }
}
