package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class Dice {
    public static int rollDice(int number, int nSides) {
        int num = 0;
        int roll = 0;
        Random r = new Random();
        if (nSides >= 3) {
            for (int i = 0; i < number; i++) {
                roll = r.nextInt(nSides) + 1;
                num = num + roll;
            }
            System.out.println("Roll is:  " + num);
        } else {
            System.out.println("Error num needs to be from 3");
        }
        return num;
    }

    public static int rollDiceForStats(BufferedReader reader, String stat) throws IOException {
        String yesNo;
        int diceSides = 6;
        int diceCount = 3;
        int diceRollValue;


        System.out.println("Roll for " + stat + ".");
        diceRollValue = Dice.rollDice(diceCount, diceSides);
        System.out.println("Do you wish to re-roll? Y/N");

        yesNo = reader.readLine();

        while (!yesNo.toLowerCase().equals("n")) {
            diceRollValue = Dice.rollDice(diceCount, diceSides);

            System.out.println("Do you wish to re-roll? Y/N");
            yesNo = reader.readLine();
        }

        System.out.println(stat + " set to " + diceRollValue);
        System.out.println();
        return diceRollValue;
    }
}
