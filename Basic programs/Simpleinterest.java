package firstjava;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter principal rate and time in years respectively");
        int P = in.nextInt();
        int R = in.nextInt();
        int T = in.nextInt();

        int interest = (P*R*T)/100;
        System.out.println("The simple interest will be "+ interest);
    }
}
