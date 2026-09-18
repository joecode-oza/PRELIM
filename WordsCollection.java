package com.mycompany.wordscollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordsCollection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] words = new String[3];

        for (int x = 0; x<3; x++ ) {
            System.out.println("Enter Word " + (x + 1) + ": ");
            words[x] = br.readLine();
        }

        String phrase = words[0] + " " + words[1] + " " + words[2];
        System.out.println("\n========================\n");
        System.out.println("Collected words: " + phrase);

    }
}