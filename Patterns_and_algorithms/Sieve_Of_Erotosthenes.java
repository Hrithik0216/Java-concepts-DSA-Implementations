package Patterns_and_algorithms;

public class Sieve_Of_Erotosthenes {
    public static void main(String[] args) {
        int n=10;
        boolean[] prime = new boolean[n+1];
        for(int i=2; i<Math.sqrt(n);i++){
            for(int j=i*i;j<=n;j=j+i){
                if(prime[j]==false){
                    prime[j]=true;
                }
            }
        }
        for(int k=2;k< prime.length;k++){
            if(prime[k]==false){
                System.out.print(k+" ");
            }
        }
    }
}
