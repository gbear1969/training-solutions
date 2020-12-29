package controliteration.pi;

public class PiGenerator {
    private String pi;
    private String vers = "Nem a régi s durva közelítés, Mi szótól szóig így kijön Betűiket számlálva." +
            "Ludolph eredménye már, Ha itt végezzük húsz jegyen." +
            "De rendre kijő még tíz pontosan, Azt is bízvást ígérhetem.";

    public PiGenerator() {
        piGenerator();
    }

    public String getPi() {
        return pi;
    }

    public void piGenerator() {
        int c = 0;
        for (int i = 0; i < vers.length(); i++) {
            if (Character.isAlphabetic(vers.charAt(i))) {
                c++;
            } else {
                if (c != 0) {
                    if (pi == null) {
                        pi = c + ".";
                    } else {
                        pi += c;
                    }
                    c = 0;
                }
            }
        }

    }

}
