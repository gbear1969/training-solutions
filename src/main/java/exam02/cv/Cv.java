package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public Cv(String name, List<Skill> skills) {
        this.name = name;
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
            String name = s.substring(0, s.lastIndexOf(" ("));
            int level = Integer.parseInt(s.substring(s.lastIndexOf("(") + 1, s.indexOf(")")));
            skills.add(new Skill(name, level));
        }
    }

    public int findSkillLevelByName(String skill) {
        for (Skill s :skills) {
            if (skill.equals(s.getName())) {
                return s.getLevel();
            }
        }
        throw new SkillNotFoundException();
    }
}
