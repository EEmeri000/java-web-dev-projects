package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the Circle:");
        Double area = Circle.getArea(input.nextDouble());
        System.out.println("The area of the Circle is " + area + ".");

    }
}
