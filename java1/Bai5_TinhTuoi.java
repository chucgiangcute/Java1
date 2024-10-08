/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java1;


import java.util.Scanner;
//import ageException.Agexception;
//import ageCheck.AgeCheck;
/**
 *
 * @author Admin
 */
public class Bai5_TinhTuoi {
    public static void maind (String[] args){
       System.out.println ("Chuong trinh quan Ly Sinh Vien");
       Scanner sc = new Scanner (System.in);
       System.out.println ("Nhap Ho va Ten: ");
       //String hoten = sc.next();
       String hoten = sc.nextLine();
       
       System.out.print ("Nhap nam sinh: ");
       int namsinh = sc.nextInt();
       
       System.out.println ("Ho ten la " + hoten);
       int tuoi = 2024 - namsinh;
       System.out.println ("Tuoi la " + tuoi);      

    }
}
