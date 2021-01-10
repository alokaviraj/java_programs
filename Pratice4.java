
//Q. String and Buffer
class Pratice4{
    public static void main(String[] args) {
        //concat used in string class
        String a=("alok singh");
        a=a.concat(" singh");
        System.out.println(a);
        String str=new String("alok");
        str=str.concat("ji");
        
        //append use in Buffer class
        StringBuffer st=new StringBuffer("alok");  
        st.append("jiiiiii");
        System.out.println(str);
        System.out.println(st);
        
        // string LENGTH
        String b=("alok singh");
        int n=b.length();
        System.out.println(n);
        System.out.println(b.length());
        
        
        // String Constructor
        String x=new String();   //creates an empty object
        System.out.println("Length="+x.length());
        //next
        char ch[]={'a','b','c','d'}; 
        String y=new String(ch);
        System.out.println(y);
        System.out.println("Length="+y.length());
        //output== abcd
        
        //next
        byte p[]={97,102,110,65}; 
        String q=new String(p);
        System.out.println(q);
        System.out.println("Length="+q.length());
        //output== afnA
    }
}