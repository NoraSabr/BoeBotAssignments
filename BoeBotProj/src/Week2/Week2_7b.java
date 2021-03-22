package Week2;

import TI.BoeBot;
import TI.Servo;

public class Week2_6c {
    private static Servo s1 = new Servo(12);
    private static Servo s2 = new Servo(13);

    public static void main (String[] args){
        GaNaarSnelheid gaNaarSnelheid = new GaNaarSnelheid();
        NoodRem noodRem = new NoodRem();
        Draaien draaien = new Draaien();

        while (true){
            gaNaarSnelheid.gaNaarSnelheid(200);
            noodRem.noodRem();
            draaien.draaien(200);
            BoeBot.wait(2000);
        }
    }
}