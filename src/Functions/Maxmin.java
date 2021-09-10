
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
package Functions;

import java.util.Scanner;


public class Maxmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int minimum = min(a,b,c);
        System.out.println(minimum);
    }
   static int min(int a, int b, int c){
        if((a<b)&&(a<c)){
            return a;
        }else if((b<c)&&(b<a)){
            return b;
        }else return c;
    }
    static int max(int a, int b, int c){
        if((a>b)&&(a>c)){
            return a;
        }else if((b>a)&&(b>c)){
            return b;
        }else return c;
    }
}
