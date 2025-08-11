package main.java.internship.inputoutput;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Input value: " + input);
        String inputString = sc.nextLine();
    System.out.println("Input value: " + inputString);
    }
}
