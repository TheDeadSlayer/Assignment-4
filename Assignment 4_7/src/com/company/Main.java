package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Random r=new Random();
        File ints = new File("tst.txt");

        try (PrintWriter nums =new PrintWriter(ints))
        {
            for (int i = 0; i < 100; i++) {
                nums.print(r.nextInt(100)+" ");
            }
        }

        catch (Exception e)
        {

        }

        // Crate and ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        try(
                // Create input file
                Scanner input = new Scanner(ints);
        ) {
            // Read the data back from the file
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        catch (Exception e)
        {

        }

        // Sort array list
        Collections.sort(list);

        // Display data in increasing order
        System.out.print(list.toString());
        System.out.println();
    }
}
