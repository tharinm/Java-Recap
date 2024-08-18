/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author tharindumadhushan
 */
public class Fish implements MyInterface {

    @Override
    public void makeSound() {
        WaterLevel waterLevel = WaterLevel.High;
        System.out.println("WaterLevel " + waterLevel);

        System.out.println("Swim");
    }

    @Override
    public void makeEat() {
        System.out.println("Fast");
    }

}
