package firstjava;

import java.util.Scanner;

public class Currencyconvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in rupees" );
        float Rupee = in.nextFloat();
        float dollar= (float) (Rupee/ 73.50);
        System.out.println("Amount in dollars will be " +dollar );
    }
}
