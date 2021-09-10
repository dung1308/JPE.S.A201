package exercise3;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class FrequentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int len;
        String choice;
        System.out.print("enter length of Array:");
        len = sc.nextInt();
        array = new int[len];
        int i =0;
        do{
            System.out.println("Enter an element: ");
            int n = sc.nextInt();
            System.out.println("Do you want to continue?");
            sc.nextLine();
            String c = sc.nextLine();
            array[i] = n;
            i++;
            if(i==len){
                break;
            }
            if(c.equalsIgnoreCase("n")){ 
               break;
            }//else continue to loop on any string ;-)
        }while(i<=len);
        int value;
        int count = 0;
        System.out.println("Value:");
        value = sc.nextInt();
        for(int x : array){
                if(x == value){
                count++;
            }
        }
        System.out.println("Amount of frequence: "+count);
    }
}
