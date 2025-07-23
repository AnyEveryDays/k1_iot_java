package org.example.Test03.main;


import org.example.Test03.service.BookServiceImpl;
import org.example.Test03.view.BookView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 서비스 구현체 생성
        BookServiceImpl bookService = new BookServiceImpl();

        // 입력 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 뷰 생성 (서비스와 스캐너 주입)
        BookView bookView = new BookView(bookService, scanner);

        // 메뉴 실행
        bookView.showMenu();

        // 사용 후 스캐너 닫기
        scanner.close();
    }
}
