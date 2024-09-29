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
public class Bai6_TinhLuyThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap co so : ");
        int coSo = scanner.nextInt();

        System.out.print("Nhap so mu : ");
        int soMu = scanner.nextInt();

        int ketQua = MathPow(coSo,soMu);

        System.out.println("Luy thua cua" + coSo + " "+ "mu"+" " + soMu +"la :" + ketQua);
        
           }
    public static int MathPow(int coSo, int soMu)
    { int ketQua = 1;
      for(int i = 0; i <soMu; i++)
      { ketQua *= coSo;
      }
      return ketQua;
    }
    
}
        
    
    

