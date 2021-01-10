
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int rem = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("enter the number to see the day");
        int key = obj.nextInt();
        while(key>365){
            System.out.println("input out year");
            break;
        }
        switch (key) {
            case 1:
                if (key == 1)
                    System.out.println("sunday");
                break;
            case 2:
                if (key == 2)
                    System.out.println("monday");
                break;
            case 3:
                if (key == 3)
                    System.out.println("tuesday");
                break;
            case 4:
                if (key == 4)
                    System.out.println("wednesday");
                break;
            case 5:
                if (key == 5)
                    System.out.println("thursday");
                break;
            case 6:
                if (key == 6)
                    System.out.println("friday");
                break;
            case 7:
                if (key == 7)
                    System.out.println("saturday");
                break;
            // case 3 -> System.out.println("monday"); formate of enhanced case statement
            // but not supported in it.
            default: {
                
                //rem = (key % 7);
                if (key % 7 == 0) {
                    System.out.println("saturday");
                } else if (key % 7 == 1) {
                    System.out.println("sunday");
                } else if (key % 7 == 2) {
                    System.out.println("monday");

                } else if (key % 7 == 3) {
                    System.out.println("tuesday");

                } else if (key % 7 == 4) {
                    System.out.println("wednesday");

                } else if (key % 7 == 5) {
                    System.out.println("thursday");
                    break;
                } else if (key % 7 == 6) {
                    System.out.println("friday");
                    // break;
                } else if (key % 7 == 7) {
                    System.out.println("saturday");
                    // break;
                }
                

            }
            
        

        }

    }
}
