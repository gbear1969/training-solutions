package ioprintwriter.talentshow;

public class Row {
    private int id;
    private String name;
    private int votes = 0;

    public Row(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
