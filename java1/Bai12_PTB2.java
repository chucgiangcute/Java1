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
public class Bai12_PTB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("GIAI PHUONG TRINH BAC 2");
        
        System.out.print("Nhap he so a");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap he so b");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap he so c");
        double c = scanner.nextDouble();
        
        double delta = b*b - 4*a*c;
        double x1,x2;
        
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else { System.out.println("Phuong trinh vo nghiem");}
            }
            else 
            {
                x1 = -c/b;
                System.out.println("Phuong trinh co nghiem la" + x1);
            }
        }
        else
        {
            if(delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta == 0)
            { 
                x1 = x2 = -b/2*a;
                System.out.println("Phuong trinh co nghiem kep la :" + x1 + "=" + x2);
            }
            else 
            {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2*a);
                
                System.out.println("Nghiem cua phuong trinh la" + x1 + "va" + x2);
            }
        }
        
    }
    
    
    
}
