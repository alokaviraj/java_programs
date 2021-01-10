// write a program to calculate  percentage of a given studet 
//in CBSE board exam .his marks for 5 sub must be taken as input from the keyboard

import java.util.Scanner;

public class CBSEMARKS {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("enter the number of subject");
        int n = obj.nextInt();
        int marks[] = new int[n];
        for (int i =0; i <marks.length; i++) {
            System.out.format("enter the marks of subject");
            marks[i] = obj.nextInt();
        }
        System.out.println("you entered");
        for (int i = 0; i < marks.length; i++)
            System.out.println(marks[i]);
            System.out.println("you entered");
        for (int i = 0; i < marks.length; i++)
        {
            marks[i]+=marks[i];
            System.out.println(marks[i]);
        }

        }

    }

