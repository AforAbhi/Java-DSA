package Functions;

import java.util.Scanner;

public class Primecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =in.nextInt();
        boolean answer=isPrime(n);
        System.out.println(answer);
    }
    static boolean isPrime(int n){
        if(n<1){
            return false;
        }
        int num=2;
        while (num*num<n){
            if(n%2==0){
                return false;
            }
            num++;
        }
        return(num*num>n);
    }
}
