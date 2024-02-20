package com.emxaple;

public class Book {
    public String name = "해리포터";
    public int price = 5000;
    public int release_year =2020;

    public Book() {
        this.name = "해리포터와 마법사의 돌";
        this.price = 7000;
        this.release_year = 2022;
    }

    public void intro() {
        System.out.println("이 책의 이름은 " + name + "이며, "
        +"가격은 " + price +"원이며, 출시년도는 "
                + release_year +"입니다.");
    }

    public static void main(String[] args) {
        Book book0 = new Book();
        book0.intro();
    }
}
