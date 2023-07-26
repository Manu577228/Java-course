package org.manubharadwaj.javacourse;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printJava(){
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // First Java Program
        System.out.println("Hello world!");

        // Variables
        String name = "Gowri";
        int age = 25;
        String neighbour = "Bharadwaj";
        String friend = neighbour;

        // Primitive Data Types & Non-Primitive Data Types
        byte chocolates = 12;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = false;

        // Types
        // 1) String
        String chocolate =  new String("MilkyBar");
        System.out.println(chocolate.length());
        // 2)concatenate
        String sweet1 = "Kaju-Barfi";
        String sweet2 = "Mysore-Pak";
        String Sweets = (sweet1 + " and " + sweet2);
        System.out.println(Sweets);
        // 3)charAt
        System.out.println(sweet1.charAt(0));
        // 4)length
        System.out.println(sweet1.length());
        // 5)replace
        String sweet3 = sweet1.replace("i", "e");
        System.out.println(sweet3);
        System.out.println(sweet1);
        // 6)substring
        System.out.println(sweet1.substring(0, 4));

        // Arrays (non-primitive Data type)
        int physic = 98;
        int chemistry = 99;
        int maths = 100;

        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 98;
        marks[2] = 100;
        System.out.println(marks[2]);
        // length
        System.out.println(marks.length);
        // sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // 1-D Array & 2-D Array
        int[] score = {97, 98, 95};
        int[][] finalMarks = {{97, 98, 95}, {95, 95, 98}};
        System.out.println(finalMarks[1][1]);

        // casting ( implicit & explicit casting)
        double price = 100.00;
        double finalPrice = price + 18;  // ( implicit casting)
        System.out.println(finalPrice);

        int p = 100;
        int fP = p + (int)18.99; //  ( explicit casting & truncating values)
        System.out.println(fP);

        // constants
        int value = 30;
        age = 31;
        age = 32;

        final float PI = 3.14F; // using final keyword so that value doesn't get changed in future.

        // Operators ( Arithmatic( +, -, % etc...) , Assignment ( = ) , Unary ( ++, -- )
        double a = 5;
        double b = 3;
        double modulo = a % b;
        System.out.println(modulo);

        int number = 5;
        System.out.println(++number);
        System.out.println(--number);

        // Math Class( max, min, random etc...)
        // 5, 6
        System.out.println(Math.min(5, 6));
        System.out.println(Math.max(5, 6));
        System.out.println((int)(Math.random() * 100));

        // How to take INPUT?
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your Age : ");
        float val = sc.nextFloat();
        System.out.println(val);

        // Comparision Operators
        // a == b
        // a != b
        // a < b
        // a > b
        // a >= b
        // a <= b
        // if, if else

        boolean isSunUp = false;
        if (isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");

        int personage = 30;
        if(personage > 18)
            System.out.println("can vote");
        else
            System.out.println("cannot vote");

        // logical operators
        // &&
        int x = 60;
        int y = 40;

        if (x < 50 && y < 50)
            System.out.println("both less than 50");

        if (x<50 || y<50)
            System.out.println("both are less than 50");

       // conditional statement
        Scanner sca = new Scanner(System.in);
        int cash = sc.nextInt();
        if (cash < 10){
            System.out.println("cannot buy anything");
        } else if (cash > 10 && cash < 50) {
            System.out.println("can buy 1 thing");
        } else {
            System.out.println("can get both");
        }

        // switch statement
        int day = 2;

        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday - Sunday");
        }

        // Loops (for , while and dowhile loops)

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");

        // 1 - 100
        for (int i = 0; i<=100; i++){
            System.out.println(i);
        }

        // 100 - 1
        for (int i = 100; i>=1; i--){
            System.out.println(i);
        }

        // while Loop
        int i = 100;
        while (i >= 1){
            System.out.println(i);
            i = i - 1;
        }

        // Do While
        int k = 100;
        do {
            System.out.println(k);
            k = k - 1;
        } while (k >= 1);

        // break and continue
        int j = 0;
        while (true){
            if (j == 3){
                j = j + 1;
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if (i > 5) {
                break;
            }
        }

        // Try - catch in exception handling
        int[] scoredMarks = {97, 98, 95};
        try {
            System.out.println(scoredMarks[5]);
        } catch (Exception exception) {
            // do something after catching
        }
        System.out.println("The name is guddu");

        // METHODS
        printJava();
        printJava();
        printJava();
        printName("Guddu");
        printName("Manu");
        printSum(1, 6);

        // Mini Project
        Scanner scan = new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Guess my number : ");
            userNumber = scan.nextInt();

            if(userNumber == myNumber) {
                System.out.println("Wohoo .. Correct Nuber!!!");
            } else if (userNumber > myNumber) {
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
        } while (userNumber >= 0);

        System.out.print("My number was : ");
        System.out.println(myNumber);
    }
}