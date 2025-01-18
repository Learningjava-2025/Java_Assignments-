// to check whether the number is odd or even

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner inp= new Scanner(System.in);
      int num = inp.nextInt();
      if(num % 2 == 0){
          System.out.println(num + " " + " is EVEN");
      }else{
          System.out.println(num + "" + " is ODD" );
      }
    }
}