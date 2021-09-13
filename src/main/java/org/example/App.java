/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {

    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        double orderAmount;
        double subtotal;
        double totalWi;

        /*Prompting for the order amount*/
        System.out.println("What is the order amount?");
        orderAmount = scan.nextDouble();

        scan.nextLine();

        /*Prompting for state*/
        System.out.println("What is the state?");
        String state = scan.nextLine();

        /*If statement for WI*/
        if (state.equals("WI")) {
            subtotal = orderAmount;
            double tax = 0.055 * orderAmount;
            totalWi = (orderAmount + (tax));
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f", subtotal, tax, totalWi);
        }

        /*If statement for any other state*/
        if (!("WI".equals(state))) {
            subtotal = orderAmount;
            System.out.printf("The total is $%.2f", subtotal);
        }
    }
}



