package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Mancika");
        note.setTopic("Próba");
        note.setText("Ez a jegyzet");
        System.out.println(note.getNoteText());
    }
}
