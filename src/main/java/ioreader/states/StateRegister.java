package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {
    private List<State> states = new ArrayList<>();

    public void readStatesFromFile(String fileName) {
        Path source = Path.of("src/main/resources/" + fileName);
        try (BufferedReader reader = Files.newBufferedReader(source)) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split("-");
                State state = new State(parts[0], parts[1]);
                states.add(state);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can't read file!", ioe);
        }
    }

    public String findCapitalByStateName(String stateName) {
        for (State s: states) {
            if (s.getStateName().equals(stateName)) {
                return s.getCapital();
            }
        }
        throw new IllegalArgumentException ("No state with this name!");
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }
}
