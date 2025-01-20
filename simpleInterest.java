//program to create a simple interest

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float p = num.nextFloat(); // if its principal rate is in decimal
        int t = num.nextInt();
        int r = num.nextInt();
        float si = (p*t*r) / 100;
        System.out.println(si);

    }
}
