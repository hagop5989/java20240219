package ds.inflearn.ex;

public class NestedEx2 {
    public static void main(String[] args) {
//        for(int rows = 1; rows<=3; rows++){
//            System.out.print("*");
//            for(int i =1; i<3; i++)
//                System.out.println();
//                System.out.print("*");
//        }
        int rows = 50;
        for(int i = 1; i <=rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
