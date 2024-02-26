package ch04.lecture.p1if.sec02.p5break;

public class C04Label {
    public static void main(String[] args) {
        // label : 반복문에 label을 붙여서 break 종료 시킬 수 있다.

        loop1:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(STR."\{i}, \{j}");

                if (j == 5) {
                    // break 가장 가까운 반복문 종료
                    // label 사용시 label이 붙은 반복문 종료
                    break loop1;
                    // loop1 label을 안붙였을땐 j가 5까지만 출력되며 i는 모두 출력됨
                    // 붙였을때는 j가 5까지 출력되며 i는 0까지만 출력됨
                }
            }
        }
    }
}
