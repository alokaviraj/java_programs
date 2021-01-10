//Q print any string by user input but the 1st letter of String is capital


import java.util.Scanner;
 class Practice6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String l,m;
        System.out.println("enter ur string");
        l=obj.nextLine();
        m=obj.nextLine();
        //to capital 1st letter 
        String str=l.substring(0,2).toUpperCase() +l.substring(1);
        String st=m.substring(0,1).toUpperCase() +m.substring(1);
        System.out.println("you entered");
        System.out.println(str);
       System.out.println(st);
        
    }
    
}
