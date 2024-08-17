/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tharindumadhushan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int total = 0;

        for (int j = 0; j < a.length; j++) {
            System.out.println("Enter values:");
            int val = sc.nextInt();
            a[j] = val;  // Storing the input value in the array

            total = total + a[j];
            System.out.println("Total is " + total);
        }

    }

    private static class doubel {

        public doubel() {
        }
    }

}
Ï
