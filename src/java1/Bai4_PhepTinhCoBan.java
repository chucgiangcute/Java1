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
public class Bai4_PhepTinhCoBan {
    public static void main(String[] args) {
        System.out.println("Chương trình phép tính cơ bản");
         //double a,b;
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Nhap so a: ");
        int a = sc.nextInt();
        
        System.out.print ("Nhap so b: ");
        int b = sc.nextInt();
        
        //int tong;
        //tong = a+b; 
        System.out.println(a + " + " + b + " = " + tinhtong(a,b) );
        
        //int hieu;
        //hieu = a-b;
        System.out.println(a + " -" + b + " = " + tinhhieu(a,b) );
         
        //int tich;
        //tich = a*b;
        System.out.println(a + " * " + b + " = " + tinhtich(a,b) );
        
        double thuong;
        
        thuong = (double)a/b;
         System.out.println(a + " : " + b + " = " + thuong );
         
         
         
}
    public static int tinhtong(int a, int b){
        return a+b;
    }
    public static int tinhhieu(int a, int b){
        return a-b;
    }
    public static int tinhtich(int a, int b){
        return a*b;
    }
    public static double tinhhthuong(int a, int b){
        if(b==0)
        {return -1;}
        else{
        return (double)a/b;
   }
    /*public static String tinhthuongD(int a,int b){
        if (b == 0 )
        {
            return "Khong the chia cho khong";
        }
        else{
            return Double.ToString(double)(a,b);
        }*/
    }
    
            
    
}
