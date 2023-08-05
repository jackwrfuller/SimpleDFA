import java.util.Set;

public record DFASchema(Alphabet alphabet, Set<State> states, State start,
                        Set<State> acceptanceStates, Set<Transition> transitions) {
}
