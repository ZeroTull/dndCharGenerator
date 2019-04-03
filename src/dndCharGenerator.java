import character.Humanoid;
import helpers.CharacterGenerator;

import java.io.IOException;

public class dndCharGenerator {
    public static void main(String[] args) throws IOException {

        Humanoid character = new Humanoid();
        CharacterGenerator generator = new CharacterGenerator();

        generator.generate(character);








    }
}
