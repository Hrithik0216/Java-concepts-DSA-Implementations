package Patterns;

public class Floyds {
    public static void main(String[] args) {
        int rows=6;
        int count =1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count);
                count++;
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
