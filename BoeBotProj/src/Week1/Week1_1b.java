package Week1;

import TI.BoeBot;

public class Week1_1b {

    public static void main (String[] args){
        while(true){
            BoeBot.digitalWrite(15, true);
            BoeBot.wait(1000);
            BoeBot.digitalWrite(15, false);
            BoeBot.wait(2000);
        }
    }
}
