package org.example.chapter01;

import java.util.Scanner;

public class J_Practice {
    public static void main(String[] args) {
        /*
        === 복합 복습 문제 ===
        
        이름,국 영 수 입력 받아야함
        
        총점 = 국어 + 영어 + 수학
        
        평균 = 총점 / 3.0
        
        세과목 모두 60점 이상이면 " 합격" 아니면 "불합격"
         */
        int kor, math, eng, sum;
        double avg;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("국어 점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        math = sc.nextInt();

        
        sum = kor + eng + math;
        avg = (double)sum / 3;
        String result = kor >= 60 && math >= 60 && eng >= 60 ? "판정 : 합격" : "판정 : 불합격";


        System.out.println("[이름 : " + name+"]");
        System.out.println("총점 : " + sum +"점");
        System.out.printf("평균 : %.1f 점\n",avg);
        System.out.println("합격 여부 : "+ result);
        
        
    }
}
