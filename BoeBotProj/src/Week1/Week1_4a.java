package Week1;

import TI.*;

public class Week1_4a {
    public static void main (String[] args){
        while (true){
            boolean state = BoeBot.digitalRead(1);
            boolean state2 = BoeBot.digitalRead(2);

            if(state == true){
                System.out.println("Knop1 niet ingedrukt");
                BoeBot.digitalWrite(15, false);
            } if(state == false){
                System.out.println("knop1 is ingedrukt");
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
            }
            if (state2 == true){
                System.out.println("Knop2 niet ingedrukt");
            } if (state2 == false){
                System.out.println("Knop2 is ingedrukt");
            }
            BoeBot.wait(1000);
        }
    }
}
