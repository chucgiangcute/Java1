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
public class Bai15_CanChi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHUONG TRINH TINH CAN CHI");
        
        System.out.print("Nhap nam ");
        int nam = scanner.nextInt();
        
        
        
        String can[] = {"Canh","Tan","Nham","Quy","Giap","At","Binh","Dinh","Mau","Ky"}; 
        String chi[] = {"Than","Dau","Tuat","Hoi","Ty","Suu","Dan","Mao","Thin","Ti","Ngo","Mui"};
        
        String cn = can[nam%10];
        String ci = chi[nam%12];
        
        System.out.print("Can chi cua nam" + nam + "la :" +" " + cn +" " + ci);
        
        
    }
    
}
