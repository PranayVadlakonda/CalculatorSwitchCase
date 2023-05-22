package org.example;

import java.util.Scanner;

public class CalculatorSwitchConstruct {
    public static void main(String[] args) {
        // prompt the scanner
        Scanner Scanner = new Scanner(System.in);

        // prompt the user to enter first number
        System.out.println(" Enter the  first number :");

        // create a variable to store first number , use the input.nextInt() method to input the number
        int firstNumber = input.nextInt();

        // prompt the user to enter second number
        System.out.println(" Enter the second number :");

        // create a variable to store second number , use the input.nextInt() method to input the number
        int secondNumber = input.nextInt();

        // prompt the user to enter operator
        System.out.println(" Enter the operator :");

        // create a variable to store operator , use the input.next().charAt(0) method to input the character
        char operator = input.next().charAT(0);

        // write a switch case statement with the operator as expression
        switch (operator) {
            // write a case for +
            case '+':
                // write the code to print the sum of two numbers
                System.out.println(firstNumber + secondNumber);
                break;
            // write a case for -
            case '-':
                // write the code to print the difference of two numbers
                System.out.println(firstNumber - secondNumber);
                break;
            // write a case for *
            case '*':
                // write the code to print the product of two numbers
                System.out.println(firstNumber * secondNumber);
                break;
            // write a case for /
            case '/':
                // write a code to print the quotient of two numbers
                System.out.println(firstNumber / secondNumber);
                break;
            // write a case for %
            case '%':
                // write a code to print the remainder of two numbers
                System.out.println(firstNumber % secondNumber);
                break;
            // write a default case for the operator input by the user is not = - * / %
            default:
                // write a code to write invalid operator
                System.out.println("Invalid operator");
                break;
        }
        // close the scanner
        input.close();
    }
}












