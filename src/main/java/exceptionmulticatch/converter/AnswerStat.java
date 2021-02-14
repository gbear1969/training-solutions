package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter bSC;

    public AnswerStat(BinaryStringConverter bSC) {
        this.bSC = bSC;
    }

    public boolean[] convert(String bStrs) {
        try {
            return bSC.binaryStringToBooleanArray(bStrs);
        } catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex.getMessage());
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] booleans = convert(answers);
        double sum = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) sum++;
        }
        int l = answers.length();
        return (int) Math.round(sum * 100 / l);
    }
}
