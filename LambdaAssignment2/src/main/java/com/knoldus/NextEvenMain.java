package com.knoldus;

import java.util.Scanner;

public class NextEvenMain {
    public static void main(String[] args) {
        NextEven nextEven = new NextEven();
        System.out.println("Enter a long value");
        Scanner sc = new Scanner(System.in);
        long b = sc.nextLong();
        long res = nextEven.FindNextEven(b);
        System.out.println(res);
    }
}
