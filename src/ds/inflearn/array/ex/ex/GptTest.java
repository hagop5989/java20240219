package ds.inflearn.array.ex.ex;
import java.util.Scanner;

public class GptTest {
    public class ProductAdminEx {
        static final int MAX_PRODUCT = 10;
        static final int MENU_REGISTER = 1;
        static final int MENU_LIST = 2;
        static final int MENU_EXIT = 3;

        public static void main(String[] args) {
            String[] productNames = new String[MAX_PRODUCT];
            int[] productPrices = new int[MAX_PRODUCT];
            int productCount = 0;

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1.상품등록 | 2.상품목록 | 3.종료 \n 메뉴를 선택하세요:");
                int menu = scanner.nextInt();
                scanner.nextLine(); // 개행 문자 소비

                switch (menu) {
                    case MENU_REGISTER:
                        registerProduct(scanner, productNames, productPrices, productCount);
                        productCount++;
                        break;
                    case MENU_LIST:
                        listProducts(productNames, productPrices, productCount);
                        break;
                    case MENU_EXIT:
                        System.out.println("프로그램을 종료합니다.");
                        return;
                    default:
                        System.out.println("잘못된 메뉴를 선택하셨습니다.");
                }
            }
        }

        private static void registerProduct(Scanner scanner, String[] productNames, int[] productPrices, int productCount) {
            if (productCount >= MAX_PRODUCT) {
                System.out.println("더 이상 입력할 수 없습니다.");
                return;
            }
            System.out.print("상품 이름을 입력하세요: ");
            productNames[productCount] = scanner.nextLine();

            System.out.print("상품 가격을 입력하세요: ");
            productPrices[productCount] = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 소비
        }

        private static void listProducts(String[] productNames, int[] productPrices, int productCount) {
            if (productCount == 0) {
                System.out.println("등록된 상품이 없습니다.");
                return;
            }
            for (int i = 0; i < productCount; i++) {
                System.out.println(productNames[i] + " 가격: " + productPrices[i]);
            }
        }
    }

}
