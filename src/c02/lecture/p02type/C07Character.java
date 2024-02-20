package c02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char (character)
        // 2byte == 16bits
        // 0 ~ 65535
        // unicode

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = 65536; // x
//        char f = -1; // x

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        char g = 0xac00;
        char i = '가';
        System.out.println(g);
        System.out.println(i);

        char m = 0xD7A3;
        char n = '힣';

        System.out.println(m);
        System.out.println(n);

        int o = 0x1f607;

        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        // 1f3a4 ; 마이크 모양 이모지 출력

        int p = 0x1f3a4;
        char[] emoji2 = Character.toChars(p);
        String emojit = new String(emoji2);
        System.out.println("emojit = " + emojit);

    }
}
