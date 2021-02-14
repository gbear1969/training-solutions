package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {
    private List<Production> productions = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();
    private List<Row> tabulation = new ArrayList<>();
    private String winner = "no";
    private Path talentsFile = Path.of("talents.txt");
    private Path votesFile = Path.of("votes.txt");

    public void readTalents(Path talentsFile) {
        try (BufferedReader reader = Files.newBufferedReader(talentsFile)) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                int id = Integer.parseInt(parts[0]);
                productions.add(new Production(id, parts[1]));
                if (isNotVote(id)) {
                    votes.add(new Vote(id, 0));
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private boolean isNotVote(int id) {
        for (Vote v: votes) {
            if (v.getId() == id) return false;
        }
        return true;
    }

    public void calculateVotes(Path votesFile) {
        readVotes(votesFile);
        makeTabulation();
        votesToTabulation();
        writeResultToFile(Path.of("tabulation.txt"));
    }

    private void readVotes(Path votesFile) {
        try (BufferedReader reader = Files.newBufferedReader(votesFile)) {
            String line;
            while((line = reader.readLine()) != null) {
                for (Vote v: votes) {
                    if (v.getId() == Integer.parseInt(line)) {
                        v.incNum();
                    }
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void makeTabulation() {
        for (Production p: productions) {
            tabulation.add(new Row(p.getId(), p.getName()));
        }
    }

    private void votesToTabulation() {
        Row max = null;
        for (Vote v: votes) {
            for (Row r: tabulation) {
                if (v.getId() == r.getId()) {
                    r.setVotes(v.getNumber());
                    if (max == null || max.getVotes() < r.getVotes()) {
                        max = r;
                    }
                }
            }
        }
        winner = max.getName();
    }

    public String getWinner() {
        return winner;
    }

    public List<Row> getTabulation() {
        return new ArrayList<>(tabulation);
    }

    public List<Production> getProductions() {
        return new ArrayList<>(productions);
    }

    public List<Vote> getVotes() {
        return new ArrayList<>(votes);
    }

    public void writeResultToFile(Path resultFile) {
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(resultFile))) {
            for (Row r: tabulation) {
                writer.print(r.getId());
                writer.print(" ");
                writer.print(r.getName());
                writer.print(" ");
                writer.println(r.getVotes());
            }
            writer.print("Winner: ");
            writer.println(winner);

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
