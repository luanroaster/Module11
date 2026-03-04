package ss3_java_overview.exercise;

import java.util.Scanner;

public class For {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhao vao hang: ");
        int hang = scanner.nextInt();
        System.out.println("Nhap vao cot: ");
        int cot = scanner.nextInt();

        for (int i = 1; i<= hang ; i++){
            for (int j = 1; j <= cot ; j++){
                if (j<=i ){
                    System.out.println("* ");
                }else {
                    System.out.println(" ");
                }
            }
        }
        System.out.println();

    }
}
