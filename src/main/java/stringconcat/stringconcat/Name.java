package stringconcat.stringconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        if (middleName == null || middleName.isBlank()) {
           this.middleName = "";
        } else {
           this.middleName = middleName + " ";
        }
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        if (middleName == null || middleName.isBlank()) {
            this.middleName = "";
        } else {
            this.middleName = middleName + " ";
        }
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        String result = "";
        if (title != null) {
            result += title.getTitleS();
        }
        return result += ( givenName + " " + middleName + familyName);
    }

    public String concatNameHungarianStyle() {
        String result = "";
        if (title  != null) {
            result = result.concat(title.getTitleS());
        }
        return result.concat(familyName.concat(" ".concat(middleName).concat(givenName)));
    }

    public boolean isEmpty(String s) {
        return s == null || s.isEmpty() || s.isBlank();
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName.trim();
    }

    public String getGivenName() {
        return givenName;
    }

    public Title getTitle() {
        return title;
    }

}
