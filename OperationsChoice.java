package com.mycompany.operationschoice;

import java.util.Scanner;
public class OperationsChoice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contiChoice;
        do{
        System.out.println("========== ARITHMETIC OPERATIONS ==========\n");
        System.out.println("Choose Operation: ");
        System.out.println("[1] Addition        [5] Modulus");
        System.out.println("[2] Subtraction     [6] Increment");
        System.out.println("[3] Multiplication  [7] Decrement");
        System.out.println("[4] Division");
        int operation = input.nextInt();
        
        
        switch (operation) {
            case 1:{
                System.out.println("\n========================\n");
                System.out.println("Enter value of x: ");
                int x = input.nextInt();
                System.out.println("Enter value of y: ");
                int y = input.nextInt();
                int result = x + y;
                System.out.println("ADDITION [x + y]: " + result);
                System.out.println("\n========================\n");
                break;
                }
            case 2:{
                System.out.println("\n========================\n");
                System.out.println("Enter value of x: ");
                int x = input.nextInt();
                System.out.println("Enter value of y: ");
                int y = input.nextInt();
                int result = x - y;
                System.out.println("SUBTRACTION [x - y]: " + result);
                System.out.println("\n========================\n");
                break;
                }
            case 3:{
                System.out.println("\n========================\n");
                System.out.println("Enter value of x: ");
                int x = input.nextInt();
                System.out.println("Enter value of y: ");
                int y = input.nextInt();
                int result = x * y;
                System.out.println("MULTIPLICATION [x * y]: " + result);
                System.out.println("\n========================\n");
                break;
                }
            case 4:{
                System.out.println("\n========================\n");
                System.out.println("Enter value of x: ");
                int x = input.nextInt();
                System.out.println("Enter value of y: ");
                int y = input.nextInt();
                if (y == 0) {
                System.out.println("ERROR: Division by 0 is not allowed!");
                } else {
                int result = x / y;
                System.out.println("DIVISION [x / y]: " + result);
                System.out.println("\n========================\n");
                }
                break;
                }
            case 5:{
                System.out.println("\n========================\n");
                System.out.println("Enter value of x: ");
                int x = input.nextInt();
                System.out.println("Enter value of y: ");
                int y = input.nextInt();
                if (y == 0) {
                System.out.println("ERROR: Modulus by 0 is not allowed!");
                } else {
                int result = x % y;
                System.out.println("MODULUS [x % y]: " + result);
                System.out.println("\n========================\n");
                }
                break;
                }
            case 6:{
                System.out.println("\n===== INCREMENT =====");
                System.out.println("Enter value of x: ");
                int x = input.nextInt();
                System.out.println("====================\n");
                int result = x + 1;
                
                System.out.println("INCREMENT [x++]: " + result);
                break;
                }
            case 7:{
                System.out.println("\n===== DECREMENT =====");
                System.out.println("Enter value of x: ");
                int x = input.nextInt();
                System.out.println("====================\n");
                int result = x - 1;
                
                System.out.println("DECREMENT [x--]: " + result);
                break;
                }
            }
            System.out.println("Do you want to continue [YES or NO]: ");
            contiChoice = input.next();
        } while (contiChoice.equalsIgnoreCase("YES"));
        
        System.out.println("Program Terminated. Thank you!");
        input.close();
    }
}
