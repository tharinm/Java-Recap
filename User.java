/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author tharindumadhushan
 */
public class User {

    private String name;
    private String age;
    private String password;

    public User(String name, String age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

//    //Getters
//    
//    public String getName(){
//    
//        return name;
//    }
//    
//    //setters
//    public void setName(String name){
//        
//        this.name=name;
//        
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {

        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
