import java.util.Random;
import java.util.Scanner;

class Practice {
    public static void main(String args[]) {
        Game obj = new Game();
        boolean b = false;
        while (!b) {
            obj.Takeuserinput();
            b = obj.Iscorrectnumber();

        }

    }
}

class Game {
    int number;
    int inputnumber;
    int noofgusses = 0;

    /* //we can run it with get or set code or without get or set code
     * public int getnoofgusses() 
     * { return noofgusses;
     * 
     * } 
     * 
     * public void setnoofgusses(int noofgusses)
     *  { this.noofgusses = noofgusses; }
     */

    Game() {

        Random ran = new Random();
        number = ran.nextInt(10);
    }

    void Takeuserinput() {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the number");
        inputnumber = ob.nextInt();

    }

    boolean Iscorrectnumber() {
        noofgusses++;
        if (inputnumber == number) {
            System.out.format("yes, you gussed it right,it was %d\n you passed it in %d attempts", number, noofgusses);
            return true;
        } else if (inputnumber < number) {
            System.out.println("to low");
            System.out.format("try bigger no\n");

        }

        else if (inputnumber > number) {
            System.out.println("to high");
            System.out.format("try small number\n");

        } 
       
        return false;
    }
}
