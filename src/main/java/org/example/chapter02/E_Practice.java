package org.example.chapter02;

import java.util.Scanner;

public class E_Practice {
    public static void main(String[] args) {
        /*
        1. 점수에 따른 학점 출력(if, else if, else 사용)

        사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력
        0 미만 또는 100 초과인 경우: 유효하지 않은 점수입니다
        90점 이상 : A
        80점 이상 B
        70 이상 C
        60 이상 D
        그 외 F


        2. 삼각형 모양의 별(*) 출력 (중첩 for 사용 -2번)

         */

        //1. 1번 문제
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("점수를 입력하시오");
            int score = sc.nextInt();
            if(score < 0 || score > 100){
                System.out.println("유효하지 않은 점수입니다");
            }
            if (score >= 90){
                System.out.println("A");
                break;
            }
            else if (score >= 80){
                System.out.println("B");
                break;
            }
            else if (score >= 70){
                System.out.println("C");
                break;
            }
            if (score >= 60){
                System.out.println("D");
                break;
            }
            else {
                System.out.println("F");
                break;
            }

        }
        // 2. 삼각형
        int count = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= count - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int row = 5;
        for (int i = 1; i <= 5; i ++){
            for(int j = 1; j <= 5; j++){
                if(j >= row){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            row--;
        }
    }
}
/*
    *
   **
  ***
 ****
*****
 */