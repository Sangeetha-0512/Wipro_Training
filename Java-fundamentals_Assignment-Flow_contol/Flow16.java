package com.w3epic.wiprotraining;

import java.util.Scanner;

public class Flow16{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int ip = sc.nextInt();  // Original input
        int reversed = 0;

        while (ip != 0) {
            int digit = ip % 10;
            reversed = reversed * 10 + digit;
            ip /= 10;
        }

        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
