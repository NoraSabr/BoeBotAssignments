package Week1;

import TI.*;

public class Week1_2a {

    public static void main (String[] args){
        Timer t1 = new Timer(1000);
        Timer t2 = new Timer(1000);

        while(true){
            if(t1.timeout()){
                t1.mark();
                BoeBot.digitalWrite(15, !BoeBot.digitalRead(15));
                System.out.println("LED1 Toggle");
            } if (t2.timeout()){
                t2.mark();
                BoeBot.digitalWrite(0, !BoeBot.digitalRead(0));
                System.out.println("LED2 Toggle");
            }
            BoeBot.wait(1);
        }

    }
}
