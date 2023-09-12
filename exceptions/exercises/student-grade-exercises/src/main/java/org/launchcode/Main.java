package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println("Result of Divide(10, 2): " + Divide(10, 2));
//        System.out.println("Result of Divide(5, 0): " + Divide(5, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
//        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            int points = CheckFileExtension(fileName);
            System.out.println(student + " submitted " + fileName + " and received " + points + " points.");
        }
    }

    public static double Divide(double x, double y)
    {
        try {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) x / y;
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
        return Double.NaN; // Return NaN (Not-a-Number) to indicate an error
    }
    }

    public static int CheckFileExtension(String fileName)
    {
        try {
            if (fileName == null || fileName.isEmpty()) {
                throw new IllegalArgumentException("File name cannot be null or empty");
            } else if (fileName.endsWith(".java")) {
                return 1; // Student gets 1 point for a .java file
            } else {
                return 0; // Student gets 0 points for other file extensions
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return -1; // Return -1 to indicate an error
        }
    }
}