
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package firstjava;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the numbers respectively");
        float a = in.nextInt();
       float b = in.nextInt();
        System.out.println("Enter the operation \n 1 for addition  \n 2 for subtraction \n 3 for Multiplication  \n 4 for division");
        int op = in.nextInt();
       float result=0;
        if(op==1){
            result=a+b;
        }else if(op==2){
            result=a-b;
        }else if(op==3) {
            result = a * b;
        } else if(op==4){
            result=a/b;
        }else {
            System.out.println("Enter valid operation");
        }
        System.out.println(result);
    }
}
