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

    public static void main(String[] args) {

        Man newMan = new Man();
        
        newMan.fname="Tharindu";
        newMan.lname="Madhushan";
        newMan.gender="male";
        newMan.age=27;
        
        Man newMan1 = new Man();
        
        newMan1.fname="Amal";
        newMan1.lname="Madhwa";
        newMan1.gender="Male";
        newMan1.age=17;
        
        Man newMan2 = new Man();
        
        newMan2.fname="Amali";
        newMan2.lname="Madhu";
        newMan2.gender="Female";
        newMan2.age=13;
        
        System.out.println("FirstName "+newMan.fname);
         System.out.println("LastName "+newMan.lname);

    }

}
