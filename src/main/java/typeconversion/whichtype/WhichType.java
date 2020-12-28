package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {

    public List<Type> whichType(String s) {
        List<Type> types = new ArrayList<>();
        for (Type t: Type.values()) {
            Long v = Long.parseLong(s);
            if (v < t.getMaxValue() && v > t.getMinValue()) {
                types.add(t);
            }
        }
        return types;
    }
}