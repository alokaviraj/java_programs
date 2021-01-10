// Wap to add two no.

import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        int a,b,total;
        System.out.print("enter the value of a=");
        a=obj.nextInt();
        System.out.print("enter the value of b=");
        b=obj.nextInt();
        total=a+b;
        System.out.print("sum="+total);


        
    }
}