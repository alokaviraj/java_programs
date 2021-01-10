
//swifting

public class Practice8 {
    public static void main(String[] args) {
       /* int x,y;
        x=5>>2;
        y=x>>>2;
        System.out.println(y);*/


        // ==operator

        String st1="alok kumar";
        String st2="alok kumar";
        System.out.println(st1==st2);

        //it gives false output because the both string create in heap area and the both point the another 
        // variable so it gives false output
        String st=new String("alok");
        String st3=new String(" alok");
        String st4=" alok";
        String st5=" alok";
        System.out.println(st==st3); 
        System.out.println(st==st4); // it also gives false otput bcoz st is in heap area but st4 is 
        // in scp area so it does not point same object
        System.out.println(st4==st5); // it gives true bcoz it points same object of scp area.

        StringBuffer sb=new StringBuffer("alok");
        sb.trimToSize();
        System.out.println(sb.capacity());
        
    }
    
}
