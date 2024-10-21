/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2cau2;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh");
        
        double bankinh = scanner.nextDouble();
        double V = 4 * Math.PI*Math.pow(bankinh,2);
        double thetich = (4.0 / 3.0) * Math.PI *Math.pow(bankinh,3);
        System.out.println("Dien tich la " + V);
        System.out.println("The tich la " + thetich);
    }
    
}
