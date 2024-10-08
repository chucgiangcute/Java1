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
public class Bai8_HinhCN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double dai = scanner.nextDouble();
        System.out.println("Nhap chieu rong");
        double rong = scanner.nextDouble();
        
        double ChuVi = chuVi(dai,rong);
        System.out.println("Chu vi HCN la :" + " " + ChuVi );
        
        double DienTich = dienTich(dai,rong);
        System.out.println("Dien tich HCN la" + " " + DienTich);
        
    }
    public static double chuVi(double dai, double rong)
    { return (dai + rong)*2;
    }
    public static double dienTich(double dai, double rong)
    { return dai*rong;
    }
    
}
