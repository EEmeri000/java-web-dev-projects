package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the width of the rectangle:");
    Double width = input.nextDouble();

    System.out.println("Please enter the height of the rectangle:");
    Double height = input.nextDouble();

    Double area = width * height;
    System.out.println("The area of the rectangle is " + area + ".");
}
}

