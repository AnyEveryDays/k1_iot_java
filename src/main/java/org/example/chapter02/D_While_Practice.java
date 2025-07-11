package org.example.chapter02;

import java.util.Scanner;

public class D_While_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("손태경을 입력해주세요");
        String name = sc.nextLine();
        while(name != "손태경"){
            System.out.println("손태경을 입력해주세요");
            name = sc.nextLine();
        }
    }
}
