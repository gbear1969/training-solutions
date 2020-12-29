package stringconcat.stringconcat;

public enum Title {
    MR("Mr. "), MS("Ms. "), MRS("Mrs. "), DR("Dr. ");

    private String titleS;

    Title(String titleS) {
        this.titleS = titleS;
    }

    public String getTitleS() {
        return titleS;
    }

}
