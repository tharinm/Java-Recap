/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
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
        
        fruits.add(0,"Papaya");
        
        System.out.println(" " + fruits);
        System.out.println(" " + fruits.get(3));

    }

}
