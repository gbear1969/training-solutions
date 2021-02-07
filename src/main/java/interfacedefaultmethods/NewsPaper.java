package interfacedefaultmethods;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper implements Printable {
    private List<String> pages = new ArrayList<>();

    public void addPage(String content) {
        pages.add(content);
    }

    public List<String> getPages() {
        return new ArrayList<>(List.copyOf(pages));
    }

    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return pages.get(pageNumber);
    }
}
