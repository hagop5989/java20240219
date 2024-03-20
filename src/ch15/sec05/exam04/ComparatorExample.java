package ch15.sec05.exam04;

import java.sql.SQLOutput;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        //비교자를 제공한 TreeSet 컬렉션 생성
//        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
        var treeSet = new TreeSet<Fruit>((x, y) -> x.getPrice() - y.getPrice());

        //객체 저장
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("수박", 10000));
        treeSet.add(new Fruit("딸기", 6000));
//

        //객체를 하나씩 가져오기
        for (Fruit fruit : treeSet) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
        System.out.println("##forEach");
        treeSet.forEach(s -> System.out.println(s.name + ":" + s.price));

    }
}
