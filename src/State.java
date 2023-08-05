import java.util.HashMap;
import java.util.Map;

public class State {

    private final Map<Character, State> transitions = new HashMap<>();
    private final boolean isAcceptanceState;

    public State next(Character c) {
        if (transitions.isEmpty() || !transitions.containsKey(c)) {
            throw new IllegalArgumentException("Invalid character: State does not contain ");
        }
        return transitions.get(c);
    }

    public boolean isAcceptanceState() {
        return isAcceptanceState;
    }

    private State(StateSchema sc) {
        this.isAcceptanceState = sc.isAcceptance;
        addTransitions(sc);
    }

    public static State createState(StateSchema sc) {
        return new State(sc);
    }

    private void addTransitions(StateSchema sc) {
        for (Transition t : sc.stateTransitions) {
            transitions.put(t.character(), t.end());
        }
    }

}
