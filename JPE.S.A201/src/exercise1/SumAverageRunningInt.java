/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author ASUS
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double avg;
        int lowerbound =1;
        double upperbound = 100;
        for(int number = lowerbound; number <= upperbound-1; number++){
            sum += number;
        }
        avg = sum/(upperbound-1);
        System.out.println("Average of all 100 first numbers: "+avg);
    }
}
