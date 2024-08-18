/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tharindumadhushan
 */
public class JavaApplication1 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banand");
        fruits.add("Grapes");

        System.out.println(" " + fruits);

        fruits.add(0, "Papaya");

        System.out.println(" " + fruits);
        System.out.println(" " + fruits.get(3));

        System.out.println(" " + fruits.set(1, "Watermelon"));
        System.out.println("---------------");
        System.out.println(" " + fruits);

        fruits.remove(3);
        System.out.println(" " + fruits);

        System.out.println("---------------");
        System.out.println("Size " + fruits.size());

        System.out.println("---------------");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(" " + fruits.get(i));
        }

        System.out.println("---------------");
        Collections.sort(fruits);

        System.out.println(" SORTED " + fruits);

        System.out.println("---------------");
        Collections.sort(fruits, Collections.reverseOrder());
        
        System.out.println(" Reversed " + fruits);

    }

}
