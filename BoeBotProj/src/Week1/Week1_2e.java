package Week1;

import TI.*;

public class Week1_2e {

    public static void main (String[] args){
        Timer t1 = new Timer(1300);
        Timer t2 = new Timer(700);
        Timer t3 = new Timer(800);
        Timer t4 = new Timer(1700);

        t1.mark();
        t3.mark();

        while(true){
            if(t1.timeout()){
                t2.mark();
                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
            } if (t2.timeout()){
                t1.mark();
                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
            } if (t3.timeout()){
                t4.mark();
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
            } if (t4.timeout()){
                t3.mark();
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
            }
            BoeBot.wait(1);
        }
    }
}
