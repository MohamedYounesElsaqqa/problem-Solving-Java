package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaStdinandStdoutI {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        String line;
//        while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
//            int number = Integer.parseInt(line);
//            System.out.println(number);
//        }
//
//        bufferedReader.close();
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    while (scanner.hasNextInt()) {
        int number = scanner.nextInt();
        System.out.println(number);
    }

    scanner.close();
}
}

