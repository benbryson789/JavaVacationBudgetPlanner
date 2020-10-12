package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the vacation budget planner");
        System.out.println("What is your name:");
        String name = scanner.nextLine();
        System.out.println("Hello" + " " + name + " " + "Choose a place to travel:");
        System.out.println("Choose Mexico or Jamaica");
        String place1 = scanner.nextLine();
        switch (place1.toLowerCase()) {
            case "jamaica":
                System.out.println(place1);
                System.out.println("Great! Jamaica sounds like an amazing trip!");
                System.out.println("********");
                System.out.println("How many days do you want to spend in Jamaica:");
                int days = scanner.nextInt();
                System.out.println("How much in USD to you plan to spend on the trip:");
                double moneyAmount = scanner.nextDouble();
                int hours = days * 24;
                int minutes = hours * 60;
                System.out.println("The total time in Jamaica is" + " "+  hours + " " + "hours");
                System.out.println("The total minutes in Jamaica is" + " "+ minutes  + " " + "minutes");
                double dayAverage =  moneyAmount / days;
                double dayJMD = moneyAmount * 138.05;
                double jmdAverage = dayAverage / days;
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                System.out.println(("Your total expenditures of $" + decimalFormat.format(moneyAmount)));
                System.out.println("Your daily average amount is $" + decimalFormat.format(dayAverage) +" " + " each day");
                System.out.println("Your JMD daily amount is"+" "+ dayJMD);
                System.out.println("Your JMD average amount is"+" "+ jmdAverage);
                System.out.println("Enjoy your trip");
                break;
            //System.out.println(place1);
            case "mexico":
                System.out.println(place1);
                System.out.println("Great! Mexico sounds like an amazing trip!");
                System.out.println("********");
                System.out.println("How many days do you want to spend in Mexico:");
                int days1 = scanner.nextInt();
                System.out.println("How much in USD to you plan to spend on the trip:");
                double moneyAmount1 = scanner.nextDouble();
                int hours1 = days1 * 24;
                int minutes1 = hours1 * 60;
                System.out.println("The total time in Mexico is" + " "+  hours1+ " "+ "hours");
                System.out.println("The total minutes in Mexico is" + " "+ minutes1  +" " + "minutes");
                double dayAverage1 =  moneyAmount1 / days1;
                double dayPeso = moneyAmount1 * 23.68;
                double pesoAverage = dayAverage1 / days1;
                DecimalFormat dformat1 = new DecimalFormat("#.##");
                System.out.println(("Your total expenditures of $" + dformat1.format(moneyAmount1)));
                System.out.println("Your daily average amount is $" + dformat1.format(dayAverage1) +" " + " each day");
                System.out.println("Your peso daily amount is"+" "+ dayPeso);
                System.out.println("Your peso average amount is"+" "+ pesoAverage);
                System.out.println("Enjoy your trip");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }
}