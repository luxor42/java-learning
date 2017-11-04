package com.luxor;
import java.util.Random;

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

        // Fahrenheit --> Celsius
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

        likePhoto(1, "hi", true);

        int roll1 = rollDice(6);
        int roll2 = rollDice(6);

        System.out.println(roll1);
        System.out.println(roll2);

        System.out.println(calculateTip(100));
        
        // Yahtzee
        int intNumRolls = keepRolling();
        System.out.println("Needed to roll " + intNumRolls + " times to get a Yahtzee");

        // While and For Loop Equivalence
        raiseAlarm(5);

        // Count Pyramid Blocks
        System.out.println("Number of blocks is " + countBlocks(3));

        // roll a six
        rollASix();

        // Arrays

        int [] numbers = {3, 1, 4, 1, 5};
        double [] fracNumbers = {3.0, 1.0, 4.0, 1.0, 5.0};
        System.out.println(numbers);
        System.out.println(fracNumbers);

    }

    // Methods in public class Main

    public static int likePhoto(int currentLikes, String comment, boolean like) {
        // prints out comment
        System.out.println("Feedback: " + comment);
        if(like) {
            currentLikes = currentLikes + 1;
        }
        System.out.println("Number of likes: " + currentLikes);

        return currentLikes;
    }


    /**
     * Dice Rolling
     * @param numSides
     * @return a value bewteen 1 and numSides
     */

    public static int rollDice(int numSides) {
        double randomNumber = Math.random();
        randomNumber = randomNumber * numSides;
        randomNumber = randomNumber + 1;
        int randomInt = (int) randomNumber;

        return randomInt;
    }

    // Yahtzee without Arrays

    /**
     * Yahtzee without arrays
     * Calls the function rollDice
     * @return the number of counts to get to a Yahtzed
     */
    public static int keepRolling() {
        // initial condition
        int dice1 = rollDice(6);
        int dice2 = rollDice(6);
        int dice3 = rollDice(6);
        int dice4 = rollDice(6);
        int dice5 = rollDice(6);
        int count = 1;

        // loop until we meet the required condition
        while(!(dice1 == dice2 && dice2 == dice3 &&
                dice3 == dice4 && dice4 == dice5)) {
            // we need to re-roll
            dice1 = rollDice(6);
            dice2 = rollDice(6);
            dice3 = rollDice(6);
            dice4 = rollDice(6);
            dice5 = rollDice(6);
            count = count + 1;
        }
        return count;
    }

    /**
     * Raise Alarm after a specific number of repetitions
     * @param numOfWarnings
     *
     */
    public static void raiseAlarm(int numOfWarnings) {
        int i = 1;
        while(i <= numOfWarnings) {
            System.out.println("Warning number " + i + " with While Loop");
            i++;
        }

        for(i = 1; i <= numOfWarnings; i++) {
            System.out.println("Warning number " + i + " with For Loop");
        }
        System.out.println("the end");
    }

    /**
     * Count blocks with a For Loop
      * @param levels
     * @return number of blocks in a pyramid with given number of levels.
     */
    public static int countBlocks(int levels) {
        int numBlocks = 0;
        for(int i = 1; i <= levels; i++) {
            numBlocks = numBlocks + i*i;
        }
        return numBlocks;
    }

    /**
     * Calculates the tip of a passed bill
     * param bill - a double
     * @return tip - 15% of the bill
      */
    public static double calculateTip(double bill) {
        double tip = bill * 0.15;
        return tip;
    }

    /**
     * Rolls a dice until you get a 6 then you win
     * If you get a 3 then you lose.
     * @return true if you win, false if you lose.
     */
    public static boolean rollASix() {
        int thisRoll = rollDice(6);
        boolean result = false;
        int counter = 1;
        while(thisRoll != 6) {
            System.out.println("rolled a " + thisRoll + " at roll " + (counter));
            if(thisRoll == 3) {
                break;
            }
            else {
                thisRoll = rollDice(6);
            }
            counter++;
        }
        if(thisRoll == 3) {
            System.out.println("LOSE: found a 3 at roll " + counter);
            return false;
        }
        else {
            System.out.println("WIN; Found a 6 at roll " + counter);
            return result;
        }
    }

}