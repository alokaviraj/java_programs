/*public class Finalkey {
    public static void main(String[] args) {
        
        Test obj=new Test();
        int a=10;
        int c=a+obj.roll;
        System.out.println("Roll="+obj.roll);
        System.out.println("Roll="+c);
    }
}
class Test
{
    final int roll;
     Test()
    {
        roll=100;
    }
}*/

//Final key with method

/*public class Finalkey{
    public static void main(String[] args) {
        Father f=new Father();
        f.disp();
        Son s=new Son();
        s.disp();
        
    }
}
class Father 
{
    int a,b;
    int add()
    {
        a=10;
        b=20;
        return a+b;
    }
    final void disp()
    {
      
        System.out.println("sum="+add());
    }
    
}
class Son extends Father
{
   void disp()
   {
       add();
       int d=a+b;
    System.out.println("Roll="+d);
   }


}*/


// Final key with class

public class Finalkey{
    public static void main(String[] args) {
        Father f=new Father();
        f.disp();
        Son s=new Son();
        s.disp();
        
    }
}
final class Father 
{
    int a,b;
    int add()
    {
        a=10;
        b=20;
        return a+b;
    }
     void disp()
    {
      
        System.out.println("sum="+add());
    }
    
}
class Son extends Father
{
   void disp()
   {
       add();
       int d=a+b;
    System.out.println("Roll="+d);
   }


}
