//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 =0;
        int num2 = 1;
        int count=2;
        System.out.print(num1+" ");
        System.out.print(num2+ " ");
        while(count <= n){
            int temp = num2;
            num2 += num1;
            num1 = temp;
            count++;

            System.out.print(num2+ " ");
        }




    }
}
