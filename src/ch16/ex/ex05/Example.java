package ch16.ex.ex05;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("OK버튼 클릭"));
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("cancel 버튼 클릭"));
        btnCancel.click();
    }
}
