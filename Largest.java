//Take 2 numbers as input and print the largest number
package firstjava;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a + " is larger than " +b);
        } else {
            System.out.println(b + " is larger than " +a);
        }
    }
}
