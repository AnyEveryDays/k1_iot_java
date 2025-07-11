package org.example.chapter02;

 //=== 제어문 ===//
// : 프로그램의 실행 흐름을 제어(Control)하는 문법

// 1) 조건문(COndition)
// : 특정 조건을 만족할 때만 코드 블록을 실행
// - if, else, else if : 조건에 따라 실행할 코드를 결정
// - switch, case, default : 여러개의 경우 (case)에 대해 실행할 코드를 결정
// +) continue, break 실행 흐름을 제어

// 2) 반복문(loop)
// : 특정 조건이 만족될 때까지 코드 블록을 반복 실행
// - for while do while
// continue, break

import java.util.Scanner;

public class A_IF {
    public static void main(String[] args) {
       // 1. if문(만약 ~ 라면) / else문( 그 밖에)

        /*
            if문 기본 형태(+ else)

            if(조건식) {
                조건이 참인 경우 실행할 코드
               }
               -------------------------------------------------
            if(조건식) {

            } else {
                조건이 거짓인 경우 실행할 코드
            }
            ----------------------
            else if (조건식) {
                앞선 조건식이 거짓이며
                , 해당 조건식이 참인 경우에 실행할 코드
            }

            >> if 문과 else 문 사이에 작성 (else가 필연적 x)
            >> 수의 제한이 x (if, else 문 사이에 여러 개 나열 가능)
         */

        int age = 14;

        //예제 1) 나이 분류
        if (age > 19){
            // 조건식이 참일 경우 실행(age는 19를 초과하는 모든 수가 될수 있음)
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자입니다");
        }

        // 예제 2) 나이 분류 (else if 추가)
        if (age > 19){
            System.out.println("성인");
        } else if (age > 13){
            // 첫번째 조건이 age > 19가 아닌 값 중에서
            // 두번째 조건이 age > 13이 부합하는 값
            // : 13 < age < 19
            System.out.println("청소년");
        } else {
            // 첫번째, 두번째 조건이 모두 거짓인 경우
            System.out.println("어린이");
        }

        // 예제3) 나이 분류 (중괄호 생략)
        // : 조건문에서 실행될 코드 블락({})에 코드가 하나의 구문인 경우 {} 생략 가능
        if (age> 19) System.out.println("성인");
        else if(age > 13) System.out.println("청소년");
        else System.out.println("어린이");

        // ※ 코드 컨벤션 ※ //
        // 1. 중괄호 내부에는 한 칸 들여쓰기
        // 2. 기호와 키워드 사이에는 한 칸 띄어쓰기
        // 3. 콜론의 경우 'A': 'B'와 같이 앞은 붙이고 , 뒤는 한칸 띄워쓰자

        // +) 코드 정리 단축기 : ctrl + shift + f

        // === 풀이 ===//
        // 1. 각 풀이 조건식에서 저장할 문자열값(사분면의 위치)를 담을 변수 선언
        String functionScope = null; // String과 같은 참조 자료형은 기본값(비워져 있음)을 null로 표시


        Scanner sc = new Scanner(System.in);
        System.out.println("x의 값을 입력하시오");

        int x = sc.nextInt();
        System.out.println("y의 값을 입력하시오");
        int y = sc.nextInt();

        if ( x > 0 && y > 0){
            functionScope = "제1사분면";
        } else if (x > 0 && y < 0){
            functionScope = "제4사분면";
        } else if( x < 0 && y > 0){
            functionScope = "제2사분면";
        } else if( x < 0 && y < 0 ){
            functionScope = "제3사분면";
        } else {
            functionScope = "어느 사분면에도 속해있지 않습니다";
        }
        System.out.println(functionScope);

    }
}
