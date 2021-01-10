// Wap to add two no. with help of method

class Student {
    int a, b, total;

    void add() {
        total = a + b;
    }
}

class First {
    public static void main(String argu[])
    {
        Student obj = new Student();
        obj.a = 500;
        obj.b = 10;
        obj.add();
        System.out.println("a="+obj.a);
        System.out.println("b="+obj.b);
        System.out.println("sum=" + obj.total);
    }
}