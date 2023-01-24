package demo;

public class TestDemo {
    /*public void super(){

    }=> wrong*/

    public static void main(String[] args) {
       //valid identifiers :-
        int Salim = 10;
        int SALIM = 10;
        int Salim1234 = 10;
        int Salim_1234 = 10;
        int Salim$1234 = 10;

        boolean a = true;
        boolean b =false;

       // boolean c = 45;=> wrong
       // boolean d = 'n';=> wrong
      //  boolean e = "rytuyiu";=> wrong

        //invalid identifiers :-
       // int Salim#1234 = 10;=> wrong
        int Salim_2345 = 20;
        System.out.println(Salim_2345);
        System.out.println(Salim_1234);

        //for case sensitivity :-
        int test = 89;
        int Test = 89;
        int TEST = 89;
        int TesT = 89;

        int s$12 = 56;
        int s_12 = 56;
        System.out.println(s_12);
        //int s@12 = 56;=> wrong
        //int s#12 = 56;=> wrong

        int digitalPartrners = 12;
       // int digital partners = 12;=> wrong

        int sum2345 = 89;
        //int 2345sum = 89;=> wrong

        int $sum = 56;
        int _sum = 56;
        int $1234 = 56;
        System.out.println(_sum);

        int digitaldtdtuuygiuuiyuigyufytdtrstrgdtugiuliulguykdtrstrdfufftftftuftftyfyuf;

        //int if = 46;=> wrong
        //int return = 565;=> wrong
        //int double = 45l;=> wrong
        //int break = 90;=> wrong

    }
}
