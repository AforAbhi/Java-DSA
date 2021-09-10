//Define a method that returns the product of two numbers entered by user
package Functions;

import java.util.Scanner;

public class Productoftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int pro=product(a,b);
        System.out.println(pro);
    }
    static int product(int a, int b){
        int p= a*b;
        return p;
    }
}
