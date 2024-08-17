package Basics;

public class Fibo {
    public static void main(String[] args){
        int a=0;
        int b=1;
        int count=5;
        int c =0;
        for(int i=0; i<=count; i++){
             c =a+b;
             a=b;
             b=c;
        }
        System.out.println(c);
    }
}
