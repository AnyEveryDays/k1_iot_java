package org.example.chapter03;

import java.util.ArrayList;

public class F_Practice {
    public static void main(String[] args) {
        /*
            1.크기 10의 ArrayList 생성
            2. 1부터 10까지의 숫자를 차례로 추가
            3. 전체 리스트 출력(원본 리스트)
            4. 원본 리스트에서 홀수만 제거하고 결과를 출력 (반복분 & 조건문 결합)
            5. index 3번에 값 50을 삽입한 뒤 결과를 출력
         */
        ArrayList<Integer> arrayList1 = new ArrayList<>(10);
        for(int i = 0; i < 10; i++){
            arrayList1.add((i+1));
        }
        System.out.println(arrayList1);



        for(int i = 0; i < arrayList1.size(); i++){
            if(arrayList1.get(i) %2 == 1) {arrayList1.remove(i);
                // 요소를 삭제하고 난 후 인덱스 조정 (ArrayList는 크기가 동적으로 변경)

                // cf) 인덱스 조정을 하지 않은 경우 정상 동작 되지 않는 경우
                // : 연속된 요소를 제거할 때 (홀수가 연속될 경우)
                // list = [1,3,5,7,9]

                // i = 0 일때 list.remove(0);
                // > [3,5,7,9]
                // 다음 인덱스인 i == 1이 아니라 3이 아니라 5기 때문에 정상 동작 되지 않는다
                i--;// 인덱스 조정
            }
        }
        System.out.println(arrayList1);

        arrayList1.add(3,50);

        System.out.println(arrayList1);  //[2, 4, 6, 50, 8, 10]


    }
}
