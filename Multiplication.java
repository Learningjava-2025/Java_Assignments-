import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 0;
        for(int i=1; i<=10;i++){
            mul = i*n;
            System.out.print(mul+ " ");
        }
    }
}
