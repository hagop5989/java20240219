package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.Random;

public class C07Sample2 {
    // TODO : null 대신 익명클래스 객체 코드 작성
//        Game lottoGame = null;
//        // 초보: 1~45 값 중 하나 출력
//        // 중급: 1~45 값 중 6개 (중복없이) 출력
//        lottoGame.play();
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        int size = 0;

        while (size < 6) {
            boolean alreadyHave = false;
            Random random = new Random();
            int randomNumber = random.nextInt(45) + 1;

            for (int i = 0; i < 6; i++) {
                //있는지 확인
                if (arr1[i] == randomNumber) {
                    alreadyHave = true;
                    break;
                }
            }
            if (!alreadyHave) {
                arr1[size] = randomNumber;
                size++;
            }
        }

        System.out.println(Arrays.toString(arr1));
    }
}

