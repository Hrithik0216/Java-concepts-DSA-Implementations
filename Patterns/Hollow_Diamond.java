package Patterns;

public class Hollow_Diamond {
    public static void main(String[] args) {
        int rows = 5;

        // Upper half of the hollow diamond
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower half of the hollow diamond
        for (int i = rows - 2; i >= 0; i--) {
            for (int k = 0; k < rows - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
