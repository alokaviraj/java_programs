
//One interface can be implemented in a single Class

/*class Interface {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.d();
        obj.disp();

    }

}

interface Father {
    int a = 101;

    void disp();
}

class Son implements Father {
    int sum = 10 + Father.a;
    public void disp()
    {
        System.out.println("sum=");

    }

   void d()
    {
        System.out.println("sum="+sum);
    }
}*/


//One class implements more than one interface
/*class Interface {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.disp();
        obj.add();

    }

}

interface Father {
    int a = 101;

    void disp();
}
interface Mother
{
    int mark=100;
    void add();
}

class Son implements Father,Mother {
    int sum = 10 + Father.a;
    public void disp()
    {
        System.out.println("sum="+sum);

    }

   public void add()
    {
        System.out.println("mark="+mark);
    }
}*/

//Multiple inheritance using intrface
class Father
{
    int a=10;
    int add(int y)
    {
        int b=y;
        return a+b;

    }
}
interface Mother
{
    int c=10;
    void disp();
}
class Son extends Father implements Mother
{
    int mult=a* Mother.c;
    int sum= add(5);
    public void disp()
    {
        System.out.println("sum="+sum);
        System.out.println("mult="+mult);
    }
}
class Interface
{
    public static void main(String[] args) {
        Son obj =new Son();
        obj.disp();
        
    }
}