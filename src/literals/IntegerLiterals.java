package literals;

public class IntegerLiterals {
    public static void main(String[] args) {
        //decimal literal :-
        int a = 2;
        int b = 9;

        System.out.println("Integer Literals : "+a+" "+b);

        //binary literals :-
        int c = 0b01;
        int d = 0B01010;
       // int e = 0b201;=>wrong

        System.out.println("Binary Literals : "+c+" "+d);

        //octal literals :-
        int e = 0145;
        int f = 0367;
        //int g = 0897;=>wrong

        System.out.println("Octal Literals : "+e+" "+f);

        //hexadecimal literals :-
        int g = 0xC9;
        int h = 0XFF;
        int i = 0xab;
        int j = 0Xdd;

        //int k = 0xiJ;=>wrong
        //int k = abcd;=>wrong

        System.out.println("Hexadecimal Literals : "+g+" "+h+" "+i+" "+j);
    }
}
