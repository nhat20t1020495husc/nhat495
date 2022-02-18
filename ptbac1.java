/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class ptbac1 {
     public static void main(String []args)
    {
    Scanner pt=new Scanner(System.in);
    double a,b;
    try
    {
      System.out.println("Nhap a : ");
      System.out.println("Nhap b : ");
      a=pt.nextDouble();
      b=pt.nextDouble();
      if( a ==0) {
        if ( b ==0) System.out.println("PT vo so nghiem ");
        if (b!=0) System.out.println("PT vo nghiem ");
    }
    else
        System.out.println("PT co nghiem " +(-b /a));
     }catch(Exception e)
        {
            System.out.println(e);
      }
    }
}


