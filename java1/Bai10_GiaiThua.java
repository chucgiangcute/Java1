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
public class Bai10_GiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHUONG TRINH TINH GIAI THUA");
        
        System.out.print("Nhap so");
        int so = scanner.nextInt();
        
        int GiaiThua = giaiThua(so);
        System.out.println("Ket qua la " + " "+ GiaiThua);
    }
    public static int giaiThua(int so)
    { 
        int giaithua = 1;
        for(int i = 1; i<=so; i++)
        {
            giaithua *= i;
        }
        return giaithua;
    }
            
    
   
}
