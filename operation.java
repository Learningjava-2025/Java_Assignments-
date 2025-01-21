//calculator program(operations)

import java.util.Scanner;
public class operation {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first two numbers: ");
        float x = num.nextFloat();
        float y = num.nextFloat();
        System.out.println("please enter from  the operation +,-,*,/");
        char op = num.next().charAt(0);
        if( op == '+'){
            float result = x+y;
            System.out.println(result);
        }
        else if( op == '-'){
            float result = x-y;
            System.out.println(result);

        }
        else if( op == '*'){
            float result = x*y;
            System.out.println(result);
        }
        else if( op == '/'){
            float result = (int) x/y;
            System.out.println(result);
        }
        else{
            System.out.println("Invalid operation, Please check again");
        }
    }
}
