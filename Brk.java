public class Brk {
    public static void main(String args[]) {
        {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 2) {
                        break;
                    }
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
