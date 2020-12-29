package stringbasic.stringbasic;

public class StringCreator {
    public String createStringForHeap() {
        String sFH = new String("Próba");
        return sFH;
    }

    public String createStringForPool() {
        String sFP = "Próba";
        return sFP;
    }

}
