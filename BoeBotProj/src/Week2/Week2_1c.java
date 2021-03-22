package Week2;

import TI.BoeBot;
import TI.PWM;

public class Week2_1c {
    public static void main (String[] args){
        PWM pwm = new PWM(0,0);
        int i = 0;
        while (i <255) {
            i++;
            BoeBot.wait(10);
            pwm.update(i);
            System.out.println(i);
            if(i == 255){
                i = 0;
            }
        }
        BoeBot.wait(1000);

    }
}
