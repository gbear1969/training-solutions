package methodargvars.examstats;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    private int limitPoint(int limitInPercent) {
        return (int) (maxPoints * (limitInPercent) / 100 + 0.5);
    }

    private void isEmpty(int[] results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        isEmpty(results);
        int n = 0;
        for (int r : results) {
            if (r > limitPoint(limitInPercent)) {
                n++;
            }
        }
        return n;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        isEmpty(results);
        for (int r : results) {
            if (r <= limitPoint(limitInPercent)) {
                return true;
            }
        }
        return false;
    }
}
