package Week2;

import TI.BoeBot;
import TI.Servo;

public class Week2_5b {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    public static void main (String[] args){

        s1.update(1600);
        s2.update(1400);
        BoeBot.wait(500);
        NoodRem noodRem = new NoodRem();
        noodRem.noodRem();
    }
}
