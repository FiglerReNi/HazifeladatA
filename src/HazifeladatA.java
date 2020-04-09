/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
import java.util.Scanner;
public class HazifeladatA {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a;
         System.out.println("Kérem a számot: ");
            a=sc.nextInt();
        for(int i=1; i<=10; i++){
         System.out.println(i+"*"+a+"="+(i*a));
        }
        
        System.out.print("Köszönjük");
        }
        
        
    }
    
