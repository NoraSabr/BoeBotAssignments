package Week1;

import TI.*;

public class Week1_4b {

    public static void main(String[] args) {
        while (true) {
            boolean state = BoeBot.digitalRead(1);
            boolean state2 = BoeBot.digitalRead(2);

            if (state == true) {
                BoeBot.digitalWrite(15, false);

            }
            if (state == false) {
                System.out.println("knop1 is ingedrukt");
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
                BoeBot.wait(1000);
            }
            if (state2 == true) {
                BoeBot.digitalWrite(0, false);
            }
            if (state2 == false) {
                System.out.println("Knop2 is ingedrukt");
                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
                BoeBot.wait(700);

            }
        }
    }
}
