//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r= in.nextInt();
        double area= areaofcircle(r);
        System.out.println("The area of the circle will be "+area);
        double circ=circumference(r);
        System.out.println("The circumference of the circle will be"+circ);
    }
    static double areaofcircle(int r) {
        double a= 3.14*r*r;
        return a;
    }
    static double circumference(int r){
       double c=2*3.14*r;
        return c;
    }


}
