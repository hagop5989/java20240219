package ch05.lecture.p1array;

public class C17Matrix {
    public static void main(String[] args) {
        int[][] mat1 = new int[3][2]; //첫번째 []안에 행의개수, 두번째 []안에 열의개수. 3행 2열

        // mat1의 원소의 개수는 3개, 타입은 int[]
        // mat1의 각 원소의 개수는 2개, 타입은 int
        /* {0,0},
           {0,0},
           {0,0} 형태 */

        System.out.println(mat1.length); // 3
        System.out.println(mat1[0].length); // 2
        System.out.println(mat1[1].length); // 2
        System.out.println(mat1[2].length); // 2

        mat1[1][0] = 5; // 2번째 행 1번째 열의 값을 5로 바꿈.
        /* {0,0},
           {5,0},
           {0,0} 형태 */
        mat1[2][1] = 9; // 3번째 행 2번째 열의 값을 9로 바꿈.
        mat1[1][1] = 7; // 2번째 행 2번째 열의 값을 9로 바꿈.

        // 전체 탐색은 중첩된 for문 사용
        for (int i = 0; i < mat1.length; i++) {
            System.out.print("[");
            for (int j = 0; j < mat1[i].length; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }
                System.out.print(mat1[i][j]);
            }
            System.out.println("]");
        }

    }
}
