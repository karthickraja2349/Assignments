package com.assignment;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException; 
//  I use printwriter rather than usual system.out.println
//  i handle InputMismatchException to avoid overflow and underflow of byte values  
//  i performed narrowing and widening 
public class TypeConversion {
    private PrintWriter writer;

    public static void main(String[] args) {
        new TypeConversion().initialize();
    }

    public void initialize() {
        writer = new PrintWriter(System.out, true);
        Scanner input = new Scanner(System.in);
        byte b = 0;
        boolean validInput = false;

        while (!validInput) {
            writer.write("Enter the number in the range of -128 to 127:\n");
            writer.flush();

            try {
                b = input.nextByte();
                validInput = true;
            } 
            catch (InputMismatchException e) {
                writer.write("Invalid input. Please enter a valid byte value.\n");
                writer.flush();
                input.nextLine();
            } 
            catch (Exception e) {
                writer.write("An unexpected error occurred: " + e.getMessage() + "\n");
                writer.flush();
                input.nextLine();
            }
        }

        writer.write("Byte value: " + b + "\n");
        narrowing(b);

        writer.flush();
        writer.close();
        input.close();
    }

    private void narrowing(byte b) {
        short shortValue = byteToShort(b);
        int intValue = shortToInt(shortValue);
        char charValue = shortToChar(shortValue);
        long longValue = intToLong(intValue);
        float floatValue = intToFloat(intValue);
        double doubleValue = longToDouble(longValue);
        writer.write("------------------------------------"+"\n");
        writer.write("Short: " + shortValue + "\n");
        writer.write("Char: " + charValue + "\n");
        writer.write("Int: " + intValue + "\n");
        writer.write("Float: " + floatValue + "f\n");
        writer.write("Long: " + longValue + "l\n");
        writer.write("Double: " + doubleValue + "\n");

        writer.write("------------------------------------"+"\n");
        // Call methods for widening conversions
        writer.write("------------------------------------"+"\n");
        writer.write("Converted values:\n");
        writer.write("Float from double: " + doubleToFloat(doubleValue) + "f\n");
        writer.write("Int from float: " + floatToInt(floatValue) + "\n");
        writer.write("Short from int: " + intToShort(intValue) + "\n");
        writer.write("Char from short: " + shortToChar(shortValue) + "\n");
        writer.write("Byte from char: " + charToByte(charValue) + "\n");
        writer.write("------------------------------------"+"\n");
    }

    private short byteToShort(byte b) {
        return (short) b;
    }

    private int shortToInt(short s) {
        return (int) s;
    }

    private long intToLong(int i) {
        return (long) i;
    }

    private float intToFloat(int i) {
        return (float) i;
    }

    private double longToDouble(long l) {
        return (double) l;
    }

    private char shortToChar(short s) {
        return (char) s;
    }

    // methods for  widening conversions
    private float doubleToFloat(double d) {
        return (float) d;
    }

    private int floatToInt(float f) {
        return (int) f;
    }

    private short intToShort(int i) {
        return (short) i;
    }

    private byte charToByte(char c) {
        return (byte) c;
    }
}

