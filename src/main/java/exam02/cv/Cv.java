package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;
    private int level;
    private List<Skill> skills = new ArrayList<>();

    public Cv(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public String getName() {
        return name;
    }

    public void addSkills(String... skill) {
        for (String s: skill) {
            name = s.substring(0, s.indexOf(" "));
            level = Integer.parseInt(s.substring(s.lastIndexOf("(") + 1, s.indexOf(")")));
            skills.add(new Skill(name, level));
        }
    }

    public int findSkillLevelByName(String name) {
        for (Skill s :skills) {
            if (name.equals(s.getName())) {
                return s.getLevel();
            }
        }
        return 0;
    }
}
