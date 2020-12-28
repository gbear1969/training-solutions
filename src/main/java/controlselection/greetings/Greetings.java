package controlselection.greetings;

public class Greetings {
    public String greet(int hour, int minute) {

        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            return "Érvénytelen adatot adott meg!";
        }

        int time = hour * 100 + minute;

        if (time > 500 && time <= 900) {
            return "jó reggelt";
        }

        if (time > 900 && time <= 1830) {
            return "jó napot";
        }

        if (time > 1830 && time <= 2000) {
            return "jó estét";
        } else {
            return "jó éjt";
        }
    }
}
