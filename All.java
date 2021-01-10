import Mygadget.Mobile;
import Mygadget.Laptop;
import Mygadget.*;
import Mygadget.Mobos.Android;
import Mygadget.Mobos.Windows;
import Mygadget.Lappyos.Linux;
//import Mygadget.Lappyos.Windows;

public class All {
    public static void main(String[] args) {
        Mobile o = new Mobile();
        o.dispM();
        Laptop ob = new Laptop();
        ob.dispL();
        Android obj = new Android();
        obj.dispA();
        Linux obje = new Linux();
        obje.dispL();
        Mygadget.Mobos.Windows oo = new Mygadget.Mobos.Windows();
        oo.dispW();
        Mygadget.Lappyos.Windows oj = new Mygadget.Lappyos.Windows();
        oj.dispS();

    }

}
