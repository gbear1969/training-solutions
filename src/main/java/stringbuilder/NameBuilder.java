package stringbuilder;

public class NameBuilder {

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder sB = new StringBuilder(givenName);

        if (title != null) {
            sB.insert(0, title.getTitleS());
        }

        if (middleName != null && !middleName.isBlank()) {
            sB.append(" " + middleName);
        }
        return sB.append(" " + familyName).toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder sB = new StringBuilder(familyName);

        if (title != null) {
            sB.insert(0, title.getTitleS());
        }

        if (middleName != null && !middleName.isBlank()) {
            sB.append(" " + middleName);
        }
        return sB.append(" " + givenName).toString();
    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder sB = new StringBuilder(name);
        return sB.insert(name.indexOf(where) + 1, title.getTitleS()).toString();
    }

    public String deleteNamePart(String name, String delete) {
        StringBuilder sB = new StringBuilder(name);
        return sB.delete(name.indexOf(delete), name.indexOf(delete) + delete.length()).toString();
    }

    public boolean isEmpty(String s) {
        return s == null || s.isEmpty() || s.isBlank();
    }

}
