package com.company;

public class Test {
   public int z = 90;
   String y = null;

    public static void add(){
        int num1 = 1;
        int num2 = 2;
        System.out.println(num1+num2);
        System.out.println(10+20);
        System.out.println(2+2);
    }

    /*void public(){

    }*/



    public static void main(String[] args) {
        System.out.println("public");
        System.out.println(2);
        System.out.println(2+3);

        //these are set of variables having different values
        int a = 10;//5
        int b = 20;
        String s = "testing";//7
        char c = '#';

        System.out.println(a);//9
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);

        add();//4

        //int public = 10;=>wrong


    }
}
