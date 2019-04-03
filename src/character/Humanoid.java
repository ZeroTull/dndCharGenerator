package character;

public class Humanoid {
    private String name;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public String getName() {
        return name;
    }

    public Humanoid setName(String name) {
        this.name = name;
        return this;
    }

    public int getStrength() {
        return strength;
    }

    public Humanoid setStrength(int strength) {
        this.strength = strength;
        return this;
    }

    public int getDexterity() {
        return dexterity;
    }

    public Humanoid setDexterity(int dexterity) {
        this.dexterity = dexterity;
        return this;
    }

    public int getConstitution() {
        return constitution;
    }

    public Humanoid setConstitution(int constitution) {
        this.constitution = constitution;
        return this;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public Humanoid setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public int getWisdom() {
        return wisdom;
    }

    public Humanoid setWisdom(int wisdom) {
        this.wisdom = wisdom;
        return this;
    }

    public int getCharisma() {
        return charisma;
    }

    public Humanoid setCharisma(int charisma) {
        this.charisma = charisma;
        return this;
    }
}
