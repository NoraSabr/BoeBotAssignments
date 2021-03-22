package Week1;

import TI.*;

public class Week1_3a {

    public static void main (String[] args){
        while (true){
            boolean state = BoeBot.digitalRead(1);
            if(state){
                System.out.println("Knop niet ingedrukt");
                BoeBot.digitalWrite(15, false);
            } else {
                System.out.println("Knop is ingedrukt");
                BoeBot.digitalWrite(15, true);

            }
            BoeBot.wait(1000);
        }
    }
}
