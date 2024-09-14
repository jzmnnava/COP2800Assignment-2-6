// This program prints calculates the gratuity and total

import java.util.Scanner;

public class GratuityAndTotal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Input Value
    System.out.print("Enter the subtotal and a gratuity rate: "); 
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();

//Calculate the gratuity and total 
    double gratuity = (gratuityRate/100.0) * subtotal;
    double total = gratuity + subtotal;
    System.out.println("The gratuity is " + "$" + gratuity + " and total is " + "$" + total);
    }
}