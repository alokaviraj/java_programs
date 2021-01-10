import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        int a;
        float b;
        String str;
        Scanner obj = new Scanner(System.in);
        System.out.print("enter string=");
        str = obj.nextLine();
        System.out.print("enter integer=");
        a = obj.nextInt();
        System.out.print("enter float=");
        b = obj.nextFloat();
        System.out.print("enter string=");
        str = obj.next();
        System.out.println("string=" + str);
        System.out.println("integer=" + a);
        System.out.println("string=" + b);
        System.out.println("string=" + str);

    }

}
