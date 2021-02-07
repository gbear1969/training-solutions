package interfacedefaultmethods;

public class Printer {

    public String print(Printable printable) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < printable.getLength(); i++) {
            if (!(printable.getColor(i)).equals(Printable.BLACK)) {
                result.append('[').append(printable.getColor(i)).append(']');
            }
            result.append(printable.getPage(i)).append("\n");
        }
        return result.toString();
    }
}
