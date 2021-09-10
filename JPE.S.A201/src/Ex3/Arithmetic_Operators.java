package Ex3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Arithmetic_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.print("Input first number: ");
        a = sc.nextInt();
        System.out.print("Input second number: ");
        b = sc.nextInt();
        System.out.print("Input third number: ");
        c = sc.nextInt();
        System.out.print("Input fourth number: ");
        d = sc.nextInt();
        System.out.print("Input fourth number: ");
        e = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("The sum is "+sum);
    }
}
