
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
public class Bai7_HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh (r)");
        double r = scanner.nextDouble();
        double ChuVi = chuVi (r);
        double DienTich = dienTich(r);
        
        System.out.println("Chu vi hinh tron la :" + ChuVi);
        System.out.println("Dien tich hinh tron la :" + DienTich);
        
        
    }
    public static double chuVi(double r)
    { return 2*Math.PI*r;
    }
    public static double dienTich (double r)
    { return Math.PI*(r*r);
    }
}
