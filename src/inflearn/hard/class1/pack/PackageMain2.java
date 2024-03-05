package inflearn.hard.class1.pack;

import inflearn.hard.class1.pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        //같은 패키지는 클래스이름으로 불러쓰면 된다.
        User user = new User();
    }
}
