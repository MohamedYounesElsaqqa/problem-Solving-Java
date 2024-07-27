package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoopI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //  System.out.println("please enter number ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){

            System.out.println(N+" x "+i +" = "+N*i);
        }

        bufferedReader.close();
    }
}