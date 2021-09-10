/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Logical_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Input first number: ");
        a = sc.nextInt();
        System.out.print("Input second number: ");
        b = sc.nextInt();
        System.out.print("Input third number: ");
        c = sc.nextInt();
        System.out.print("Input fourth number: ");
        d = sc.nextInt();
        if (a==b && b==c && c==d){
            System.out.println("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal!");
        }
    }
}
