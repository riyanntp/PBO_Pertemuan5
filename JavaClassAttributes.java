package com.pboreg;

public class JavaClassAttributes {
    String fname = "Marco";
    String lname = "Dominicus";
    int age = 21;

    public static void main(String[]args){
        JavaClassAttributes myObj = new JavaClassAttributes();
        System.out.println("Name : "+ myObj.fname + " " + myObj.lname);
        System.out.println("Age : "+ myObj.age);

    }
}