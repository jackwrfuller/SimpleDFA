

public class SimpleDFA implements DFA {

    private final Alphabet alphabet;
    private final State start;



    @Override
    public boolean check(Word word) {
        State currentState = start;
        int index = 0;
        for (Character c : word) {
            if (index == word.length() - 1) {
                return currentState.isAcceptanceState();
            }
            currentState = currentState.next(c);
            index++;
        }
        // if execution gets here, something has gone wrong so return false;
        return false;
    }

    public static SimpleDFA create(DFASchema schema) {
        return new SimpleDFA(schema);
    }

    private SimpleDFA(DFASchema schema) {
        this.alphabet = schema.alphabet();
        this.start = schema.start();

    }

}
