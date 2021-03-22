package Week1;

import TI.BoeBot;

public class Week1_4c {

    public static void main (String[] args){
        while (true){
            boolean state = BoeBot.digitalRead(1);
            boolean state2 = BoeBot.digitalRead(2);

            if(state == true){
                BoeBot.digitalWrite(15, false);
            } if(state == false){
                if (BoeBot.digitalRead(0)) {
                    BoeBot.digitalWrite(15, false);
                    BoeBot.wait(1000);
                } else {
                    BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
                }
            }
            if (state2 == true){
                BoeBot.digitalWrite(0, false);
            } if (state2 == false){
                if(BoeBot.digitalRead(15) == true){
                    BoeBot.digitalWrite(0, false);
                    BoeBot.wait(700);
                } else {
                    BoeBot.digitalWrite(0, true);
                    BoeBot.wait(1300);
                    BoeBot.digitalWrite(0, false);
                    BoeBot.wait(700);
                }
            }
        }
    }
}
