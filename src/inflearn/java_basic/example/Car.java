package inflearn.java_basic.example;

public class Car {
    private String name;
    private int price;

    public Car() {
        this.name = "소나타";
        this.price = 3000;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void introduce() {
        System.out.println("안녕하세요 이 차는 " + name + "이며, 가격은" + price + "입니다.");
    }

    public static void main(String[] args) {
        Car car0 = new Car();
        car0.introduce();
    }
}

