package Functions;

import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers respectively");
        int firstNumber = in.nextInt();
        int SecondNumber = in.nextInt();
        int sum1=sum(firstNumber,SecondNumber);
        System.out.println(sum1);
    }

    static int sum(int firstNumber, int SecondNumber) {
        int Sumof = firstNumber + SecondNumber;
        return Sumof;
    }


}
