package exercise2;

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
public class ArrayContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sValue;
        boolean found=false;
        int size;
        System.out.print("Enter length of string: ");
        size = sc.nextInt();
        String[] stringArray = new String[10];
        System.out.print("Enter "+ size +" string: ");
        for(int i = 0; i<=size; ++i){
            stringArray[i] = sc.nextLine();
        }
        System.out.println("--------------");
        System.out.print("Enter sValue: ");
        sValue = sc.nextLine();
        for(int j =0; j<=size; j++){
            if(stringArray[j].equals(sValue)){
                System.out.println("Check '"+sValue+"' in Array: Contained!");
                found = true;
                break;
            }
            
        }
        if(found == false){
            System.out.println("Check '"+sValue+"' in Array: No Contain!");
        }
    }
}
