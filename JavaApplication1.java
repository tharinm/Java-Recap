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

        User u1 = new User("Tharindu", "12", "1212");
        User u2 = new User("Chamal", "12", "1212");
        User u3 = new User("Thamindu", "12", "1212");

        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

        for (int i = 0; i < users.size(); i++) {
            System.out.println("User name " + users.get(i).getName());
            System.out.println("User name " + users.get(i).getAge());

        }

    }

}
