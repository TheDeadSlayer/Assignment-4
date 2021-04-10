package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File x = new File("C:\\Users\\DeadSlayer\\Desktop\\Assignment 4\\Uni.txt");

        Scanner s = new Scanner(x);
        String contents;
        int w = 0, c = 0, l = 0;

        while (s.hasNext()) {
            l++;
            String line = s.nextLine();
            c += line.length();
        }

        while (s.hasNext()) {
            String line = s.next();
            w++;
        }

        System.out.println(w + " words");
        System.out.println(c + " characters");
        System.out.println(l + " lines");

    }
}
