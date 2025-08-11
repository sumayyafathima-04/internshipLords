package main.java.internship.fan;

import java.util.ArrayList;
import java.util.Scanner;

public class FanDemo {
    public static void main(String[] args) {
        ArrayList<Fan> fanArrayList = new ArrayList<Fan>();

        int i = 1;
        while (i <= 180) {
            Fan f = new Fan();
            fanArrayList.add(f);
            i++;
        }

        System.out.println("No of fans in the warehouse: " + fanArrayList.size());
        Scanner sc = new Scanner(System.in);
        boolean outerRunning = true;
        while (outerRunning == true) {
            System.out.println("Enter the fan number to test: ");
            int fanSelected = sc.nextInt();
            Fan f1 = fanArrayList.get(fanSelected);
            boolean running = true;
            while (running == true) {
                System.out.println("---main.java.internship.fan.Fan Controls----");
                System.out.println("1.Switch on the main.java.internship.fan.Fan");
                System.out.println("2.Switch off the main.java.internship.fan.Fan");
                System.out.println("3.Increase the main.java.internship.fan.Fan Speed");
                System.out.println("4.Decrease the main.java.internship.fan.Fan Speed");
                System.out.println("5.To select another main.java.internship.fan.Fan");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        if (f1.isSwitchOn() == false) {
                            System.out.println("Starting the fan");
                            f1.switchOnTheFan();
                        } else {
                            System.out.println("main.java.internship.fan.Fan is already running");
                        }
                    }
                    case 2 -> {
                        f1.switchOffTheFan();
                        System.out.println("main.java.internship.fan.Fan is switched off ");
                    }
                    case 3 -> {
                        f1.increaseSpeed();
                        System.out.println("main.java.internship.fan.Fan speed is: " + f1.getSpeed());
                    }
                    case 4 -> {
                        f1.decreaseSpeed();
                        System.out.println("main.java.internship.fan.Fan speed is: " + f1.getSpeed());
                    }
                    case 5 -> {
                        running = false;
                        //System.out.println("");
                    }
                }
            }
        }
    }
}
