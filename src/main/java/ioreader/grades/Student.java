package ioreader.grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> gradeList = new ArrayList<>();

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.gradeList.addAll(marks);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGradeList() {
        return new ArrayList<>(gradeList);
    }

    public double average() {
        double sum = 0;
        for (int mark: gradeList) {
            sum += mark;
        }
        return sum / gradeList.size();
    }

    public boolean isIncreasing() {
        for (int i = 0; i < gradeList.size() - 1; i++) {
            if (gradeList.get(i) > gradeList.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
