package com.luxor;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int passengers;
        passengers = 0;

        passengers = passengers + 5;
        passengers = passengers - 2;
        passengers = passengers - 1 + 5;

        String driver;
        driver = "Ryan";
        //driver = 5;
        int letters = driver.length();
        System.out.println(letters);
        driver = driver.toUpperCase();
        System.out.println(driver);

        int fare;
        int stops;
        fare = 15;
        stops = 3;

        String driverFirstName;
        driverFirstName = "Hamish";
        String driverLastName;
        driverLastName = "Blake";
        String driverFullName = driverFirstName + driverLastName;
        System.out.println(driverFullName);
        driverFullName = driverFirstName + ' ' + driverLastName;
        System.out.println(driverFullName);
        System.out.println("The bus made $"+fare+" after "+stops+" stops");

        System.out.println(passengers);
        System.out.println("Java Rocks!");
        System.out.println(2+3);

    }
}
