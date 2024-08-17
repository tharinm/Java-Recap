/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author tharindumadhushan
 */
public class Man {

    String fname;
    String lname;
    int age;
    String gender;

    public void eat() {
        String fullName;
        System.out.println("Im eat");
    }

    public void walk() {
        System.out.println("Im walk");
    }

    public void createMan(String fname, String lname, int age, String gender) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        
//         System.out.println("FirstName "+fname);
//         System.out.println("LastName "+lname);
    }

}
