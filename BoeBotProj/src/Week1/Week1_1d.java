package Week1;

import TI.BoeBot;

public class Week1_1d {
    public static void main (String[] args){
        while(true){
            BoeBot.digitalWrite(15, true);
            BoeBot.wait(20);
            BoeBot.digitalWrite(15, false);
            BoeBot.wait(20);
        }
    }
}
