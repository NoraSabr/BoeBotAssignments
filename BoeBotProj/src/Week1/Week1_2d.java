package Week1;

import TI.*;

public class Week1_2d {

    public static void main (String[] args){
        Timer t1 = new Timer(1300);
        Timer t2 = new Timer(700);

        t1.mark();
        t2.mark();

        while(true){
            if (t1.timeout()){
                t1.mark();
                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
            } if (t2.timeout()){
                t2.mark();
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
            }
            BoeBot.wait(1);
        }
    }
}
