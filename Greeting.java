package firstjava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name= in.nextLine();
        System.out.println(" Welcome "+ name +" You are now a programmer ");
    }
}
