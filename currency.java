//indian currency to american

import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
       Scanner rupee = new Scanner(System.in);
       int d = rupee.nextInt();
       float val = (float) (d * 0.012);
        System.out.println(val);

    }
}
