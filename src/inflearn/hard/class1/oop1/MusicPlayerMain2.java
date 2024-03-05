package inflearn.hard.class1.oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 음악 플레이어 켜기
        on(data);
        //볼륨증가
        volumnUp(data);
        //볼륨증가
        volumnUp(data);
        //볼륨감소
        volumnDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);

    }
    static void on (MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off (MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumnUp (MusicPlayerData data) {
        data.volumn++;
        System.out.println("음악 플레이어 볼륨: " + data.volumn);
    }
    static void volumnDown (MusicPlayerData data) {
        data.volumn--;
        System.out.println("음악 플레이어 볼륨: " + data.volumn);
    }
    static void showStatus (MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volumn);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
