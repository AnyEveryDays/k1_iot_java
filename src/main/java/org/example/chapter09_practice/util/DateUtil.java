package org.example.chapter09_practice.util;

/*
    날짜 및 시간을 포맷팅하거나 파싱하는 유틸리티 클래스

    클래스, 매서드 단위의 설명을 첨부
    @parem parameterName 작성
    @return 반환값  작성
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    // 사용할 날짜 및 시간 포맷 패턴 정의
    private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    //위의 패턴을 기반으로 하는 포멧터 생성
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    /*
        현재 시간을 포맷된 문자열로 반환
        @return 현재 시간( 예
     */

    public static String now() {
        // 날짜 시간 데이터 .format(포멧터);
        return LocalDateTime.now().format(FORMATTER);

    }
    /*
        전달받은 LocalDateTime 객체를 포맷 문자열로 변환
        @param datetime 포맷할 LocalDateTime 객체
        @return 포맷된 날짜 문자열
     */

    /*
        문자열 형태의 날짜를 LocalDateTime 객체로 파싱
        @param datetimeStr 포맷에 맞는 날짜문자열
        @return LocalDateTime
     */
}
