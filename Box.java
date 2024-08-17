/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author tharindumadhushan
 */
public class Box {

    double length;
    double width;
    double color;
    double height;

    //default constructor
    public Box() {
        this.length = 5;
        this.color = 6;
        this.height = 5;
    }

    public Box(double length, double width, double color, double height) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.height = height;
    }
    
    public double findArea(){
        double area=length*height;
        System.out.println("Area "+area);
        return area;
        
    }
}
