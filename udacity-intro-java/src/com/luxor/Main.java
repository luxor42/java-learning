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
        String my_month;
        day = 18;
        my_month = "September";
        System.out.println(my_month + " " + day);

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

        // Automated discount program
        int ticketPrice = 10;
        int age = 20;
        boolean isStudent = true;

        if(age <= 15 || age > 60 || isStudent) {
            ticketPrice = 5;
        }

        System.out.println("Ticket Price is " + ticketPrice);


        int passcode = 629;
        String coffeeType;
        switch(passcode) {
            case 555: coffeeType = "Espresso";
                break;
            case 312: coffeeType = "Vanilla latte";
                break;
            case 629: coffeeType = "Drip coffee";
                break;
            default : coffeeType = "Unknown";
                break;
        }
        System.out.println(coffeeType);

        int month = 36;
        String monthString;
        switch(month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "May";
                break;
            case 6: monthString = "June";
                break;
            case 7: monthString = "July";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month: " + month;
        }
        System.out.println(monthString);

    }




}
