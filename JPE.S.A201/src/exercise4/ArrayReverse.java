package exercise4;

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
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
        reverseArray(myIntArray,myIntArray.length);
    }
    public static void reverseArray(int[] arr, int n){
        int[] b = new int[n];
        int j =n;
        for(int i =0; i<n;i++){
            b[j-1]=arr[i];
            j--;
        }
        System.out.print("Original Array: ");
        for(int h =0;h<n;h++){
            System.out.print(arr[h]);
            if(h<n-1){
                System.out.print(", ");
            }
        }
        System.out.print("\nReversed Array: ");
        for(int k =0;k<n;k++){
            System.out.print(b[k]);
            if(k<n-1){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
