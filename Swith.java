import java.util.Scanner;

public class Swith {
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
         int n;
         System.out.print("enter the value of n (1to7)=");
        switch (n=obj.nextInt()) {
            case 1: {
                System.out.println("monday");
                break;
            }
            case 2: {
                System.out.println("tuesday");
                break;
            }
            case 3: {
                System.out.println("wed");
                break;
            }
            case 4: {
                System.out.println("thu");
                break;
            }
            case 5: {
                System.out.println("fri");
                break;
            }
            case 6: {
                System.out.println("sat");
                break;
            }
            case 7: {
                System.out.println("sun");
                break;
            }

            default: {
                System.out.println("Wrong input");
            }
        }
    }

}
