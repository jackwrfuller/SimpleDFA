import java.util.HashSet;
import java.util.Set;

public class Alphabet {

    private Set<Character> letters = new HashSet<>();

    public void addCharacter(Character c) {
        letters.add(c);
    }

    public boolean contains(Character c) {
        return letters.contains(c);
    }



}
