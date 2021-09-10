//Define a program to find out whether a given number is even or odd.
package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        result(n);
    }
    static void result(int n){
        if(n%2==0) {
            System.out.println("Even number");
        }
                else
                System.out.println("Odd number");
            }
        }