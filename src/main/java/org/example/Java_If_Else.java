package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java_If_Else {

    public static void main(String[] args) throws IOException, IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//
//        bufferedReader.close();
//
//        if (N % 2 != 0) {
//            System.out.println("Weird");
//        } else {
//            if (N >= 2 && N <= 5) {
//                System.out.println("Not Weird");
//            } else if (N >= 6 && N <= 20) {
//                System.out.println("Weird");
//            } else if (N > 20) {
//                System.out.println("Not Weird");
//            }
//        }

        //-------------------------------------------------------
        final Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}

