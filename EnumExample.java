package com.assignment;

import java.util.Scanner;

public class EnumExample {
    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        new EnumExample().initialize();
    }

    public void initialize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the DAY value from 1 to 7:");
        int dayValue = input.nextInt();
        input.close();  

        if (dayValue <= 0 || dayValue > 7) {
            System.out.println("Please enter a day from 1 to 7");
            return;
        } 
        else {
            System.out.println(day(dayValue));
        }
    }

    private String day(int dayValue) {
        switch (dayValue) {
            case 1:
                return Weekday.MONDAY.name();
            case 2:
                return Weekday.TUESDAY.name();
            case 3:
                return Weekday.WEDNESDAY.name();
            case 4:
                return Weekday.THURSDAY.name();
            case 5:
                return Weekday.FRIDAY.name();
            case 6:
                return Weekday.SATURDAY.name();
            case 7:
                return Weekday.SUNDAY.name();
            default:
                return "Invalid day";
        }
    }
}

