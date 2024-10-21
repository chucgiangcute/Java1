/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de2cau1.java;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class De2cau1Java {

    private static int i;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, Integer Nextfibo) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHAP SO LUONG SO FIBONACCI MUON HIEN THI");
        int N = scanner.nextInt();
        
        int[] arrFibo = new int[N];
        ArrayList<Integer> fibo = new ArrayList<>();
        
        for(int i = 0; i <= N; i++)
        {
            if(i==0)
            {
                fibo.add(0);
            }
            else if(i==1)
            {
                fibo.add(1);
            }
            else
            {int nextFibo = fibo.get(i-1) + fibo.get(i-2);
            fibo.add(nextFibo);}
            
        }
        int Tong = 0;
        for(int so : fibo)
        {
            Tong += so;
        }
        
        System.out.print("Day so Fibonacci la :" + fibo);
        System.out.print("Tong cua day so la :" + Tong);
        
    }
    
}
