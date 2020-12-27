package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
       Person person = new Person("Jon", "84154ED");
       Adress adress = new Adress("Pest", "Dunakeszi", "Sport utca 14.", "2120");

        System.out.println(person.personToString());

        person.moveTo(adress);
        System.out.println(person.getAdress().addressToString());

        person.correctData("John","841541ED");
        person.getAdress().correctData("Budapest", "XIV.", "Pered utca 4.", "1141");
        System.out.println(person.personToString());
        System.out.println(person.getAdress().addressToString());
    }

}
