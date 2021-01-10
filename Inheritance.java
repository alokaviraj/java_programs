
//single inheritance

/*class Inheritance {
    public static void main(String args[]) {
        Son obj = new Son();
        obj.data(255, 5);
        obj.disp();

    }
}

class Father {
    int x, y;

    void data(int a, int b) {
        x = a;
        y = b;
    }
}

class Son extends Father {

    int add() {
        int sum = x + y;
        return sum;
    }

    void disp() {
        System.out.println("a=" + x);
        System.out.println("b=" + y);
        System.out.println("sum=" + add());
    }

}*/

//Multi-level inheritance

/*class Inheritance {
    public static void main(String args[]) {
        Grandson obj = new Grandson();
        obj.data(255, 5);
        obj.disp();

    }
}

class Father {
    int x, y;

    void data(int a, int b) {
        x = a;
        y = b;
    }
}

class Son extends Father {
    int c = -30;

    int add() {
        int sum = x + y + c;
        return sum;
    }
}

class Grandson extends Son {

    void disp() {
        System.out.println("a=" + x);
        System.out.println("b=" + y);
        System.out.println("c=" + c);
        System.out.println("sum=" + add());
    }

}*/


//Hierarchical inheritance

class Inheritance {
    public static void main(String args[]) {
        Son obj = new Son();
        obj.data(255, 5);
        obj.disp();
        Daughter ob=new Daughter();
        ob.data(50,-10);
        ob.disp();
        Son1 o=new Son1();
        o.data(5,6);
        o.disp();


    }
}

class Father {
    int x, y;

    void data(int a, int b) 
    {
        x = a;
        y = b;
    }
}

class Son extends Father {
    int c = -30;

    int add() {
        int sum = x + y + c;
        return sum;
    }
    final void disp() {
        System.out.println("a=" + x);
        System.out.println("b=" + y);
        System.out.println("c=" + c);
        System.out.println("sum=" + add());
    }

}
class Daughter extends Father
{
    int sub()
    {
        return(x+y);
    }
    void disp()
    {
        System.out.println("a=" + x);
        System.out.println("b=" + y);
        System.out.println("sub=" + sub()); 
    }
}
class Son1 extends Father
{
    int mult()
    {
        return(x*y);
    }
    void disp()
    {
        System.out.println("a=" + x);
        System.out.println("b=" + y);
        System.out.println("mult=" + mult()); 
    }

}

