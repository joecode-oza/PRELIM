package com.mycompany.gradingifelse;

import java.util.Scanner;

public class GradingIfElse {
    public static void main (String [] args){
        System.out.println("========== STUDENT GRADE COMPUTER ==========");
        
        Scanner input = new Scanner(System.in);
        String contiChoice;
        do {
            System.out.println("Enter Java Programming Score: ");
            double java_Score = input.nextDouble();
            
            System.out.println("Enter C Programming Score: ");
            double cProg_Score = input.nextDouble();
            
            System.out.println("Enter Data Handling Score: ");
            double data_Score = input.nextDouble();
            
            double average = (java_Score + cProg_Score + data_Score) / 3;
            char grade; 
            
            if ( average >= 90 && average <= 100 ){
                grade = 'A';
            } else if ( average >= 80 && average <= 89 ){
                grade = 'B';
            } else if ( average >= 75 && average <= 79 ) {
                grade = 'C';
            } else {
                grade = 'F';
            }
            
            System.out.println("\n==========================================\n");
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Grade: " + grade);
            System.out.println("\n==========================================\n");
            
            System.out.println("Do you want to continue [YES or NO]: ");
            contiChoice = input.next();
        } while (contiChoice.equalsIgnoreCase("YES"));
        
        System.out.println("Program Terminated. Thank you!");
        input.close();
    }
}
