package inflearn.hard.class1;

public class ClassStart2 {
    public static void main(String[] args) {
        int[][] students = {
                {15, 90},
                {16, 80}
        };
        for (int i = 0; i < 2; i++) {
            switch (i) {
                case 0 -> System.out.print("학생1: ");
                case 1 -> System.out.print("학생2: ");
            }
            for (int j = 0; j < 2; j++) {
                System.out.print(students[i][j]);
                if (j == 0) {
                    System.out.print(", ");
                } else if (j == 1) {
                    System.out.print(" ");
                }
            }
        }

    }
}
