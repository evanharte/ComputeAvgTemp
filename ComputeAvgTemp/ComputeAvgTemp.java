package ComputeAvgTemp;

//Calculate the avarage temperature, and give how many days are above the average temperature

//  1. taka an input from the user (eg 8)
//  2. promt the user to enter all the 8 numbers
//  3. calculate the average temperature
//  4. Given the avarage tempeture, how many of the numbers in line 2 are above the average temperature

import java.util.Scanner;
import java.util.Arrays;

public class ComputeAvgTemp {
  public static void main(String[] args) {
    double[] temps = new double[8];
    double sum = 0;

    System.out.println();
    for (int i = 0; i < temps.length; i++) {
      try {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature " + (i + 1) + ": ");
        double num = input.nextDouble();
        temps[i] = num;
        sum += num;
      } catch (Exception e) {
        System.out.println("Invalid input. Please enter a valid floating point number.");
        i--;
      }
    }

    System.out.println();
    System.out.println(Arrays.toString(temps));

    double avg = sum / temps.length;
    System.out.println("The average temperature is: " + avg + " degrees"); 

    int tempsCtr = 0;

    for (int i = 0; i < temps.length; i++) {
      if (temps[i] > avg) {
        tempsCtr++;
      }
    }

    System.out.println("Number of temperatures above average: " + tempsCtr);
    System.out.println();
  }

}