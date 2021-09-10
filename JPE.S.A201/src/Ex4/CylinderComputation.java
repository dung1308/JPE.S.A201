/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CylinderComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, height, surfaceArea, baseArea, volume;
        System.out.print("radius:");
        radius = sc.nextDouble();
        System.out.print("height:");
        height =sc.nextDouble();
        surfaceArea = 2 * Math.PI * radius * (radius + height);
        baseArea = Math.PI *radius*radius;
        volume = Math.PI * radius * radius * height;
        System.out.format("Surface area = %.2f\n",surfaceArea);
        System.out.format("Base area = %.2f\n",baseArea);
        System.out.format("Volume = %.2f\n",volume);
    }
}
