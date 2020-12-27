package attributes.person;

public class Person {
    private String name;
    private String identificationCard;
    private Adress adress;

    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public Adress getAdress() {
        return adress;
    }
    public String personToString() {
        return name + " " + identificationCard;
    }

    public void moveTo(Adress adress) {
        this.adress = adress;
    }

}
