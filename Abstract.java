//calling abstract super class object by reference

class Abstract {
    public static void main(String[] args) {
        Son s=new Son();
        Father f;
         f=s;
        f.disp();
        s.disp();
        
    }
    
}
abstract class Father
{
    abstract void disp();
}
class Son extends Father{
    void disp()
    {
        System.out.println("hello");
    }

}
