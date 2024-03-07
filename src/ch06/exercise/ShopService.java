package ch06.exercise;

public class ShopService {
    private static ShopService s;

    private ShopService() {
    }

    //geti 라는 것 입력시 싱글톤 인스턴스 생성됨
    public static ShopService getInstance() {
        if (s == null) {
            s = new ShopService();
        }
        return s;
    }
}
