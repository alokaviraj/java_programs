// Q1. wap to find out the type of website from thw url
//         .com==commerical website
//          .in== india website
//          .org==origination website




import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        System.out.println("enter you website name");
        String website = obj.nextLine();
        if (website.endsWith("org")) {

            System.out.println("this is a orginational website");
        } else if (website.endsWith("in")) {
            System.out.println("this is a indian website");

        } else if (website.endsWith("com")) {
            System.out.println("this is a commerical website");

        }

    }
//   Q2. Wap to calculate 
//   float a=7/4*9/2;


//   float a=7/4f*9/2f;
//   System.out.println(a);

//  Q3. input number is greater or
 
//  Scanner obj = new Scanner(System.in);
//  int a=10;
//  System.out.println("enter ur no.");
//  int num=obj.nextInt();
//  if(a>num)
//  {
//     System.out.println("input is lesser than number");
//  }
//  else{
//     System.out.println("input is greater than number");
//  }

//  //Q4. Wap to calculate v(2)square - u(2) square / 2*a*s
//  Scanner obj = new Scanner(System.in);
//  float v=obj.nextFloat();
//  float u=obj.nextFloat();
//  float a=obj.nextFloat();
//  float s=obj.nextFloat();
//  System.out.println((v*v-u*u)/(2*a*s));
 




// }}
