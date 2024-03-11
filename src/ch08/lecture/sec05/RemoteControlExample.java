package ch08.lecture.sec05;

import ch08.lecture.sec04.RemoteControl;
import ch08.lecture.sec04.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        ch08.lecture.sec05.RemoteControl.changeBattery();
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

//        rc.setMute(true);
//        rc.setMute(false);


    }
}
