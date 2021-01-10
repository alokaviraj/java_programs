
// nesting of instance method
/*class Method 
{
    public static void main(String args[])
    {
        Test obj=new Test();
        System.out.println("hello the iput is fixed");
        obj.disp();
    }
    
}
class Test
{
    int add()
    {
        int a=20, b=10;
        int c=a+b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        return c;
    }
    void disp()
    {
        int x=add();
        System.out.println("sum of number="+x);
    }
}*/
//2nd example of nesting of instance method
/*class Method 
{
    public static void main(String args[])
    {
        Test1 obj=new Test1();
        System.out.println("answer");
        obj.disp();
    }
    
}
class Test
{
    int add()
    {
        int a=20, b=30;
        int c=a+b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        return c;
    }
}    
class Test1
{
    void disp()
    {
        Test ob=new Test();
        //ob.add();
       // System.out.println("sum of number="+ob.add());
        int x=ob.add();
        System.out.println("sum of number="+x);
    }
}*/

//3rd example of method
import java.util.Scanner;

class Method {
    public static void main(String[] args) {

        Test1 ob = new Test1();
        ob.data();
        ob.disp();

    }
}

class Test {
    String name;
    int age;

    void data() {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter your name::");
        name = obj.nextLine();
        System.out.print("enter your age ::");
        age = obj.nextInt();
    }
}

class Test1 extends Test {
    void disp() {
        System.out.println("u entered");
        System.out.println("Name=" + name);
        System.out.println("age=" + age);

    }
}
