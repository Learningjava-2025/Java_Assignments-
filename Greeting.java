// create greeting message with the person name

import java.util.Scanner;
public class Greeting{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        System.out.println("Hi, " + name + " Good Day!");
    }
}
