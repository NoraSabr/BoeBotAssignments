package Week2;

import TI.Servo;

public class NoodRem {
    public void noodRem(){
        Servo s1 = new Servo(12);
        Servo s2 = new Servo(13);

        s1.stop();
        s2.stop();
    }
}
