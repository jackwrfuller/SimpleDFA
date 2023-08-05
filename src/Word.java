import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Word implements Iterable<Character> {

    private final List<Character> word = new ArrayList<>();

    private Word(String string) {
        char[] charArr = string.toCharArray();
        for (char c : charArr) {
            word.add(c);
        }
    }
    public Character getLetter(int index) {
        return word.get(index);
    }

    public static Word createWord(String string) {
        return new Word(string);
    }

    public Iterator<Character> iterator() {
        return word.iterator();
    }
    
}
