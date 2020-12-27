package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person p1;
        Person p2;

        p1 = new Person("Próba Jancsi", 16);
        p2 = p1;
        p2.setName("Próba Juliska");

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());

        int a = 24;
        int b = a;

        b++;
        System.out.println(a);
        System.out.println(b);

        p2 = new Person("Próba Baba", 15);

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());
    }
}
