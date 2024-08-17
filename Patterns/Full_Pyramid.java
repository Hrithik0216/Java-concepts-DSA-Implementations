package Patterns;

public class Full_Pyramid {
    public static void main(String[] args) {
        int rows =5;
        for(int i=0;i<rows;i++){
            for(int k=0;k<rows-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
