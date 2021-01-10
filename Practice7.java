import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str, result = "";
        int count;
        char ch;
        System.out.println("enter your string");
        str = obj.nextLine();
        str = "" + str;
        count = str.length();
        for (int i = 0; i < count; i++) {

            ch = str.charAt(i);
            if (ch ==' ') {
                result += ch;
                i++;
                ch = Character.toUpperCase(str.charAt(1));
                result += ch;

            } else {
                ch = Character.toLowerCase(str.charAt(i));
            
            result += ch;
            }

        }
        System.out.println(result.substring(1));

    }

}
