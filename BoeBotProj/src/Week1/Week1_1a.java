package Week1;

import TI.*;

public class Week1_1a {

    public static void main (String[] args){

        while(true){
            BoeBot.digitalWrite(15, true);
            BoeBot.wait(1000);
            BoeBot.digitalWrite(15, false);
            BoeBot.wait(1000);
        }
    }
}
