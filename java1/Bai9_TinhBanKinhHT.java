/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai9_TinhBanKinhHT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tim ban kinh Hinh Tron ");
        //System.out.println("Tu Chu Vi ");
        //System.out.println("Tu Dien Tich");
        
        System.out.print("Nhap Chu Vi" + " ");
        double C = scanner.nextDouble();
        double r = tuChuVi(C);
        System.out.println("Ban kinh hinh tron la" + " " + r);
        
        System.out.print("Nhap Dien Tich" + " ");
        double V = scanner.nextDouble();
        double r2 = tuDienTich(V);
        System.out.print("Ban kinh hinh tron la" + " " + r2);
        
        
    }
    public static double tuChuVi(double C)
    { return C/(2*Math.PI);
    }
    public static double tuDienTich(double V)
    { return Math.sqrt(V/Math.PI);
    }
    
}
