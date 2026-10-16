package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        double regularPrice= 5.45;
        double largePrice=8.95;

        System.out.println("How old are you?");
        int age= Integer.parseInt(input.nextLine());
        System.out.println("What size would you like your sandwich? Type S for small, L for large");
        String userinput= input.nextLine();


        if (age <= 17) {
            if(userinput == "S") {
                regularPrice -= regularPrice * .10;
            }
            else {
                largePrice -= largePrice * .10;
            }

        }
        else if(age >=65){
            if(userinput == "S") {

                regularPrice -= regularPrice * .20;
            }
            else {

                largePrice -= largePrice * .20;
            }

        }
        else{
            if(userinput == "S") {
                regularPrice = regularPrice;
            }
            else{
            largePrice= largePrice;
        }}


        if(userinput.equals("S")) {
            System.out.printf("Regular size price is $%.2f \n", regularPrice);
        }
        else {

            System.out.printf("Large size price is $%.2f ", largePrice);
        }
    }
}
