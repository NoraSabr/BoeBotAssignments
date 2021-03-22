package Week1;

import TI.*;

public class Week1_3b {
    public static void main (String[] args){
        Timer t1 = new Timer(1000);

        while (true){
            boolean state = BoeBot.digitalRead(1);
            if(state){
                System.out.println("Knop niet ingedrukt");
                BoeBot.digitalWrite(15, false);
            } else {
                System.out.println("Knop is ingedrukt");
                t1.mark();
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));

            }
            BoeBot.wait(1000);
        }
    }
}
