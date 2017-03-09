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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //enter name
         System.out.println("Please enter your name.");
         Scanner input = new Scanner(System.in);
         String name = input.nextLine();
        //first test scores
        System.out.println("What was the first test out of?");
        double test1 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark1 = input.nextDouble();
        //second test scores
        System.out.println("What was the second test out of?");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark2 = input.nextDouble();
        //third test scores
        System.out.println("What was the third test out of?");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark3 = input.nextDouble();
        //fourth test scores 
        System.out.println("What was the fourth test out of?");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark4 = input.nextDouble();
        //test 5 scores
        System.out.println("What was the fifth test out of?");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark5 = input.nextDouble();
        
        //calcualating all the presintaions 
        System.out.println("Test score for" + name + ".");
        double per1 = (mark1/test1);
        double percent1 = (per1 * 100);
        double per2 = (mark2/test2);
        double percent2 = (per2 * 100);
        double per3 = (mark3/test3);
        double percent3 = (per3 * 100);
        double per4 = (mark4/test4); 
        double percent4 = (per4* 100);
        double per5 = (mark5/test5);
        double percent5 = (per5 * 100);
        
        // Writing all the percentages
        System.out.println("Test 1:" + percent1 + "%");
        System.out.println("Test 2:" + percent2 + "%");
        System.out.println("Test 3:" + percent3 + "%");
        System.out.println("Test 4:" + percent4 + "%");
        System.out.println("Test 5:" + percent5 + "%");
        // calculating the final average
        double average = (((per1 + per2 + per3 + per4 + per5)/5) *100);
        System.out.println("Average:" + average + "%");
        
    }
}
