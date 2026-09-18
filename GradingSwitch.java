package com.mycompany.gradingswitch;

import java.util.Scanner;
public class GradingSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contiChoice;
        char grade;
        
        do {
        System.out.println("Enter Java Programming Score: ");
        double javSc = input.nextDouble();
        
        System.out.println("Enter C Programming Score: ");
        double cProg= input.nextDouble();
        
        System.out.println("Enter Data Handling Score: ");
        double dataSc= input.nextDouble();
        
        double average = (javSc + cProg + dataSc) / 3;
        int gradeGroup = (int)(average / 5);
        
         
        switch (gradeGroup) {
            case 20:
            case 19:
            case 18:
                grade = 'A';
                break;
            case 17:
            case 16:
                grade = 'B';
                break;
            case 15:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("\n========================================\n");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("\n========================================\n");
        
        System.out.println("Do you want to continue? [YES] or [NO]");
        contiChoice = input.next();
        }
        while (contiChoice.equalsIgnoreCase("YES"));
        
        System.out.println("Program Terminated. Thank you!");
    }
}
