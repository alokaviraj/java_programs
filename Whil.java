//while loop example

import java.util.Scanner;

public class Whil {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int i = 0, n;

        System.out.println("enter 0 to end the program");
        System.out.print("enter any integer key :");
        n = obj.nextInt();
        while (i <= n) {

            if (n == 0) {
                System.out.println("program end");
                break;
            }
            System.out.println("your number is::" + i);
            i++;
        }

    }

}