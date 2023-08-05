import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {


    @Test
    void testWordFactory() {
        Word word = Word.createWord("test");
        assertEquals(word.getLetter(0), 't', "Character not matching");
        assertEquals(word.getLetter(1), 'e', "Character not matching");
        assertEquals(word.getLetter(2), 's', "Character not matching");
        assertEquals(word.getLetter(3), 't', "Character not matching");
    }

    @Test
    void testWordIterator() {
        Word word = Word.createWord("test");
        int index = 0;
        for (Character c : word) {
            assertEquals(c, word.getLetter(index), "Character not matching");
            index++;
        }





    }






}