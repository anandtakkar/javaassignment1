package com.assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int percentage;

            System.out.println("Enter the marks for subject 1");
            num1 = sc.nextInt();

            System.out.println("Enter the marks for subject 2");
            num2 = sc.nextInt();

            System.out.println("Enter the marks for subject 3");
            num3 = sc.nextInt();

            System.out.println("Enter the marks for subject 4");
            num4 = sc.nextInt();

            System.out.println("Enter the marks for subject 5");
            num5 = sc.nextInt();

        percentage=100*(num1+num2+num3+num4+num5)/500;


if(percentage>=70 && percentage<=100){
    System.out.println("Your grade is A and your percentage is " + percentage);
}
         else if (percentage>=50 && percentage<=69){
            System.out.println("Your grade is B and your percentage is " + percentage);
        }
         else if (percentage>=35 && percentage<=49){
            System.out.println("Your grade is C and your percentage is " + percentage);
        }
else {
    System.out.println("Your grade is D and your Failed and your percentage is " + percentage);
}
    }
}
