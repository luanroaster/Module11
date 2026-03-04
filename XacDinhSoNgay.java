package ss3_java_overview.exercise;

import java.util.Scanner;

public class XacDinhSoNgay {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao thang:");
        int thang = scanner.nextInt();
        System.out.println("Nhap vao nam: ");
        int nam = scanner.nextInt();

        switch (thang){
            case 2: if (nam % 400 == 0){
                System.out.println("So ngay thang "+thang+" nam "+nam+ " la 29");
            }else{
                System.out.println("so ngay thang "+thang+" nam "+nam+" la 28");
            }break;
            case 4:
                System.out.println("So ngay thang " +thang+" nam "+nam+ " la 30 ngay "); break;
            case 6:
                System.out.println("So ngay thang " +thang+" nam "+nam+ " la 30 ngay "); break;
            case 9:
                System.out.println("So ngay thang " +thang+" nam "+nam+ " la 30 ngay "); break;
            case 11:
                System.out.println("So ngay thang " +thang+" nam "+nam+ " la 30 ngay "); break;
            default:
                System.out.println("So ngay thang "+thang+ " la 31 ngay");
        }
    }
}
