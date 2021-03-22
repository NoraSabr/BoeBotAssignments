package Week1;

import TI.*;

public class Week1_3c {

    public static void main (String[] args){
        Timer t1 = new Timer(1300);
        Timer t2 = new Timer(700);

        while (true){
            boolean state = BoeBot.digitalRead(1);
            if(state){
                System.out.println("Knop niet ingedrukt");
                BoeBot.digitalWrite(15, false);
                BoeBot.digitalWrite(0, true);
            } else {
                BoeBot.digitalWrite(0, false);
                System.out.println("Knop is ingedrukt");
                t1.mark();
                if (t1.timeout()) {
                    t2.mark();
                    BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
                } if (t2.timeout()){
                    t1.mark();
                    BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
                }
            }
            BoeBot.wait(1000);
        }
    }
}
