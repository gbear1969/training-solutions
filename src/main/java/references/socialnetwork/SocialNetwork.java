package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public void connect(String name1, String name2) {
        findByName(name1).connectMember(findByName(name2));
    }

    private Member findByName(String name) {
        for (Member m: members) {
            if (name.equalsIgnoreCase(m.getName())) {
                return m;
            }
        }
        return null;
    }

    public List<String> bidirectionalConnections() {
        List<String> conn = new ArrayList<>();
        for (Member m1: members) {
            for (Member m2: m1.getConnections()) {
                if (m2.getConnections().contains(m1)) {
                    conn.add(m1.getName() + " - " + m2.getName());
                }
            }
        }
        return conn;
    }

    @Override
    public String toString() {
        return members.toString();
    }
}
