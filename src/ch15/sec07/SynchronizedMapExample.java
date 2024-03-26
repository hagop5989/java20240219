package ch15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

        //작업 쓰레드 객체 생성
        Thread threadA = new Thread(() -> {
            //객체 1000개 추가
            for (int i = 1; i <= 1000; i++) {
                map.put(i, "내용" + i);
            }
        });

        //작업 쓰레드 객체 생성
        Thread threadB = new Thread(() -> {
            //객체 1000개 추가
            for (int i = 1001; i <= 2000; i++) {
                map.put(i, "내용" + i);
            }
        });

        //작업 쓰레드 실행
        threadA.start();
        threadB.start();

        //작업쓰레드 종료까지 메인스레드 기다리기
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {
        }

        //저장된 총 객체 수 얻기
        int size = map.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();
    }
}
