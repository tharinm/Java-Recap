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

        int[][] numbers = new int[3][2];

        numbers[0][0] = 60;
        numbers[0][1] = 20;

        numbers[1][0] = 30;
        numbers[1][1] = 60;

        numbers[2][0] = 70;
        numbers[2][1] = 50;

        System.out.println("------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(numbers[i][j]);
            }
        }

        System.out.println("------------");

        int sum = 0;
        for (int[] shortArray : numbers) {
            for (int a : shortArray) {
                sum = sum + a;
            }
            System.out.println("Total " + sum);
        }

        

        System.out.println("------------");

        int max = 0;
        for (int[] shortArray : numbers) {
            for (int a : shortArray) {

                if (a > max) {
                    max = a;
                }
            }
           System.out.println("max "+ max);
        }
     

    }

    private static class doubel {

        public doubel() {
        }
    }

}
