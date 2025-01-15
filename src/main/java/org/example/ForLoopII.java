package org.example;

import java.util.Scanner;

public class ForLoopII {
//    public static void main(String []argh){
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int res=a;
//            for(int j=0;j<n;j++) {
//                res += (int) (Math.pow(2, j) * b);
//                System.out.print(Integer.toString(res) +" ");
//            }
//            System.out.println("\n");
//        }
//        in.close();
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            int powerOf2 = 1; // This represents 2^0 initially
            for (int j = 0; j < n; j++) {
                res += powerOf2 * b;
                System.out.print(res + " ");
                powerOf2 *= 2; // Update powerOf2 to be 2^j for the next iteration
            }
            System.out.println();
        }
        in.close();
    }
}

