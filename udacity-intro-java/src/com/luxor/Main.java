package com.luxor;

public class Main {

    public static void main(String[] args) {
        // Simple variable math and output
        double maths = 97.5;
        double english = 98;
        double science = 83.5;
        double drama = 75;
        double music = 96;
        double sum = maths + english + science + drama + music;
        double average = sum / 5;
        System.out.println(average);

        int bankBalance = 500;
        bankBalance += 250;
        bankBalance -= 100;
        System.out.println(bankBalance);

        int day;
        String month;
        day = 18;
        month = "September";
        System.out.println(month + " " + day);

        String firstName = "Ryan";
        String lastName = "Luck";
        String fullName = firstName + " " + lastName;
        System.out.println("Hello, my name is " + fullName);
        System.out.println("There are " + (firstName.length() + lastName.length()) + " letters in my name.");
        System.out.println("Hello " + (1+3) + "all");

        double fahrenheit = 82;
        double celsius = (fahrenheit - 32.0) * 5 / 9;
        System.out.println(fahrenheit + " deg F = " + celsius + " deg C");

        boolean isCold = true;
        if(isCold) {
            System.out.println("It's cold, wear a coat!");
        }

        boolean isLightGreen = false;
        boolean isLightYellow = true;
        isLightGreen = false;
        if(isLightGreen) {
            double carSpeed = 100;
            System.out.println("Drive!");
            System.out.println("Accelerate to " + carSpeed);
        }
        //carSpeed = carSpeed - 10; // Error!
        else if(isLightYellow) {
            System.out.println("Hurry!");
        }
        else {
            System.out.println("Stop!");
        }

        boolean isRaining = true;
        if(isRaining) {
            System.out.println("Windshield Wipers On");
        }

    }



}
