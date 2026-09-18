package com.mycompany.largestnum;

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ordinal_num = {"first", "second", "third"};
        double[] num = new double[3];
        
        for(int x = 0; x<3; x++){
            System.out.println("Enter " + ordinal_num[x] + " number: ");
            num[x] = input.nextDouble();
        }
        double largest_num = Math.max(num[0], Math.max(num[1], num[2]));
        System.out.println("\n========================\n");
        System.out.println("The Largest Number is: " + largest_num);
    }
}
