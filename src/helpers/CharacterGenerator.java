package helpers;

import character.Humanoid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterGenerator {

    public Humanoid generate(Humanoid characterToGenerate) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter character name.");
        characterToGenerate.setName(reader.readLine());


        System.out.println("Stats generation.");
        characterToGenerate.setStrength(Dice.rollDiceForStats(reader, "Strength"));
        characterToGenerate.setCharisma(Dice.rollDiceForStats(reader, "Charisma"));
        characterToGenerate.setConstitution(Dice.rollDiceForStats(reader, "Constitution"));
        characterToGenerate.setDexterity(Dice.rollDiceForStats(reader, "Dexterity"));
        characterToGenerate.setIntelligence(Dice.rollDiceForStats(reader, "Intelligence"));
        characterToGenerate.setWisdom(Dice.rollDiceForStats(reader, "Wisdom"));

        System.out.println("==============================");
        System.out.println("Char " + characterToGenerate.getName() + " has following stats: \n" +
                "Strength: " + characterToGenerate.getStrength() + "\n" +
                "Dexterity: " + characterToGenerate.getDexterity() + "\n" +
                "Constitution: " + characterToGenerate.getConstitution() + "\n" +
                "Intelligence: " + characterToGenerate.getIntelligence() + "\n" +
                "Wisdom: " + characterToGenerate.getWisdom() + "\n" +
                "Charisma: " + characterToGenerate.getCharisma());
        System.out.println("==============================");

        return characterToGenerate;
    }
}
