package org.example;

import static org.example.Constant.DERIVED_DATA;

public class Main {
    public void addData(String data){
        if(data.equals(DERIVED_DATA)){
            System.out.println("Welcome");
        }
        System.out.println("data - "+data);
    }

    public void addedMethod(){
        System.out.println("Method Added");
    }
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
    }
}
