package exam02.cv;

public class Skill {
    private String name;
    private int level;

    public Skill(String name, int level) {
        if (name == null || name.isEmpty() || name.isBlank() || level < 1 || level > 5) {
            throw new ClassNotFoundException();
        }
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
